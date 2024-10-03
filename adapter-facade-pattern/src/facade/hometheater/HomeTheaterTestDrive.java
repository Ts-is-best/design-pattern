package facade.hometheater;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("앰프");
		Tuner tuner = new Tuner("AM/FM 튜너", amp);
		StreamingPlayer player = new StreamingPlayer("스트리밍 플레이어", amp);
		CdPlayer cd = new CdPlayer("CD 플레이어", amp);
		Projector projector = new Projector("프로젝터", player);
		TheaterLights lights = new TheaterLights("극장 천장 조명");
		Screen screen = new Screen("극장 스크린");
		PopcornPopper popper = new PopcornPopper("팝콘 기계");

		HomeTheaterFacade homeTheater =
				new HomeTheaterFacade(amp, tuner, player,
						projector, screen, lights, popper);

		homeTheater.watchMovie("조커2 망함");
		homeTheater.endMovie();
	}
}

/**
 * 홈시어터를 만들었다고 가정하자.
 * 판콘 기계를 켜고 튀기고 조명 조절하고 스크린 내리고 프로젝터 키고 앰프 키고 스피커 연결하고 볼륨 조절하고 영화 틀고 어쩌고...
 * 다 끝나면 또 역순으로 끝내는 작업을 해야한다.
 * 정말 해야 할 일이 많은데 문제는 이걸 다 하나하나 배워서 할 줄 알게되었더라도 기능이 추가 되거나 변경되면 다시 공부해야한다.
 * 우리가 필요한건 영화를 시작하는것(팝콘도 알아서 나오고 영화 보기 좋은 환경도 알아서 셋팅되어야한다)과 영화를 종료하는것이다.
 * 위와 같이 복잡한 모든걸 이해하고 다루는걸 원하는게 아니다.
 * 퍼사드는 새로운 행동(구상)을 하지는 않지만 서브시스템의 기능들을 적절히 활용하여 스마트하게 일을 처리할 수 있다.
 * 어댑터 패턴과 다른점은 호환되지않는 인터페이스를 감싸서 호환성을 제공하는 것이 아니라, 단순히 서브시스템을 더 쉽게 사용할 수 있게 해준다.
 * ( 아 나는 모든걸 알기에는 너무 귀찮다고.. 간단히 내가 원하는것만 요청하면 나머지는 니가 알아서 하라고.. )
 * 최소 지식 원칙 이라는 키워드 또한 나온다. 클래스간에 결합도를 낮추어야하는데 이를 위해선 객체가 직접적으로 상호작용하는 객체의 수를 최소화해야한다.
 * 상호작용을 하더라도 다른 객체의 세부 구현사항에 지나치게 의존하여서는 안된다. ( 이건 뭐 .. 기본적인거니까! )
 * 지나치게 단순화 하려다 보면 파사드 클래스가 지나치게 비대해질 수 있음을 주의.
 * */