package com.example.app.service.searchpage;

import com.example.app.domain.dto.QuestionDTO;
import com.example.app.domain.dto.Search;

import java.util.List;

public interface SearchPageService {
//    검색기능
    public List<QuestionDTO> getList(Search search);
}
