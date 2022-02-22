import java.util.Scanner;
public class CREDIT{
public static void main(String[] args) {
        
    int credit_limit, quantity, price;
    int next_customer='1';
    Scanner input = new Scanner(System.in);
    System.out.println("\n\t\tEVALUATION OF CUSTOMER CREDIT");
    do{
        System.out.printf("\n\tInput customer limit: ");
        credit_limit = input.nextInt();
        System.out.printf("\n\tInput quantity: ");
        quantity = input.nextInt();
        System.out.printf("\n\tInput price: ");
        price = input.nextInt();
        if((price*quantity)>credit_limit)
        {
            System.out.println("\nThe value of goods selected worth " +Integer.toString((price * quantity)) + "exceeds" + Integer.toString(credit_limit)+". please retry");
                    System.out.println("Sorry you cannot purchase goods worthy such a value on credit");
                    System.out.println("\n");
        
        }
        else{
            System.out.println("Input valid. Thank you for purchasing from us");
        }
        System.out.printf("\nNext customer (Y/N)? ");
        System.out.println("1.Yes");
        System.out.println("2.No");
        Scanner reader=new Scanner(System.in);
        next_customer=reader.nextInt();
                {
                    if (next_customer==1){
                        next_customer='y';
                    }
                   
                  else if(next_customer==2){
                      next_customer='2';
                        }}
         
    }while(next_customer=='y');
    
 }
 
}
