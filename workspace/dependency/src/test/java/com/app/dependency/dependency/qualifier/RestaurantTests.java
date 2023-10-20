package com.app.dependency.dependency.qualifier;

import com.app.dependency.dependency.qualifier.task.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTests {

    @Autowired
    private Restaurant restaurant;

    @Test
    public void RestaurantTest() {
        log.info(restaurant.toString());
    }
}
