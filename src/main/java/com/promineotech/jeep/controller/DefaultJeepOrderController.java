package com.promineotech.jeep.controller;
//ASSIGNMENT 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import com.promineotech.jeep.service.JeepOrderService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultJeepOrderController implements JeepOrderController {

  //Injects the JeepOrderService Interface 
  @Autowired
  private JeepOrderService jeepOrderService;
  
  @Override
  public Order createOrder(OrderRequest orderRequest) {
   log.debug("Order = {}", orderRequest);
  //returns the value from the service for createOrder method with param orderRequest
   return jeepOrderService.createOrder(orderRequest);
  }

  
}
