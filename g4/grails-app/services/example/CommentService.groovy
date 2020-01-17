package example

import grails.gorm.services.Service

@Service(Comment)
interface CommentService {

    Comment get(Serializable id)

    List<Comment> list(Map args)

    Long count()

    void delete(Serializable id)

    Comment save(Comment comment)

}