// File: Pramugari.java
package orang;

import util.printer.Information;

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
    public Information getPrintableInformation() {
        Information existedInformation = super.getPrintableInformation();
        existedInformation.setContent("Pramugari");
        existedInformation.addSubInformation("Kode Pramugari: " + kodePramugari);

        return existedInformation;
    }
}
