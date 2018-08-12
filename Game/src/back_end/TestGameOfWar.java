/**
 * Assignment: Week 05 - Homework (War Card Game )
 * Author: Ross Allen
 * Date Created: 6/12/2018
 * Due Date: 6/23/2018
 */

/**
 *
 * @author ross
 */
public class TestGameOfWar {
    
    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args){
        
        //Create war object
        GameOfWar war = new GameOfWar();
        
        //Initialize game
        war.initialize();
        
        //Display deck size and players hand size. 
        System.out.println("Deck: " + war.deck.group.size());
        System.out.println("Player 1's hand: " + war.plr1Hand.group.size());
        System.out.println("Player 2's hand: " + war.plr2Hand.group.size());
        
        //Set number of rounds to play
        GameOfWar.setRounds(1000);
        
        //Start play
        war.play();
        
        //Display winner
        war.displayWinner();
        
        //Show final hand values
        System.out.println("Player 1's hand: " + war.plr1Hand.toString());
        System.out.println("Player 2's hand: " + war.plr2Hand.toString());
        System.out.println("Player 1's win hand: " + war.plr1WinHand.toString());
        System.out.println("Player 2's win hand: " + war.plr2WinHand.toString());
        System.out.println("Number of rounds played: " + GameOfWar.getRoundsPlayed());
    }
}
