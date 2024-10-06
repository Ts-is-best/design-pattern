<aside>
💡

핵심 키워드: OCP(Open/Closed Principle, 개방-폐쇄 원칙)

OCP(Open/Closed Principle, 개방-폐쇄 원칙)는 객체 지향 설계의 SOLID 원칙 중 하나로, **소프트웨어 구성 요소는 확장에는 열려(Open) 있어야 하고, 수정에는 닫혀(Closed) 있어야 한다**는 개념을 의미합니다.

즉, 새로운 기능이나 요구사항이 추가될 때 기존 코드를 수정하지 않고도 확장이 가능해야 한다는 원칙입니다.

</aside>

## 📄 1. 정의

> Command 패턴은 행동(Behavioral) 디자인 패턴 중 하나로, **요청을 캡슐화**하여 **호출자(Invoker)**와 **수행자(Receiver)** 간의 결합을 느슨하게 만드는 패턴입니다. 이를 통해 명령을 객체로 표현하고, 이를 실행하거나 취소할 수 있는 구조를 제공합니다.
>

## 💡 2. 디자인 패턴의 특징

1. **확장성**: 새로운 명령을 쉽게 추가할 수 있습니다. Command 객체만 추가하면 호출자와 수신자에 큰 변경 없이 기능을 확장할 수 있습니다.
2. **캡슐화**: 실행되는 명령을 객체로 캡슐화하여, 명령의 실행 방법을 숨길 수 있습니다.
3. **작업 큐나 이력 관리**: 명령을 큐에 넣거나, 이력을 저장하여 작업을 되돌리거나 재실행할 수 있습니다.

## 💊 3. 요청 캡슐화

1. **실행 로직과 호출자의 분리**:
   - 요청을 캡슐화함으로써 명령을 실행하는 로직(Receiver)과 명령을 호출하는 주체(Invoker) 간의 결합도를 낮출 수 있습니다. 즉, 호출자는 명령이 실제로 어떻게 실행되는지 몰라도 됩니다. 이로 인해 시스템의 유연성과 유지보수성이 향상됩니다.
2. **명령을 재사용 및 저장 가능**:
   - 요청을 객체로 캡슐화하면 명령을 인스턴스로 만들 수 있기 때문에, 이를 저장하거나 큐(queue)에 쌓아서 나중에 실행할 수 있습니다. 이를 통해 작업의 이력(history)을 관리하거나, 일정 시간이 지난 후에 다시 실행할 수 있습니다.
3. **작업 취소(Undo) 및 재실행(Redo) 기능 구현 가능**:

   • 캡슐화된 요청은 실행 전에 상태를 저장하거나, 반대 명령(예: 실행한 작업을 취소하는 Undo 명령)을 캡슐화하여 작업을 취소할 수 있습니다. 마찬가지로, 다시 실행(Redo)하는 기능도 쉽게 구현할 수 있습니다. 이는 복잡한 프로그램에서 매우 유용한 기능입니다.

4. **새로운 명령 추가가 용이**:
   - 명령 객체를 추가하는 방식으로 기능을 확장할 수 있기 때문에, 기존 코드를 수정하지 않고도 새로운 요청을 쉽게 추가할 수 있습니다. 이는 확장성 면에서 큰 장점입니다. 호출자나 수신자 코드에 영향을 주지 않고 명령을 확장할 수 있습니다.
5. **작업의 매개변수화**:
   - 명령 객체를 통해 작업을 매개변수화할 수 있습니다. 즉, 서로 다른 요청을 하나의 호출자 객체에 담아 실행할 수 있습니다. 호출자가 다룰 수 있는 요청의 종류를 자유롭게 바꿀 수 있게 됩니다.
6. **요청의 로그 및 추적 가능**:
   - 요청이 객체로 캡슐화되면, 이를 로그로 남기거나, 시스템에서 어떤 명령이 실행되었는지 추적할 수 있습니다. 이러한 기록은 문제 발생 시 디버깅하거나, 시스템 동작을 분석하는 데 유용합니다.

### **요약**

> 요청을 캡슐화하면 호출자와 실행자의 결합도가 낮아져 유지보수성과 유연성이 높아지며, 작업의 재사용, 취소, 재실행, 저장 등 다양한 기능을 쉽게 구현할 수 있습니다. 또한, 새로운 명령을 추가하거나 변경하는 데 있어 기존 시스템에 큰 변경 없이 확장할 수 있는 장점이 있습니다.
>

## 👎 단점

1.	**클래스 수 증가**:

