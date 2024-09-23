package in.nareshIt.carts;

import java.util.ArrayList;
import java.util.List;

import in.nareshIt.products.Mobile;
import lombok.Data;

@Data
public class MobileCart {
	private static MobileCart mcart = null;

	private List<Mobile> mobiles;

	private MobileCart() {
		mobiles = new ArrayList<Mobile>();
	}

	public static MobileCart getInstance() {
		if (mcart == null) {
			mcart = new MobileCart();
		}
		return mcart;
	}

	public void add(Mobile m) {
		mobiles.add(m);
	}

	public void add(List<Mobile> m) {
		for (int i = 0; i < m.size(); i++)
			mobiles.add(m.get(i));
	}

	public List<Mobile> showList() {
		return mobiles;
	}

}
