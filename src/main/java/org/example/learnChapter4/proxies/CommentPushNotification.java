package org.example.learnChapter4.proxies;

import org.example.learnChapter4.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotification implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправленно с помощью PUSH" + comment.getText());
    }
}
