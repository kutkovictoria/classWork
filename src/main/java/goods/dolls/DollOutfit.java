package goods.dolls;

public class DollOutfit {
    String outfitType;  //Dress, Suit
    String outfitColor;

    public DollOutfit(String outfitType, String outfitColor) {
        this.outfitType = outfitType;
        this.outfitColor = outfitColor;
    }

    public String getOutfitType() {
        return outfitType;
    }

    public String getOutfitColor() {
        return outfitColor;
    }
}
