package pattern.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command to execute.");
	}

	@Override
	public void uodo() {
		System.out.println("no command to uodo.");
	}

}
