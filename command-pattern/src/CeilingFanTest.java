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
