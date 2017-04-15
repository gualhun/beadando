package hu.me.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.me.entity.MovieEntity;
import hu.me.repository.MovieRepository;
import hu.me.service.MovieService;

@Service
public class MovieServiceImp implements MovieService{
	
	MovieRepository movieRepository;
	
	@Autowired
	public MovieServiceImp(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public Iterable<MovieEntity> listAllMovie() {
		return movieRepository.findAll();
	}

	@Override
	public void newMovie(MovieEntity newMovie) {
		movieRepository.save(newMovie);
	}

	@Override
	public void deleteMovie(long id) {
		movieRepository.delete(id);
	}

}
