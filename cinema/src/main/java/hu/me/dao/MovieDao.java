package hu.me.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.me.entity.MovieEntity;

@Repository
public class MovieDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public MovieDao (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<MovieEntity> getMovieByGenre() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
		
		cr.add(Restrictions.like("genre", "Sc-Fi"));
		
		return cr.list();
	}
	
	@Transactional
	public List<MovieEntity> getMovieByCinema() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
		
		cr.add(Restrictions.like("cinema", "Cinema2"));
		
		return cr.list();
	}
	

	
//	@Transactional
//	public List<MovieEntity> getMovieByAction() {
//		Criteria cr = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
//		
//		cr.add(Restrictions.like("genre", "Action"));
//		
//		return cr.list();
//	}
//	
//	@Transactional
//	public List<MovieEntity> getMovieByDrama() {
//		Criteria cr = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
//		
//		cr.add(Restrictions.like("genre", "Drama"));
//		
//		return cr.list();
//	}

}
