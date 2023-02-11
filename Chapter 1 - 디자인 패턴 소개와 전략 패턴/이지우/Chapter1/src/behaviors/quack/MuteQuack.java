package behaviors.quack;

import behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("... - MuteQuack class");
	}

}
