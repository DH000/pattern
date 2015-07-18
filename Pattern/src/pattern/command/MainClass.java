package pattern.command;

/**
 * 命令模式
 * 
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Light light = new Light();
		LightCommand com = new LightCommand(light);
		RemoteControl control = new RemoteControl();
		control.setCommand(com);
		
		control.clickOnBtn(0);
		control.undo();
	}
}
