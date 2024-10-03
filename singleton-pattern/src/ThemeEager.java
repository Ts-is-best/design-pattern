public class ThemeEager {
    private static final ThemeEager instance = new ThemeEager();
    private Color themeColor;

    private ThemeEager() {
        this.themeColor = Color.LIGHT;
    }

    public static ThemeEager getInstance() {
        return instance;
    }

    public Color getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(Color themeColor) {
        this.themeColor = themeColor;
    }
}