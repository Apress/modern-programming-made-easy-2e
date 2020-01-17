package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CommentController {

    CommentService commentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond commentService.list(params), model:[commentCount: commentService.count()]
    }

    def show(Long id) {
        respond commentService.get(id)
    }

    def create() {
        respond new Comment(params)
    }

    def save(Comment comment) {
        if (comment == null) {
            notFound()
            return
        }

        try {
            commentService.save(comment)
        } catch (ValidationException e) {
            respond comment.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'comment.label', default: 'Comment'), comment.id])
                redirect comment
            }
            '*' { respond comment, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond commentService.get(id)
    }

    def update(Comment comment) {
        if (comment == null) {
            notFound()
            return
        }

        try {
            commentService.save(comment)
        } catch (ValidationException e) {
            respond comment.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'comment.label', default: 'Comment'), comment.id])
                redirect comment
            }
            '*'{ respond comment, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        commentService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'comment.label', default: 'Comment'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'comment.label', default: 'Comment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
