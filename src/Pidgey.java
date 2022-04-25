import java.util.ArrayList;

public class Pidgey extends Pokemon {
    public Pidgey(ArrayList<Attack> attackSet) {
        super("Pidgey", 40, 45, "Flying", attackSet);
    }


    @Override
    public void attack(Pokemon enemy, int attackIndex) {
        if ((enemy.getType().compareTo("Bug") == 0 || enemy.getType().compareTo("Fighting") == 0 || enemy.getType().compareTo("Grass") == 0)) {
           //Super effective
            try {
                System.out.print("Pidgey attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                int damage = super.getAttackSet().get(attackIndex).baseDamage * 2;
                if((enemy.getHp() < damage))
                {
                    enemy.setHp(0);
                    System.out.print(enemy.getName() + " has fainted!");
                    System.exit(1);
                }else {
                    enemy.setHp(enemy.getHp() - damage);
                    super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
                    Thread.sleep(2 * 1000);
                    System.out.print("It's super effective!\n");
                    System.out.print("Inflicts " + damage + " with it's attack!\n\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (enemy.getType().compareTo("Electric") == 0 || enemy.getType().compareTo("Rock") == 0) {                          //not effective
            try {
                System.out.print("Pidgey attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                int damage = super.getAttackSet().get(attackIndex).baseDamage / 2;
                if((enemy.getHp() < damage))
                {
                    enemy.setHp(0);
                    System.out.print(enemy.getName() + " has fainted!");
                    System.exit(1);
                }else {
                    enemy.setHp(enemy.getHp() - damage);
                    super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
                    Thread.sleep(2 * 1000);
                    System.out.print("Not really effective...\n");
                    System.out.print("Inflicts " + damage + " with it's attack!\n\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {                                                                                        //basic attack
            try {
                System.out.print("Pidgey attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                int damage = super.getAttackSet().get(attackIndex).baseDamage;
                if((enemy.getHp() < damage))
                {
                    enemy.setHp(0);
                    System.out.print(enemy.getName() + " has fainted!");
                    System.exit(1);
                }else {
                    enemy.setHp(enemy.getHp() - damage);
                    System.out.print("Pidgey attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                    Thread.sleep(2 * 1000);
                    System.out.print("Inflicts " + damage + " with it's attack!");
                    super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void speak() {
        System.out.print("KWEH!");
    }
}

