package com.app.dependency.dependency;

import com.app.dependency.dependency.task.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest @Slf4j
public class FoodTests {

    @Autowired
    private Knife knife;

    @Test
    public void foodTest(){
        List<Food> foods = new ArrayList<>(Arrays.asList(new Food(knife), new Food(knife)));
        log.info(knife.toString());
    }
}
