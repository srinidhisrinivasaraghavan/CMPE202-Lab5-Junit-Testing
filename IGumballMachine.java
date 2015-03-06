public interface IGumballMachine
{  
	public void insertQuarter();
	public void ejectMoney();
	public void insertDime( ) ;
	public void insertNickel( ) ;
	public void turnCrank();
	public void dispense();
	public String name();
	public boolean isGumballInSlot();
    public void takeGumballFromSlot( ) ;
}