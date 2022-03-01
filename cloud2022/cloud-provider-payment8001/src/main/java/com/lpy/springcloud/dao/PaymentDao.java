package com.lpy.springcloud.dao;

import com.lpy.springcloud.entities.Payment;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    //增删改查
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
