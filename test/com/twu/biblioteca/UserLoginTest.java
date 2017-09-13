package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserLoginTest {

    @Test
    public void UserLoginTest(){
        User jnliu=new User("jnliu","123-4567","TWU","jnliu@thoughtworks.com","666");

        assertEquals(true, jnliu.login("123-4567","TWU"));
        assertEquals(false, jnliu.login("123-4567","111"));
    }
}
