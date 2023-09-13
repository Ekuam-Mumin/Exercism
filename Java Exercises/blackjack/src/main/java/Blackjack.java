import java.util.*;

public class Blackjack 
{
    private HashMap<String, Integer> cardValues = new HashMap<String, Integer>();

    public Blackjack()
    {
        this.cardValues.put("ace", 11);
        this.cardValues.put("two", 2);
        this.cardValues.put("three", 3);
        this.cardValues.put("four", 4);
        this.cardValues.put("five", 5);
        this.cardValues.put("six", 6);
        this.cardValues.put("seven", 7);
        this.cardValues.put("eight", 8);
        this.cardValues.put("nine", 9);
        this.cardValues.put("ten", 10);
        this.cardValues.put("jack", 10);
        this.cardValues.put("queen", 10);
        this.cardValues.put("king", 10);
    }

    public int parseCard(String card) 
    {
        if(this.cardValues.containsKey(card)) return this.cardValues.get(card);
        return 0;
    }

    public boolean isBlackjack(String card1, String card2) 
    {
        return ((this.cardValues.get(card1) + this.cardValues.get(card2)) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) 
    {
        if(isBlackjack)
        {
            if(dealerScore == 11 || dealerScore == 10) return "S";
            return "W";
        }
        return "P"; 
    }

    public String smallHand(int handScore, int dealerScore) 
    {
        if(handScore >= 17) return "S";
        if(handScore <= 11) return "H";
        if((handScore > 11 || handScore < 17) && dealerScore >= 7) return "H";
        else return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) 
    {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) 
        {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } 
        else 
        {
            return smallHand(handScore, dealerScore);
        }
    }
}
