package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Campaign")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Campaign implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camp_id", nullable = false)
	private int camp_id;
	
	@Column(name = "camp_name", nullable = false)
	private String camp_name;
	
	@Column(name = "camp_description")
	private String camp_description;
	
	
	@Column(name = "visibility", nullable = false)
	private boolean visibility;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "user_id", nullable = false)
	private User dm;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Players", joinColumns = @JoinColumn(name = "camp_id"))
	@Column(name = "players", nullable = false)
	private List<User> players;


//	public Campaign() {
//		super();
//	}

	public Campaign(String camp_name, String camp_description, User dm, List<User> players, boolean visibility) {
		super();
		this.camp_name = camp_name;
		this.camp_description = camp_description;
		this.dm = dm;
		this.players = players;
		this.visibility = visibility;
	}

	public Campaign(int camp_id, String camp_name, String camp_description, User dm, List<User> players,
			boolean visibility) {
		super();
		this.camp_id = camp_id;
		this.camp_name = camp_name;
		this.camp_description = camp_description;
		this.dm = dm;
		this.players = players;
		this.visibility = visibility;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((camp_description == null) ? 0 : camp_description.hashCode());
//		result = prime * result + camp_id;
//		result = prime * result + ((camp_name == null) ? 0 : camp_name.hashCode());
//		result = prime * result + ((dm == null) ? 0 : dm.hashCode());
//		result = prime * result + ((players == null) ? 0 : players.hashCode());
//		result = prime * result + (visibility ? 1231 : 1237);
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Campaign other = (Campaign) obj;
//		if (camp_description == null) {
//			if (other.camp_description != null)
//				return false;
//		} else if (!camp_description.equals(other.camp_description))
//			return false;
//		if (camp_id != other.camp_id)
//			return false;
//		if (camp_name == null) {
//			if (other.camp_name != null)
//				return false;
//		} else if (!camp_name.equals(other.camp_name))
//			return false;
//		if (dm == null) {
//			if (other.dm != null)
//				return false;
//		} else if (!dm.equals(other.dm))
//			return false;
//		if (players == null) {
//			if (other.players != null)
//				return false;
//		} else if (!players.equals(other.players))
//			return false;
//		if (visibility != other.visibility)
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Campaign [camp_id=" + camp_id + ", camp_name=" + camp_name + ", camp_description=" + camp_description
//				+ ", dm=" + dm + ", players=" + players + ", visibility=" + visibility + "]";
//	}

	

	
}
