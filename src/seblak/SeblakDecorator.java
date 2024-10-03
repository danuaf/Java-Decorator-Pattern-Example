package seblak;

public class SeblakDecorator implements Seblak{

    protected Seblak decoratedSeblak;

    public SeblakDecorator(Seblak decoratedSeblak){
        this.decoratedSeblak = decoratedSeblak;
    }

    @Override
    public String getDescription(){
        return decoratedSeblak.getDescription();
    }

    @Override
    public int harga() {
        return decoratedSeblak.harga();
    }
}
