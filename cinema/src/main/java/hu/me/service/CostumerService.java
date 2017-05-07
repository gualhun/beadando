package hu.me.service;

import hu.me.entity.CostumerEntity;

public interface CostumerService {
	Iterable<CostumerEntity> listAllCostumer();
	void newCostumer(CostumerEntity newCostumer);
	void deleteCostumer (long id);
}
