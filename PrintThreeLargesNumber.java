import java.util.Scanner;

public class PrintThreeLargesNumber {
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The 1st number");
         int A =sc.nextInt();
         System.out.println("Enter The 2st number");
         int B =sc.nextInt();
         System.out.println("Enter The 3st number");
         int C =sc.nextInt();
        // int A=1,B=2,C=3;
        
          if((A>=B) && (A>=C)) {
            System.out.println("A is larges number");
          } 
          else if (B>=C){
            System.out.println("B is a larest");
          }
          else {
            System.out.println("C is Larges Number");
          }
    }
}
