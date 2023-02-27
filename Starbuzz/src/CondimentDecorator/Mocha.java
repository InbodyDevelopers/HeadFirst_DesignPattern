package CondimentDecorator;
import Beverage.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ��ī";
	}
	
	public double cost() {
		return beverage.cost() + .20;
	}
	
}
