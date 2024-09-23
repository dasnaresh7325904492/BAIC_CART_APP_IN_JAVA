package in.nareshIt.addToCart;

import java.util.ArrayList;
import java.util.List;

import in.nareshIt.carts.MobileCart;
import in.nareshIt.products.Mobile;
import lombok.Data;

@Data
public class AddToCartMobile {

	public AddToCartMobile() {

	}

	public void addToMobileCart(Mobile m) {
		MobileCart mc1 = MobileCart.getInstance();
		mc1.add(m);
	}

	public void addToMobileCart(List<Mobile> m) {
		MobileCart mc1 = MobileCart.getInstance();
		mc1.add(m);
	}

	public List<Mobile> getList() {
		List<Mobile> mobiles = MobileCart.getInstance().getMobiles();
		List<Mobile> list = new ArrayList(mobiles);
		return list;
	}

}
