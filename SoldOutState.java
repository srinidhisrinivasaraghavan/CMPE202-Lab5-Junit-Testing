

public class SoldOutState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
	
	
	public void insertNickel() {
		System.out.println("You can't insert a Nickel, the machine is sold out");
	}
	
	
	public void insertDime() {
		System.out.println("You can't insert a dime, the machine is sold out");
	}
 
	public void ejectMoney() {
		System.out.println("You can't eject, you haven't inserted money yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
	
	
	 public String name()
	 {
	     return "SoldOutState";
	   }
	   
	   public boolean isGumballInSlot()
    {
        return false;
    }
 
    public void takeGumballFromSlot()
    {
        System.out.println("No gumball in slot.. turn crank");
        
    } 
}
