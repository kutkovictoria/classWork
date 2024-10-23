package goods.dolls;

public enum EyeColor {
    BLUE("rgb for blue"),
    GREEN("rgb for green"),
    BROWN("rgb for brown"),
    GRAY("rgb for brown");


    String rgbColor;

    EyeColor(String rgbColor) {
        this.rgbColor = rgbColor;
    }
}
