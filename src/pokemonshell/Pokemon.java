package pokemonshell;

import pokemonshell.iPokemon;

public class Pokemon implements iPokemon{
    private String name;
    private int hp;
    private int maxHP;
    private int atk;
    private int def;
    private int evolution;
    private int expPts;
    private String type;

    //Prints out all the Pokemon's stats
    public void Stats() {
        System.out.println("name: " + getName());
        System.out.println("hp: " + getHP());
        System.out.println("maxHP: " + getMaxHP());
        System.out.println("atk: " + getAtk());
        System.out.println("def: " + getDef());
        System.out.println("evolution: " + getEvol());
        System.out.println("expPts: " + getExpPts());
        System.out.println("type: " + getType());

        System.out.println("");
    }

    //constructors
    public Pokemon(String name) {
        this.name = name;
        //These values can be anything (default)
        this.hp = 1;
        this.maxHP = 1;
        this.atk = 1;
        this.def = 1;
        //I don't know what evolution does
        this.evolution = 1;
        this.expPts = 0;
        this.type = "Normal";
    }

    public Pokemon(String name, int hp, int atk, int def, String type) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.type = type;
        //I don't know what evolution does
        this.evolution = 1;
        this.expPts = 0;
        this.maxHP = hp;
    }

    //accessors
    //Returns Pokemon's name
    @Override
    public String getName() {
        return name;
    }

    //Returns Pokemon's current HP
    @Override
    public int getHP() {
        return hp;
    }

    //Returns Pokemon's max HP
    @Override
    public int getMaxHP() {
        return maxHP;
    }

    //Returns Pokemon's attack
    @Override
    public int getAtk() {
        return atk;
    }

    //Return Pokemon's defense
    @Override
    public int getDef() {
        return def;
    }

    //Returns Pokemon's evolution
    @Override
    public int getEvol() {
        return evolution;
    }

    //Returns Pokemon's experience points
    @Override
    public int getExpPts() {
        return expPts;
    }

    //Returns Pokemon's type
    @Override
    public String getType() {
        return type;
    }

    //Calculates damage and determines the Pokemon's new HP
    //int damage: The amount of damage inflicted
    @Override
    public int damage(int damage) {
        this.hp = getHP() - damage;
        return this.hp;
    }

    //Calculates the HP healed and determines the Pokemon's new HP
    //int heal: The amount of HP healed
    @Override
    public int heal(int heal) {
        if(getHP() + heal <= getMaxHP()) {  //Heal cannot exceed max HP
            this.hp = getHP() + heal;
            return this.hp;
        } else {
            return -1;  //Error code
        }
    }

    //Returns the current number of experience points
    //int exp: The number of experience points gained
    @Override
    public int expUp(int exp) {
        this.expPts = getExpPts() + exp;
        return this.expPts;
    }

    //Compares your Pokemon with the other Pokemon
    //iPokemon other: The other Pokemon you are battling
    @Override
    public int compare(iPokemon other) {
        if(this.getAtk() + this.getDef() > other.getAtk() + other.getDef()) { //Current pokemon has a higher stat value of atk + def
            return 1;
        } else if (this.getAtk() + this.getDef() < other.getAtk() + other.getDef()) { //Comparison pokemon has a higher stat value of atk + def
            return -1;
        } else {    //atk + def are equal for current pokemon and comparison pokemon
            return 0;
        }
    }

    //Increases maxHP by 5, atk and def by 1
    @Override
    public void levelUp() {
        this.maxHP = getMaxHP() + 5;
        this.atk = getAtk() + 1;
        this.def = getDef() + 1;

        //Comment this out if necessary
        System.out.println("New maxHP: " + getMaxHP());
        System.out.println("New atk: " + getAtk());
        System.out.println("New def: " + getDef());
    }

    //Changes the evolution, name and reports the name
    @Override
    public String evolve(String name) {
        this.evolution++;   //What is this supposed to do?
        this.name = name;   //this.name is the Pokemon object's name, name is the new name of the evolved Pokemon
        return getName();
    }

    //Reports the name of the Pokemon
    @Override
    public String toString() {
        return getName();
    }
}
