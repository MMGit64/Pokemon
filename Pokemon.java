import java.util.Arrays;

public class Pokemon{
	
	public static void main(String[] args) {
		
		Pokedex Charmander = new Pokedex("Charmander", "Fire", "Dragon", 15, 1, true);
		Charmander.setPokemonType();
		System.out.println(Charmander);
	}

	private String name;
	private String elementType;
	private String eggGroup;
	private int level = 0;
	private int generation = 0;
	private boolean starter = false;
	
	public Pokemon(String name_of_pokemon, String element_Type, String egg_Group, int level_of_pokemon, int generation_No, boolean starter_pokemon) {
		
		this.setName(name_of_pokemon);
		this.setElementType(element_Type);
		this.setEggGroup(egg_Group);
		this.setLevel(level_of_pokemon);
		this.setGeneration(generation_No);
		this.setStarter(starter_pokemon);
	}	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getElementType() {
		return elementType;
	}

	public void setElementType (String elementType){
		this.elementType = elementType;
	}

	public String getEggGroup() {
		return eggGroup;
	}

	public void setEggGroup (String eggGroup)  {
		this.eggGroup = eggGroup;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel (int level) {
		this.level = level;
	}

	public int getGeneration(){
		return generation;
	}

	public void setGeneration (int generation){
		this.generation = generation;
	}

	public boolean getStarter() {
		return starter;
	}

	public void setStarter(boolean starter) {
		this.starter = starter;
	}

}


class Pokedex extends Pokemon {

	private String pokemonType;

	Pokedex(String name, String elementType, String eggGroup, int level, int generation, boolean starter) {
		super(name, elementType, eggGroup, level, generation, starter);
	}		

	public void setPokemonType() {
		
		super.getName();
		super.getElementType();
		super.getEggGroup();
		super.getLevel();
		super.getGeneration();
		super.getStarter();

	}


	//public String getPokemonType() {
	//	return this.pokemonType;

	//}

	String name = getName();
	String elementType = getElementType();
	String eggGroup = getEggGroup();
	int level = getLevel();
	int generation = getGeneration();
	boolean starter = getStarter();
	
	
	public String toString (){
		return "Your Pokemon's features are:" + " \nNAME: " + name + " \nELEMENT Type: " + elementType + " \nEGG group: " + eggGroup + " \nLEVEL: " + level + " \nGENERATION: " + generation + " \nSTARTER: " + starter;
	}

}





	


