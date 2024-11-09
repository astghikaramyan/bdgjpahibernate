package vmwarechallengeproblems;

import java.util.Scanner;

/**
 * Created by User on 26.09.2020.
 */
public class StdInStdOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = null;
        String s = null;
        int i = 0;
        double d = 0.0;
        boolean doubleValue = false;
        boolean intValue = false;
        while(scan.hasNextLine()){
            line = scan.nextLine();
            try{
                Integer.parseInt(line);
                intValue = true;
            }catch(NumberFormatException e){
                intValue = false;
            }
            try{
                Double.parseDouble(line);
                if(i != 0){
                    doubleValue = true;
                }
            }catch(NumberFormatException e){
                doubleValue = false;
            }
            if(doubleValue){
                d = Double.parseDouble(line);
            }else if(intValue){
                i = Integer.parseInt(line);
            }else{
                s = line;
            }
        }
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
