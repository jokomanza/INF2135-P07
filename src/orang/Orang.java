// File: Orang.java
package orang;

import util.printer.Information;
import util.printer.Printable;

public abstract class Orang implements Printable {

    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public Information getPrintableInformation() {
        Information information = new Information("Orang");
        information.addSubInformation("Nama: " + nama);

        return information;
    }
}
