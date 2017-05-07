package hu.me.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.me.entity.ShowEntity;

@Repository
public interface ShowRepository extends CrudRepository<ShowEntity, Long>{
	List<ShowEntity> findByMovieName(String movieName);

}
