package pattern.state;

/**
 * 
 * @ClassName: WinnerState 
 * @Description: 抽中状态
 * @author:	xuelin
 * @date: Jul 25, 2015 11:41:47 AM 
 *
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You're a winner, you get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if(0 == gumballMachine.getCount()){
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else{
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else{
				System.out.println("Oops, out of gumball");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
