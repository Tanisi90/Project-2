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
@Table(name = "Spell")

public class Spell implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "spell_id", nullable = false)
	private int spell_id;
	
	private int level;
	private String spell_name;
	private String school;
	private String castingTime;
	private String range;
	private String material;
	private String duration;
	private String description;
	private List<Character> components;
	
	
	public Spell() {
		super();
	}


	public Spell(int level, String spell_name, String school, String castingTime, String range, String material,
			String duration, String description, List<Character> components) {
		super();
		this.level = level;
		this.spell_name = spell_name;
		this.school = school;
		this.castingTime = castingTime;
		this.range = range;
		this.material = material;
		this.duration = duration;
		this.description = description;
		this.components = components;
	}


	public Spell(int spell_id, int level, String spell_name, String school, String castingTime, String range,
			String material, String duration, String description, List<Character> components) {
		super();
		this.spell_id = spell_id;
		this.level = level;
		this.spell_name = spell_name;
		this.school = school;
		this.castingTime = castingTime;
		this.range = range;
		this.material = material;
		this.duration = duration;
		this.description = description;
		this.components = components;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((castingTime == null) ? 0 : castingTime.hashCode());
		result = prime * result + ((components == null) ? 0 : components.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + level;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((range == null) ? 0 : range.hashCode());
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		result = prime * result + spell_id;
		result = prime * result + ((spell_name == null) ? 0 : spell_name.hashCode());
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
		Spell other = (Spell) obj;
		if (castingTime == null) {
			if (other.castingTime != null)
				return false;
		} else if (!castingTime.equals(other.castingTime))
			return false;
		if (components == null) {
			if (other.components != null)
				return false;
		} else if (!components.equals(other.components))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (level != other.level)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (range == null) {
			if (other.range != null)
				return false;
		} else if (!range.equals(other.range))
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		if (spell_id != other.spell_id)
			return false;
		if (spell_name == null) {
			if (other.spell_name != null)
				return false;
		} else if (!spell_name.equals(other.spell_name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Spell [spell_id=" + spell_id + ", level=" + level + ", spell_name=" + spell_name + ", school=" + school
				+ ", castingTime=" + castingTime + ", range=" + range + ", material=" + material + ", duration="
				+ duration + ", description=" + description + ", components=" + components + "]";
	}


	
	
	

}
