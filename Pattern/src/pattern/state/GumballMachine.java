package pattern.state;

/**
 * 
 * @ClassName: GumballMachine 
 * @Description: 糖果机
 * @author:	xuelin
 * @date: Jul 25, 2015 11:16:31 AM 
 *
 */
public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	// 当前糖果数量
	int count = 0;
	
	// 当前状态
	State state = soldOutState;
	
	public GumballMachine(int numberGunballs){
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGunballs;
		if(this.count > 0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count > 0){
			this.count -= 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}
	
}
