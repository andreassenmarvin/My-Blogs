package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        Post testpost = new Post("Day 1: Intro");
        assertEquals("Day 1: Intro", testpost.getContent());
    }

    @After
    public void tearDown() throws Exception {
    }
}