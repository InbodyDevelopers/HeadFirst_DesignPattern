package CondimentDecorator;
import Beverage.Beverage;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ����ũ��";
	}
	
	public double cost() {
		return beverage.cost() + .10;
	}
	
}


