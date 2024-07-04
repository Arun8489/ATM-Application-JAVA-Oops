import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UserData 

{
Scanner obj = new Scanner(System.in);
	private static  List<User> users;
	private static  List<CreateAccount> accounts;
	private static Map<Double, String> transactions;
	private static List<String> transactionlists;

	CreateAccount ca = new CreateAccount();
	
	public UserData()
	{
		users = new ArrayList<>();
		accounts = new ArrayList<>();
        transactions = new HashMap<>();
        transactionlists = new ArrayList<>();
	}
	
	

	public void signup(String name, String id, String password)
	{
      		 for(User user : users)
      		 {
      			 if(user.getId().equals(id))
      			 {
      				 System.out.println("ID Already Exist");
      			 }
      			 
      		 }
      		 users.add(new User(id, name, password));
      		 System.out.println("\tSignUp Successfull");
	}

	
	
	public boolean login(String loginId, String loginPassword)
	{
		for (User user : users) 
		{
            if (user.getId().matches(loginId) && (user.getPassword().matches(loginPassword)) )
            {
                System.out.println("Login successful!");
                System.out.println("Welcome, " + user.getName() + "!");
		        return true;
            }
            System.out.println();
		}
		 System.out.println("\tInvalid ID or password.");
	      return false;
	}
	
	
	
	public void UsersLists()
	{
		
		for(User user : users)
		{ 
		
			System.out.println(user.getId() + "   " + user.getName() + "   " + user.getPassword());
		}
		System.out.println();
	}

	
	
	public void createAccount() 
	{
		            System.out.println("Enter the ID : ");
		            String id = obj.next();
            		System.out.println("Enter the name :");
            	    String name = obj.next();
            	    System.out.println("Enter Age : ");
            	    int age = obj.nextInt();
            	    System.out.println("Enter Initial Deposit : ");
            	    double initialAmount = obj.nextDouble();
            	    double currentBalance = initialAmount;
            	    
            	    accounts.add(new CreateAccount(id, name, age, initialAmount, currentBalance));
            	    
     }

	public void AccountsLists() 
	{
		System.out.println("ID\tName\t\tAge\tInitial_Deposit\t\tcurrentBalance\n" );
		System.out.println("------------------------------------------------------------------------");
		 for(CreateAccount acc : accounts)
		 {
			 System.out.println(acc.getId()+"\t"+acc.getName()+"\t\t"+acc.getAge()+"\t"+acc.getInitialAmount()+"\t\t\t"+acc.getCurrentBalance());
		 }
		 System.out.println();
	}



	public void depositAmount(String cusID) 
	{
		
		for (CreateAccount acc : accounts)
		{
			if(acc.getId().matches(cusID))
			{
				System.out.println("Enter the Amount to Deposit\n");
				double amount = obj.nextDouble();
				if(amount>= 0)
		    	{
					
		    		double total = acc.getCurrentBalance()+ amount;
		    		System.out.println(" | Amount Deposited : \n" +amount +" |");
		    		acc.setCurrentBalance(total);
		    		System.out.println("Total Amount : " +total);
		    		transactions.put(amount, " Amount Deposited on "+acc.getId()+ " - "+acc.getName());
		    		
		    		System.out.println(acc.getName()+ "," +amount+" Deposited in your Account\n \t Total balance : " +total+"\n"); 
		    	}
		    	else 
		    	{
		    		System.out.println("Invalid Amount\n");
		    	}
			}
			else 
			{
			  System.out.println("There is No ID Matching with the INPUT\n");	
			}
		}
		
	}

    




	public void WithdrawAmount(String cusID) 
	{
		for (CreateAccount acc : accounts)
		{
			if(acc.getId().matches(cusID))
			{
				System.out.println("Enter the Amount to WithDraw\n");
				double amount = obj.nextDouble();
				if (amount>= 0)
		    	{
					
		    		double total = acc.getCurrentBalance() - amount;
		    		System.out.println(" | Amount WithDrawn : \n" +amount +" |");
		    		acc.setCurrentBalance(total);
		    		System.out.println();
		    		transactions.put(amount, " Amount WithDrawn on "+acc.getId()+ " - "+acc.getName());
		    		
		    		System.out.println(acc.getName()+ "," +amount+" WithDrawn from your Account\n \t Total balance : " +total +"\n"); 
		    	}
		    	else 
		    	{
		    		System.out.println("Invalid Amount\n");
		    	}
			}
			else 
			{
			  System.out.println("There is No ID Matching with the INPUT\n");	
			}
		}
	}



	public void CheckBalance(String cusID) 
	{
		for (CreateAccount acc : accounts)
		{
		  if(acc.getId().matches(cusID))
		   {
			System.out.println("cusID   : " + cusID);
			System.out.println("cusNAME : " + acc.getName());
			System.out.println("Balance : " + acc.getCurrentBalance());
		   }
		   else 
		    {
		      System.out.println("There is No ID Matching with the INPUT\n");	
		    }
	    }
	}	

public void accountTransaction()
{
	for(Entry<Double, String> m:transactions.entrySet())
	{
        System.out.println(m.getKey()+""+m.getValue());
    }
}

	



}
