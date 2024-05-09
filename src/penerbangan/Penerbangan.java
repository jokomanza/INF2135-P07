package penerbangan;

import orang.Pilot;
import orang.Pramugari;
import orang.Teknisi;
import util.printer.Information;
import util.printer.Printable;

import java.util.ArrayList;
import java.util.List;

public class Penerbangan implements Printable {

    private final List<Pilot> pilots;
    private String kodePenerbangan;
    private Airline airline;
    private Pesawat pesawat;
    private Pramugari pramugari;
    private Teknisi teknisi;

    private Airport airportAsal;
    private Airport airportTujuan;

    private int jumlahPenumpang;

    public Penerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
        pilots = new ArrayList<>();
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

    public void addPilot(Pilot pilot) {
        if (pilots.size() < 2) {
            pilots.add(pilot);
        }
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

    @Override
    public Information getPrintableInformation() {
        Information information = new Information("Penerbangan");

        information.addInformation(airline.getPrintableInformation());
        information.addInformation(pesawat.getPrintableInformation());


        Information pilot1Information = pilots.getFirst().getPrintableInformation();
        pilot1Information.setContent("Pilot 1");
        information.addInformation(pilot1Information);

        Information pilot2Information = pilots.getLast().getPrintableInformation();
        pilot2Information.setContent("Pilot 2");
        information.addInformation(pilot2Information);


        information.addInformation(pramugari.getPrintableInformation());
        information.addInformation(teknisi.getPrintableInformation());

        Information airportAsalInformation = airportAsal.getPrintableInformation();
        airportAsalInformation.setContent("Airport Asal");
        information.addInformation(airportAsalInformation);

        Information airportTujuanInformation = airportTujuan.getPrintableInformation();
        airportTujuanInformation.setContent("Airport Tujuan");
        information.addInformation(airportTujuanInformation);


        information.addInformation("Jumlah Penumpang: " + jumlahPenumpang);

        return information;
    }
}
