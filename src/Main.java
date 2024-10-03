import seblak.Seblak;
import seblak.SeblakOriginal;
import seblak.toping.BaksoDecorator;
import seblak.toping.MakaroniDecorator;
import seblak.toping.TelurDecorator;

public class Main {
    public static void main(String[] args) {
        Seblak seblaksaya = new SeblakOriginal();
        System.out.println(seblaksaya.getDescription() + " = Rp." + seblaksaya.harga());

        seblaksaya = new BaksoDecorator(seblaksaya);
        System.out.println(seblaksaya.getDescription() + " =  Rp." + seblaksaya.harga());

        seblaksaya = new TelurDecorator(seblaksaya);
        System.out.println(seblaksaya.getDescription() + " =  Rp." + seblaksaya.harga());

        seblaksaya = new MakaroniDecorator(seblaksaya);
        System.out.println(seblaksaya.getDescription() + " =  Rp." + seblaksaya.harga());
    }
}
