package CondimentDecorator;
import Beverage.Beverage;

// '÷����'�� ���� ���ڷ����� Ŭ���� (�߻� Ŭ����)
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}


