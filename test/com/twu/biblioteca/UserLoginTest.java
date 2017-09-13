package com.twu.biblioteca;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserLoginTest {
    @Test
    public void UserLoginTest(){
        assertEquals(true, User.login("jnliu","TWU"));
        assertEquals(false, User.login("jnliu","111"));
    }
}
