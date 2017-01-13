package com.niit.collaboration.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Blog")
public class Blog implements Serializable {

	// Blog with 4 instance variables

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	@Id
	private String id;
	private String title;
	private String description;
	
	
	public Blog()
	{
		id="BL"+UUID.randomUUID().toString();
	}

	// Blog with one parameterized constructor
	public Blog(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", description=" + description + "]+";
	}

}
