package com.revature.models;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Character")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Character implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "char_id", nullable = false)
	@PositiveOrZero
	private int char_id;
	
	@Column(name = "char_name", nullable = false)
	@Size(min=6, max=30, message= "Your character name must be between 6 and 30 characters.")
	private String char_name;
	
	@Column(name = "alignment", nullable = false)
	@NotNull(message = "Are you a moral person or naw?")
	private String alignment;
	
	@Column(name = "char_background", nullable = false)
	@NotNull(message = "I know you come from somewhere!")
	private String char_background;
	
	@Column(name = "armorClass", nullable = false)
	@PositiveOrZero
	private int armorClass;
	
	@Column(name = "initiative", nullable = false)
	@PositiveOrZero
	private int initiative;
	
	@Column(name = "speed", nullable = false)
	@PositiveOrZero
	private int speed;
	
	@Column(name = "exp", nullable = false)
	@PositiveOrZero
	private int exp;
	
	@Column(name = "profBonus", nullable = false)
	@PositiveOrZero
	private int profBonus;
	
	//Current is for the spell slots
	@Column(name = "currentFirst")
	@PositiveOrZero
	private int currentFirst;
	
	@Column(name = "currentSecond")
	@PositiveOrZero
	private int currentSecond;
	
	@Column(name = "currentThird")
	@PositiveOrZero
	private int currentThird;
	
	@Column(name = "currentFourth")
	@PositiveOrZero
	private int currentFourth;
	
	@Column(name = "currentFifth")
	@PositiveOrZero
	private int currentFifth;
	
	@Column(name = "currentSixth")
	@PositiveOrZero
	private int currentSixth;
		
	@Column(name = "currentSeventh")
	@PositiveOrZero
	private int currentSeventh;
		
	@Column(name = "currentEighth")
	@PositiveOrZero
	private int currentEighth;
	
	@Column(name = "currentNinth")
	@PositiveOrZero
	private int currentNinth;
	
	@Column(name = "inspiration", nullable = false)
	private boolean inspiration;
	
	@Column(name = "visability", nullable = false)
	private boolean visability;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Attribute", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "attributes", nullable = false)
	@NotNull(message = "You must have an attribute.")
	private List<Attribute> attributes;
	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Skills", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "skills", nullable = false)
	@NotNull(message = "Combat skills are a must!")
	private String skills;
	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Attacks", joinColumns = @JoinColumn(name = "char_id"))
//	@Column(name = "attacks", nullable = false)
//	private List<Attack> attacks;
	
	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Spells", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "spells")
	private String spells;
	
	
//	@ElementCollection
//	@CollectionTable(name = "Collect_Equipment", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "equipment", nullable = false)
	@NotNull(message = "You can't streak in this game!")
	private String equipment;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Languages", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "languages", nullable = false)
	@NotNull(message = "Everyone has a language!")
	private List<String> languages;
	
	@ElementCollection
	@CollectionTable(name = "Collect_Proficiencies", joinColumns = @JoinColumn(name = "char_id"))
	@Column(name = "proficiencies", nullable = false)
	@NotNull(message = "Everyone is good at something!")
	private List<String> proficiencies;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "class_id", referencedColumnName="class_id", insertable=false, updatable=false,  nullable = false)
	@NotNull(message = "Everyone belongs somewhere!")
	private Class class1;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName= "user_id", insertable=false, updatable=false,  nullable = false)
	@NotNull(message = "Every player has an ID!")
	private User player;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "camp_id", referencedColumnName="camp_id", insertable=false, updatable=false, nullable = false)
	@NotNull(message = "If a campaign is created so was a number.")
	private Campaign campaign;
	
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "race_id", referencedColumnName="race_id", insertable=false, updatable=false, nullable = false)
	@Column(name = "race", nullable = false)
	@NotNull(message = "If it exist it has a race.")
	private String race;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "curr_id", referencedColumnName="curr_id", insertable=false, updatable=false, nullable = false)
	@NotNull(message = "You started from the bottom now you'll sell.")
	private Currency currency;

	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "hitp_id", referencedColumnName="hitp_id", insertable=false, updatable=false, nullable = false)
	@NotNull(message = "Every character does some damage.")
	private HitPoints hitpoints;
	
