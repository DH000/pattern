package pattern.observer;

public class ManObserver implements Observer {

	@Override
	public void update(SubjectData subject) {
		System.out.println("I'm man.");
	}

}
