package hu.me.service;

import hu.me.entity.MovieEntity;

public interface MovieService {
	Iterable<MovieEntity> listAllMovie();
	void newMovie(MovieEntity newMovie);
	void deleteMovie (long id);

}
