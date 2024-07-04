import java.util.Scanner;

public class MainClass 
{ 
	 public static void main(String[] args) 
	 {
		    
	        UserData data = new UserData();
	        Scanner scanner = new Scanner(System.in);
	        while (true) 
	        {
	            System.out.println("\t - - - - Welcome to the User Management System. Choose an option: - - -\n\n ");
	            System.out.println("1. Signup    2.Login\t3.UsersLists\t 4.Create Account ");
	            System.out.println("5. Account Lists\t 6. Deposit Amount\t 7. Withdraw Amount" );
	            System.out.println("8. Check Balance \t 9. Transactions in ATM \t 10. Exit" );
	            
	            

	            int choice = scanner.nextInt();
	              scanner.nextLine();  // Consume newline
	            
	            switch(choice)
	            {
	            case 1: 
	            	System.out.println("\t - - - Sign Up - - - ");
	            	
	            	System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    data.signup(name, id, password);
                    break;
                    
	            case 2:
	            	System.out.println("\t - - - Log In - - - \n\n");
	            	
	            	System.out.print("Enter ID: ");
                    String loginId = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    data.login(loginId, loginPassword);
                    break;
                   
                case 3:
                	 System.out.println("\t- - - List of All Users - - - \n\n");
                	 data.UsersLists();
                	 break;
                	 
                case 4:
                	 System.out.println("\t- - - Create An Account - - - \n\n");
                	 data.createAccount();
                	 break;
                
                case 5:
                	System.out.println("\t- - - List of Accounts - - - \n\n");
                	data.AccountsLists();
                	break;
                	
                case 6:
                	System.out.println("\t- - - Deposit Amount - - - \n\n");
                	System.out.println("Enter the Customer ID\n");
            		String cusID = scanner.next();
            		
                	data.depositAmount(cusID);
                	break;
                	
                case 7:
                	System.out.println("\t- - - Withdraw Amount - - - \n\n");
                	System.out.println("Enter the Customer ID\n");
                	String cusID1 = scanner.next();
                	data.WithdrawAmount(cusID1);
                	
                	break;
                
                case 8:
                	System.out.println("\t- - - Check Balance - - - \n\n");
                	System.out.println("Enter the Customer ID\n");
                	String cusID2 = scanner.next();
                	data.CheckBalance(cusID2);
                	break;
                    
	            case 9:
	            	 System.out.println("\t- - -  Tansaction History - - - \n\n");
	            	 data.accountTransaction();
	                 break;
	                
	            case 10:
                	System.out.println("\t\\t- - Thank you for using the User Management System. Goodbye! - -\n\n");
                	scanner.close();
                	return;
                	
	            default:
                    System.out.println("\t x-x-x-  Invalid option. Please try again -x-x-x\n\n");
                    break;


	            }
	        }
	 }
}
