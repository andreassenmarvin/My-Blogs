package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PostTest {

    @After
    public void tearDown() {
        Post.clearAllPosts(); //clear out all the posts before each test.
    }

    @Test
    public void AllPostsAreCorrectlyReturned_true() throws ParseException {
        Post post = new Post("Day 1: Intro", "");
        Post otherPost = new Post ("How to pair successfully", "");
        assertEquals(2, Post.getAll().size());
    }

    @Test
    public void AllPostsContainsAllPosts_true() throws ParseException {
        Post post = new Post("Day 1: Intro", "");
        Post otherPost = new Post ("How to pair successfully", "");
        assertTrue(Post.getAll().contains(post));
        assertTrue(Post.getAll().contains(otherPost));
    }

    @Test
    public void getCreatedAt_instantiatesWithCurrentTime_today() throws Exception{
        Post post = new Post("Day 1: Intro", ""); //see below
        assertEquals(LocalDateTime.now().getDayOfWeek(), post.getCreatedAt().getDayOfWeek());
    }
}