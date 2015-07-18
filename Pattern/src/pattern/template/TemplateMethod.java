package pattern.template;

/**
 * 模板方法
 * 
 * @author Lin.Pc
 *
 */
public class TemplateMethod extends AbstractTemplateMethod {

	@Override
	public void step1() {
		System.out.println("step1");
	}

	@Override
	public void step3() {
		System.out.println("step3");
	}

	@Override
	public void step4() {
		System.out.println("step4");
	}

	@Override
	public boolean gouzi() {
		return false;
	}

}
