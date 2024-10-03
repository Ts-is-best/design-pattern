public class CeilingFanLowCommand extends CeilingFanCommand {
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void changeSpeed() {
        ceilingFan.low();
    }
}
