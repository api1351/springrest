package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String authorNaame;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorNaame() {
		return authorNaame;
	}
	public void setAuthorNaame(String authorNaame) {
		this.authorNaame = authorNaame;
	}
	public Books(int id, String name, String authorNaame) {
		super();
		this.id = id;
		this.name = name;
		this.authorNaame = authorNaame;
	}
	
}
