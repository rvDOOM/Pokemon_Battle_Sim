public class Ether implements Item {
    private static String name = "Ether";
    private static String description = "Restore 10 PP to Pokemon.";

    public static String getName() {
        return name;
    }

    public static String getDescription() {
        return description;
    }

    @Override
    public void use(Pokemon pokemon) {
        System.out.print("Using ether!\n");
        pokemon.setPp(pokemon.getPp() + 10);
    }
}