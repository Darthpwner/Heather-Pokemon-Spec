package pokemonshell;

import pokemonshell.iPokemon;

public class Pokemon implements iPokemon{
    private String name;
    private int hp;
    private int maxHP;
    private int atk;
    private int def;
    private int evol;
    private int expPt;
    private String type;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public int getEvol() {
        return evol;
    }

    @Override
    public int getExpPts() {
        return expPt;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int damage(int damage) {
        return damage;
    }

    @Override
    public int heal(int heal) {
        return heal;
    }

    @Override
    public int expUp(int exp) {
        return exp;
    }

    @Override
    public int compare(iPokemon other) {
        return -1;
    }

    @Override
    public void levelUp() {

    }

    @Override
    public String evolve(String name) {
        return "";
    }
    @Override
    public String toString() {
        return "";
    }

}
