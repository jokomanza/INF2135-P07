package orang;

import java.util.List;

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
    public List<String> getPrintableInformations() {
        List<String> existedInformations = super.getPrintableInformations();
        existedInformations.addFirst("Kode Teknisi: " + kodeTeknisi);

        return existedInformations;
    }
}
