package hu.me.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hu.me.entity.MovieEntity;

public class MovieDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMovieDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMovieByGenre() {
			List<MovieEntity> actual = Arrays.asList(new MovieEntity());
		  List<MovieEntity> expected = Arrays.asList(new MovieEntity());

//		  assertThat(actual, is(expected));
//		  assertThat(actual, is(not(expected)));
	}

	@Test
	public void testGetMovieByCinema() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMovieByCinema2() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMovieByAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMovieByDrama() {
		fail("Not yet implemented");
	}

}
