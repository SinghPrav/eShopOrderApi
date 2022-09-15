package com.eshop.order.OrderService.repository;

import com.eshop.order.OrderService.model.Order;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CouchbaseRepository<Order, Integer> {
    @Query("SELECT * FROM `eshop` where name = $name")
    List<Order> findByIdLike(String name);
}
