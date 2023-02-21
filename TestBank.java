package gitHub;
public class TestBank
{
	public static void main(String[] args) {
    //Abstract Class Program
	// abstraction means hiding the implementation details and showing only the functionality to the user 
	Bank b= new Mastercard ();
	System.out.println("the account numerstart with :" +b.accountnumber());
	}
}

abstract class Bank
{
	// abstract class is restricted class that cannot be used to create object (it must be inherited from another class)
	//abstract method is used only in an abstract class and it does not have a body (body is provided by the subclasss)
	abstract int accountnumber();
}
class Mastercard extends Bank
{
	int accountnumber()
	{
		return 5;
	}
}
class Visa extends Bank
{
	int accountnumber()
	{
		return 7;
	}
}
