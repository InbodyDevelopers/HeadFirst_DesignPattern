import Beverage.Beverage;
import Beverage.DarkRoast;
import Beverage.Espresso;
import Beverage.HouseBlend;
import CondimentDecorator.Mocha;
import CondimentDecorator.Soy;
import CondimentDecorator.Whip;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		// 주문서 - 에스프레소
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// 주문서 - 다크 로스트 모카2샷 + 휘핑크림
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// 주문서 - 하우스 블렌드 + 두유 + 모카 + 휘핑크림
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
