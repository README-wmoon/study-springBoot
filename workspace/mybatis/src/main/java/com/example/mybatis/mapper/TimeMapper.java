package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("SLECT SYSDATE FROM DUAL")
    public String getTime();
}
