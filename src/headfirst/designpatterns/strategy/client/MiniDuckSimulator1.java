package headfirst.designpatterns.strategy.client;

import headfirst.designpatterns.strategy.pattern.Duck;
import headfirst.designpatterns.strategy.pattern.FlyRocketPowered;
import headfirst.designpatterns.strategy.pattern.MallardDuck;
import headfirst.designpatterns.strategy.pattern.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
