package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.core.annotation.Order;

import java.util.List;

@Mapper
public interface ProductOrderMapper {
//    주문 내역
    public List<Order> getOrders();
}
