package playerCards;

public enum CardElement {
  Two("2"),
  Three("3"),
  Four("4"),
  Five("5"),
  Six("6"),
  Seven("7"),
  Eight("8"),
  Nine("9"),
  Ten("10"),
  Jack("J"),
  Queen("Q"),
  King("K"),
  Ace("A");
  CardElement(String shortname){
    this.shortname = shortname;
  }
  public String shortname;
  public String getShortname(){
    return this.shortname;
  }
  public static CardElement valueOfByShortName(String shortname){
    for(CardElement cardElement: CardElement.values()){
      if(cardElement.shortname.equals(shortname)){
        return cardElement;
      }
    }
    throw new IllegalArgumentException("wrong cartElement");
  }
}
