import java.util.Random;

public class Player {

    private String name;
    private int position;
    private int money;

    public Player(String playerName, int playerPosition, int playerMoney) {
        this.name = playerName;
        this.position = playerPosition;
        this.money = playerMoney;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getMoney() {
        return money;
    }

    public void gainMoney(int m) {
        int oldTotal = money;
        this.money = oldTotal + m;
    }

    public void loseMoney(int m) {
        int oldTotal = money;
        this.money = oldTotal - m;
    }

    public void rollDice() { 
        
        Random no = new Random();
        int diceNo = no.nextInt(6) + 1;
        System.out.println("Hello " + getName() + ", to decide your new position... You have rolled a " + diceNo + "!");

        this.position = diceNo;

        // if statements
        if (getPosition() == 1) {
            System.out.println(getName() + ", you have landed on a lucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've earned.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            gainMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());

        } else if (getPosition() == 2) {
            System.out.println(getName() + ", you have landed on an unlucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've lost.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            loseMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());

        } else if (getPosition() == 3) {
            System.out.println(getName() + ", you have landed on a lucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've earned.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            gainMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());

        } else if (getPosition() == 4) {
            System.out.println(getName() + ", you have landed on an unlucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've lost.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            loseMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());

        } else if (getPosition() == 5) {
            System.out.println(getName() + ", you have landed on a lucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've earned.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            gainMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());

        } else if (getPosition() == 6) {
            System.out.println(getName() + ", you have landed on an unlucky tile! Roll the dice one more time; the amount shown on the dice will be equal to the money you've lost.");

            Random no2 = new Random();
            int diceNo2 = no2.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceNo2 + "!");
            loseMoney(diceNo2);

            System.out.println(getName() + " now has a total of: " + "$ " + getMoney());
        }
    }
    
    public void readRules(){
        System.out.println("Hello! Here are the rules of the game:");
        System.out.println("The player has to roll a die to determine what his/her position will be on the board. Some positions would make the player gain money while others would make the player lose money.");
        System.out.println("To determine how much money is gained or lost, the die will be rolled again; the number that the die lands on represents the increase or decrease in the player's money.");
        System.out.println("The goal of this game is to end up with the highest total of money between all players. After each turn, the player with the least amount of money after the rolls is eliminated.");
        System.out.println("The game is replayed until there is only one player standing!");
        System.out.println();

    }
}