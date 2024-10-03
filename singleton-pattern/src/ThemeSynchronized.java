public class ThemeSynchronized {
    private static ThemeSynchronized instance;
    private Color themeColor;

    private ThemeSynchronized() {
        this.themeColor = Color.LIGHT;
    }

    public static synchronized ThemeSynchronized getInstance() {
        if (instance == null) {
            instance = new ThemeSynchronized();
        }
        return instance;
    }

    public Color getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(Color themeColor) {
        this.themeColor = themeColor;
    }
}