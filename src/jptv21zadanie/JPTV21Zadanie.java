
package jptv21zadanie;

import java.util.Scanner;


public class JPTV21Zadanie {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====StringEdit====");
        System.out.println("Vvedite tekst(latinitsei): ");
        String str = scanner.nextLine();
        int repeat = 1;
        do {
            System.out.println("vi vveli sledujuwij tekst: " + str);
            System.out.println("vvesite nomer funktsii: ");
            System.out.println("1 : koli4estvo simvolov v tekste");
            System.out.println("2 : loi4estvo slov v tekste");
            System.out.println("3 : nehodit ukazannuju podstroku v tekste");
            System.out.println("4 : zamenjaet ukazannuju podstroku na druguju podstorku");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction) {
                case 0:
                    System.out.println("poka");
                    repeat = 0;
                case 1:
                    System.out.println("vibrana 1 func");
                    char[] strChar = str.toCharArray();
                    System.out.println("pos4itano: " + strChar.length);
                    break;
                case 2:
                    System.out.println("vibrana 2 func");
                    String[] wordArray = str.split(" ");
                    System.out.println("pos4itano: " + wordArray.length + " slov");
                    break;
                case 3:
                    System.out.println("vibrana 3 func");
                    System.out.println("vvedite iskomoe");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if (indexSubStr < 0) {
                        System.out.print("takoi podstoki net ");
                    }else{ 
                        indexSubStr++;
                        System.out.println("podstroka naxoditsja na " +indexSubStr + " pozitsijax v stroke");
                    }
                    break;
                case 4:
                    
                    System.out.println("vibrana 4 func");
                    break;
                default:
                    break;
            }
            System.out.println("=============================");
            if(repeat == 0)break;
        } while (true);
    }
    
}
