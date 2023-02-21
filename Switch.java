import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        switch(number){
            case 1: System.out.println("Hello Sir ");
            break;
            case 2 : System.out.println("Good Morning Sir");
            break;
            case 3: System.out.println("Good Evening Sir");
            break;
            default : System.out.println("Not Valid Number");
        }
    }
    
}
