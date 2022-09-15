package com.eshop.order.OrderService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Order {
    @Id
    private int id;
    @Field
    private String name;
}
