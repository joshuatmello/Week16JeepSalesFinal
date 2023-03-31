package com.promineotech.jeep.service;
//ASSIGNMENT 

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.jeep.dao.JeepSalesDao;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

//Tells it that Spring wants to manage this injection
@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {

  @Autowired
  private JeepSalesDao jeepSalesDao;
  
  @Transactional (readOnly = true)
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    
    //Lombok info-level log statement shows the service was called
    log.info("The fetchJeeps method was called with model={}, trim= {}", model, trim);
   
    List<Jeep> jeeps = jeepSalesDao.fetchJeeps(model, trim);
    
   return jeeps;
    
    
  }

}
