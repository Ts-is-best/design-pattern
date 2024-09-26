# 옵저버 패턴 (Observer Design Pattern)

## 📖 정의

**옵저버 패턴**은 객체의 상태 변화를 구독자에게 자동으로 통지하는 디자인 패턴이다. 이 패턴은 발행자(Subject)가 상태 변경 시 구독자(Observer)에게 알림을 전달하여, 상태 변화에 반응하는 동작을 구현한다.

### 예시
유튜브 채널 구독처럼, 구독자는 채널의 새로운 영상(상태 변화)을 알림으로 받아보게 된다.

## 🔧 주요 구성 요소

1. **발행자(Subject)**: 상태 변화를 감지하고 구독자에게 알림을 전달.
2. **구독자(Observer)**: 알림을 받고 그에 따른 동작을 수행.

### 예시 코드 (Java)
```java
// Subject 인터페이스
interface ISubject {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}

// 구체적 발행자
class ConcreteSubject implements ISubject {
    List<IObserver> observers = new ArrayList<>();
    
    public void addObserver(IObserver o) {
        observers.add(o);
    }
    
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }
    
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update();
        }
    }
}

// Observer 인터페이스
interface IObserver {
    void update();
}

// ObserverA 클래스
class ObserverA implements IObserver {
    public void update() {
        System.out.println("ObserverA가 알림을 받았습니다.");
    }
}

// ObserverB 클래스
class ObserverB implements IObserver {
    public void update() {
        System.out.println("ObserverB가 알림을 받았습니다.");
    }
}
```
🔄 플로우

	1.	발행자(Subject)가 상태를 변경.
	2.	등록된 구독자(Observer)에게 상태 변경을 알림.
	3.	구독자는 알림을 받고 적절한 동작을 수행.

- 복잡하고 확장이 많이 되야할 경우는 반대로 옵저버가 필요한 속성을 요청할 수 있다. 

🔍 패턴 사용 사례

	•	java.util.Observer 및 Observable 클래스 ( java 9 이후 Deprecated )
	•	RxJS의 Observable은 옵저버 패턴을 사용해 비동기 데이터 스트림을 처리.
    •       이외 다양한 Listener, Event Handler 내부에서 사용.

📊 장점

	•	상태 변경을 실시간으로 감지하여 효율적 반응.
	•	발행자와 구독자 간의 느슨한 결합으로 확장성 제공.

⚠️ 단점

	•	알림을 받는 순서를 제어할 수 없음.
	•	구독자를 관리하지 않으면 메모리 누수 가능성.
	•	복잡도가 올라갈 경우 디버깅 리소스 증가.
