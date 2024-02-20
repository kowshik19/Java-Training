import java.util.*;
public class StdDetails {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    String s= sc.nextLine();
    int a= sc.nextInt();
    float b= sc.nextFloat();
    char g= sc.next().charAt(0);
    System.out.println("Name: "+s);
    System.out.println("Age: "+a);
    System.out.println("CGPA: "+Math.floor(b*100)/100);
    System.out.println("Grade: "+g);
    sc.close();
   } 
}
