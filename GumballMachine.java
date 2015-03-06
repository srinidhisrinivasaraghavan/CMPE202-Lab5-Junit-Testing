

public class GumballMachine {
 public int money=0;
 boolean gumballInSlot=false;
    IGumballMachine soldOutState;
    IGumballMachine noMoneyState;
    IGumballMachine hasMoneyState;

    IGumballMachine soldState;
 
    IGumballMachine state = soldOutState;
    int count = 0;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
         
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noMoneyState;
        } 
    }
 
    public void insertQuarter() {
        money=money+25;
        state.insertQuarter();
    }
    public void ejectMoney() {
        System.out.println("take the money back"+money);
        money=0;
        state.ejectMoney();
     }
    
    public void insertDime() {
        money=money+10;
        state.insertDime();
     }
    
    public void insertNickel() {
        money=money+5;
        state.insertNickel();
}
 
    public void turnCrank() {
            state.turnCrank();
            state.dispense();
    }

    void setState(IGumballMachine state) {
        this.state = state;
    }
 
    
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noMoneyState;
    }

    int returnMoney()
    {
        return money;
    }
    
    public String getState() {
        return state.name();
    }

    public IGumballMachine getSoldOutState() {
        return soldOutState;
    }

    public IGumballMachine getNoMoneyState() {
        return noMoneyState;
    }

    public IGumballMachine getHasMoneyState() {
        return hasMoneyState;
    }
  
    
    
    public IGumballMachine getSoldState() {
        return soldState;
    }
    
    public boolean isGumballInSlot()
    {
        return gumballInSlot;
    }
 
    public void takeGumballFromSlot()
    {
        if (gumballInSlot==false)
        state.takeGumballFromSlot();
        else
        {
        System.out.println("Gumball from slot taken");
        gumballInSlot=false;
    }
}
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
