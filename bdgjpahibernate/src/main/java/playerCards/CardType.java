package playerCards;

public enum CardType {
  Clubs("C"),
  Diamonds("D"),
  Hearts("H"),
  Spades("S");


  CardType(String shortName) {
    this.shortName = shortName;
  }

  public static CardType valueOfByShortName(String shortName) {
    for(CardType cardTypes: CardType.values()){
      if(cardTypes.shortName.equals(shortName)) {
        return cardTypes;
      }
    }
    throw new IllegalArgumentException("Wrong card type");
  }

  public String getShortName() {
    return shortName;
  }

  private String shortName;


}
