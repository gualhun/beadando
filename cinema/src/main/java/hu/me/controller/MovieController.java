package hu.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.me.entity.MovieEntity;
import hu.me.service.MovieService;

//megadtunk egy alap elérést igy utána nem kell mindegyiknél kiirni h/movie, csak ha másra megy
@RestController
@RequestMapping("/movie")
public class MovieController {
	
	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	@GetMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<MovieEntity> list() {
		return movieService.listAllMovie();
	}
	
	@PostMapping(path = "", consumes=MediaType.APPLICATION_JSON_VALUE)
	void createNew(@RequestBody MovieEntity newMovie) {
		movieService.newMovie(newMovie);
	}
	
	@DeleteMapping(path="/{id}")
	void deleteExisting(@PathVariable("id")long id) {
		movieService.deleteMovie(id);		
	}
	
	void updateExisting(@PathVariable("id")long id, @RequestBody MovieEntity newMovie) {
		
	}
	
	
	
	
	

}
