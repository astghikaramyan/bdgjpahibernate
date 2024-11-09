package playerCards;

/**
 * Created by User on 31.08.2019.
 */

/*
* arr[0] -um pahvum e xaxacoxi carderin hamapatasxan carderi tip@ hamarov
  * orinak 1 - @ royalFlushn e
  * 2-@ straightFlush@
  * ev ayln
  * isk arr-i hachord elementner@ ogtagorcum en nuyn hamari depqum myus xaxatxter@ hamematelu hamar
   * orinak
   * 2JKKK ev 10JQQQ
   * arr[1] -um arachin xaxacoxi hamar kpahvi K
   * isk erkrord xaxacoxi hamar ` Q
   * qani vor k aveli barcr e khaxti arachin@
   *
* */
public class CardTypeDefenitionUtil {
    public static int royalFlush(String cardElements,String cardTypes){
        if(cardElements == "10JQKA" & cardTypes == "CCCCC"){
            return 1;
        }
        return -1;
    }
    public static String[] straightFlush(String cardElements,String cardTypes){
        String [] arr = new String[2];
        if((cardElements == "23456" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "34567" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "45678" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "56789" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "678910" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "78910J" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "8910JQ" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "910JQK" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements == "10JQKA" &
                ((cardTypes == "CCCCC") | (cardTypes == "DDDDD") | (cardTypes == "HHHHH") | (cardTypes == "SSSSS") ))){
            arr[0] = "2";
            arr[1] = cardElements.substring(0,2);
        }
        return arr;
    }
    public static String[] fourOfAKind(String cardElements){
        String[] arr = new String[2];
        if((cardElements.substring(0,4) == "2222") |
                (cardElements.substring(0,4) == "3333") |
                (cardElements.substring(0,4) == "4444") |
                (cardElements.substring(0,4) == "5555") |
                (cardElements.substring(0,4) == "6666") |
                (cardElements.substring(0,4) == "7777") |
                (cardElements.substring(0,4) == "8888") |
                (cardElements.substring(0,4) == "9999")){
            arr[1] = cardElements.substring(0,1);
        }
        if((cardElements.substring(1) == "2222") |
                (cardElements.substring(1) == "3333") |
                (cardElements.substring(1) == "4444") |
                (cardElements.substring(1) == "5555") |
                (cardElements.substring(1) == "6666") |
                (cardElements.substring(1) == "7777") |
                (cardElements.substring(1) == "8888") |
                (cardElements.substring(1) == "9999")){
            arr[1] = cardElements.substring(1,2);
        }
        if(cardElements.substring(0,2) == "10" & cardElements.substring(0,8) == "10101010"){
            arr[1] = "10";
        }
        if(cardElements.substring(1) == "10101010" ){
            arr[1] = "10";
        }
        if(cardElements.substring(0,2) == "10" & cardElements.substring(2,4) != "10"){
            if((cardElements.substring(2) == "JJJJ") |
                    (cardElements.substring(2) == "QQQQ") |
                    (cardElements.substring(2) == "KKKK") |
                    (cardElements.substring(2) == "AAAA")){
                arr[1] = cardElements.substring(2,3);
            }
        }
        if(cardElements.substring(0,2) != "10"){
            if((cardElements.substring(1) == "JJJJ") |
                    (cardElements.substring(1) == "QQQQ") |
                    (cardElements.substring(1) == "KKKK") |
                    (cardElements.substring(1) == "AAAA")){
                arr[1] = cardElements.substring(1,2);
            }
        }
        arr[0] = "3";
        return arr;
    }
    public static String[] fullHouse(String cardElements){
        String [] arr = new String[3];
        //some logic here
        arr[0] = "4";
        return arr;
    }
    public static String[] flush(String cardElement,String cardTypes){
        String [] arr = new String[2];
        if(CardTypeDefenitionUtil.royalFlush(cardElement,cardTypes) != 1 &
                CardTypeDefenitionUtil.straightFlush(cardElement,cardTypes)[0] != "2"){
            if((cardTypes.substring(0) == "CCCCC") |
                    (cardTypes.substring(0) == "DDDDD") |
                    (cardTypes.substring(0) == "HHHHH") |
                    (cardTypes.substring(0) == "SSSSS") ){
                arr[1] = cardTypes.substring(0,1);
            }
            arr[0] = "5";
        }else{
            arr[0] = "-1";
        }
        return arr;
    }
    public static String[] straight(String cardElements, String cardTypes){
        String[] arr = new String[2];
        if((cardElements.substring(0) == "23456" |
                cardElements.substring(0) == "34567" |
                cardElements.substring(0) == "45678" |
                cardElements.substring(0) == "56789" |
                cardElements.substring(0) == "678910" |
                cardElements.substring(0) == "78910J" |
                cardElements.substring(0) == "8910JQ" |
                cardElements.substring(0) == "910JQK" |
                cardElements.substring(0) == "10JQKA" )&
                ((cardTypes.substring(0) != "CCCCC") |
                        (cardTypes.substring(0) != "DDDDD") |
                        (cardTypes.substring(0) != "HHHHH") |
                        (cardTypes.substring(0) != "SSSSS") )){
            if(cardElements.length() != 5){
                if(cardElements.substring(0,2) == "10"){
                    arr[1] = "10";
                }else {
                    arr[1] = cardElements.substring(0,1);
                }
            }else {
                arr[1] = cardElements.substring(0,1);
            }
        }
        arr[0] = "6";
        return arr;
    }
    public static String[] threeOfAKind(String cardElements){
        String[] arr = new String[3];
        if(((cardElements.substring(0,3) == "222" & cardElements.substring(3,4) != "2")|
                (cardElements.substring(0,3) == "333" & cardElements.substring(3,4) != "3") |
                (cardElements.substring(0,3) == "444" & cardElements.substring(3,4) != "4") |
                (cardElements.substring(0,3) == "555" & cardElements.substring(3,4) != "5") |
                (cardElements.substring(0,3) == "666" & cardElements.substring(3,4) != "6") |
                (cardElements.substring(0,3) == "777" & cardElements.substring(3,4) != "7") |
                (cardElements.substring(0,3) == "888" & cardElements.substring(3,4) != "8") |
                (cardElements.substring(0,3) == "999" & cardElements.substring(3,4) != "9"))
                &
                ((cardElements.substring(3) != "33") |
                        (cardElements.substring(3) != "44") |
                        (cardElements.substring(3) != "55") |
                        (cardElements.substring(3) != "66") |
                        (cardElements.substring(3) != "77") |
                        (cardElements.substring(3) != "88") |
                        (cardElements.substring(3) != "99") |
                        (cardElements.substring(3) != "1010")|
                        (cardElements.substring(3) != "JJ") |
                        (cardElements.substring(3) != "QQ") |
                        (cardElements.substring(3) != "KK")|
                        (cardElements.substring(3) != "AA"))){
            if(cardElements.substring(3,5) == "10"){
                arr[1] = cardElements.substring(3,5);
                arr[2] = cardElements.substring(5);
            }else{
                arr[1] = cardElements.substring(3,4);
                arr[2] = cardElements.substring(4);
            }
        }
        if(((cardElements.substring(1,4) == "333" & cardElements.substring(4,5) != "3")) |
                ((cardElements.substring(1,4) == "444" & cardElements.substring(4,5) != "4")) |
                ((cardElements.substring(1,4) == "555" & cardElements.substring(4,5) != "5")) |
                ((cardElements.substring(1,4) == "666" & cardElements.substring(4,5) != "6"))|
                ((cardElements.substring(1,4) == "777" & cardElements.substring(4,5) != "7"))|
                ((cardElements.substring(1,4) == "888" & cardElements.substring(4,5) != "8")) |
                (cardElements.substring(1,4) == "999" & cardElements.substring(4,5) != "9")){
           arr[1] = cardElements.substring(4);
           arr[2] = cardElements.substring(0,1);
        }
        if((cardElements.substring(2) == "333" & cardElements.substring(1,2) != "3") |
                (cardElements.substring(2) == "444" & cardElements.substring(1,2) != "4") |
                (cardElements.substring(2) == "555" & cardElements.substring(1,2) != "5") |
                (cardElements.substring(2) == "666" & cardElements.substring(1,2) != "6") |
                (cardElements.substring(2) == "777" & cardElements.substring(1,2) != "7") |
                (cardElements.substring(2) == "888" & cardElements.substring(1,2) != "8") |
                (cardElements.substring(2) == "999" & cardElements.substring(1,2) != "9")){
            arr[1] = cardElements.substring(1,2);
            arr[2] = cardElements.substring(0,1);
        }
        if((cardElements.substring(0,6) == "101010" & cardElements.substring(6,8) != "10")
                &
                (cardElements.substring(6) != "JJ" |
                cardElements.substring(6) != "QQ" |
                cardElements.substring(6) != "KK" |
                cardElements.substring(6) != "AA")){
            arr[1] = cardElements.substring(6,7);
            arr[2] = cardElements.substring(7);
        }
        if((cardElements.substring(2) == "101010" & cardElements.length() == 8)
                &
                (cardElements.substring(0,2) != "22" |
                        cardElements.substring(0,2) != "33" |
                        cardElements.substring(0,2) != "44" |
                        cardElements.substring(0,2) != "55" |
                        cardElements.substring(0,2) != "66" |
                        cardElements.substring(0,2) != "77" |
                        cardElements.substring(0,2) != "88" |
                        cardElements.substring(0,2) != "99" )){
            arr[1] = cardElements.substring(1,2);
            arr[2] = cardElements.substring(0,1);
        }
        if(((cardElements.substring(0,3) == "JJJ" &
                (cardElements.substring(3,4) != "J" & cardElements.substring(3,4) != "Q" & cardElements.substring(3,4) != "K" & cardElements.substring(3,4) != "A") |
                (cardElements.substring(0,3) == "QQQ"
                        & (cardElements.substring(3,4) != "Q" & cardElements.substring(3,4) != "K" & cardElements.substring(3,4) != "A")))|
                (cardElements.substring(0,3) == "KKK" &
                        (cardElements.substring(3,4) != "K" & cardElements.substring(3,4) != "A"))|
                (cardElements.substring(0,3) == "AAA" & cardElements.substring(3,4) != "A"))){
            arr[1] = cardElements.substring(3,4);
            arr[2] = cardElements.substring(4);
        }
        arr[0] = "7";
        return arr;
    }

