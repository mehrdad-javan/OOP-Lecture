package se.lexicon;

public class Fries extends Product {

    private Size size;
    private boolean isSpicy;
    private boolean isSweetPotato;

    public Fries(Size size, boolean isSpicy, boolean isSweetPotato) {
        super(size.getLabel(), size.getPrice());
        this.size = size;
        this.isSpicy = isSpicy;
        this.isSweetPotato = isSweetPotato;
    }

    @Override
    public String getDescription() {
        return "Name: " + super.getName() + " , Price: " + super.getPrice() + " , Size: " + this.size + " , Spicy: " + isSpicy;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "size=" + size +
                ", isSpicy=" + isSpicy +
                ", isSweetPotato=" + isSweetPotato +
                '}';
    }

}
