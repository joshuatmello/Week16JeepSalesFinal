package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
  private Long orderPK;
  private Customer customer;
  private Jeep model;
  private Color color;
  private Engine engine;
  private Tire tire;
  private List<Option> options;
  private BigDecimal price;
  
  @JsonIgnore
  public Long getOrderPK() {
    return orderPK;
  }
}

/**
 * CREATE TABLE orders (
  order_pk int unsigned NOT NULL AUTO_INCREMENT,
  customer_fk int unsigned NOT NULL,
  color_fk int unsigned NOT NULL,
  engine_fk int unsigned NOT NULL,
  tire_fk int unsigned NOT NULL,
  model_fk int unsigned NOT NULL,
  price decimal(9, 2) NOT NULL,
  PRIMARY KEY (order_pk),
  FOREIGN KEY (customer_fk) REFERENCES customers (customer_pk) ON DELETE CASCADE,
  FOREIGN KEY (color_fk) REFERENCES colors (color_pk) ON DELETE CASCADE,
  FOREIGN KEY (engine_fk) REFERENCES engines (engine_pk) ON DELETE CASCADE,
  FOREIGN KEY (tire_fk) REFERENCES tires (tire_pk) ON DELETE CASCADE,
  FOREIGN KEY (model_fk) REFERENCES models (model_pk) ON DELETE CASCADE
);
 */