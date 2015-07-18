package pattern.adapter;

/**
 * 测试类
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		adapter.quack();
	}
}
