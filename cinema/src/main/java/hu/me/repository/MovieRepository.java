package hu.me.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.me.entity.MovieEntity;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long>{

}
