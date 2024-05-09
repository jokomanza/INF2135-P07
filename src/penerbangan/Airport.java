package penerbangan;

import util.printer.Information;
import util.printer.Printable;

public class Airport implements Printable {

    private String nama;
    private String kodeIATA;
    private String kodeICAO;
    private String kota;

    public Airport(String nama, String kodeIATA, String kodeICAO, String kota) {
        this.nama = nama;
        this.kodeIATA = kodeIATA;
        this.kodeICAO = kodeICAO;
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeIATA() {
        return kodeIATA;
    }

    public void setKodeIATA(String kodeIATA) {
        this.kodeIATA = kodeIATA;
    }

    public String getKodeICAO() {
        return kodeICAO;
    }

    public void setKodeICAO(String kodeICAO) {
        this.kodeICAO = kodeICAO;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Override
    public Information getPrintableInformation() {
        Information information = new Information("Airport");
        information.addInformation("Nama: " + nama);
        information.addInformation("Kode IATA: " + kodeIATA);
        information.addInformation("Kode ICAO: " + kodeICAO);
        information.addInformation("Kota: " + kota);

        return information;
    }
}
