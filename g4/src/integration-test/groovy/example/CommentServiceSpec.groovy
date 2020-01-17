package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CommentServiceSpec extends Specification {

    CommentService commentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        //Comment comment = new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //comment.id
    }

    void "test get"() {
        setupData()

        expect:
        commentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Comment> commentList = commentService.list(max: 2, offset: 2)

        then:
        commentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        commentService.count() == 5
    }

    void "test delete"() {
        Long commentId = setupData()

        expect:
        commentService.count() == 5

        when:
        commentService.delete(commentId)
        sessionFactory.currentSession.flush()

        then:
        commentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Comment comment = new Comment()
        commentService.save(comment)

        then:
        comment.id != null
    }
}
