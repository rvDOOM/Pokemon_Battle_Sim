public class Attack {
    private String name;
    private String description;
    private int ppCost;
    private String type;
    int baseDamage;

    //Constructor
    public Attack(String name, String description,int ppCost, String type, int baseDamage){
        this.name = name;
        this.description = description;
        this.ppCost = ppCost;
        this.type = type;
        this.baseDamage = baseDamage;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getPpCost(){
        return ppCost;
    }
    public String getType(){
        return type;
    }
    public int getBaseDamage(){
        return baseDamage;
    }

    public String toString(){
        return "\nAttack name: " + name + "\n" +
                "Description: " + description + "\n" +
                "PP Cose: " + ppCost + "\n" +
                "Type: " + type + "\n" +
                "Base Damage: " + baseDamage;

    }
}
