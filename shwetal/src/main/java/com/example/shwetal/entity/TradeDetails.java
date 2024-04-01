package com.example.shwetal.entity;


@entity
@Table(name = "trade_details")
public class TradeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade_date_time")
    private LocalDateTime tradeDateTime;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "listing_price")
    private BigDecimal listingPrice;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private TradeType type;

    @Column(name = "price_per_unit")
    private BigDecimal pricePerUnit;

    // Constructors, getters, setters
}
