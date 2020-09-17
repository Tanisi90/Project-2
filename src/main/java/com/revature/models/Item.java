package com.revature.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Item")
public class Item implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id", nullable = false)
	private int item_id;
	
	@Column(name = "item_name", nullable = false)
	private String item_name;
	
	@Column(name = "item_description")
	private String item_description;
	
	@Column(name = "weight", nullable = false)
	private double weight;
	
	
	// Need to change to all 4 currencies
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id", nullable = false)
//	private Currency value;
	
	
	public Item() {
		super();
	}


	public Item(String item_name, String item_description, double weight) {
		super();
		this.item_name = item_name;
		this.item_description = item_description;
		this.weight = weight;
	}


	public Item(int item_id, String item_name, String item_description, double weight) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_description = item_description;
		this.weight = weight;
	}


	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getItem_description() {
		return item_description;
	}


	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_description == null) ? 0 : item_description.hashCode());
		result = prime * result + item_id;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Item other = (Item) obj;
		if (item_description == null) {
			if (other.item_description != null)
				return false;
		} else if (!item_description.equals(other.item_description))
			return false;
		if (item_id != other.item_id)
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_description=" + item_description
				+ ", weight=" + weight + "]";
	}


	

	
	
}
