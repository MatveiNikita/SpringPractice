package org.example.learnChapter4.repository;

import org.example.learnChapter4.model.Comment;


public interface CommentRepository {
    void storeComment(Comment comment);
}
