package com.example.shwetal.repsitory;

public class OrderMasterRepository {

	@Repository
	public interface OrderMasterRepository extends JpaRepository<OrderMaster, Long> {
	}
}
