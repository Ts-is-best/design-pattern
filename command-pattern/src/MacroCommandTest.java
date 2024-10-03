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
