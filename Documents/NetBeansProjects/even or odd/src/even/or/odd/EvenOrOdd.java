
package even.or.odd;
import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Enter the value  of n: ");
        Scanner m=new Scanner(System.in);
        n=m.nextInt();
        if(n%2==0)
        {System.out.println("the number is even");
        }
        else
        {
                System.out.println("The number is odd");
                }
        }
    }
    

