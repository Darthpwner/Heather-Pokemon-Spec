package pokemonshell;

public class PokemonShell {

    //Prints out all the Pokemon's stats
    public static void Stats(Pokemon p) {
        System.out.println("name: " + p.getName());
        System.out.println("hp: " + p.getHP());
        System.out.println("maxHP: " + p.getMaxHP());
        System.out.println("atk: " + p.getAtk());
        System.out.println("def: " + p.getDef());
        System.out.println("evolution: " + p.getEvol());
        System.out.println("expPts: " + p.getExpPts());
        System.out.println("type: " + p.getType());

        System.out.println("");
    }

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Charmander"); //Default constructed Pokemon
        Pokemon p2 = new Pokemon("Pikachu", 5, 2, 2, "Electric");   //Client program Pokemon

        Stats(p1);
        Stats(p2);

        //Test p1 mutator methods
        System.out.println("p1 damage: " + p1.damage(1));
        System.out.println("p1 heal: " + p1.heal(1));
        System.out.println("p1 expUp: " + p1.expUp(5));
        System.out.println("p1 compare: " + p1.compare(p2));
        System.out.println("p1 toString: " + p1.toString());
        p1.levelUp();
        System.out.println("p1 evolve: " + p1.evolve("Charmeleon"));

        System.out.println(""); //Add extra space

        //Test p2 mutator methods
        System.out.println("p2 damage: " + p2.damage(1));
        System.out.println("p2 heal: " + p2.heal(1));
        System.out.println("p2 expUp: " + p2.expUp(5));
        System.out.println("p2 compare: " + p2.compare(p2));
        System.out.println("p2 toString: " + p2.toString());
        p2.levelUp();
        System.out.println("p2 evolve: " + p2.evolve("Raichu"));

    }
}