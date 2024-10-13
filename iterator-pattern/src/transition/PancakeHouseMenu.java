package iterator.transition;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B의 팬케이크 아침 식사",
				"스크램블 에그와 토스트를 곁들인 팬케이크",
				true,
				2.99);

		addItem("일반 팬케이크 아침 식사",
				"프라이드 에그와 소시지를 곁들인 팬케이크",
				false,
				2.99);

		addItem("블루베리 팬케이크",
				"신선한 블루베리로 만든 팬케이크",
				true,
				3.49);

		addItem("와플",
				"블루베리 또는 딸기를 선택하여 곁들일 수 있는 와플",
				true,
				3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
  
	// other menu methods here
}
