package com.example.demo1.pojo;

import com.example.demo1.utils.Impl.UserIdGetterImpl;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testUserGetID(){
        User user = new User("123","123","123");

        int i = new UserIdGetterImpl().setUserId(user.getEmail());
        int i1 = new UserIdGetterImpl().setUserId("123");

        System.out.println(user.getId());
        System.out.println(i +""+ i1);
    }
}
