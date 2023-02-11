package Main;

import animals.Duck;
import behaviors.fly.FlyNoWay;
import ducks.MallardDuck;

public class Main {
	public static void main(String args[]) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.swim();
		
		System.out.println("\n***������ ������ ���ƴ�.***\n");
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
	}
}
