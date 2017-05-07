package hu.me.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.me.entity.ShowEntity;
import hu.me.service.ShowService;

@RestController
@RequestMapping("/show")
public class ShowController {
	
	private ShowService showService;

	public ShowController(ShowService showService) {
		super();
		this.showService = showService;
	}
	
	@GetMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<ShowEntity> list() {
		return showService.listAllShow();
	}
	
	@GetMapping(path="/findByMovieName", produces=MediaType.APPLICATION_JSON_VALUE)
	List<ShowEntity> findByMovieName() {
		return showService.findByMovieName();
	}
	
	

}