//	@ElementCollection
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "char_features", joinColumns = { @JoinColumn(name = "char_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "feat_id")})
	@NotNull(message = "All characters have features.")
	private Collection<Feature> char_feature;
	
//	public Character() {
//	super();
//}

	public Character(
			@Size(min = 6, max = 30, message = "Your character name must be between 6 and 30 characters.") String char_name,
			@NotNull(message = "Are you a moral person or naw?") String alignment,
			@NotNull(message = "I know you come from somewhere!") String char_background,
			@PositiveOrZero int armorClass, @PositiveOrZero int initiative, @PositiveOrZero int speed,
			@PositiveOrZero int exp, @PositiveOrZero int profBonus, @PositiveOrZero int currentFirst,
			@PositiveOrZero int currentSecond, @PositiveOrZero int currentThird, @PositiveOrZero int currentFourth,
			@PositiveOrZero int currentFifth, @PositiveOrZero int currentSixth, @PositiveOrZero int currentSeventh,
			@PositiveOrZero int currentEighth, @PositiveOrZero int currentNinth, boolean inspiration,
			boolean visability, @NotNull(message = "You must have an attribute.") List<Attribute> attributes,
			@NotNull(message = "Combat skills are a must!") String skills, String spells,
			@NotNull(message = "You can't streak in this game!") String equipment,
			@NotNull(message = "Everyone has a language!") List<String> languages,
			@NotNull(message = "Everyone is good at something!") List<String> proficiencies,
			@NotNull(message = "Everyone belongs somewhere!") Class class1,
			@NotNull(message = "Every player has an ID!") User player,
			@NotNull(message = "If a campaign is created so was a number.") Campaign campaign,
			@NotNull(message = "If it exist it has a race.") String race,
			@NotNull(message = "You started from the bottom now you'll sell.") Currency currency,
			@NotNull(message = "Every character does some damage.") HitPoints hitpoints,
			@NotNull(message = "All characters have features.") Collection<Feature> char_feature) {
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
		this.spells = spells;
		this.equipment = equipment;
		this.languages = languages;
		this.proficiencies = proficiencies;
		this.class1 = class1;
		this.player = player;
		this.campaign = campaign;
		this.race = race;
		this.currency = currency;
		this.hitpoints = hitpoints;
		this.char_feature = char_feature;
	}

	public Character(@PositiveOrZero int char_id,
			@Size(min = 6, max = 30, message = "Your character name must be between 6 and 30 characters.") String char_name,
			@NotNull(message = "Are you a moral person or naw?") String alignment,
			@NotNull(message = "I know you come from somewhere!") String char_background,
			@PositiveOrZero int armorClass, @PositiveOrZero int initiative, @PositiveOrZero int speed,
			@PositiveOrZero int exp, @PositiveOrZero int profBonus, @PositiveOrZero int currentFirst,
			@PositiveOrZero int currentSecond, @PositiveOrZero int currentThird, @PositiveOrZero int currentFourth,
			@PositiveOrZero int currentFifth, @PositiveOrZero int currentSixth, @PositiveOrZero int currentSeventh,
			@PositiveOrZero int currentEighth, @PositiveOrZero int currentNinth, boolean inspiration,
			boolean visability, @NotNull(message = "You must have an attribute.") List<Attribute> attributes,
			@NotNull(message = "Combat skills are a must!") String skills, String spells,
			@NotNull(message = "You can't streak in this game!") String equipment,
			@NotNull(message = "Everyone has a language!") List<String> languages,
			@NotNull(message = "Everyone is good at something!") List<String> proficiencies,
			@NotNull(message = "Everyone belongs somewhere!") Class class1,
			@NotNull(message = "Every player has an ID!") User player,
			@NotNull(message = "If a campaign is created so was a number.") Campaign campaign,
			@NotNull(message = "If it exist it has a race.") String race,
			@NotNull(message = "You started from the bottom now you'll sell.") Currency currency,
			@NotNull(message = "Every character does some damage.") HitPoints hitpoints,
			@NotNull(message = "All characters have features.") Collection<Feature> char_feature) {
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
		this.spells = spells;
		this.equipment = equipment;
		this.languages = languages;
		this.proficiencies = proficiencies;
		this.class1 = class1;
		this.player = player;
		this.campaign = campaign;
		this.race = race;
		this.currency = currency;
		this.hitpoints = hitpoints;
		this.char_feature = char_feature;
	}
	
	
//	public int getChar_id() {
//		return char_id;
//	}
//
//
//	public void setChar_id(int char_id) {
//		this.char_id = char_id;
//	}
//
//
//	public String getChar_name() {
//		return char_name;
//	}
//
//
//	public void setChar_name(String char_name) {
//		this.char_name = char_name;
//	}
//
//
//	public String getAlignment() {
//		return alignment;
//	}
//
//
//	public void setAlignment(String alignment) {
//		this.alignment = alignment;
//	}
//
//
//	public String getChar_background() {
//		return char_background;
//	}
//
//
//	public void setChar_background(String char_background) {
//		this.char_background = char_background;
//	}
//
//
//	public int getArmorClass() {
//		return armorClass;
//	}
//
//
//	public void setArmorClass(int armorClass) {
//		this.armorClass = armorClass;
//	}
//
//
//	public int getInitiative() {
//		return initiative;
//	}
//
//
//	public void setInitiative(int initiative) {
//		this.initiative = initiative;
//	}
//
//
//	public int getSpeed() {
//		return speed;
//	}
//
//
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//
//	public int getExp() {
//		return exp;
//	}
//
//
//	public void setExp(int exp) {
//		this.exp = exp;
//	}
//
//
//	public int getProfBonus() {
//		return profBonus;
//	}
//
//
//	public void setProfBonus(int profBonus) {
//		this.profBonus = profBonus;
//	}
//
//
//	public int getCurrentFirst() {
//		return currentFirst;
//	}
//
//
//	public void setCurrentFirst(int currentFirst) {
//		this.currentFirst = currentFirst;
//	}
//
//
//	public int getCurrentSecond() {
//		return currentSecond;
//	}
//
//
//	public void setCurrentSecond(int currentSecond) {
//		this.currentSecond = currentSecond;
//	}
//
//
//	public int getCurrentThird() {
//		return currentThird;
//	}
//
//
//	public void setCurrentThird(int currentThird) {
//		this.currentThird = currentThird;
//	}
//
//
//	public int getCurrentFourth() {
//		return currentFourth;
//	}
//
//
//	public void setCurrentFourth(int currentFourth) {
//		this.currentFourth = currentFourth;
//	}
//
//
//	public int getCurrentFifth() {
//		return currentFifth;
//	}
//
//
//	public void setCurrentFifth(int currentFifth) {
//		this.currentFifth = currentFifth;
//	}
//
//
//	public int getCurrentSixth() {
//		return currentSixth;
//	}
//
//
//	public void setCurrentSixth(int currentSixth) {
//		this.currentSixth = currentSixth;
//	}
//
//
//	public int getCurrentSeventh() {
//		return currentSeventh;
//	}
//
//
//	public void setCurrentSeventh(int currentSeventh) {
//		this.currentSeventh = currentSeventh;
//	}
//
//
//	public int getCurrentEighth() {
//		return currentEighth;
//	}
//
//
//	public void setCurrentEighth(int currentEighth) {
//		this.currentEighth = currentEighth;
//	}
//
//
//	public int getCurrentNinth() {
//		return currentNinth;
//	}
//
//
//	public void setCurrentNinth(int currentNinth) {
//		this.currentNinth = currentNinth;
//	}
//
//
//	public boolean isInspiration() {
//		return inspiration;
//	}
//
//
//	public void setInspiration(boolean inspiration) {
//		this.inspiration = inspiration;
//	}
//
//
//	public boolean isVisability() {
//		return visability;
//	}
//
//
//	public void setVisability(boolean visability) {
//		this.visability = visability;
//	}
//
//
//	public List<Attribute> getAttributes() {
//		return attributes;
//	}
//
//
//	public void setAttributes(List<Attribute> attributes) {
//		this.attributes = attributes;
//	}
//
//
//	public List<Skill> getSkills() {
//		return skills;
//	}
//
//
//	public void setSkills(List<Skill> skills) {
//		this.skills = skills;
//	}
//
//
//	public List<Spell> getSpells() {
//		return spells;
//	}
//
//
//	public void setSpells(List<Spell> spells) {
//		this.spells = spells;
//	}
//
//
//	public List<Item> getEquipment() {
//		return equipment;
//	}
//
//
//	public void setEquipment(List<Item> equipment) {
//		this.equipment = equipment;
//	}
//
//
//	public List<String> getLanguages() {
//		return languages;
//	}
//
//
//	public void setLanguages(List<String> languages) {
//		this.languages = languages;
//	}
//
//
//	public List<String> getProficiencies() {
//		return proficiencies;
//	}
//
//
//	public void setProficiencies(List<String> proficiencies) {
//		this.proficiencies = proficiencies;
//	}
//
//
//	public Class getClass1() {
//		return class1;
//	}
//
//
//	public void setClass1(Class class1) {
//		this.class1 = class1;
//	}
//
//
//	public User getPlayer() {
//		return player;
//	}
//
//
//	public void setPlayer(User player) {
//		this.player = player;
//	}
//
//
//	public Campaign getCampaign() {
//		return campaign;
//	}
//
//
//	public void setCampaign(Campaign campaign) {
//		this.campaign = campaign;
//	}
//
//
//	public Race getRace() {
//		return race;
//	}
//
//
//	public void setRace(Race race) {
//		this.race = race;
//	}
//
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
//		result = prime * result + armorClass;
//		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
//		result = prime * result + ((campaign == null) ? 0 : campaign.hashCode());
//		result = prime * result + ((char_background == null) ? 0 : char_background.hashCode());
//		result = prime * result + char_id;
//		result = prime * result + ((char_name == null) ? 0 : char_name.hashCode());
//		result = prime * result + ((class1 == null) ? 0 : class1.hashCode());
//		result = prime * result + currentEighth;
//		result = prime * result + currentFifth;
//		result = prime * result + currentFirst;
//		result = prime * result + currentFourth;
//		result = prime * result + currentNinth;
//		result = prime * result + currentSecond;
//		result = prime * result + currentSeventh;
//		result = prime * result + currentSixth;
//		result = prime * result + currentThird;
//		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
//		result = prime * result + exp;
//		result = prime * result + initiative;
//		result = prime * result + (inspiration ? 1231 : 1237);
//		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
//		result = prime * result + ((player == null) ? 0 : player.hashCode());
//		result = prime * result + profBonus;
//		result = prime * result + ((proficiencies == null) ? 0 : proficiencies.hashCode());
//		result = prime * result + ((race == null) ? 0 : race.hashCode());
//		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
//		result = prime * result + speed;
//		result = prime * result + ((spells == null) ? 0 : spells.hashCode());
//		result = prime * result + (visability ? 1231 : 1237);
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
//		Character other = (Character) obj;
//		if (alignment == null) {
//			if (other.alignment != null)
//				return false;
//		} else if (!alignment.equals(other.alignment))
//			return false;
//		if (armorClass != other.armorClass)
//			return false;
//		if (attributes == null) {
//			if (other.attributes != null)
//				return false;
//		} else if (!attributes.equals(other.attributes))
//			return false;
//		if (campaign == null) {
//			if (other.campaign != null)
//				return false;
//		} else if (!campaign.equals(other.campaign))
//			return false;
//		if (char_background == null) {
//			if (other.char_background != null)
//				return false;
//		} else if (!char_background.equals(other.char_background))
//			return false;
//		if (char_id != other.char_id)
//			return false;
//		if (char_name == null) {
//			if (other.char_name != null)
//				return false;
//		} else if (!char_name.equals(other.char_name))
//			return false;
//		if (class1 == null) {
//			if (other.class1 != null)
//				return false;
//		} else if (!class1.equals(other.class1))
//			return false;
//		if (currentEighth != other.currentEighth)
//			return false;
//		if (currentFifth != other.currentFifth)
//			return false;
//		if (currentFirst != other.currentFirst)
//			return false;
//		if (currentFourth != other.currentFourth)
//			return false;
//		if (currentNinth != other.currentNinth)
//			return false;
//		if (currentSecond != other.currentSecond)
//			return false;
//		if (currentSeventh != other.currentSeventh)
//			return false;
//		if (currentSixth != other.currentSixth)
//			return false;
//		if (currentThird != other.currentThird)
//			return false;
//		if (equipment == null) {
//			if (other.equipment != null)
//				return false;
//		} else if (!equipment.equals(other.equipment))
//			return false;
//		if (exp != other.exp)
//			return false;
//		if (initiative != other.initiative)
//			return false;
//		if (inspiration != other.inspiration)
//			return false;
//		if (languages == null) {
//			if (other.languages != null)
//				return false;
//		} else if (!languages.equals(other.languages))
//			return false;
//		if (player == null) {
//			if (other.player != null)
//				return false;
//		} else if (!player.equals(other.player))
//			return false;
//		if (profBonus != other.profBonus)
//			return false;
//		if (proficiencies == null) {
//			if (other.proficiencies != null)
//				return false;
//		} else if (!proficiencies.equals(other.proficiencies))
//			return false;
//		if (race == null) {
//			if (other.race != null)
//				return false;
//		} else if (!race.equals(other.race))
//			return false;
//		if (skills == null) {
//			if (other.skills != null)
//				return false;
//		} else if (!skills.equals(other.skills))
//			return false;
//		if (speed != other.speed)
//			return false;
//		if (spells == null) {
//			if (other.spells != null)
//				return false;
//		} else if (!spells.equals(other.spells))
//			return false;
//		if (visability != other.visability)
//			return false;
//		return true;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Character [char_id=" + char_id + ", char_name=" + char_name + ", alignment=" + alignment
//				+ ", char_background=" + char_background + ", armorClass=" + armorClass + ", initiative=" + initiative
//				+ ", speed=" + speed + ", exp=" + exp + ", profBonus=" + profBonus + ", currentFirst=" + currentFirst
//				+ ", currentSecond=" + currentSecond + ", currentThird=" + currentThird + ", currentFourth="
//				+ currentFourth + ", currentFifth=" + currentFifth + ", currentSixth=" + currentSixth
//				+ ", currentSeventh=" + currentSeventh + ", currentEighth=" + currentEighth + ", currentNinth="
//				+ currentNinth + ", inspiration=" + inspiration + ", visability=" + visability + ", attributes="
//				+ attributes + ", skills=" + skills + ", spells=" + spells + ", equipment=" + equipment + ", languages="
//				+ languages + ", proficiencies=" + proficiencies + ", class1=" + class1 + ", player=" + player
//				+ ", campaign=" + campaign + ", race=" + race + "]";
//	}
//


	
	

	
}