- 각 명령을 객체로 캡슐화하기 때문에, 명령의 수가 많아질수록 클래스의 수가 증가합니다. 이로 인해 코드가 복잡해지고 관리해야 할 클래스가 많아지면서 유지보수가 어려워질 수 있습니다.

2.	**간단한 작업에 불필요한 복잡성**:

- 매우 간단한 작업에도 명령을 객체로 캡슐화해야 하기 때문에, 상대적으로 불필요한 복잡성을 초래할 수 있습니다. 단순한 요청을 처리하는데도 많은 코드가 필요할 수 있어 코드의 가독성과 효율성이 떨어질 수 있습니다.

3.	**메모리 및 성능 부담**:

- 명령을 객체로 캡슐화하고, 요청을 저장하거나 큐에 넣는 경우 메모리 사용이 증가할 수 있습니다. 특히 시스템이 많은 요청을 처리하거나 복잡한 명령을 처리할 때 성능에 부하가 발생할 수 있습니다.

4.	**구현 복잡성 증가**:

- Undo, Redo와 같은 기능을 구현할 때는 각 명령마다 취소 로직을 따로 구현해야 하기 때문에 복잡성이 증가할 수 있습니다. 또한, 각 명령의 상태를 저장해야 할 경우 관리해야 할 데이터도 늘어나기 때문에 코드가 복잡해질 수 있습니다.

5.	**추상화의 남용 가능성**:

- 모든 요청을 캡슐화하는 방식이 항상 적합한 것은 아닙니다. 필요 이상의 추상화가 오히려 코드를 읽기 어렵게 만들고, 이해하는 데 많은 시간과 노력이 들게 할 수 있습니다. 간단한 시스템에서는 오히려 과한 설계가 될 수 있습니다.

## 🏛️ 4. 아키텍처

![테스트주도개발 - 16.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/3385b730-8f1c-45c2-acd2-bfc7bc427042/c6b25335-0e40-400e-b2d2-4df100a3952e/%E1%84%90%E1%85%A6%E1%84%89%E1%85%B3%E1%84%90%E1%85%B3%E1%84%8C%E1%85%AE%E1%84%83%E1%85%A9%E1%84%80%E1%85%A2%E1%84%87%E1%85%A1%E1%86%AF_-_16.jpg)

## 🧪 코드 분석

### Command 인터페이스

```java
public interface Command {
    void execute();
}
```

## 조명 클래스 (리시버)

```java
public class Light {
    String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    // 액션 1
    public void on() {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append(name).append("에 ");
        }
        sb.append("불이 켜졌습니다.");

        System.out.println(sb);
    }

    // 액션 2
    public void off() {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append(name).append("에 ");
        }
        sb.append("불이 꺼젔습니다.");

        System.out.println(sb);
    }
}
```

## 간단한 리모컨 클래스 (인보커)

```java
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
```

## 조명 켜기 커맨드

```java
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
```

## 리모컨 클래스 테스트

```java
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
```

```text
불이 켜졌습니다.
```

## 리모트 컨트롤 고도화 하기

```java
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder
                    .append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}

// null object (딱히 할일이 없지만, 클라이언트가 Null을 처리하지 않기하기 위해 정의하는 클래스)
class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command assigned.");
    }
}
```

## 조명 끄기 커맨드

```java
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
```

## 조명 크고 끄기 테스트

```java
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
```

```

----- 리모컨 ------
[slot 0] LightOnCommand	LightOffCommand
[slot 1] LightOnCommand	LightOffCommand
[slot 2] NoCommand	NoCommand
[slot 3] NoCommand	NoCommand
[slot 4] NoCommand	NoCommand
[slot 5] NoCommand	NoCommand
[slot 6] NoCommand	NoCommand
[undo] NoCommand
거실에 불이 켜졌습니다.
거실에 불이 꺼젔습니다.
주방에 불이 켜졌습니다.
주방에 불이 꺼젔습니다.
```

## 작업 되돌리기

```java
public interface Command {
    void execute();
    void undo();
}
```

```java
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
// 나머지 LightOnCommand, NoCommand 도 undo() 메소드 구현
```

```java
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder
                    .append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName());
        return stringBuilder.toString();
    }
}

class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command assigned.");
    }

    @Override
    public void undo() {
        System.out.println("No command assigned.");
    }
}
```

## 되돌리기 테스트

```java
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl + "\n");

        remoteControl.undoButtonWasPushed();

        System.out.println();

        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl + "\n");

        remoteControl.undoButtonWasPushed();
    }
}

```

