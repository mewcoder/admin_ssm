package com.zen.service;


import com.zen.domain.Orders;

import java.util.List;

public interface IOrdersService {

    public Orders findById(String id) throws Exception;

    public List<Orders> findAll(int page, int size) throws Exception;

}
