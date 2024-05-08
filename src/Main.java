import orang.Pilot;
import orang.Pramugari;
import orang.Teknisi;
import penerbangan.Airline;
import penerbangan.Airport;
import penerbangan.Penerbangan;
import penerbangan.Pesawat;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program Administrasi Penerbangan\n");

        Penerbangan penerbangan = generatePenerbangan();
        printPenerbangan(penerbangan);
    }

    private static Penerbangan generatePenerbangan() {
        Pilot pilot1 = new Pilot("P001", "John Doe");
        Pilot pilot2 = new Pilot("P002", "Jane Doe");

        Pramugari pramugari1 = new Pramugari("P001", "John Doe");
        Pramugari pramugari2 = new Pramugari("P002", "Jane Doe");

        Teknisi teknisi1 = new Teknisi("T001", "John Doe");
        Teknisi teknisi2 = new Teknisi("T002", "Jane Doe");

        Airline airline = new Airline("Garuda Indonesia");
        airline.setKodeIATA("GA");
        airline.setKodeICAO("GIA");
        airline.setNegara("Indonesia");

        Pesawat pesawat = new Pesawat("PK-GIA", "Boeing 737-800", "Boeing", 189);

        Airport airportAsal = new Airport("Soekarno-Hatta International Airport", "CGK", "WIII", "Tangerang");
        Airport airportTujuan = new Airport("Changi International Airport", "SIN", "WSSS", "Singapore");

        Penerbangan penerbangan = new Penerbangan("GA123");
        penerbangan.setAirline(airline);
        penerbangan.setPesawat(pesawat);
        penerbangan.setPilots(List.of(pilot1, pilot2));
        penerbangan.setPramugari(pramugari1);
        penerbangan.setTeknisi(teknisi1);
        penerbangan.setAirportAsal(airportAsal);
        penerbangan.setAirportTujuan(airportTujuan);
        penerbangan.setJumlahPenumpang(189);

        return penerbangan;
    }

    private static void printPenerbangan(Penerbangan penerbangan) {
        System.out.println("Penerbangan " + penerbangan.getKodePenerbangan());
        System.out.println("Airline: " + penerbangan.getAirline().getNama());
        System.out.println("Pesawat: " + penerbangan.getPesawat().getNamaPesawat());
        System.out.println("Pilot 1: " + penerbangan.getPilots().get(0).getNama());
        System.out.println("Pilot 2: " + penerbangan.getPilots().get(1).getNama());
        System.out.println("Pramugari: " + penerbangan.getPramugari().getNama());
        System.out.println("Teknisi: " + penerbangan.getTeknisi().getNama());
        System.out.println("Airport Asal: " + penerbangan.getAirportAsal().getNama());
        System.out.println("Airport Tujuan: " + penerbangan.getAirportTujuan().getNama());
        System.out.println("Jumlah Penumpang: " + penerbangan.getJumlahPenumpang());
    }
}
