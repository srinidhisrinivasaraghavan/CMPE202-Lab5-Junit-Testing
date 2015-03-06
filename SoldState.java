

public class SoldState implements IGumballMachine {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		
	}
	
	public void insertDime() {
		System.out.println("You inserted a Dime");
		
	}
	
	public void insertNickel() {
		System.out.println("You inserted a Nickel");
		
	}
 
	public void ejectMoney() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
	    
        System.out.println("A gumball comes rolling out the slot...");
        gumballMachine.gumballInSlot=true;
        
        if (gumballMachine.count != 0) {
            gumballMachine.count = gumballMachine.count - 1;
        }
    
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoMoneyState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
	
	
	 public String name()
	 {
	     return "SoldState";
	   }
	   
	    public boolean isGumballInSlot()
    {
        return true;
    }
 
    public void takeGumballFromSlot()
    {
        System.out.println("Gumball taken from slot");
        
    }
	
}


