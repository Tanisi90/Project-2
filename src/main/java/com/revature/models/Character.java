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
	
	
	@Column(name = "currentFirst")
	private int currentFirst;
	
	@Column(name = "currentSecond")
	private int currentSecond;
	
	@Column(name = "currentThird")
	private int currentThird;
	
	@Column(name = "currentFourth")
	private int currentFourth;
	
	@Column(name = "currentFifth")
	private int currentFifth;
	
	@Column(name = "currentSixth")
	private int currentSixth;
		
	@Column(name = "currentSeventh")
	private int currentSeventh;
		
	@Column(name = "currentEighth")
	private int currentEighth;
	
	@Column(name = "currentNinth")
	private int currentNinth;
	
	@Column(name = "inspiration", nullable = false)
	private boolean inspiration;
	
	@Column(name = "visability", nullable = false)
	private boolean visability;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Attribute", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "attributes", nullable = false)
	private List<Attribute> attributes;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Skills", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "skills", nullable = false)
	private List<Skill> skills;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Attacks", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "attacks", nullable = false)
	private List<Attack> attacks;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Spells", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "spells", nullable = false)
	private List<Spell> spells;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Equipment", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "equipment", nullable = false)
	private List<Item> equipment;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Languages", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "languages", nullable = false)
	private List<String> languages;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Proficiencies", joinColumns = @JoinColumn(name = "char_id"))
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


	public Character() {
		super();
	}


	public Character(String char_name, String alignment, String char_background, int armorClass, int initiative,
			int speed, int exp, int profBonus, int currentFirst, int currentSecond, int currentThird, int currentFourth,
			int currentFifth, int currentSixth, int currentSeventh, int currentEighth, int currentNinth,
			boolean inspiration, boolean visability, List<Attribute> attributes, List<Skill> skills,
			List<Attack> attacks, List<Spell> spells, List<Item> equipment, List<String> languages,
			List<String> proficiencies, Class class1, User player, Campaign campaign, Race race) {
		super();
		this.char_name = char_name;
		this.alignment = alignment;
		this.char_background = char_background;
		this.armorClass = armorClass;
		this.initiative = initiative;
		this.speed = speed;
		this.exp = exp;
		this.profBonus = profBonus;
		this.currentFirst = currentFirst;
		this.currentSecond = currentSecond;
		this.currentThird = currentThird;
		this.currentFourth = currentFourth;
		this.currentFifth = currentFifth;
		this.currentSixth = currentSixth;
		this.currentSeventh = currentSeventh;
		this.currentEighth = currentEighth;
		this.currentNinth = currentNinth;
		this.inspiration = inspiration;
		this.visability = visability;
		this.attributes = attributes;
		this.skills = skills;
		this.attacks = attacks;
		this.spells = spells;
		this.equipment = equipment;
		this.languages = languages;
		this.proficiencies = proficiencies;
		this.class1 = class1;
		this.player = player;
		this.campaign = campaign;
		this.race = race;
	}


	public Character(int char_id, String char_name, String alignment, String char_background, int armorClass,
			int initiative, int speed, int exp, int profBonus, int currentFirst, int currentSecond, int currentThird,
			int currentFourth, int currentFifth, int currentSixth, int currentSeventh, int currentEighth,
			int currentNinth, boolean inspiration, boolean visability, List<Attribute> attributes, List<Skill> skills,
			List<Attack> attacks, List<Spell> spells, List<Item> equipment, List<String> languages,
			List<String> proficiencies, Class class1, User player, Campaign campaign, Race race) {
		super();
		this.char_id = char_id;
		this.char_name = char_name;
		this.alignment = alignment;
		this.char_background = char_background;
		this.armorClass = armorClass;
		this.initiative = initiative;
		this.speed = speed;
		this.exp = exp;
		this.profBonus = profBonus;
		this.currentFirst = currentFirst;
		this.currentSecond = currentSecond;
		this.currentThird = currentThird;
		this.currentFourth = currentFourth;
		this.currentFifth = currentFifth;
		this.currentSixth = currentSixth;
		this.currentSeventh = currentSeventh;
		this.currentEighth = currentEighth;
		this.currentNinth = currentNinth;
		this.inspiration = inspiration;
		this.visability = visability;
		this.attributes = attributes;
		this.skills = skills;
		this.attacks = attacks;
		this.spells = spells;
		this.equipment = equipment;
		this.languages = languages;
		this.proficiencies = proficiencies;
		this.class1 = class1;
		this.player = player;
		this.campaign = campaign;
		this.race = race;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
		result = prime * result + armorClass;
		result = prime * result + ((attacks == null) ? 0 : attacks.hashCode());
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((campaign == null) ? 0 : campaign.hashCode());
		result = prime * result + ((char_background == null) ? 0 : char_background.hashCode());
		result = prime * result + char_id;
		result = prime * result + ((char_name == null) ? 0 : char_name.hashCode());
		result = prime * result + ((class1 == null) ? 0 : class1.hashCode());
		result = prime * result + currentEighth;
		result = prime * result + currentFifth;
		result = prime * result + currentFirst;
		result = prime * result + currentFourth;
		result = prime * result + currentNinth;
		result = prime * result + currentSecond;
		result = prime * result + currentSeventh;
		result = prime * result + currentSixth;
		result = prime * result + currentThird;
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
		result = prime * result + exp;
		result = prime * result + initiative;
		result = prime * result + (inspiration ? 1231 : 1237);
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + profBonus;
		result = prime * result + ((proficiencies == null) ? 0 : proficiencies.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + speed;
		result = prime * result + ((spells == null) ? 0 : spells.hashCode());
		result = prime * result + (visability ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (alignment == null) {
			if (other.alignment != null)
				return false;
		} else if (!alignment.equals(other.alignment))
			return false;
		if (armorClass != other.armorClass)
			return false;
		if (attacks == null) {
			if (other.attacks != null)
				return false;
		} else if (!attacks.equals(other.attacks))
			return false;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (campaign == null) {
			if (other.campaign != null)
				return false;
		} else if (!campaign.equals(other.campaign))
			return false;
		if (char_background == null) {
			if (other.char_background != null)
				return false;
		} else if (!char_background.equals(other.char_background))
			return false;
		if (char_id != other.char_id)
			return false;
		if (char_name == null) {
			if (other.char_name != null)
				return false;
		} else if (!char_name.equals(other.char_name))
			return false;
		if (class1 == null) {
			if (other.class1 != null)
				return false;
		} else if (!class1.equals(other.class1))
			return false;
		if (currentEighth != other.currentEighth)
			return false;
		if (currentFifth != other.currentFifth)
			return false;
		if (currentFirst != other.currentFirst)
			return false;
		if (currentFourth != other.currentFourth)
			return false;
		if (currentNinth != other.currentNinth)
			return false;
		if (currentSecond != other.currentSecond)
			return false;
		if (currentSeventh != other.currentSeventh)
			return false;
		if (currentSixth != other.currentSixth)
			return false;
		if (currentThird != other.currentThird)
			return false;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		if (exp != other.exp)
			return false;
		if (initiative != other.initiative)
			return false;
		if (inspiration != other.inspiration)
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (profBonus != other.profBonus)
			return false;
		if (proficiencies == null) {
			if (other.proficiencies != null)
				return false;
		} else if (!proficiencies.equals(other.proficiencies))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (speed != other.speed)
			return false;
		if (spells == null) {
			if (other.spells != null)
				return false;
		} else if (!spells.equals(other.spells))
			return false;
		if (visability != other.visability)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Character [char_id=" + char_id + ", char_name=" + char_name + ", alignment=" + alignment
				+ ", char_background=" + char_background + ", armorClass=" + armorClass + ", initiative=" + initiative
				+ ", speed=" + speed + ", exp=" + exp + ", profBonus=" + profBonus + ", currentFirst=" + currentFirst
				+ ", currentSecond=" + currentSecond + ", currentThird=" + currentThird + ", currentFourth="
				+ currentFourth + ", currentFifth=" + currentFifth + ", currentSixth=" + currentSixth
				+ ", currentSeventh=" + currentSeventh + ", currentEighth=" + currentEighth + ", currentNinth="
				+ currentNinth + ", inspiration=" + inspiration + ", visability=" + visability + ", attributes="
				+ attributes + ", skills=" + skills + ", attacks=" + attacks + ", spells=" + spells + ", equipment="
				+ equipment + ", languages=" + languages + ", proficiencies=" + proficiencies + ", class1=" + class1
				+ ", player=" + player + ", campaign=" + campaign + ", race=" + race + "]";
	}
	
	

	
}
