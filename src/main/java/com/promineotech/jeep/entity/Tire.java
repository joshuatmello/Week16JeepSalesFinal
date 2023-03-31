package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tire {
  private Long tirePK;
  private String tireId;
  private String tireSize;
  private String manufacturer;
  private BigDecimal price;
  private int warrantyMiles;
}

/**
 * CREATE TABLE tires (
  tire_pk int unsigned NOT NULL AUTO_INCREMENT,
  tire_id varchar(30) NOT NULL, 
  tire_size varchar(128) NOT NULL,
  manufacturer varchar(70) NOT NULL,
  price decimal(7, 2) NOT NULL,
  warranty_miles int NOT NULL,
  PRIMARY KEY (tire_pk),
  UNIQUE KEY (tire_id)
);
*/
