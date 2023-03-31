package com.promineotech.jeep.controller.support;

//ASSIGNMENT 

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;



public class FetchJeepTestSupport extends BaseTest {

  protected List<Jeep> buildExpected() {
    //Creating and returning a List<Jeep>
    List<Jeep> list = new LinkedList<Jeep>();
    
    //To build the list we are using Spring's annotation of builder
    //which is on the Jeep class. So we start adding to a list 
    //but call the Jeep.builder annotation, type in the variables, then 
    //call the .build() method to execute the build. 
    
    //@formatter:off
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(2)
        .wheelSize(17)
        .basePrice(new BigDecimal("28475.00"))
        .build());
    
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(4)
        .wheelSize(17)
        .basePrice(new BigDecimal("31975.00"))
        .build());
    
    //@formatter:on
    return list;
  }
  
}
