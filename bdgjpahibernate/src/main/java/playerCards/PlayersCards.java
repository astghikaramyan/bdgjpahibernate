package playerCards;

import java.io.*;
import java.util.*;

public class PlayersCards{


  public static void main(String[] args) throws IOException {
    PlayersCards playersCards = new PlayersCards();
   // playersCards.showPlayerCards();
    //playersCards.enumRepresentationOfCardCombination();
    //playersCards.generatingPlayersCards();
    playersCards.generateEachPlayerCardList();
  }

  GameOfCards gameOfCards;
  CardType cardType;
  CardElement cardElement;
  List<String> list = new LinkedList<>();
  List<String[]> pairFromList = new LinkedList<>();
  List<String> firstPlayerCards = new LinkedList<>();
  List<String> secondPlayerCards = new LinkedList<>();
  List<String[]> firstPlayerEachCard = new LinkedList<>();
  List<String[]> secondPlayerEachCard = new LinkedList<>();

  List<String[]> list1 = new LinkedList<>();
  List<String[]> list2 = new LinkedList<>();

  public List<String> getPlayersNumbers() throws IOException {
    try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\javaLessons\\javaExam\\astghik\\src\\combinations.txt"))) {
      int readCount;
      while ((readCount = in.read()) != -1) {
        list.add((char)readCount + in.readLine());
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return list;
  }

  public List<String[]> pairCardsFromList() throws IOException {
    List<String> list = getPlayersNumbers();
    for (int i = 0; i < list.size(); i++) {
      pairFromList.add(list.get(i).split("--"));
    }
    return pairFromList;
  }

  public void generatingPlayersCards() throws IOException {
    List<String[]> list = pairCardsFromList();
    for (String[] i : list) {
      firstPlayerCards.add(i[0].trim());
      secondPlayerCards.add(i[1].trim());
    }
  }

  public void showPlayerCards() throws IOException {
    generatingPlayersCards();
    for (String i : firstPlayerCards) {
      System.out.println(i);
    }
    for (String i : secondPlayerCards) {
      System.out.println(i);
    }
  }


  public void generateEachPlayerCardList() throws IOException {
    generatingPlayersCards();
    for (String i : secondPlayerCards) {
      secondPlayerEachCard.add(i.split(" "));
    }
    for (String j : firstPlayerCards) {
      firstPlayerEachCard.add(j.split(" "));
    }

    List<List<CardElement>> sortedlist1 = new LinkedList<>();
    List<List<String>> list1 = new LinkedList<>();
    List<List<CardElement>> sortedlist2 = new LinkedList<>();
    List<List<String>> list2 = new LinkedList<>();

    for (String[] cards : firstPlayerEachCard) {
      List<CardElement> arr1 = new LinkedList<>();
      List<String> arr11 = new LinkedList<>();
      for (String card : cards) {
        CardType cardType = CardType.valueOfByShortName(card.substring(0, 1));
        //System.out.println(cardType.getShortName());
        CardElement cardElement = CardElement.valueOfByShortName(card.substring(1));
       // GameOfCards gameOfCards = new GameOfCards(cardElement,cardType)
        arr1.add(cardElement);
        arr11.add(cardType.getShortName());
        Arrays.asList(CardElement.Two,CardElement.Three,CardElement.Four,CardElement.Five,
                CardElement.Six,CardElement.Seven,CardElement.Eight,
                CardElement.Nine,CardElement.Ten,CardElement.Jack,
                CardElement.Queen,CardElement.King,CardElement.Ace);
                Collections.sort(arr1);
      }
      //System.out.println(arr1);
      sortedlist1.add(arr1);
      list1.add(arr11);
    }

    for (String[] cards : secondPlayerEachCard) {
      List<CardElement> arr2 = new LinkedList<>();
      List<String> arr22 = new LinkedList<>();
      for (String card : cards) {
        CardType cardType = CardType.valueOfByShortName(card.substring(0, 1));
        //  System.out.println(cardType.getShortName());
        CardElement cardElement = CardElement.valueOfByShortName(card.substring(1));
        // GameOfCards gameOfCards = new GameOfCards(cardElement,cardType)
        arr2.add(cardElement);
        arr22.add(cardType.getShortName());
        Arrays.asList(CardElement.Two, CardElement.Three, CardElement.Four, CardElement.Five,
                CardElement.Six, CardElement.Seven, CardElement.Eight,
                CardElement.Nine, CardElement.Ten, CardElement.Jack,
                CardElement.Queen, CardElement.King, CardElement.Ace);
        Collections.sort(arr2);
      }
      // System.out.println(arr2);
      sortedlist2.add(arr2);
      list2.add(arr22);
      //System.out.println(sortedlist2.size());
    }
      for(int i = 0; i < sortedlist1.size(); i++){
        String firstPlayerElements = sortedlist1.get(i).get(0).getShortname()+
                                    sortedlist1.get(i).get(1).getShortname()+
                                    sortedlist1.get(i).get(2).getShortname()+
                                    sortedlist1.get(i).get(3).getShortname()+
                                    sortedlist1.get(i).get(4).getShortname();
        System.out.println(firstPlayerElements);
        String firstPlayerElementsTypes = list1.get(i).get(0)+
                                          list1.get(i).get(1)+
                                          list1.get(i).get(2)+
                                          list1.get(i).get(3)+
                                          list1.get(i).get(4);
        System.out.println(firstPlayerElementsTypes);
       // System.out.println(sortedlist2.size());
        String secondPlayerElements = sortedlist2.get(i).get(0).getShortname()+
                sortedlist2.get(i).get(1).getShortname()+
                sortedlist2.get(i).get(2).getShortname()+
                sortedlist2.get(i).get(3).getShortname()+
                sortedlist2.get(i).get(4).getShortname();
        System.out.println(secondPlayerElements);
        String secondPlayerElementsTypes = list2.get(i).get(0)+
                list2.get(i).get(1)+
                list2.get(i).get(2)+
                list2.get(i).get(3)+
                list2.get(i).get(4);
        System.out.println(secondPlayerElementsTypes);


        /*
        here use CardTypeDefenetionUtil functions to find out each player win counts
        int firstPlayerWinCount = 0;
        int secondPlayerWinCount = 0;
        */

      }
    }

  }


