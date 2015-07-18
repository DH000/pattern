package pattern.singleton;

public class MainClass {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.doSomething();
	}
}
