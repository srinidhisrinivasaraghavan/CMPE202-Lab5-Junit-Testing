

import java.util.Random;

public class HasMoneyState implements IGumballMachine {
	GumballMachine gumballMachine;
 
	public HasMoneyState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
	}
	
	public void insertNickel() {
		System.out.println("You inserted a Nickel");
	}
	
	public void insertDime() {
		System.out.println("You inserted a Dime");
	}
 
	public void ejectMoney() {
		System.out.println("Money returned");
		gumballMachine.setState(gumballMachine.getNoMoneyState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.money==50)
		{
		    gumballMachine.money=0;
		gumballMachine.setState(gumballMachine.getSoldState());
	    } 
	    else if(gumballMachine.money>50)
	    { 
	    gumballMachine.money=gumballMachine.money-50;
	    System.out.println("take the remaining money back "+gumballMachine.money+" cents");
	    gumballMachine.money=0;
	    gumballMachine.setState(gumballMachine.getSoldState());
	   }
	   else if(gumballMachine.money>0 && gumballMachine.money<50)
	   {
	      System.out.println("U have inserted only  "+gumballMachine.money+"  cents still"); 
	   }
}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
	
	
	 public String name()
	 {
	     return "HasMoneyState";
	   }
	   
	    public boolean isGumballInSlot()
    {
        return false;
    }
 
    public void takeGumballFromSlot()
    {
        System.out.println("No gumballs in slot.. turn crank");
        
    }
}
