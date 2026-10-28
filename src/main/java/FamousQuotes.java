import java.util.*;
public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     while ( true ) {
         try {
             String[] quotes = {"Be the change you wish to see in the world.",
                     "Stay hungry, stay foolish.",
                     "Less is more.",
                     "I think, therefore I am.",
                     "Action is the foundational key to all success.",
                     "Dream big and dare to fail.",
                     "Turn your wounds into wisdom.",
                     "Simplicity is the ultimate sophistication.",
                     "Life is what happens when you're busy making other plans.",
                     "Done is better than perfect."
             };

             System.out.println("Pick a quote (select #1 - #10): ");
             int index = scanner.nextInt();
             scanner.nextLine();
             index = index - 1;
             System.out.println(quotes[index]);
             System.out.println("do you want to try again (yes/no): ");
             String response = scanner.nextLine();
             if(   response.equals("no")  ) {break;}

         } catch (Exception e) {
             System.out.println("Your number was out of range.");
             e.printStackTrace();
         }
     }
    }
}
