// File: Airline.java
package penerbangan;

import util.printer.Information;
import util.printer.Printable;

public class Airline implements Printable {

    private String nama;
    private String kodeIATA;
    private String kodeICAO;
    private String negara;

    public Airline(String nama) {
        this.nama = nama;
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

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    @Override
    public Information getPrintableInformation() {
        Information information = new Information("Airline");
        information.addSubInformation("Nama: " + nama);
        information.addSubInformation("Kode IATA: " + kodeIATA);
        information.addSubInformation("Kode ICAO: " + kodeICAO);
        information.addSubInformation("Negara: " + negara);

        return information;
    }
}
