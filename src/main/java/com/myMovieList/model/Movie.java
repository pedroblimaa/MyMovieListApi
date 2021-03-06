package com.myMovieList.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.myMovieList.controller.dto.MovieApiDto;

@Entity
public class Movie {

	@Id
	private Long id;
	private String name;
	@Column(length = 1000)
	private String overview;
	private String language;
	private String release_date;
	private Float vote_average = (float) 0;
	private Long vote_count = (long) 0;

	public Movie() {
		super();
	}

	public Movie(MovieApiDto movieApi) {
		super();
		this.id = movieApi.getId();
		this.name = movieApi.getTitle();
		this.overview = movieApi.getOverview();
		this.language = movieApi.getOriginal_language();
		this.release_date = movieApi.getRelease_date();
	}

	public Movie(Integer id, String name, String overview, String language, String release_date) {
		super();
		this.id = (long) id;
		this.name = name;
		this.overview = overview;
		this.language = language;
		this.release_date = release_date;
	}

	public Movie(Long id, String name, String overview, String language, String release_date, float vote_average,
			Long vote_count) {
		super();
		this.id = id;
		this.name = name;
		this.overview = overview;
		this.language = language;
		this.release_date = release_date;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public Float getVote_average() {
		return vote_average;
	}

	public void setVote_average(Float vote_average) {
		this.vote_average = vote_average;
	}

	public Long getVote_count() {
		return vote_count;
	}

	public void setVote_count(Long vote_count) {
		this.vote_count = vote_count;
	}
}