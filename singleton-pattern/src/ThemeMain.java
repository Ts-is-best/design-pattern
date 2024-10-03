public class ThemeMain {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        Label label = new Label("라벨");

        button.display();
        label.display();

        Theme.getInstance().setThemeColor(Color.DARK);

        button.display();
        label.display();
    }
}