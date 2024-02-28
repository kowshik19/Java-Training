class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class add{
    public static void main (String args[])
    {
        System.out.println(Adder.add(2,3));
         System.out.println(Adder.add(4,5,6));
    }
}