package pattern.state;

import java.util.Random;

/**
 * 
 * @ClassName: HasQuarterState 
 * @Description: 有15分钱状态
 * @author:	xuelin
 * @date: Jul 25, 2015 11:15:23 AM 
 *
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random random = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert anoter quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = random.nextInt(10);
		if(0 == winner && gumballMachine.getCount() > 1){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispense");
	}

}
