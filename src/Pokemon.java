import java.util.ArrayList;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int pp;
    private String type;
    private ArrayList<Attack> attackSet;

    public Pokemon(String name, int hp, int pp, String type, ArrayList<Attack> attackSet) {
        this.name = name;
        this.hp = hp;
        this.pp = pp;
        this.type = type;
        this.attackSet = attackSet;
    }


    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getPp() {
        return pp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public ArrayList<Attack> getAttackSet() {
        return attackSet;
    }

    public abstract void attack(Pokemon enemy, int attackIndex);

    public abstract void speak();

    public String toString() {
        return "Pokemon: " + name + "\n" +
                "HP: " + hp + "\n" +
                "PP: " + pp + "\n" +
                "Type: " + type + "\n";
    }
}
