package penerbangan;

import orang.Pilot;
import orang.Pramugari;
import orang.Teknisi;

import java.util.List;

public class Penerbangan {

    private String kodePenerbangan;
    private Airline airline;
    private Pesawat pesawat;
    private List<Pilot> pilots;
    private Pramugari pramugari;
    private Teknisi teknisi;

    private Airport airportAsal;
    private Airport airportTujuan;

    private int jumlahPenumpang;

    public Penerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public void setPesawat(Pesawat pesawat) {
        this.pesawat = pesawat;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public Pramugari getPramugari() {
        return pramugari;
    }

    public void setPramugari(Pramugari pramugari) {
        this.pramugari = pramugari;
    }

    public Teknisi getTeknisi() {
        return teknisi;
    }

    public void setTeknisi(Teknisi teknisi) {
        this.teknisi = teknisi;
    }

    public Airport getAirportAsal() {
        return airportAsal;
    }

    public void setAirportAsal(Airport airportAsal) {
        this.airportAsal = airportAsal;
    }

    public Airport getAirportTujuan() {
        return airportTujuan;
    }

    public void setAirportTujuan(Airport airportTujuan) {
        this.airportTujuan = airportTujuan;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
