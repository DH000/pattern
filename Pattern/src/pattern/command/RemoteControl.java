package pattern.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	private List<Command> coms;
	private Command undoCom;
	
	public RemoteControl(){
		this.coms = new ArrayList<Command>();
	}
	
	public void setCommand(Command command){
		if(null != command){
			this.coms.add(command);
		}
	}
	
	public void clickOnBtn(int index){
		if(index >= this.coms.size()){
			System.out.println("no command to execute.");
			return;
		}
		
		Command com = this.coms.get(index);
		if(null != com){
			com.execute();
			this.undoCom = com;
		}
	}
	
	public void undo(){
		if(null != this.undoCom){
			this.undoCom.uodo();
		}else{
			System.out.println("no command to uodo.");
		}
	}
}