```
거실에 불이 켜졌습니다.
거실에 불이 꺼젔습니다.

----- 리모컨 ------
[slot 0] LightOnCommand	LightOffCommand
[slot 1] LightOnCommand	LightOffCommand
[slot 2] NoCommand	NoCommand
[slot 3] NoCommand	NoCommand
[slot 4] NoCommand	NoCommand
[slot 5] NoCommand	NoCommand
[slot 6] NoCommand	NoCommand
[undo] LightOffCommand

거실에 불이 켜졌습니다.

주방에 불이 꺼젔습니다.
주방에 불이 켜졌습니다.

----- 리모컨 ------
[slot 0] LightOnCommand	LightOffCommand
[slot 1] LightOnCommand	LightOffCommand
[slot 2] NoCommand	NoCommand
[slot 3] NoCommand	NoCommand
[slot 4] NoCommand	NoCommand
[slot 5] NoCommand	NoCommand
[slot 6] NoCommand	NoCommand
[undo] LightOnCommand

주방에 불이 꺼젔습니다.
```

## 이전 상태로 되돌리기

```java
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}

```

```java
public abstract class CeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;

    int prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        changeSpeed();
        printSpeed();
    }

    public abstract void changeSpeed();

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
        printSpeed();
    }

    void printSpeed() {
        StringBuilder sb = new StringBuilder();

        sb.append(ceilingFan.location).append("에 선풍기 속도가 ");

        switch (ceilingFan.speed) {
            case CeilingFan.HIGH:
                sb.append("HIGH 로 설정되었습니다.");
                break;
            case CeilingFan.MEDIUM:
                sb.append("MEDIUM 로 설정되었습니다.");
                break;
            case CeilingFan.LOW:
                sb.append("LOW 로 설정되었습니다.");
                break;
            case CeilingFan.OFF:
                sb.append("OFF 로 설정되었습니다.");
                break;
        }

        System.out.println(sb);
    }
}
```

```java
public class CeilingFanHighCommand extends CeilingFanCommand {
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void changeSpeed() {
        ceilingFan.high();
    }
}
// Medium, Low, Off 등이 있음
```

## 이전 상태 저장 테스트

```java
public class CeilingFanTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan livingRoomCeilingFan = new CeilingFan("거실");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanLow, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl + "\n");
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl + "\n");
        remoteControl.undoButtonWasPushed();
    }
}

```

```
거실에 선풍기 속도가 HIGH 로 설정되었습니다.
거실에 선풍기 속도가 OFF 로 설정되었습니다.

----- 리모컨 ------
[slot 0] CeilingFanHighCommand	CeilingFanOffCommand
[slot 1] CeilingFanMediumCommand	CeilingFanOffCommand
[slot 2] CeilingFanLowCommand	CeilingFanOffCommand
[slot 3] NoCommand	NoCommand
[slot 4] NoCommand	NoCommand
[slot 5] NoCommand	NoCommand
[slot 6] NoCommand	NoCommand
[undo] CeilingFanOffCommand

거실에 선풍기 속도가 HIGH 로 설정되었습니다.
거실에 선풍기 속도가 MEDIUM 로 설정되었습니다.

----- 리모컨 ------
[slot 0] CeilingFanHighCommand	CeilingFanOffCommand
[slot 1] CeilingFanMediumCommand	CeilingFanOffCommand
[slot 2] CeilingFanLowCommand	CeilingFanOffCommand
[slot 3] NoCommand	NoCommand
[slot 4] NoCommand	NoCommand
[slot 5] NoCommand	NoCommand
[slot 6] NoCommand	NoCommand
[undo] CeilingFanMediumCommand

거실에 선풍기 속도가 HIGH 로 설정되었습니다.
```

## 여러 작업을 큐로 실행

```java
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}

```

```java
public class MacroCommandTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan livingRoomCeilingFan = new CeilingFan("거실");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        Command[] commands = {ceilingFanHigh, ceilingFanMedium, ceilingFanLow};

        MacroCommand command = new MacroCommand(commands);

        remoteControl.setCommand(0, command, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}

```

```
거실에 선풍기 속도가 HIGH 로 설정되었습니다.
거실에 선풍기 속도가 MEDIUM 로 설정되었습니다.
거실에 선풍기 속도가 LOW 로 설정되었습니다.
거실에 선풍기 속도가 MEDIUM 로 설정되었습니다.
거실에 선풍기 속도가 HIGH 로 설정되었습니다.
거실에 선풍기 속도가 OFF 로 설정되었습니다.
```