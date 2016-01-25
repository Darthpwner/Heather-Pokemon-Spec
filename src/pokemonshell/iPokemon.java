package pokemonshell;

public interface iPokemon {
    //accessor methods
    public String getName();
    public int getHP();
    public int getMaxHP();
    public int getAtk();
    public int getDef();
    public int getEvol();
    public int getExpPts();
    public String getType();

    //mutator methods
    public int damage(int damage);
    public int heal(int heal);
    public int expUp(int exp);
    public int compare(iPokemon other);
    public String toString();
    public void levelUp();
    public String evolve(String name);
}