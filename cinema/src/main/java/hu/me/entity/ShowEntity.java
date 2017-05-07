package hu.me.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShowEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String movieName;
	private int seatsAvailable = 100;
	private String cinema;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getCinema() {
		return cinema;
	}
	public void setCinema(String cinema) {
		this.cinema = cinema;
	}
	

	
}
