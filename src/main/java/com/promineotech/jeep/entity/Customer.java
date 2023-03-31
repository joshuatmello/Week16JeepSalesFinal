package com.promineotech.jeep.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
  private Long customerPK;
  private String customerId;
  private String firstName;
  private String lastName;
  private String phone;
}

/*
 * 
 * customer_pk int unsigned NOT NULL AUTO_INCREMENT,
customer_id varchar(40) NOT NULL,
first_name varchar(45) NOT NULL, 
last_name varchar(45) NOT NULL,
phone varchar(20),
PRIMARY KEY (customer_pk)

 */
