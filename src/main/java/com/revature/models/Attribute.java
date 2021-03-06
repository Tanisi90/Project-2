package com.revature.models;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Attribute")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Attribute implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attrib_id", nullable = false)
	@PositiveOrZero
	private int attrib_id;
	
	@Column(name = "attrib_name", nullable = false)
	@NotNull(message = "All attributes have a name!")
	private String attrib_name;
	
	@Column(name = "value", nullable = false)
	@PositiveOrZero
	private int value;
	
	@Column(name = "modifier", nullable = false)
	@PositiveOrZero
	private int modifier;
	
	@Column(name = "save", nullable = false)
	@PositiveOrZero
	private int save; //save is an int?
	
	
//	public Attribute() {
//		super();
//	}


	public Attribute(String attrib_name, int value, int modifier, int save) {
		super();
		this.attrib_name = attrib_name;
		this.value = value;
		this.modifier = modifier;
		this.save = save;
	}


	public Attribute(int attrib_id, String attrib_name, int value, int modifier, int save) {
		super();
		this.attrib_id = attrib_id;
		this.attrib_name = attrib_name;
		this.value = value;
		this.modifier = modifier;
		this.save = save;
	}


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + attrib_id;
//		result = prime * result + ((attrib_name == null) ? 0 : attrib_name.hashCode());
//		result = prime * result + modifier;
//		result = prime * result + save;
//		result = prime * result + value;
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
//		Attribute other = (Attribute) obj;
//		if (attrib_id != other.attrib_id)
//			return false;
//		if (attrib_name == null) {
//			if (other.attrib_name != null)
//				return false;
//		} else if (!attrib_name.equals(other.attrib_name))
//			return false;
//		if (modifier != other.modifier)
//			return false;
//		if (save != other.save)
//			return false;
//		if (value != other.value)
//			return false;
//		return true;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Attribute [attrib_id=" + attrib_id + ", attrib_name=" + attrib_name + ", value=" + value + ", modifier="
//				+ modifier + ", save=" + save + "]";
//	}



}
