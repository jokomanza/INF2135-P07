package orang;

import java.util.List;

public class Pramugari extends Orang {

    private String kodePramugari;

    public Pramugari(String kodePramugari, String nama) {
        super(nama);

        this.kodePramugari = kodePramugari;
    }

    public String getKodePramugari() {
        return kodePramugari;
    }

    public void setKodePramugari(String kodePramugari) {
        this.kodePramugari = kodePramugari;
    }

    @Override
    public List<String> getPrintableInformations() {
        List<String> existedInformations = super.getPrintableInformations();
        existedInformations.addFirst("Kode Pramugari: " + kodePramugari);

        return existedInformations;
    }
}
