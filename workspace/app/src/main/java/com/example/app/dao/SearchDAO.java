package com.example.app.dao;

import com.example.app.domain.dto.QuestionDTO;
import com.example.app.domain.dto.Search;
import com.example.app.mapper.SearchMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SearchDAO {
    private final SearchMapper searchMapper;

    public List<QuestionDTO> findAll(Search search){
        return searchMapper.selectAll(search);
    }
}
