import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         float a=sc.nextFloat();
         System.out.println((int)a);
         System.out.println((int)Math.ceil(a));
         System.out.println((int)Math.floor(a)); 
         sc.close();
    }
}
