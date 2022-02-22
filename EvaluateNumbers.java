import java.util.Scanner;
public class EvaluateNumbers {
public static void main(String[] args) {
    int number;
    Scanner reader=new Scanner(System.in);
    System.out.println("Enter an integer Number: ");
    number =reader.nextInt();
    System.out.println(number %2==013 ?number+ "is Even":number +"is odd");
    if (number %2 ==0)
        System.out.println(number+ "is Even");
    else System.out.println(number +"is odd");
    
    }
}

