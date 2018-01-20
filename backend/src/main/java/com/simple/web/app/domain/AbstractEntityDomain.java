package com.simple.web.app.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class AbstractEntityDomain implements Serializable {

	private static final long serialVersionUID = -6268927772789995394L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isPersisted() {
		return this.id > 0;
	}
}
