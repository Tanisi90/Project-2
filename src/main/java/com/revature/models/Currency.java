package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Currency")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Currency implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "curr_id", nullable = false)
	@PositiveOrZero
	private int curr_id;
	
	//default all below to 0
	@Column(name = "copper", nullable = false)
	@PositiveOrZero
	private int copper;
	
	@Column(name = "silver", nullable = false)
	@PositiveOrZero
	private int silver;
	
	@Column(name = "gold", nullable = false)
	@PositiveOrZero
	private int gold;
	
	@Column(name = "platinum", nullable = false)
	@PositiveOrZero
	private int platinum;
	
//	@Column(name = "total", nullable = false)
//	@PositiveOrZero
//	private double total; // may be able to have this auto calculated

//	public Currency() {
//		super();
//	}

	public Currency(int copper, int silver, int gold, int platinum, double total) {
		super();
		this.copper = copper;
		this.silver = silver;
		this.gold = gold;
		this.platinum = platinum;
		//this.total = total;
	}

	public Currency(int curr_id, int copper, int silver, int gold, int platinum, double total) {
		super();
		this.curr_id = curr_id;
		this.copper = copper;
		this.silver = silver;
		this.gold = gold;
		this.platinum = platinum;
		//this.total = total;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + copper;
//		result = prime * result + curr_id;
//		result = prime * result + gold;
//		result = prime * result + platinum;
//		result = prime * result + silver;
//		long temp;
//		temp = Double.doubleToLongBits(total);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Currency other = (Currency) obj;
//		if (copper != other.copper)
//			return false;
//		if (curr_id != other.curr_id)
//			return false;
//		if (gold != other.gold)
//			return false;
//		if (platinum != other.platinum)
//			return false;
//		if (silver != other.silver)
//			return false;
//		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Currency [curr_id=" + curr_id + ", copper=" + copper + ", silver=" + silver + ", gold=" + gold
//				+ ", platinum=" + platinum + ", total=" + total + "]";
//	}
	
	
	
	


}
