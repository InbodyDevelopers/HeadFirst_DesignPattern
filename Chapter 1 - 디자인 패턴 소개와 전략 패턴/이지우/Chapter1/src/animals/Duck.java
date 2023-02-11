package animals;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

/**
 * 
 * @author 이지우
 * 오리가 가진 기능
 * 1. display - 모든 오리의 기능, 각각 다르게 동작
 * 2. swim - 모든 오리의 기능, 동일하게 동작
 * 3. quack - 일부 오리의 기능, 각각 다르게 동작
 * 4. fly - 일부 오리의 기능, 각각 다르게 동작
 * 
 */
public abstract class Duck {
	public QuackBehavior quackBehavior;
	public FlyBehavior flyBehavior;
	public Duck() {}
	public abstract void display();
	public void swim() { // 모든 오리의 공통이므로 오리 객체의 최상단에서 구현하고 상속 받도록 한다.
		System.out.println("모든 오리 물에서 뜸 - Duck class");
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
