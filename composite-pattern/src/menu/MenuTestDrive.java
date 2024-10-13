package composite.menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu =
				new Menu("팬케이크 하우스 메뉴", "아침 식사");
		MenuComponent dinerMenu =
				new Menu("다이너 메뉴", "점심 식사");
		MenuComponent cafeMenu =
				new Menu("카페 메뉴", "저녁 식사");
		MenuComponent dessertMenu =
				new Menu("디저트 메뉴", "물론 디저트!");
		MenuComponent coffeeMenu = new Menu("커피 메뉴", "오후 커피와 함께하는 메뉴");

		MenuComponent allMenus = new Menu("모든 메뉴", "모든 메뉴 통합");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem(
				"K&B 팬케이크 아침 식사",
				"스크램블 에그와 토스트가 곁들여진 팬케이크",
				true,
				2.99));
		pancakeHouseMenu.add(new MenuItem(
				"일반 팬케이크 아침 식사",
				"프라이드 에그와 소시지가 곁들여진 팬케이크",
				false,
				2.99));
		pancakeHouseMenu.add(new MenuItem(
				"블루베리 팬케이크",
				"신선한 블루베리와 블루베리 시럽이 곁들여진 팬케이크",
				true,
				3.49));
		pancakeHouseMenu.add(new MenuItem(
				"와플",
				"블루베리 또는 딸기를 선택할 수 있는 와플",
				true,
				3.59));

		dinerMenu.add(new MenuItem(
				"채식주의자 BLT",
				"(가짜) 베이컨과 양상추 & 토마토를 통밀빵에",
				true,
				2.99));
		dinerMenu.add(new MenuItem(
				"BLT",
				"베이컨과 양상추 & 토마토를 통밀빵에",
				false,
				2.99));
		dinerMenu.add(new MenuItem(
				"오늘의 수프",
				"감자 샐러드를 곁들인 오늘의 수프 한 그릇",
				false,
				3.29));
		dinerMenu.add(new MenuItem(
				"핫도그",
				"사우어크라우트, 렐리쉬, 양파, 치즈가 얹어진 핫도그",
				false,
				3.05));
		dinerMenu.add(new MenuItem(
				"찐 채소와 현미밥",
				"찐 채소를 현미밥 위에 얹음",
				true,
				3.99));

		dinerMenu.add(new MenuItem(
				"파스타",
				"마리나라 소스를 곁들인 스파게티와 사워도우 빵 한 조각",
				true,
				3.89));

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem(
				"애플 파이",
				"바삭한 크러스트가 있는 애플 파이, 바닐라 아이스크림을 얹음",
				true,
				1.59));

		dessertMenu.add(new MenuItem(
				"치즈케이크",
				"뉴욕 스타일의 크리미한 치즈케이크, 초콜릿 그레이엄 크러스트와 함께",
				true,
				1.99));
		dessertMenu.add(new MenuItem(
				"샤베트",
				"라즈베리 한 스쿱과 라임 한 스쿱",
				true,
				1.89));

		cafeMenu.add(new MenuItem(
				"채식 버거와 에어 프라이",
				"통밀 번에 채식 버거, 양상추, 토마토, 그리고 감자튀김",
				true,
				3.99));
		cafeMenu.add(new MenuItem(
				"오늘의 수프",
				"샐러드가 곁들여진 오늘의 수프 한 컵",
				false,
				3.69));
		cafeMenu.add(new MenuItem(
				"부리또",
				"통 핀토콩, 살사, 아보카도를 곁들인 큰 부리또",
				true,
				4.29));

		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItem(
				"커피 케이크",
				"계피와 호두가 얹어진 부드러운 케이크",
				true,
				1.59));
		coffeeMenu.add(new MenuItem(
				"베이글",
				"참깨, 양귀비씨, 시나몬 건포도, 호박 맛 포함",
				false,
				0.69));
		coffeeMenu.add(new MenuItem(
				"비스코티",
				"아몬드 또는 헤이즐넛 비스코티 3개",
				true,
				0.89));

		Waitress waitress = new Waitress(allMenus);

		waitress.printMenu();
	}
}

//얘는 개별객체,복합객체를 모두 담을 수 있게된다.
//메뉴는 메뉴와 요소(리프 노드)를 가질 수 있다.
//컴포지트 패턴은 상황에 맞게 변형해서 써야하기때문에 개념만 알고있으면 된다.