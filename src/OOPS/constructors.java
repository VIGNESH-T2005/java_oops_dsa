// Bank problem 
package OOPS;

import java.util.*;

class constructors{
	String Accountholder;
	String Accountnumber;
	int Balance;
	int Password=6876;
	
	
	public constructors(String Accountholder ,String Accountnumber , int Balance ) {
		this.Accountholder= Accountholder;
		this.Accountnumber= Accountnumber;
		this.Balance=Balance;
		
	}
	
	public void deposit(int amount,int Pin){
		if(Password==Pin && amount>0) {
			Balance+=amount;
			System.out.println("deposited amount :" + amount);
			System.out.println("Total balance :" + Balance);
		}
		else {
			System.out.println("Enter correct pin ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		constructors sbi = new constructors("vignesh","sbi120324",1000);
		System.out.println("enter the pin :");
		int Pin=sc.nextInt();
		System.out.println("Enter amount to deposit :");
		int amount=sc.nextInt();
		sbi.deposit(amount, Pin);
	}
}