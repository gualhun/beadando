package hu.me.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.me.entity.CostumerEntity;
import hu.me.service.CostumerService;

@RestController
@RequestMapping("/costumer")
public class CostumerController {
	
	private CostumerService costumerService;

	@Autowired
	public CostumerController(CostumerService costumerService) {
		super();
		this.costumerService = costumerService;
	}
	
	@RequestMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<CostumerEntity> list() {
		return costumerService.listAllCostumer();
	}
	
	@PostMapping(path = "", consumes=MediaType.APPLICATION_JSON_VALUE)
	void createNew(@RequestBody CostumerEntity newCostumer) {
		costumerService.newCostumer(newCostumer);
	}
	
	void deleteExisting(@PathVariable("id")long id) {
		costumerService.deleteCostumer(id);
	}
	

}
