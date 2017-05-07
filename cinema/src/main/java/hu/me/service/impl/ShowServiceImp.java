package hu.me.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.me.dao.ShowDao;
import hu.me.entity.ShowEntity;
import hu.me.repository.ShowRepository;
import hu.me.service.ShowService;

@Service
public class ShowServiceImp implements ShowService {
	
	ShowRepository showRepository;
	ShowDao showDao;
	
	
	@Autowired
	public ShowServiceImp(ShowRepository showRepository, ShowDao showDao) {
		super();
		this.showRepository = showRepository;
		this.showDao = showDao;
	}

	@Override
	public Iterable<ShowEntity> listAllShow() {
		// TODO Auto-generated method stub
		return showRepository.findAll();
	}

	@Override
	public List<ShowEntity> findByMovieName() {
		// TODO Auto-generated method stub
		return showDao.getShowByMovieName();
	}

}
