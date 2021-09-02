package com.lee.orderopenfegin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OrderNacosApplicationTests {

    @Test
    void contextLoads() {

        List<Integer> list = new ArrayList<Integer>(){{
            add(10);
            add(20);
            add(30);
            add(40);
        }};

        boolean b = list.remove((Integer) 20);
        System.out.println(list);

    }

}
