import java.util.Arrays;

public class Pokemon{
	
	public static void main(String[] args) {
		
		Pokedex pokedex = new Pokedex("Fire", "Flying","Dragon", 36, 1, true, false, true, false, "Beautiful");
		pokedex.setPokemonType();
		System.out.println(pokedex);
	}

	private String elementType;
	private String elementType2;
	private String eggGroup;
	private int level = 0;
	private int generation = 0;
	private boolean starter = true;
	private boolean dragonScale = false;
	private boolean dayLight = true;
	private boolean legendary = false;
	private String condition;
	
	public Pokemon(String element_Type, String element_Type2, String egg_Group, int level_of_pokemon, int generation_No, boolean starter_pokemon, boolean dragon_Scale, boolean day_Light, boolean legendary, String condition) {
		
		this.setElementType(element_Type);
		this.setElementType2(element_Type2);
		this.setEggGroup(egg_Group);
		this.setLevel(level_of_pokemon);
		this.setGeneration(generation_No);
		this.setStarter(starter_pokemon);
		this.setDragonScale(dragon_Scale);
		this.setDayLight(day_Light);
		this.setLegendary(legendary);
		this.setCondition(condition);
	}	
	
	
	public String getElementType() {
		return elementType;
	}

	public void setElementType (String elementType){
		this.elementType = elementType;
	}
	
	public String getElementType2() {
		return elementType2;
	}
	
	public void setElementType2(String elementType2) {
		this.elementType2 = elementType2;
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
	
	public boolean getDragonScale() {
		return dragonScale;
	}

	public void setDragonScale(boolean dragonScale) {
		this.dragonScale = dragonScale;
	}
	
	public boolean getDaylight() {
		return dayLight;
	}
	
	public void setDayLight(boolean dayLight) {
		this.dayLight = dayLight;
	}
	
	public boolean getLegendary() {
		return legendary;
	}
	
	public void setLegendary(boolean legendary) {
		this.legendary = legendary;
	}
	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
}


class Pokedex extends Pokemon {

	private String pokemonType;