    public static String[] twoPair(String cardElement){
        String [] arr = new String[2];
        //some logic here
        arr[0] = "8";
        return arr;
    }
    public static String[] onePair(String cardElement){
        String[] arr = new String[4];
        //some logic here
        arr[0] = "9";
        return arr;
    }
    public String[] highCard(String cardElement,String cardType){
        String [] arr = new String[4];
        if(CardTypeDefenitionUtil.royalFlush(cardElement,cardType) != 1 &
                CardTypeDefenitionUtil.straightFlush(cardElement,cardType)[0] != "2" &
                CardTypeDefenitionUtil.fourOfAKind(cardElement)[0] != "3" &
                CardTypeDefenitionUtil.fullHouse(cardElement)[0] != "4" &
                CardTypeDefenitionUtil.flush(cardElement,cardType)[0] != "5" &
                CardTypeDefenitionUtil.straight(cardElement,cardType)[0] != "6" &
                CardTypeDefenitionUtil.threeOfAKind(cardElement)[0] != "7" &
                CardTypeDefenitionUtil.twoPair(cardElement)[0] != "8" &
                CardTypeDefenitionUtil.onePair(cardElement)[0] != "9"){
            if(cardElement.substring(0,2) == "10"){
                arr[1] = cardElement.substring(4,5);
                arr[2] = cardElement.substring(3,4);
                arr[3] = cardElement.substring(2,3);
                arr[4] = "10";
            }else{
                arr[1] = cardElement.substring(3,4);
                arr[2] = cardElement.substring(2,3);
                arr[3] = cardElement.substring(1,2);
                arr[4] = cardElement.substring(0,1);
            }
        }
        arr[0] = "10";
        return arr;
    }


}
