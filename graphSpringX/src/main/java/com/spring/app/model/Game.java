/**
 * 
 */
package com.spring.app.model;

/**
 * @author SRT
 *
 */
public class Game {

	/**
	 * 
	 */
	
	private String id;

	private String name;

    private Integer cost;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

 
 
	public Game(String id, String name, Integer cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	
	
}
