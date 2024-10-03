package seblak.toping;

import seblak.Seblak;
import seblak.SeblakDecorator;

public class MakaroniDecorator extends SeblakDecorator {

    public MakaroniDecorator(Seblak decoreadSeblak){
        super(decoreadSeblak);
    }

    @Override
    public String getDescription(){
        return decoratedSeblak.getDescription() + ", Makaroni";
    }

    @Override
    public int harga() {
        return decoratedSeblak.harga() + 2000;
    }
}
