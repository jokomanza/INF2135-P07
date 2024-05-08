package orang;

import util.printer.Printable;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> getPrintableInformations() {
        List<String> info = new ArrayList<>();
        info.add("Nama: " + nama);

        return info;
    }
}
