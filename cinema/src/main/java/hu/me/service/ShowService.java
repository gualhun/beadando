package hu.me.service;

import java.util.List;

import hu.me.entity.ShowEntity;

public interface ShowService {

	Iterable<ShowEntity> listAllShow();
	List<ShowEntity> findByMovieName();
}
