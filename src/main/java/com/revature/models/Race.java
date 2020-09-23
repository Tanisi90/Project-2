//package com.revature.models;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;
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
//@Table(name = "Race")
//@Component
//@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
//public class Race implements Serializable {
//	
//private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "race_id", nullable = false)
//	@PositiveOrZero
//	private int race_id;
//	
//	@Column(name = "race_name", nullable = false)
//	@NotEmpty(message = "It's and Elf its and Orc it's a....?")
//	private String race_name;
//	
//	@Column(name = "subrace")
//	private String subrace;
//	
//	@Column(name = "size", nullable = false)
//	@NotEmpty(message = "Yeah yeah most are medium but what are you?")
//	private String size;
//	
//	@Column(name = "r_description")
//	private String r_description;
//	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Features", joinColumns = @JoinColumn(name = "race_id"))
//	@Column(name = "features", nullable = false)
//	@NotEmpty(message = "Every race has unique features.")
//	private List<Feature> features;
//	
//	
//	
////	public Race() {
////		super();
////	}
//
//
//
//	public Race(String race_name, String subrace, String size, String r_description, List<Feature> features) {
//		super();
//		this.race_name = race_name;
//		this.subrace = subrace;
//		this.size = size;
//		this.r_description = r_description;
//		this.features = features;
//	}
//
//
//
//	public Race(int race_id, String race_name, String subrace, String size, String r_description,
//			List<Feature> features) {
//		super();
//		this.race_id = race_id;
//		this.race_name = race_name;
//		this.subrace = subrace;
//		this.size = size;
//		this.r_description = r_description;
//		this.features = features;
//	}
//
//
//
////	@Override
////	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + ((features == null) ? 0 : features.hashCode());
////		result = prime * result + ((r_description == null) ? 0 : r_description.hashCode());
////		result = prime * result + race_id;
////		result = prime * result + ((race_name == null) ? 0 : race_name.hashCode());
////		result = prime * result + ((size == null) ? 0 : size.hashCode());
////		result = prime * result + ((subrace == null) ? 0 : subrace.hashCode());
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
////		Race other = (Race) obj;
////		if (features == null) {
////			if (other.features != null)
////				return false;
////		} else if (!features.equals(other.features))
////			return false;
////		if (r_description == null) {
////			if (other.r_description != null)
////				return false;
////		} else if (!r_description.equals(other.r_description))
////			return false;
////		if (race_id != other.race_id)
////			return false;
////		if (race_name == null) {
////			if (other.race_name != null)
////				return false;
////		} else if (!race_name.equals(other.race_name))
////			return false;
////		if (size == null) {
////			if (other.size != null)
////				return false;
////		} else if (!size.equals(other.size))
////			return false;
////		if (subrace == null) {
////			if (other.subrace != null)
////				return false;
////		} else if (!subrace.equals(other.subrace))
////			return false;
////		return true;
////	}
////
////
////
////	@Override
////	public String toString() {
////		return "Race [race_id=" + race_id + ", race_name=" + race_name + ", subrace=" + subrace + ", size=" + size
////				+ ", r_description=" + r_description + ", features=" + features + "]";
////	}
//
//
//}
