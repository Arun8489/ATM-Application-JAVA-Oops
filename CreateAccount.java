import java.util.List;

public class CreateAccount
{
	private String id;
   private String name;
   private int age;
   private double initialAmount;
   private double currentBalance;
   private List<String> Accounts;
   
public CreateAccount(String id, String name, int age, double initialAmount, double currentBalance) 
{
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.initialAmount = initialAmount;
    this.currentBalance = currentBalance;
}



public CreateAccount() {
	// TODO Auto-generated constructor stub
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getInitialAmount() {
	return initialAmount;
}

public void setInitialAmount(double initialAmount) {
	this.initialAmount = initialAmount;
}



public double getCurrentBalance() {
	return currentBalance;
}



public void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
}



}
