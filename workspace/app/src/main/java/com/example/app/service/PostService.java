package com.example.app.service;

import com.example.app.domain.dto.PostDTO;
import com.example.app.domain.vo.PostVO;

import java.util.List;
import java.util.Optional;

public interface PostService {
    //    게시글 목록
    public List<PostDTO> getList();

    //    게시글 추가
    public void write(PostVO postVO);

    //    게시글 조회
    public Optional<PostDTO> read(Long id);

    //    게시글 수정
    public void modify(PostVO postVO);

    //    게시글 삭제
    void remove(Long id);

    default PostDTO toDTO(PostVO postVO){
        PostDTO postDTO = new PostDTO();
        postDTO.setId(postVO.getId());
        postDTO.setPostTitle(postVO.getPostTitle());
        postDTO.setPostContent(postVO.getPostContent());
        postDTO.setMemberId(postVO.getMemberId());
        postDTO.setPostReadCount(postVO.getPostReadCount());
        postDTO.setPostRegisterDate(postVO.getPostRegisterDate());
        postDTO.setPostUpdateDate(postVO.getPostUpdateDate());
        return postDTO;
    }
}


















