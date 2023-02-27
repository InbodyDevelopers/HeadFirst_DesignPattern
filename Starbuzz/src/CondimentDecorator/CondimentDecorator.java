package CondimentDecorator;
import Beverage.Beverage;

// '첨가물'을 위한 데코레이터 클래스 (추상 클래스)
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}


