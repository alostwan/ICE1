/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author alostwan
 * student id: 030721086
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int random = rand.nextInt(13 - 1) + 0;
            c.setValue(random);
            
            int random2 = rand.nextInt(3);
            c.setSuit(Card.SUITS[random2]);
            
            magicHand [i] = c;   
        }
        
        Card luckyCard = new Card();
        int num = 2;
        String card = "Hearts";
        
        //printing the magigHand array
        for(int i =0; i< magicHand.length; i++){
            System.out.println(magicHand[i].getSuit()+" "
                    + magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Card value and suit: ");
        
        int number = input.nextInt();
        String userSuit= "";
        switch (number){
            case 1:
                userSuit = "Hearts";
                break;
            case 2:
                userSuit = "Diamonds";
                break;
            case 3:
                userSuit = "Spades";
                break;
            case 4:
                userSuit = "Clubs";       
        }
        
        int userValue = input.nextInt();
        
        System.out.println("Your card: ");
        System.out.println("Suit: " + userSuit);
        System.out.println("Value: "+ userValue );

        // and search magicHand here
        for(int i =0; i< magicHand.length; i++){
            if(userSuit.equals(magicHand[i].getSuit()) 
                    && userValue == magicHand[i].getValue() ){
                System.out.println("The majic hand dose contain your card!"); 
                break;
            }else{
                System.out.println("The Majic Hand dose NOT contain your card!"); 
                break;
            }  
        }
        //Then report the result here
    }
    
}
