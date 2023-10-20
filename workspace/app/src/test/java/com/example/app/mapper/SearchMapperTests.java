package com.example.app.mapper;


import com.example.app.domain.dto.QuestionDTO;
import com.example.app.domain.dto.Search;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SearchMapperTests {
    @Autowired
    private SearchMapper searchMapper;

    @Test
    public void insertTest(){
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionId(2L);
        questionDTO.setQuestionLikeCount(20L);
        searchMapper.insert(questionDTO);
    }

    @Test
    public void selectAllTest(){
//        postMapper.selectAll(pagination, new Search("popular")).stream().map(PostDTO::toString).forEach(log::info);
//        postMapper.selectAll(pagination, new Search()).stream().map(PostDTO::toString).forEach(log::info);
        searchMapper.selectAll(new Search()).stream().map(QuestionDTO::toString).forEach(log::info);
    }
}
