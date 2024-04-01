package com.example.shwetal.service;


	

	import com.example.shwetal.entity.TradeDetails;
	import com.example.shwetal.repository.TradeDetailsRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.Optional;

	@Service
	public class TradeDetailsService {

	    @Autowired
	    private TradeDetailsRepository tradeDetailsRepository;

	    public TradeDetails updateTradeDetail(Long id, TradeDetails updatedTradeDetails) {
	        Optional<TradeDetails> optionalTradeDetails = tradeDetailsRepository.findById(id);
	        if (optionalTradeDetails.isPresent()) {
	            TradeDetails existingTradeDetails = optionalTradeDetails.get();
	            // Update trade details with the new values
	            existingTradeDetails.setTradeDateTime(updatedTradeDetails.getTradeDateTime());
	            existingTradeDetails.setStockName(updatedTradeDetails.getStockName());
	            existingTradeDetails.setListingPrice(updatedTradeDetails.getListingPrice());
	            existingTradeDetails.setQuantity(updatedTradeDetails.getQuantity());
	            existingTradeDetails.setType(updatedTradeDetails.getType());
	            existingTradeDetails.setPricePerUnit(updatedTradeDetails.getPricePerUnit());
	            // Save the updated trade details
	            return tradeDetailsRepository.save(existingTradeDetails);
	        } else {
	            // Trade details with the given id not found
	            throw new IllegalArgumentException("Trade details with id " + id + " not found");
	        }
	    }

	    public void deleteTradeDetail(Long id) {
	        tradeDetailsRepository.deleteById(id);
	    }
	}


