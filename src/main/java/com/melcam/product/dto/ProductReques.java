package com.melcam.product.dto;

import java.math.BigDecimal;

public record ProductReques (String id, String name, String description, BigDecimal price){
}
