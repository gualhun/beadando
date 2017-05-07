package hu.me.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.me.entity.CostumerEntity;
import hu.me.repository.CostumerRepository;
import hu.me.service.CostumerService;

@Service
public class CostumerSerciveImp implements CostumerService {
	
	CostumerRepository costumerRepository;
	
	
	@Autowired
	public CostumerSerciveImp(CostumerRepository costumerRepository) {
		super();
		this.costumerRepository = costumerRepository;
	}

	@Override
	public Iterable<CostumerEntity> listAllCostumer() {
		// TODO Auto-generated method stub
		return costumerRepository.findAll();
	}

	@Override
	public void newCostumer(CostumerEntity newCostumer) {
		costumerRepository.save(newCostumer);

	}

	@Override
	public void deleteCostumer(long id) {
		costumerRepository.delete(id);

	}

}
