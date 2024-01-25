package org.example.learnChapter4.proxies;

import org.example.learnChapter4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
