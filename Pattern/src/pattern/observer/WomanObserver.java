package pattern.observer;

public class WomanObserver implements Observer {

	@Override
	public void update(SubjectData subject) {
		System.out.println("I'm woman.");
	}

}
