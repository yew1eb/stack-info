package com.yew1eb.service;

import com.yew1eb.BaseTest;
import com.yew1eb.model.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
public class CommentServiceTests extends BaseTest {

    @Autowired
    private CommentService commentService;

    @Test
    public void TestGetComment() {
        Long cid = 55L;
        Comment comment = commentService.getComment(cid);
        System.out.println(comment);
    }

    @Test
    public void TestSave() {
        Integer cid = commentService.save(25L, 25L, 27L, "n-n-n", "UA");
        System.out.println("cid="+cid);
    }

    @Test
    public void TestGetComments() {
        Long uid = 25L;
        Long total = commentService.getComments(uid);
        System.out.println(total);
    }
}
