package pattern.observer;

import java.util.ArrayList;

public class PaperSubject implements Subject {
	private ArrayList<Observer> observers;
	
	public PaperSubject(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void update(SubjectData data) {
		for(Observer observer : observers){
			observer.update(data);
		}
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}
