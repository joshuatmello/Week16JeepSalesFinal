package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Color {
  private Long colorPK;
  private String colorId;
  private String color;
  private BigDecimal price;
  private boolean isExterior;
}

/**
 * CREATE TABLE colors (
  color_pk int unsigned NOT NULL AUTO_INCREMENT,
  color_id varchar(30) NOT NULL,
  color varchar(60) NOT NULL,
  price decimal(9, 2) NOT NULL,
  is_exterior boolean NOT NULL,
  PRIMARY KEY (color_pk),
  UNIQUE KEY (color_id)
);
 */
