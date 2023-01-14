public class BoardGame {

    public static void main(String[] args) {
        Player player1 = new Player("Josh", 0, 100);
        Player player2 = new Player("Joey", 0, 100);
        Player player3 = new Player("Norm", 0, 100);
        Player player4 = new Player("Lebron", 0, 100);
        

        player1.readRules();
        
        player1.rollDice();
        System.out.println();
        
        player2.rollDice();
        System.out.println();
        
        player3.rollDice();
        System.out.println();
        
        player4.rollDice();
        System.out.println();

    }
}