	Pokedex(String elementType, String elementType2, String eggGroup, int level, int generation, boolean starter, boolean dragonScale, boolean dayLight, boolean legendary, String condition) {
		super(elementType, elementType2, eggGroup, level, generation, starter, dragonScale, dayLight, legendary, condition);
	}		

	
	public void setPokemonType() {

		if (super.getEggGroup() == "Dragon") {
			if (super.getLegendary() == false) {

				if (super.getGeneration() == 1) {
					if(super.getElementType() == "Fire") {
						if (super.getElementType2() == "None") {
							if (super.getStarter() == true){
								if (super.getLevel() < 16) {
									this.pokemonType = "Charmander";
								}
								if (super.getLevel() >= 16) {
									this.pokemonType = "Charmeleon";
								}

							}
							
						}
						else if (super.getStarter() == true) {
							if(super.getElementType2() == "Flying") {
								if(super.getLevel() >= 36) {
									this.pokemonType = "Charizard";
								}
							}
						}

						else {
							this.pokemonType = "No Pokemon Entry Found.";
						}
					}

					else if (super.getElementType() == "Dragon") {
						if (super.getElementType2() == "None") {

							if (super.getLevel() >= 30) {
								this.pokemonType = "Dragonair";
							}
							else if (super.getLevel() < 30) {
								this.pokemonType = "Dratini";
							}
							else if (super.getLevel() >= 55) {
								if (super.getElementType2() == "Flying") {
									this.pokemonType = "Dragonite";
								}
							}	
						}
						else {
							this.pokemonType = "No Pokemon Entry Found";
						}
					}
					else if (super.getElementType() == "Poison") {

						if (super.getLevel() < 22) {
							this.pokemonType = "Ekans";
						}
						else{
							this.pokemonType = "Arbok";
						}
					}
					else if (super.getElementType() == "Water") {

						if (super.getElementType2() == "None") {

							if (super.getLevel() < 32) {
								this.pokemonType = "Horsea";
							}
							else if (super.getLevel() >= 32) {
								if (super.getDragonScale() == false) {
									this.pokemonType = "Seadra";
								}
								else if (super.getDragonScale() == true){
									if (super.getGeneration() == 2) {
										if (super.getElementType2() == "Dragon") {
											this.pokemonType = "Kingdra";
										}
									}
									else {
										this.pokemonType = "No Pokemon Entry Found.";
									}
								}

							}

						}
						else if (super.getElementType2() == "Flying") {

							if (super.getLevel() < 20) {
								this.pokemonType = "Magikarp";
							}
							else {
								this.pokemonType = "Gyarados";
							}
						}
						else {
							this.pokemonType = "No Pokemon Entry Found";
						}
					}
					else {
						this.pokemonType = "No Pokemon Entry Found";
					}
				}
				else if (super.getGeneration() == 3) {
					if (super.getElementType() == "Grass") {
						if (super.getStarter() == true) {
							if(super.getLevel() < 16) {
								this.pokemonType = "Treecko";
							}
							else if (super.getLevel() >= 16) {
								this.pokemonType = "Grovyle";
							}
							else if (super.getLevel() >= 36) {
								this.pokemonType = "Sceptile";
							}
						}
						else {
							this.pokemonType = "No Pokemon Entry Found.";
						}
					}
					else if (super.getElementType() == "Flying") {
						if (super.getElementType2() == "Normal") {
							if(super.getLevel() < 35) {
								this.pokemonType = "Swablu";
							}
						}
						else if (super.getElementType2() == "Dragon") {
							if(super.getLevel() >= 35) {
								this.pokemonType = "Altaria";
							}
						}
						else {
							this.pokemonType = "No Pokemon Entry Found";
						}
					}
					else if (super.getElementType() == "Poison") {
						this.pokemonType = "Seviper";
					}
					else if (super.getElementType() == "Water") {
						if (super.getCondition() != "Beautiful") {
							this.pokemonType = "Feebas";
						}
						else {
							this.pokemonType = "Milotic";
						}
					}
					else if (super.getElementType() == "Dragon") {
						if (super.getLevel() < 30) {
							this.pokemonType = "Bagon";
						}
						else if (super.getLevel() >= 30) {
							this.pokemonType = "Shelgon";
						}
						else if(super.getLevel() >= 50) {
							if (super.getElementType2() == "Flying"){
								this.pokemonType = "Salamence";
							}
							else {
								this.pokemonType = "No Pokemon Entry Found";
							}
						}
					}
					else {
						this.pokemonType = "No Pokemon Entry Found.";
					}
				}
				else if (super.getGeneration() == 4) {
					if (super.getElementType() == "Dragon") {
						if(super.getElementType2() == "Ground") {
							if(super.getLevel() < 24) {
								this.pokemonType = "Gible";
							}
							else if (super.getLevel() >= 24) {
								this.pokemonType = "Gabite";
							}
							else if (super.getLevel() >= 48) {
								this.pokemonType = "Garchomp";
							}
						}
						else {
							this.pokemonType = "No Pokemon Entry Found.";
						}
					}
					else {
						this.pokemonType = "No Pokemon Entry Found";
					}
				}
				else if(super.getGeneration() == 5) {
					if (super.getElementType() == "Dark") {
						if (super.getElementType2() == "Fighting") {
							if(super.getLevel() < 39) {
								this.pokemonType = "Scraggy";
							}
							else {
								this.pokemonType = "Scrafty";
							}
						}
						else if(super.getElementType2() == "Dragon"){
							if(super.getLevel() < 50) {
								this.pokemonType = "Deino";
							}
							else if (super.getLevel() >= 50) {
								this.pokemonType = "Zweilous";
							}
							else if (super.getLevel() >= 64) {
								this.pokemonType = "Hydreigon";
							}
						}
						else {
							this.pokemonType = "No Pokemon Entry Found";
						}
					}
					else if(super.getElementType() == "Dragon") {
						if (super.getLevel() < 38) {
							this.pokemonType = "Axew";
						}
						else if(super.getLevel() >= 38) {
							this.pokemonType = "Fraxure";
						}
						else if(super.getLevel() >= 48) {
							this.pokemonType = "Haxorus";
						}
					}
					else {
						this.pokemonType = "No Pokemon Entry Found";
					}
				}
				else if (super.getGeneration() == 6) {
				}
			}

		}
	}
	public String getPokemonType() {
		return this.pokemonType;

	}
	
    
	public String toString() {
		return "POKEMON ENTRY: " + getPokemonType();
	}

}
