package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Spell")

public class Spell implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "spell_id", nullable = false)
	private int spell_id;
	
//	@Column(name = "level", nullable = false)
//	private int level;
	
	@Column(name = "spell_name", nullable = false)
	private String spell_name;
	
//	@Column(name = "school")
//	private String school;
//	
//	@Column(name = "castingTime")
//	private String castingTime;
//	
//	@Column(name = "range")
//	private String range;
//	
//	@Column(name = "material")
//	private String material;
//	
//	@Column(name = "duration")
//	private String duration;
//	
//	@Column(name = "description")
//	private String description;
//	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Components", joinColumns = @JoinColumn(name = "spell_id"))
//	@Column(name = "components", nullable = false)
//	private List<Character> components;

	
	public Spell() {
		super();
	}

public Spell(String spell_name) {
	super();
	this.spell_name = spell_name;
}

public Spell(int spell_id, String spell_name) {
	super();
	this.spell_id = spell_id;
	this.spell_name = spell_name;
}

public int getSpell_id() {
	return spell_id;
}

public void setSpell_id(int spell_id) {
	this.spell_id = spell_id;
}

public String getSpell_name() {
	return spell_name;
}

public void setSpell_name(String spell_name) {
	this.spell_name = spell_name;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
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
	return "Spell [spell_id=" + spell_id + ", spell_name=" + spell_name + "]";
}


}
