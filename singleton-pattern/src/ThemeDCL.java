public class ThemeDCL {
    private volatile static ThemeDCL instance;
    private Color themeColor;

    private ThemeDCL() {
        this.themeColor = Color.LIGHT;
    }

    public static ThemeDCL getInstance() {
        if (instance == null) {
            synchronized (ThemeDCL.class) {
                if (instance == null) {
                    instance = new ThemeDCL();
                }
            }
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