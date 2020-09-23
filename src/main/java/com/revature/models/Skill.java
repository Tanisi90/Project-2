//package com.revature.models;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.PositiveOrZero;
//
//import org.springframework.stereotype.Component;
//
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Table(name = "Skill")
//@Component
//@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
//public class Skill implements Serializable {
//	
//private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "skill_id", nullable = false)
//	@PositiveOrZero
//	private int skill_id;
//	
//	@Column(name = "skill_name", nullable = false)
//	@NotEmpty(message = "Dude you kicked their but what was that skill called!")
//	private String skill_name;
//	
//	@Column(name = "value", nullable = false)
//	@PositiveOrZero
//	private int value;
//	
//	@Column(name = "proficient", nullable = false)
//	private boolean proficient;
//	
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "attrib_id", referencedColumnName="attrib_id", insertable=false, updatable=false, nullable = false)
//	@NotNull(message = "Not everyone has the same attributes")
//	private Attribute attribute;
//
//	
//	
//	
////	public Skill() {
////		super();
////	}
//
//
//
//	public Skill(String skill_name, int value, Attribute attribute, boolean proficient) {
//		super();
//		this.skill_name = skill_name;
//		this.value = value;
//		this.attribute = attribute;
//		this.proficient = proficient;
//	}
//
//
//
//	public Skill(int skill_id, String skill_name, int value, Attribute attribute, boolean proficient) {
//		super();
//		this.skill_id = skill_id;
//		this.skill_name = skill_name;
//		this.value = value;
//		this.attribute = attribute;
//		this.proficient = proficient;
//	}
//
//
//
////	@Override
////	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + ((attribute == null) ? 0 : attribute.hashCode());
////		result = prime * result + (proficient ? 1231 : 1237);
////		result = prime * result + skill_id;
////		result = prime * result + ((skill_name == null) ? 0 : skill_name.hashCode());
////		result = prime * result + value;
////		return result;
////	}
////
////
////
////	@Override
////	public boolean equals(Object obj) {
////		if (this == obj)
////			return true;
////		if (obj == null)
////			return false;
////		if (getClass() != obj.getClass())
////			return false;
////		Skill other = (Skill) obj;
////		if (attribute == null) {
////			if (other.attribute != null)
////				return false;
////		} else if (!attribute.equals(other.attribute))
////			return false;
////		if (proficient != other.proficient)
////			return false;
////		if (skill_id != other.skill_id)
////			return false;
////		if (skill_name == null) {
////			if (other.skill_name != null)
////				return false;
////		} else if (!skill_name.equals(other.skill_name))
////			return false;
////		if (value != other.value)
////			return false;
////		return true;
////	}
////
////
////
////	@Override
////	public String toString() {
////		return "Skill [skill_id=" + skill_id + ", skill_name=" + skill_name + ", value=" + value + ", attribute="
////				+ attribute + ", proficient=" + proficient + "]";
////	}
//
//
//}
