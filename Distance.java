import java.util.Scanner;

public class Distance {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1= 3;
    int y1= 4;
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    double dis= Math.sqrt((Math.pow(x2-x1, 2))+Math.pow(y2-y1, 2));
    System.out.println(" The Distance is "+ (int)dis);
    sc.close();
   } 
}
