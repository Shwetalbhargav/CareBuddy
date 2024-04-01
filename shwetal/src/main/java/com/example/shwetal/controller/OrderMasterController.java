package com.example.shwetal.controller;

public class OrderMasterController {
	@RestController
	@RequestMapping("/api/order-master")
	public class OrderMasterController {
	    @Autowired
	    private OrderMasterService orderMasterService;

	    @PostMapping
	    public OrderMaster createOrder(@RequestBody List<TradeDetails> selectedTrades) {
	        return orderMasterService.createOrder(selectedTrades);
	    }

	    @GetMapping
	    public List<OrderMaster> getConfirmedOrders(@RequestParam(defaultValue = "0") int page,
	                                                @RequestParam(defaultValue = "10") int size) {
	        return orderMasterService.getConfirmedOrders(page, size);
	    }

	    // Additional endpoints as needed
	}

}
