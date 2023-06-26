package homeWork_2;

public enum Suits {
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private String suit;

    Suits(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
