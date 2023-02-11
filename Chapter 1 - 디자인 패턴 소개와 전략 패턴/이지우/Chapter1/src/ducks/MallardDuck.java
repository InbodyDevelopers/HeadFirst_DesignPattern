package ducks;

import animals.Duck;
import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("나는 물오리다 - MallardDuck class");
	}

}
