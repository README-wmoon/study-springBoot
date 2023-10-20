package com.app.dependency.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Knife {
    List<Food> foods = new ArrayList<>();
}
