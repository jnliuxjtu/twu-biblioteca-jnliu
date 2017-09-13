package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class showUserInfoTest {
    @Test
    public void showUserInfoTest(){
        User jnliu=new User("jnliu","123-4567","TWU","jnliu@thoughtworks.com","666");
        assertEquals(false,jnliu.showUserInfo());
        jnliu.login("123-4567","TWU");
        assertEquals(true,jnliu.showUserInfo());

    }
}
