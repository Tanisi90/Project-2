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
@Table(name = "HitPoints")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class HitPoints implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hitp_id", nullable = false)
	@PositiveOrZero
	private int hitp_id;

	@Column(name = "currentHP", nullable = false)
	@PositiveOrZero
	private int currentHP;
	
	@Column(name = "maxHP", nullable = false)
	@PositiveOrZero
	private int maxHP;
	
	@Column(name = "tempHP", nullable = false)
	@PositiveOrZero
	private int tempHP;
	
	@Column(name = "currentHD", nullable = false)
	@PositiveOrZero
	private int currentHD;
	
	@Column(name = "maxHD", nullable = false)
	@PositiveOrZero
	private int maxHD;
	
	//default below to 0?
	@Column(name = "deathSuccesses", nullable = false)
	@PositiveOrZero
	private int deathSuccesses;
	
	@Column(name = "deathFailures", nullable = false)
	@PositiveOrZero
	private int deathFailures;
	
	
	
//	public HitPoints() {
//		super();
//	}



	public HitPoints(int currentHP, int maxHP, int tempHP, int currentHD, int maxHD, int deathSuccesses,
			int deathFailures) {
		super();
		this.currentHP = currentHP;
		this.maxHP = maxHP;
		this.tempHP = tempHP;
		this.currentHD = currentHD;
		this.maxHD = maxHD;
		this.deathSuccesses = deathSuccesses;
		this.deathFailures = deathFailures;
	}



	public HitPoints(int hitp_id, int currentHP, int maxHP, int tempHP, int currentHD, int maxHD, int deathSuccesses,
			int deathFailures) {
		super();
		this.hitp_id = hitp_id;
		this.currentHP = currentHP;
		this.maxHP = maxHP;
		this.tempHP = tempHP;
		this.currentHD = currentHD;
		this.maxHD = maxHD;
		this.deathSuccesses = deathSuccesses;
		this.deathFailures = deathFailures;
	}



//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + currentHD;
//		result = prime * result + currentHP;
//		result = prime * result + deathFailures;
//		result = prime * result + deathSuccesses;
//		result = prime * result + hitp_id;
//		result = prime * result + maxHD;
//		result = prime * result + maxHP;
//		result = prime * result + tempHP;
//		return result;
//	}
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HitPoints other = (HitPoints) obj;
//		if (currentHD != other.currentHD)
//			return false;
//		if (currentHP != other.currentHP)
//			return false;
//		if (deathFailures != other.deathFailures)
//			return false;
//		if (deathSuccesses != other.deathSuccesses)
//			return false;
//		if (hitp_id != other.hitp_id)
//			return false;
//		if (maxHD != other.maxHD)
//			return false;
//		if (maxHP != other.maxHP)
//			return false;
//		if (tempHP != other.tempHP)
//			return false;
//		return true;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "HitPoints [hitp_id=" + hitp_id + ", currentHP=" + currentHP + ", maxHP=" + maxHP + ", tempHP=" + tempHP
//				+ ", currentHD=" + currentHD + ", maxHD=" + maxHD + ", deathSuccesses=" + deathSuccesses
//				+ ", deathFailures=" + deathFailures + "]";
//	}
//	
	
	
	
	

}
