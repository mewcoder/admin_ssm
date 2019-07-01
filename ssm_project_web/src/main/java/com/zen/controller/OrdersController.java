package com.zen.controller;


import com.github.pagehelper.PageInfo;
import com.zen.dao.IOrdersDao;
import com.zen.domain.Orders;
import com.zen.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    /*
    //未分页
    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception{

        List<Orders> ordersList = ordersService.findAll();
        ModelAndView  mv = new ModelAndView();
        mv.setViewName("orders-list");
        mv.addObject("ordersList",ordersList);


        return mv;

    }
*/

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String ordersId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Orders orders = ordersService.findById(ordersId);
        mv.addObject("orders", orders);
        mv.setViewName("orders-show");
        return mv;
    }


    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") int size) throws Exception {

        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page, size);


        //PageInfo就是一个分页Bean
        PageInfo pageInfo = new PageInfo(ordersList);


        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("orders-list");
        return mv;


    }

}