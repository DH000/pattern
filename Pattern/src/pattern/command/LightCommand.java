package pattern.command;

public class LightCommand implements Command {
	private Light light;
	
	public LightCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

	@Override
	public void uodo() {
		this.light.off();
	}

}
