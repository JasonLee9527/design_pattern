package headfirst.designpatterns.strategy.pattern;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
