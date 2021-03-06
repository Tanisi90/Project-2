package com.revature.models;

import java.io.Serializable;
import java.util.List;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

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
	@PositiveOrZero
	private int class_id;
	
	@Column(name = "class_name", nullable = false)
	@NotEmpty(message = "We all belong somewhere")
	private String class_name;
	
	@Column(name = "level", nullable = false)
	@PositiveOrZero // can't start at level 0 have to start at level 1 right?
	private int level;
	
	@Column(name = "maxFirst")
	@PositiveOrZero
	private int maxFirst;
	
	@Column(name = "maxSecond")
	@PositiveOrZero
	private int maxSecond;
	
	@Column(name = "maxThird")
	@PositiveOrZero
	private int maxThird;
	
	@Column(name = "maxFourth")
	@PositiveOrZero
	private int maxFourth;
	
	@Column(name = "maxFifth")
	@PositiveOrZero
	private int maxFifth;
	
	@Column(name = "maxSixth")
	@PositiveOrZero
	private int maxSixth;
		
	@Column(name = "maxSeventh")
	@PositiveOrZero
	private int maxSeventh;
		
	@Column(name = "maxEighth")
	@PositiveOrZero
	private int maxEighth;
	
	@Column(name = "maxNinth")
	@PositiveOrZero
	private int maxNinth;
	
	
	@Column(name = "hitDice", nullable = false)
	@NotNull(message = "Gotta roll to know your characters hit points")
	private String hitDice;


	public Class(@NotEmpty(message = "We all belong somewhere") String class_name, @PositiveOrZero int level,
			@PositiveOrZero int maxFirst, @PositiveOrZero int maxSecond, @PositiveOrZero int maxThird,
			@PositiveOrZero int maxFourth, @PositiveOrZero int maxFifth, @PositiveOrZero int maxSixth,
			@PositiveOrZero int maxSeventh, @PositiveOrZero int maxEighth, @PositiveOrZero int maxNinth,
			@NotNull(message = "Gotta roll to know your characters hit points") String hitDice) {
		super();
		this.class_name = class_name;
		this.level = level;
		this.maxFirst = maxFirst;
		this.maxSecond = maxSecond;
		this.maxThird = maxThird;
		this.maxFourth = maxFourth;
		this.maxFifth = maxFifth;
		this.maxSixth = maxSixth;
		this.maxSeventh = maxSeventh;
		this.maxEighth = maxEighth;
		this.maxNinth = maxNinth;
		this.hitDice = hitDice;
	}


	public Class(@PositiveOrZero int class_id, @NotEmpty(message = "We all belong somewhere") String class_name,
			@PositiveOrZero int level, @PositiveOrZero int maxFirst, @PositiveOrZero int maxSecond,
			@PositiveOrZero int maxThird, @PositiveOrZero int maxFourth, @PositiveOrZero int maxFifth,
			@PositiveOrZero int maxSixth, @PositiveOrZero int maxSeventh, @PositiveOrZero int maxEighth,
			@PositiveOrZero int maxNinth,
			@NotNull(message = "Gotta roll to know your characters hit points") String hitDice) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.level = level;
		this.maxFirst = maxFirst;
		this.maxSecond = maxSecond;
		this.maxThird = maxThird;
		this.maxFourth = maxFourth;
		this.maxFifth = maxFifth;
		this.maxSixth = maxSixth;
		this.maxSeventh = maxSeventh;
		this.maxEighth = maxEighth;
		this.maxNinth = maxNinth;
		this.hitDice = hitDice;
	}
	
	
//	public Class() {
//		super();
//	}




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
