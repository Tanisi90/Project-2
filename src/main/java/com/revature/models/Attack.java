package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Attack")
public class Attack implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attack_id", nullable = false)
	private int attack_id;

	@Column (name = "attack_name")
	private String attack_name;
	
	@Column (name = "type")
	private String type;
	
	@Column (name = "bonus")
	private int bonus;
	
	@ManyToOne
	private Dice damage;

	public Attack() {
		super();

	}

	public Attack(String attack_name, String type, int bonus, Dice damage) {
		super();
		this.attack_name = attack_name;
		this.type = type;
		this.bonus = bonus;
		this.damage = damage;
	}

	public Attack(int attack_id, String attack_name, String type, int bonus, Dice damage) {
		super();
		this.attack_id = attack_id;
		this.attack_name = attack_name;
		this.type = type;
		this.bonus = bonus;
		this.damage = damage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack_id;
		result = prime * result + ((attack_name == null) ? 0 : attack_name.hashCode());
		result = prime * result + bonus;
		result = prime * result + ((damage == null) ? 0 : damage.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Attack other = (Attack) obj;
		if (attack_id != other.attack_id)
			return false;
		if (attack_name == null) {
			if (other.attack_name != null)
				return false;
		} else if (!attack_name.equals(other.attack_name))
			return false;
		if (bonus != other.bonus)
			return false;
		if (damage == null) {
			if (other.damage != null)
				return false;
		} else if (!damage.equals(other.damage))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Attack [attack_id=" + attack_id + ", attack_name=" + attack_name + ", type=" + type + ", bonus=" + bonus
				+ ", damage=" + damage + "]";
	}

	
}
