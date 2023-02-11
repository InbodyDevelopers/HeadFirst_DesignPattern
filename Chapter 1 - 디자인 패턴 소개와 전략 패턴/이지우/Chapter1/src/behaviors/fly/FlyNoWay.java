package behaviors.fly;

import behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못한다 - FlyNoWay class");

	}

}
