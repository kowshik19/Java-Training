import java.util.Scanner;

public class NumberSystem {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
      if (i%2==0) {
        System.out.print(i*i-2+" ");
      } else {
        System.out.print(i*i-1+" ");
      }  
    }
    sc.close();
   } 
}
