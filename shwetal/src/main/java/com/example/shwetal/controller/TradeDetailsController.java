package com.example.shwetal.controller;

public class TradeDetailsController {
	@RestController
	@RequestMapping("/api/trade-details")
	public class TradeDetailsController {
	    @Autowired
	    private TradeDetailsService tradeDetailsService;

	    @GetMapping
	    public List<TradeDetails> getAllTradeDetails() {
	        return tradeDetailsService.getAllTradeDetails();
	    }

	    @PostMapping
	    public TradeDetails addTradeDetail(@RequestBody TradeDetails tradeDetails) {
	        return tradeDetailsService.addTradeDetail(tradeDetails);
	    }

	    
	}

}
