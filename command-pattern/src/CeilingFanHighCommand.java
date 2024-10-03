public class CeilingFanHighCommand extends CeilingFanCommand {
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void changeSpeed() {
        ceilingFan.high();
    }
}
