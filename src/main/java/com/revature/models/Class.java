package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Class")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Class implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "class_id", nullable = false)
	private int class_id;
	
	@Column(name = "class_name", nullable = false)
	private String class_name;
	
	@Column(name = "level", nullable = false)
	private int level;
	
	@Column(name = "maxFirst")
	private int maxFirst;
	
	@Column(name = "maxSecond")
	private int maxSecond;
	
	@Column(name = "maxThird")
	private int maxThird;
	
	@Column(name = "maxFourth")
	private int maxFourth;
	
	@Column(name = "maxFifth")
	private int maxFifth;
	
	@Column(name = "maxSixth")
	private int maxSixth;
		
	@Column(name = "maxSeventh")
	private int maxSeventh;
		
	@Column(name = "maxEighth")
	private int maxEighth;
	
	@Column(name = "maxNinth")
	private int maxNinth;
	
	
	//working on this
	private Dice hitDice;
	
	
//	public Class() {
//		super();
//	}


	public Class(String class_name, int level, Dice hitDice) {
		super();
		this.class_name = class_name;
		this.level = level;
		this.hitDice = hitDice;
	}


	public Class(int class_id, String class_name, int level, Dice hitDice) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.level = level;
		this.hitDice = hitDice;
	}

//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + class_id;
//		result = prime * result + ((class_name == null) ? 0 : class_name.hashCode());
//		result = prime * result + ((hitDice == null) ? 0 : hitDice.hashCode());
//		result = prime * result + level;
//		return result;
//	}
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
//		Class other = (Class) obj;
//		if (class_id != other.class_id)
//			return false;
//		if (class_name == null) {
//			if (other.class_name != null)
//				return false;
//		} else if (!class_name.equals(other.class_name))
//			return false;
//		if (hitDice == null) {
//			if (other.hitDice != null)
//				return false;
//		} else if (!hitDice.equals(other.hitDice))
//			return false;
//		if (level != other.level)
//			return false;
//		return true;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Class [class_id=" + class_id + ", class_name=" + class_name + ", level=" + level + ", hitDice="
//				+ hitDice + "]";
//	}


	
	
	

}
