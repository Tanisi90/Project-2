package com.revature.models;

import java.util.List;

<<<<<<< Updated upstream
public class Campaign {
=======
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Campaign")

public class Campaign implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camp_id", nullable = false)
	private int camp_id;
	
	@Column(name = "camp_name")
	private String camp_name;
	
	@Column(name = "camp_description")
	private String camp_description;
	
	@Column(name = "visability", nullable = false)
	private boolean visability;
	
	@ManyToOne(nullable = false)
>>>>>>> Stashed changes
	
	private String name;
	private String description;
	private User dm;
<<<<<<< Updated upstream
=======
	
	@ElementCollection
	@CollectionTable(name = "Collect_Players", joinColumns = @JoinColumn(name = "camp_id"))
	@Column(name = "players")
>>>>>>> Stashed changes
	private List<User> players;

}
