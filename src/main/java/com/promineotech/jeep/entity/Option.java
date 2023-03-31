package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Option {
  private Long optionPK;
  private String optionId;
  private OptionType category;  //created an enum and then used it here
  private String manufacturer;
  private String name;
  private BigDecimal price;
}

/**
 * CREATE TABLE options (
  option_pk int unsigned NOT NULL AUTO_INCREMENT,
  option_id varchar(30) NOT NULL,
  category enum('DOOR', 'EXTERIOR', 'INTERIOR', 'STORAGE', 'TOP', 'WHEEL') NOT NULL,
  manufacturer varchar(60) NOT NULL,
  name varchar(60) NOT NULL,
  price decimal(9, 2) NOT NULL,
  PRIMARY KEY (option_pk),
  UNIQUE KEY (option_id)
);
*/
