package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Class")
public class Class implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "class_id", nullable = false)
	private int class_id;
	
	private String name;
	private int level;
	private Dice hitDice;
	
	
	public Class() {
		super();
	}


	public Class(String name, int level, Dice hitDice) {
		super();
		this.name = name;
		this.level = level;
		this.hitDice = hitDice;
	}


	public Class(int class_id, String name, int level, Dice hitDice) {
		super();
		this.class_id = class_id;
		this.name = name;
		this.level = level;
		this.hitDice = hitDice;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + class_id;
		result = prime * result + ((hitDice == null) ? 0 : hitDice.hashCode());
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		if (class_id != other.class_id)
			return false;
		if (hitDice == null) {
			if (other.hitDice != null)
				return false;
		} else if (!hitDice.equals(other.hitDice))
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Class [class_id=" + class_id + ", name=" + name + ", level=" + level + ", hitDice=" + hitDice + "]";
	}
	
	
	
	

}
