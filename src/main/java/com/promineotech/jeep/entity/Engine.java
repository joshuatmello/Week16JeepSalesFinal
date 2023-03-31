package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Engine {
  private Long enginePK;
  private String engineId;
  private Float sizeInLiters;
  private String name;
  private FuelType fuelType; //created an enum and implemented it here
  private Float mpgCity;
  private Float mpgHwy;
  private boolean hasStartStop;
  private String description;
  private BigDecimal price;
}

/**
 * CREATE TABLE engines (
  engine_pk int unsigned NOT NULL AUTO_INCREMENT,
  engine_id varchar(30) NOT NULL,
  size_in_liters decimal(5, 2) NOT NULL,
  name varchar(60) NOT NULL,
  fuel_type enum('GASOLINE', 'DIESEL', 'HYBRID') NOT NULL,
  mpg_city decimal(7, 2) NOT NULL,
  mpg_hwy decimal(7, 2) NOT NULL,
  has_start_stop boolean NOT NULL,
  description varchar(500) NOT NULL,
  price decimal(9, 2),
  PRIMARY KEY (engine_pk),
  UNIQUE KEY (engine_id)
);
 */