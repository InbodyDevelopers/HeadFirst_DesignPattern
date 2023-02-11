package animals;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

/**
 * 
 * @author ������
 * ������ ���� ���
 * 1. display - ��� ������ ���, ���� �ٸ��� ����
 * 2. swim - ��� ������ ���, �����ϰ� ����
 * 3. quack - �Ϻ� ������ ���, ���� �ٸ��� ����
 * 4. fly - �Ϻ� ������ ���, ���� �ٸ��� ����
 * 
 */
public abstract class Duck {
	public QuackBehavior quackBehavior;
	public FlyBehavior flyBehavior;
	public Duck() {}
	public abstract void display();
	public void swim() { // ��� ������ �����̹Ƿ� ���� ��ü�� �ֻ�ܿ��� �����ϰ� ��� �޵��� �Ѵ�.
		System.out.println("��� ���� ������ �� - Duck class");
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
