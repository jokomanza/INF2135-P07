// File: Pesawat.java
package penerbangan;

import util.printer.Information;
import util.printer.Printable;

public class Pesawat implements Printable {

    private String kodePesawat;
    private String namaPesawat;
    private String jenisPesawat;
    private int kapasitasPenumpang;

    public Pesawat(String kodePesawat, String namaPesawat, String jenisPesawat, int kapasitasPenumpang) {
        this.kodePesawat = kodePesawat;
        this.namaPesawat = namaPesawat;
        this.jenisPesawat = jenisPesawat;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getKodePesawat() {
        return kodePesawat;
    }

    public void setKodePesawat(String kodePesawat) {
        this.kodePesawat = kodePesawat;
    }

    public String getNamaPesawat() {
        return namaPesawat;
    }

    public void setNamaPesawat(String namaPesawat) {
        this.namaPesawat = namaPesawat;
    }

    public String getJenisPesawat() {
        return jenisPesawat;
    }

    public void setJenisPesawat(String jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public Information getPrintableInformation() {
        Information information = new Information("Pesawat");
        information.addSubInformation("Kode: " + kodePesawat);
        information.addSubInformation("Nama: " + namaPesawat);
        information.addSubInformation("Jenis: " + jenisPesawat);
        information.addSubInformation("Kapasitas penumpang: " + kapasitasPenumpang);

        return information;
    }
}
