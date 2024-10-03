public class Button {
    private String text;

    public Button(String text) {
        this.text = text;
    }

    public void display() {
        Color themeColor = Theme.getInstance().getThemeColor();
        System.out.println(
            "Button [" + text + "] displayed in " + themeColor + " theme."
        );
    }
}