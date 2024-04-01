package com.example.shwetal.service;
import com.example.shwetal.entity.OrderMaster;
import com.example.shwetal.entity.TradeDetails;
import com.example.shwetal.repository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderMasterService {
	@Autowired
    private OrderMasterRepository orderMasterRepository;

    public OrderMaster createOrder(List<TradeDetails> selectedTrades, int quantity, double perUnitPrice, String stock, String status) {
        // Create a new order
        OrderMaster order = new OrderMaster();
        order.setTradeDetailsList(selectedTrades);
        order.setQuantity(quantity);
        order.setPerUnitPrice(perUnitPrice);
        order.setStock(stock);
        order.setStatus(status);
        // Save the order to the database
        return orderMasterRepository.save(order);
    }

    public List<OrderMaster> getConfirmedOrders() {
        // Retrieve confirmed orders from the database
        return orderMasterRepository.findAll();
    }
}
