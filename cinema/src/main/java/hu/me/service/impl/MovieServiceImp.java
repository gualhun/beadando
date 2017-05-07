package hu.me.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.me.dao.MovieDao;
import hu.me.entity.MovieEntity;
import hu.me.repository.MovieRepository;
import hu.me.service.MovieService;

@Service
public class MovieServiceImp implements MovieService{
	
	MovieRepository movieRepository;
	MovieDao movieDao;
	

	
	@Autowired
	public MovieServiceImp(MovieRepository movieRepository, MovieDao movieDao) {
		super();
		this.movieRepository = movieRepository;
		this.movieDao = movieDao;
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

	@Override
	public List<MovieEntity> findByGenre() {
		// TODO Auto-generated method stub
		return movieDao.getMovieByGenre();
	}

	@Override
	public List<MovieEntity> findByCinema() {
		// TODO Auto-generated method stub
		return movieDao.getMovieByCinema();
	}
	
	@Override
	public List<MovieEntity> findByCinema2() {
		// TODO Auto-generated method stub
		return movieDao.getMovieByCinema2();
	}

	@Override
	public List<MovieEntity> findByAction() {
		// TODO Auto-generated method stub
		return movieDao.getMovieByAction();
	}
//
	@Override
	public List<MovieEntity> findByDrama() {
		// TODO Auto-generated method stub
		return movieDao.getMovieByDrama();
	}

	
}
