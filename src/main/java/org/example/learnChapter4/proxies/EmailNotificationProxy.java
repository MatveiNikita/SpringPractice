package org.example.learnChapter4.proxies;


import org.example.learnChapter4.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправленно с помощью EMAIL"+comment.getText());
    }
}
