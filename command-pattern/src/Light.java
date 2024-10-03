public class Light {
    String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append(name).append("에 ");
        }
        sb.append("불이 켜졌습니다.");

        System.out.println(sb);
    }

    public void off() {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append(name).append("에 ");
        }
        sb.append("불이 꺼젔습니다.");

        System.out.println(sb);
    }
}
