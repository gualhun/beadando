package hu.me.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.me.entity.MovieEntity;
import hu.me.entity.ShowEntity;

@Repository
public class ShowDao {

	private SessionFactory sessionFactory;

	@Autowired
	public ShowDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<ShowEntity> getShowByMovieName() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(ShowEntity.class);

		cr.add(Restrictions.like("movieName", "Film"));

		return cr.list();
	}

}
