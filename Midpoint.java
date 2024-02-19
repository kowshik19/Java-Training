import java.util.Scanner;

public class Midpoint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    float x =(float)(x1+x2)/2;
    float y=(float)(y1+y2)/2;
    System.out.println("Arun's house is located at ("+x+","+y+")");
    sc.close();
  }  
}
