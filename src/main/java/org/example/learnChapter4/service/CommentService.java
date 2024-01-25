package org.example.learnChapter4.service;
import org.example.learnChapter4.model.Comment;
import org.example.learnChapter4.proxies.CommentNotificationProxy;
import org.example.learnChapter4.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    @Qualifier("PUSH")
    CommentNotificationProxy commentNotificationProxy;


    public void pushComment(Comment comment){
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
