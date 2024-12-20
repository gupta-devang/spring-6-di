package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class FauxControllerTest {

    @Autowired
    FauxController fauxController;
    @Test
    void getDataSource() {
        System.out.println(fauxController.getDataSource());
    }
}