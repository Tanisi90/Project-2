package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skill")

public class Skill implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "skill_id", nullable = false)
	private int skill_id;
	
	
	private String name;
	private int value;
	private Attribute attribute;
	private boolean proficient;
	
	
	
	public Skill() {
		super();
	}



	public Skill(String name, int value, Attribute attribute, boolean proficient) {
		super();
		this.name = name;
		this.value = value;
		this.attribute = attribute;
		this.proficient = proficient;
	}



	public Skill(int skill_id, String name, int value, Attribute attribute, boolean proficient) {
		super();
		this.skill_id = skill_id;
		this.name = name;
		this.value = value;
		this.attribute = attribute;
		this.proficient = proficient;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute == null) ? 0 : attribute.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (proficient ? 1231 : 1237);
		result = prime * result + skill_id;
		result = prime * result + value;
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
		Skill other = (Skill) obj;
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (!attribute.equals(other.attribute))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (proficient != other.proficient)
			return false;
		if (skill_id != other.skill_id)
			return false;
		if (value != other.value)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Skill [skill_id=" + skill_id + ", name=" + name + ", value=" + value + ", attribute=" + attribute
				+ ", proficient=" + proficient + "]";
	}
	
	
	
	

}
