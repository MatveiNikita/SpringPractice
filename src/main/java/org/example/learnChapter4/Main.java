package org.example.learnChapter4;


import org.example.learnChapter4.configuration.ProjectConfig;
import org.example.learnChapter4.model.Comment;
import org.example.learnChapter4.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();
        comment.setText("LALALA");
        comment.setAuthorName("Nikita");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.pushComment(comment);
    }
}