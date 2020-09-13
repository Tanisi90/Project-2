package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Race")

public class Race implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "race_id", nullable = false)
	private int race_id;
	
	private String name;
	private String subrace;
	private String size;
	private String r_description;
	private List<Feature> features;
	
	
	
	public Race() {
		super();
	}



	public Race(String name, String subrace, String size, String r_description, List<Feature> features) {
		super();
		this.name = name;
		this.subrace = subrace;
		this.size = size;
		this.r_description = r_description;
		this.features = features;
	}



	public Race(int race_id, String name, String subrace, String size, String r_description, List<Feature> features) {
		super();
		this.race_id = race_id;
		this.name = name;
		this.subrace = subrace;
		this.size = size;
		this.r_description = r_description;
		this.features = features;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((features == null) ? 0 : features.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((r_description == null) ? 0 : r_description.hashCode());
		result = prime * result + race_id;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((subrace == null) ? 0 : subrace.hashCode());
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
		Race other = (Race) obj;
		if (features == null) {
			if (other.features != null)
				return false;
		} else if (!features.equals(other.features))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (r_description == null) {
			if (other.r_description != null)
				return false;
		} else if (!r_description.equals(other.r_description))
			return false;
		if (race_id != other.race_id)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (subrace == null) {
			if (other.subrace != null)
				return false;
		} else if (!subrace.equals(other.subrace))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Race [race_id=" + race_id + ", name=" + name + ", subrace=" + subrace + ", size=" + size
				+ ", r_description=" + r_description + ", features=" + features + "]";
	}



	
	
	
	

}
