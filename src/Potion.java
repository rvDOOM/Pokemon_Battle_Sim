public class Potion implements Item {
    private static String name = "Potion";
    private static String description = "Heal your Pokemon 15 HP.";

    public static String getName() {
        return name;
    }

    public static String getDescription() {
        return description;
    }

    @Override
    public void use(Pokemon pokemon) {
        System.out.print("Using potion!\n\n");
        pokemon.setHp(pokemon.getHp() + 15);
    }
}
