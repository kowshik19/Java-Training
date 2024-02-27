import java.util.Scanner;

public class Table {

  public static void main(String args[])
  {
    int i;
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println("Enter m");
    int m = sc.nextInt();
    sc.close();
    System.out.println("The multiplication table of "+n+" is");
    for(i=1;i<=m;i++)
    {
       System.out.println(i+"*"+n+"="+(i*n));
    } 
   
  }}