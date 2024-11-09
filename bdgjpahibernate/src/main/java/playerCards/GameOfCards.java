package playerCards;

import java.util.Comparator;

public class GameOfCards {
  public CardType cardTypes;
  public CardElement cardElement;
  public GameOfCards(CardElement cardElement, CardType cardType){
    this.cardTypes = cardType;
    this.cardElement = cardElement;
  }

  public CardType getCardTypes() {
    return cardTypes;
  }

  public CardElement getCardElement() {
    return cardElement;
  }

  public void setCardTypes(CardType cardTypes) {
    this.cardTypes = cardTypes;
  }

  public void setCardElement(CardElement cardElement) {
    this.cardElement = cardElement;
  }

  public static class CompareByCardElement implements Comparator<GameOfCards>{
    @Override
    public int compare(GameOfCards o1, GameOfCards o2) {
      return o1.cardElement.compareTo(o2.cardElement);
    }
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
