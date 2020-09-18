package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dice")

public class Dice implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dice_id", nullable = false)
	private int dice_id;

	@Column(name = "number", nullable = false)
	private int number;
	
	@Column(name = "size", nullable = false)
	private int size;
	
//	@Column(name = "advantage", nullable = false)
//	private boolean advantage;
	
	
	public Dice() {
		super();
	}

public Dice(int number, int size) {
	super();
	this.number = number;
	this.size = size;
}

public Dice(int dice_id, int number, int size) {
	super();
	this.dice_id = dice_id;
	this.number = number;
	this.size = size;
}

public int getDice_id() {
	return dice_id;
}

public void setDice_id(int dice_id) {
	this.dice_id = dice_id;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + dice_id;
	result = prime * result + number;
	result = prime * result + size;
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
	Dice other = (Dice) obj;
	if (dice_id != other.dice_id)
		return false;
	if (number != other.number)
		return false;
	if (size != other.size)
		return false;
	return true;
}

@Override
public String toString() {
	return "Dice [dice_id=" + dice_id + ", number=" + number + ", size=" + size + "]";
}


	
	
	
	

}
