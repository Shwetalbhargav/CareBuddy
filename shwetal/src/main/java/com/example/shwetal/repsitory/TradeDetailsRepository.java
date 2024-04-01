package com.example.shwetal.repsitory;

public class TradeDetailsRepository {
 
	@Repository
	public interface TradeDetailsRepository extends JpaRepository<TradeDetails, Long> {
	}
}
