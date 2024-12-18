package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
class MyControllerTest {
    @Test
    void testSayHello() {
        MyController myController = new MyController();
        String s = myController.sayHello();
        assertNotNull(s);
        System.out.println(s);
    }
}