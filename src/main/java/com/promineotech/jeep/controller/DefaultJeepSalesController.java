package com.promineotech.jeep.controller;

//ASSIGNMENT
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;

//This tells Spring that this is a restController 
//This restcontroller tells Spring boot that this class is special--
//it is a controller of JeepSalesController so it implements that interface 
//while finds that the class is mapped to /jeeps; get verb needs two parameters
@RestController
@Slf4j  //lombok annotation
public class DefaultJeepSalesController implements JeepSalesController {
    //This is the controller implementation method
  
  //Injects the service interface
  @Autowired
  private JeepSalesService jeepSalesService;
  
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.info("model={}, trim={}", model, trim);
    return jeepSalesService.fetchJeeps(model, trim);
  }

}
