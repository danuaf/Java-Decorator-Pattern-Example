package seblak.toping;
import seblak.Seblak;
import seblak.SeblakDecorator;

public class BaksoDecorator extends SeblakDecorator {
    public BaksoDecorator(Seblak decoratedSeblak) {
        super(decoratedSeblak);
    }

    @Override
    public String getDescription() {
        return decoratedSeblak.getDescription() + ", Bakso";
    }

    @Override
    public int harga() {
        return decoratedSeblak.harga() + 2000;
    }


}
