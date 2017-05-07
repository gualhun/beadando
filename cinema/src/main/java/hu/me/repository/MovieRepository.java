package hu.me.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.me.entity.MovieEntity;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long>{
	
	List<MovieEntity> findByGenre(String genre);
	List<MovieEntity> findByCinema(String cinema);
//	List<MovieEntity> findByAction(String genre);
//	List<MovieEntity> findByDrama(String genre);
}
