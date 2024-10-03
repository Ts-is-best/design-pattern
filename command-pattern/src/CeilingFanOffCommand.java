public class CeilingFanOffCommand extends CeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void changeSpeed() {
        ceilingFan.off();
    }
}
