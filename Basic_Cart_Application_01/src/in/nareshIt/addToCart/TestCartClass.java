package in.nareshIt.addToCart;

import java.util.List;

import in.nareshIt.products.Mobile;

public class TestCartClass {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setName("SAMSUNG");
		m1.setPrice(25000);
		m1.setColor("BLUE");

		Mobile m2 = new Mobile();
		m2.setName("BLACK BERRY");
		m2.setColor("BLACK");
		m2.setPrice(35000);

		Mobile m3 = new Mobile();

		m3.setPrice(100000);
		m3.setName("APPLE PHONE");
		m3.setColor("SILVER");

		AddToCartMobile a1 = new AddToCartMobile();
		a1.addToMobileCart(m1);
		a1.addToMobileCart(List.of(m2, m3));

		a1.getList().forEach(System.out::println);

	}
}
