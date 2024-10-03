package adapter.ducks;

import adapter.ducks.challenge.Drone;
import adapter.ducks.challenge.DroneAdapter;
import adapter.ducks.challenge.SuperDrone;

public class DuckTestDrive  {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		//오리와 칠면조를 연결하는 어댑터 생성 원래 칠면조는 오리와 호환되지 않음
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("찰면조가 말하기를...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\n오리가 말하기를...");
		testDuck(duck);

		System.out.println("\n칠면조어댑터가 말하기를...");
		testDuck(turkeyAdapter);
		
		// Challenge
//		Drone drone = new SuperDrone();
//		Duck droneAdapter = new DroneAdapter(drone);
//		testDuck(droneAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}

/**
 * 가장 핵심은 호환되지 않는 인터페이스를 사용하는 객체를 어댑터를 통해 호환되는 인터페이스로 변환하는 것이다.
 * 즉 클라이언트가 사용하려는 인터페이스가 현재 구상된 인터페이스와 다를 때 어댑터를 사용하여 호환되는 인터페이스로 변환한다.
 * 이러면 어댑터에 변경내용이 캡슐화되기 때문에 클라이언트와 구상된 인터페이스 사이의 결합도를 낮출 수 있다. 이게 핵심이다.
 * 위 코드를 가지고 쉽게 설명하면 오리와 칠면조를 사용하는 클라이언트가 있다고 가정하자.
 * 오리와 칠면조는 서로 다른 인터페이스를 가지고 있다. 오리는 quack과 fly를 가지고 있고 칠면조는 gobble과 fly를 가지고 있다.
 * 이때 칠면조를 사용하는 클라이언트가 오리를 사용하려고 할 때 어댑터를 사용하여 칠면조를 오리로 변환하여 사용할 수 있다.
 * 서드파티 라이브러리 등 외부의 무언가를 이용할때 이런 패턴을 사용할 수 있다.
 * 자바의 IO 시스템에서도 사용된다는데 일단 우리랑은 관련이 없으니 패스.
 * 어댑터 클래스가 많아지고 커지면 관리가 굉장히 힘들어질 듯!
 */