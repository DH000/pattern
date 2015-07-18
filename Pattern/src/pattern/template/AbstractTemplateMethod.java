package pattern.template;

/**
 * 模板方法
 * 
 * @author Lin.Pc
 *
 */
public abstract class AbstractTemplateMethod {

	public final void execue(){
		step1();
		step2();
		step3();
		if(gouzi()){
			step4();
		}
		step5();
	}
	
	public abstract void step1();
	
	public void step2(){
		System.out.println("step2");
	}
	
	public abstract void step3();
	
	public abstract void step4();
	
	public void step5(){
		System.out.println("step5");
	}
	
	public abstract boolean gouzi();
}
