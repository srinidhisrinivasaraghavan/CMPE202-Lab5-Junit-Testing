

public class NoMoneyState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasMoneyState());
	}
	public void insertNickel() {
		System.out.println("You inserted a Nickel");
		gumballMachine.setState(gumballMachine.getHasMoneyState());
	}
	public void insertDime() {
		System.out.println("You inserted a Dime");
		gumballMachine.setState(gumballMachine.getHasMoneyState());
	}
	
	
	
	public void ejectMoney() {
		System.out.println("You haven't inserted anything");
	}
	
	public void turnCrank() {
		System.out.println("You turned, but there's no 50 cents");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter/nickel/dime";
	}
	 public String name()
	 {
	     return "NoMoneyState";
	   }
	    public boolean isGumballInSlot()
    {
        return false;
    }
 
    public void takeGumballFromSlot()
    {
        System.out.println("No gumball in slot.. U have not entered any coins");
        
    }
}