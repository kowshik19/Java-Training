import java.util.Scanner;

public class Team {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The number of friends in each team is "+a/b+" and the left is "+a%b);
    sc.close();
   } 
}
