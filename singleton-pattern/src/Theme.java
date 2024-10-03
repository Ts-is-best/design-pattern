public class Theme {
    private static Theme instance;
    private Color themeColor;

    private Theme() {
        this.themeColor = Color.LIGHT;
    }

    public static Theme getInstance() {
        if (instance == null) {
            instance = new Theme();
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