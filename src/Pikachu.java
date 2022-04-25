import java.util.ArrayList;

public class Pikachu extends Pokemon {

    public Pikachu(ArrayList<Attack> attackSet) {
        super("Pikachu", 35, 50, "Electric", attackSet);
    }


    @Override
    public void attack(Pokemon enemy, int attackIndex) {
        if ((enemy.getType().compareTo("Flying") == 0 || enemy.getType().compareTo("Water") == 0))  //super effective
        {
            try {
                int damage = super.getAttackSet().get(attackIndex).baseDamage * 2;
                System.out.print("Pikachu attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
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
                    System.out.print("Inflicts " + damage + " with it's attack\n\n!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (enemy.getType().compareTo("Electric") == 0 || enemy.getType().compareTo("Grass") == 0)   //not effective
        {
            try {
                int damage = super.getAttackSet().get(attackIndex).baseDamage / 2;
                if((enemy.getHp() < damage))
                {
                    enemy.setHp(0);
                    System.out.print(enemy.getName() + " has fainted!");
                    System.exit(1);
                }else {
                    enemy.setHp(enemy.getHp() - damage);
                    super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
                    System.out.print("Pikachu attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                    Thread.sleep(2 * 1000);
                    System.out.print("Not really effective...\n");
                    System.out.print("Inflicts " + damage + " with it's attack!\n\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (enemy.getType().compareTo("Ground") == 0)         //no effect
        {
            super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
            System.out.print("Attack has no effect!\n");
        } else                                                      //basic attack
        {
            try {
                int damage = super.getAttackSet().get(attackIndex).baseDamage;
                if((enemy.getHp() < damage))
                {
                    enemy.setHp(0);
                    System.out.print(enemy.getName() + " has fainted!");
                    System.exit(1);
                } else {
                    enemy.setHp(enemy.getHp() - damage);
                    System.out.print("Pikachu attacks with " + super.getAttackSet().get(attackIndex).getName() + "!\n");
                    Thread.sleep(2 * 1000);
                    System.out.print("Inflicts " + damage + " with it's attack\n\n!");
                    super.setPp(enemy.getPp() - super.getAttackSet().get(attackIndex).getPpCost());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void speak() {
        System.out.print("Pika Pika!");
    }

}
