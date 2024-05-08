package orang;

import java.util.List;

public class Pilot extends Orang {

    private String kodePilot;

    public Pilot(String kodePilot, String nama) {
        super(nama);

        this.kodePilot = kodePilot;
    }

    public String getKodePilot() {
        return kodePilot;
    }

    public void setKodePilot(String kodePilot) {
        this.kodePilot = kodePilot;
    }

    @Override
    public List<String> getPrintableInformations() {
        List<String> existedInformations = super.getPrintableInformations();
        existedInformations.addFirst("Kode Pilot: " + kodePilot);

        return existedInformations;
    }
}
