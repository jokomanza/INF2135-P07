// File: Teknisi.java
package orang;

import util.printer.Information;

public class Teknisi extends Orang {

    private String kodeTeknisi;

    public Teknisi(String kodeTeknisi, String nama) {
        super(nama);

        this.kodeTeknisi = kodeTeknisi;
    }

    public String getKodeTeknisi() {
        return kodeTeknisi;
    }

    public void setKodeTeknisi(String kodeTeknisi) {
        this.kodeTeknisi = kodeTeknisi;
    }

    @Override
    public Information getPrintableInformation() {
        Information existedInformation = super.getPrintableInformation();
        existedInformation.setContent("Teknisi");
        existedInformation.addSubInformation("Kode Teknisi: " + kodeTeknisi);

        return existedInformation;
    }
}
