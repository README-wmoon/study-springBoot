package com.example.app.service.searchpage;

import com.example.app.dao.SearchDAO;
import com.example.app.domain.dto.QuestionDTO;
import com.example.app.domain.dto.Search;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchPageServiceImpl implements SearchPageService {
    private final SearchDAO searchDAO;

    @Override
    public List<QuestionDTO> getList(Search search) {
        return searchDAO.findAll(search);
    }
}
