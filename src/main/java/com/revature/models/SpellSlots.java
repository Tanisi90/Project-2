package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SpellSlots")

public class SpellSlots implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "slots_id", nullable = false)
	private int slots_id;
	
	private int currentFirst;
	private int maxFirst;
	private int currentSecond;
	private int maxSecond;
	private int currentThird;
	private int maxThird;
	private int currentFourth;
	private int maxFourth;
	private int currentFifth;
	private int maxFifth;
	private int currentSixth;
	private int maxSixth;
	private int currentSeventh;
	private int maxSeventh;
	private int currentEighth;
	private int maxEighth;
	private int currentNinth;
	private int maxNinth;
	
	
	
	public SpellSlots() {
		super();
	}



	public SpellSlots(int currentFirst, int maxFirst, int currentSecond, int maxSecond, int currentThird, int maxThird,
			int currentFourth, int maxFourth, int currentFifth, int maxFifth, int currentSixth, int maxSixth,
			int currentSeventh, int maxSeventh, int currentEighth, int maxEighth, int currentNinth, int maxNinth) {
		super();
		this.currentFirst = currentFirst;
		this.maxFirst = maxFirst;
		this.currentSecond = currentSecond;
		this.maxSecond = maxSecond;
		this.currentThird = currentThird;
		this.maxThird = maxThird;
		this.currentFourth = currentFourth;
		this.maxFourth = maxFourth;
		this.currentFifth = currentFifth;
		this.maxFifth = maxFifth;
		this.currentSixth = currentSixth;
		this.maxSixth = maxSixth;
		this.currentSeventh = currentSeventh;
		this.maxSeventh = maxSeventh;
		this.currentEighth = currentEighth;
		this.maxEighth = maxEighth;
		this.currentNinth = currentNinth;
		this.maxNinth = maxNinth;
	}



	public SpellSlots(int slots_id, int currentFirst, int maxFirst, int currentSecond, int maxSecond, int currentThird,
			int maxThird, int currentFourth, int maxFourth, int currentFifth, int maxFifth, int currentSixth,
			int maxSixth, int currentSeventh, int maxSeventh, int currentEighth, int maxEighth, int currentNinth,
			int maxNinth) {
		super();
		this.slots_id = slots_id;
		this.currentFirst = currentFirst;
		this.maxFirst = maxFirst;
		this.currentSecond = currentSecond;
		this.maxSecond = maxSecond;
		this.currentThird = currentThird;
		this.maxThird = maxThird;
		this.currentFourth = currentFourth;
		this.maxFourth = maxFourth;
		this.currentFifth = currentFifth;
		this.maxFifth = maxFifth;
		this.currentSixth = currentSixth;
		this.maxSixth = maxSixth;
		this.currentSeventh = currentSeventh;
		this.maxSeventh = maxSeventh;
		this.currentEighth = currentEighth;
		this.maxEighth = maxEighth;
		this.currentNinth = currentNinth;
		this.maxNinth = maxNinth;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentEighth;
		result = prime * result + currentFifth;
		result = prime * result + currentFirst;
		result = prime * result + currentFourth;
		result = prime * result + currentNinth;
		result = prime * result + currentSecond;
		result = prime * result + currentSeventh;
		result = prime * result + currentSixth;
		result = prime * result + currentThird;
		result = prime * result + maxEighth;
		result = prime * result + maxFifth;
		result = prime * result + maxFirst;
		result = prime * result + maxFourth;
		result = prime * result + maxNinth;
		result = prime * result + maxSecond;
		result = prime * result + maxSeventh;
		result = prime * result + maxSixth;
		result = prime * result + maxThird;
		result = prime * result + slots_id;
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
		SpellSlots other = (SpellSlots) obj;
		if (currentEighth != other.currentEighth)
			return false;
		if (currentFifth != other.currentFifth)
			return false;
		if (currentFirst != other.currentFirst)
			return false;
		if (currentFourth != other.currentFourth)
			return false;
		if (currentNinth != other.currentNinth)
			return false;
		if (currentSecond != other.currentSecond)
			return false;
		if (currentSeventh != other.currentSeventh)
			return false;
		if (currentSixth != other.currentSixth)
			return false;
		if (currentThird != other.currentThird)
			return false;
		if (maxEighth != other.maxEighth)
			return false;
		if (maxFifth != other.maxFifth)
			return false;
		if (maxFirst != other.maxFirst)
			return false;
		if (maxFourth != other.maxFourth)
			return false;
		if (maxNinth != other.maxNinth)
			return false;
		if (maxSecond != other.maxSecond)
			return false;
		if (maxSeventh != other.maxSeventh)
			return false;
		if (maxSixth != other.maxSixth)
			return false;
		if (maxThird != other.maxThird)
			return false;
		if (slots_id != other.slots_id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "SpellSlots [slots_id=" + slots_id + ", currentFirst=" + currentFirst + ", maxFirst=" + maxFirst
				+ ", currentSecond=" + currentSecond + ", maxSecond=" + maxSecond + ", currentThird=" + currentThird
				+ ", maxThird=" + maxThird + ", currentFourth=" + currentFourth + ", maxFourth=" + maxFourth
				+ ", currentFifth=" + currentFifth + ", maxFifth=" + maxFifth + ", currentSixth=" + currentSixth
				+ ", maxSixth=" + maxSixth + ", currentSeventh=" + currentSeventh + ", maxSeventh=" + maxSeventh
				+ ", currentEighth=" + currentEighth + ", maxEighth=" + maxEighth + ", currentNinth=" + currentNinth
				+ ", maxNinth=" + maxNinth + "]";
	}
	
	
	
	

}
