package seblak.toping;

import seblak.Seblak;
import seblak.SeblakDecorator;

public class TelurDecorator extends SeblakDecorator {
    public TelurDecorator(Seblak decoratedSeblak){
        super(decoratedSeblak);
    }

    @Override
    public String getDescription(){
        return decoratedSeblak.getDescription() + ", Telur";
    }

    @Override
    public int harga(){
        return decoratedSeblak.harga() + 3000;
    }
}
