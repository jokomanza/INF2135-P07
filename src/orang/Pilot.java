// File: Pilot.java
package orang;

import util.printer.Information;

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
    public Information getPrintableInformation() {
        Information existedInformation = super.getPrintableInformation();
        existedInformation.setContent("Pilot");
        existedInformation.addSubInformation("Kode Pilot: " + kodePilot);

        return existedInformation;
    }
}
