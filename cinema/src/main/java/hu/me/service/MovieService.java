package hu.me.service;

import java.util.List;

import hu.me.entity.MovieEntity;

public interface MovieService {
	Iterable<MovieEntity> listAllMovie();
	void newMovie(MovieEntity newMovie);
	void deleteMovie (long id);
	List<MovieEntity> findByGenre();
	List<MovieEntity> findByCinema();

}
