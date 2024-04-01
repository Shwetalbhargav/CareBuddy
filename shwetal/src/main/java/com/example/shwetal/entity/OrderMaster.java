package com.example.shwetal.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "order_master")
public class OrderMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "trade_details_id")
    private List<TradeDetails> tradeDetailsList;

    private int quantity;

    @Column(name = "per_unit_price")
    private BigDecimal perUnitPrice;

    @Enumerated(EnumType.STRING)
    private TradeType type;

    @Column(name = "stock")
    private String stock;

    @Column(name = "status")
    private String status;

    // Constructors
    public OrderMaster() {
    }

    public OrderMaster(List<TradeDetails> tradeDetailsList, int quantity, BigDecimal perUnitPrice, TradeType type, String stock, String status) {
        this.tradeDetailsList = tradeDetailsList;
        this.quantity = quantity;
        this.perUnitPrice = perUnitPrice;
        this.type = type;
        this.stock = stock;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TradeDetails> getTradeDetailsList() {
        return tradeDetailsList;
    }

    public void setTradeDetailsList(List<TradeDetails> tradeDetailsList) {
        this.tradeDetailsList = tradeDetailsList;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPerUnitPrice() {
        return perUnitPrice;
    }

    public void setPerUnitPrice(BigDecimal perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public TradeType getType() {
        return type;
    }

    public void setType(TradeType type) {
        this.type = type;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
