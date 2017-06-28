import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Exercise 14
        Scanner scnr = new Scanner (System.in);
        String keepGoing = "";
        int userNum;
        do {
            System.out.println("Enter a number: ");
            userNum = scnr.nextInt();
            for (int i =1; i <= userNum; ++i){
                System.out.print(Math.pow(i, 2)+ " ");
            }
            System.out.println("");
            scnr.nextLine();
            System.out.println("Would you like to continue? (Y/N)");
            keepGoing = scnr.nextLine();
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));

    }
}
