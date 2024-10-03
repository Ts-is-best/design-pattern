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
