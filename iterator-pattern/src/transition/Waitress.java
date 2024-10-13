package iterator.transition;

import java.util.ArrayList;
import java.util.Iterator;
  
     
public class Waitress {
	ArrayList<Menu> menus;
     
  
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  
//만약 디너메뉴에 디저트 메뉴, 에피타이저 메뉴가 추가된다면?