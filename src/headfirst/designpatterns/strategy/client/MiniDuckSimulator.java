package headfirst.designpatterns.strategy.client;

import headfirst.designpatterns.strategy.pattern.DecoyDuck;
import headfirst.designpatterns.strategy.pattern.Duck;
import headfirst.designpatterns.strategy.pattern.FlyRocketPowered;
import headfirst.designpatterns.strategy.pattern.MallardDuck;
import headfirst.designpatterns.strategy.pattern.ModelDuck;
import headfirst.designpatterns.strategy.pattern.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
