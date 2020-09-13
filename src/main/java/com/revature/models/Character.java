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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Character")

public class Character implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "char_id", nullable = false)
	private int char_id;
	
	@Column(name = "char_name", nullable = false)
	private String char_name;
	
	@Column(name = "alignment", nullable = false)
	private String alignment;
	
	@Column(name = "char_background", nullable = false)
	private String char_background;
	
	@Column(name = "armorClass", nullable = false)
	private int armorClass;
	
	@Column(name = "initiative", nullable = false)
	private int initiative;
	
	@Column(name = "speed", nullable = false)
	private int speed;
	
	@Column(name = "exp", nullable = false)
	private int exp;
	
	@Column(name = "profBonus", nullable = false)
	private int profBonus;
	
	@Column(name = "inspiration", nullable = false)
	private boolean inspiration;
	
	@Column(name = "visability", nullable = false)
	private boolean visability;
	
	@ElementCollection
	@Column(name = "attributes", nullable = false)
	private List<Attribute> attributes;
	
	@ElementCollection
	@Column(name = "skills", nullable = false)
	private List<Skill> skills;
	
	@ElementCollection
	@Column(name = "attacks", nullable = false)
	private List<Attack> attacks;
	
	@ElementCollection
	@Column(name = "spells", nullable = false)
	private List<Spell> spells;
	
	@ElementCollection
	@Column(name = "equipment", nullable = false)
	private List<Item> equipment;
	
	@ElementCollection
	@Column(name = "languages", nullable = false)
	private List<String> languages;
	
	@ElementCollection
	@Column(name = "proficiencies", nullable = false)
	private List<String> proficiencies;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "class_id", nullable = false)
	private Class class1;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User player;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "camp_id", nullable = false)
	private Campaign campaign;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "race_id", nullable = false)
	private Race race;
	
	@OneToOne
	@JoinColumn(name = "slots_id", referencedColumnName = "fk_slots_id")
	private SpellSlots spellSlots;
	
	@OneToOne
	@JoinColumn(name = "curr_id", referencedColumnName = "fk_curr_id")
	private Currency currency;

	public Character() {
		super();
	}

	
}
