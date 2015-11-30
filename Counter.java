package drawing;
import java.util.Vector;


public class Counter {
	
	private Vector<Observer> observers = new Vector<>();

	
	int counter = 0;
	
	public Counter() {
	}

	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs){
		observers.remove(obs);
	}
	
	private void notifyObservers(){
		for (Observer obs : observers) {
			obs.update(counter);
		}
	}
	
	
	
	public void renitialiser() {
		counter = 0;
		notifyObservers();
	}
}