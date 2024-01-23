package org.example;

import org.example.configuration.ProjectConfig;
import org.example.model.Comment;
import org.example.servece.CommentService;
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