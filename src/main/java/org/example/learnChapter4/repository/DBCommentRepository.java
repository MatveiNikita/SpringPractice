package org.example.learnChapter4.repository;

import org.example.learnChapter4.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("История сообщений "+comment.getText());
    }
}
