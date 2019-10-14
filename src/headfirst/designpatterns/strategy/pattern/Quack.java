package headfirst.designpatterns.strategy.pattern;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
