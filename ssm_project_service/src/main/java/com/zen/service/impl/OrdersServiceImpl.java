package com.zen.service.impl;

import com.github.pagehelper.PageHelper;
import com.zen.dao.IOrdersDao;
import com.zen.domain.Orders;
import com.zen.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("ordersService")
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;


    @Override
    public Orders findById(String id) throws Exception {
        return ordersDao.findById(id);

    }

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {

        //页码值，每页条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }


}
