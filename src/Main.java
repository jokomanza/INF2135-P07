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

        Pilot pilot1 = new Pilot("PL001", "John Doe");
        Pilot pilot2 = new Pilot("PL002", "Jane Smith");
        Pilot pilot3 = new Pilot("PL003", "Robert Jonshon");
        Pilot pilot4 = new Pilot("PL004", "Michael Jackson");

        Teknisi teknisi1 = new Teknisi("TK001", "Michael Miller");
        Teknisi teknisi2 = new Teknisi("TK002", "William Wilson");
        Teknisi teknisi3 = new Teknisi("TK003", "David Davis");
        Teknisi teknisi4 = new Teknisi("TK004", "Richard Richardson");

        Pramugari pramugari1 = new Pramugari("PG001", "Maria Garcia");
        Pramugari pramugari2 = new Pramugari("PG002", "Anna Anderson");
        Pramugari pramugari3 = new Pramugari("PG003", "Jennifer James");
        Pramugari pramugari4 = new Pramugari("PG004", "Linda Lopez");

        Airline garudaIndonesia = new Airline("Garuda Indonesia");
        garudaIndonesia.setKodeIATA("GA");
        garudaIndonesia.setKodeICAO("GIA");
        garudaIndonesia.setNegara("Indonesia");

        Airline singaporeAirlines = new Airline("Singapore Airlines");
        singaporeAirlines.setKodeIATA("SQ");
        singaporeAirlines.setKodeICAO("SIA");
        singaporeAirlines.setNegara("Singapore");

        Airline cathayPacific = new Airline("Cathay Pacific");
        cathayPacific.setKodeIATA("CX");
        cathayPacific.setKodeICAO("CPA");
        cathayPacific.setNegara("Hong Kong");

        Airline qatarAirways = new Airline("Qatar Airways");
        qatarAirways.setKodeIATA("QR");
        qatarAirways.setKodeICAO("QTR");
        qatarAirways.setNegara("Qatar");

        Pesawat boeing737 = new Pesawat("PK-GIA", "Boeing 737-800", "Boeing", 189);
        Pesawat airbusA350 = new Pesawat("PK-SIA", "Airbus A350-900", "Airbus", 303);
        Pesawat boeing777 = new Pesawat("PK-CPA", "Boeing 777-300ER", "Boeing", 368);
        Pesawat airbusA380 = new Pesawat("PK-QTR", "Airbus A380-800", "Airbus", 517);

        Airport soekarnoHatta = new Airport("Soekarno-Hatta International Airport", "CGK", "WIII", "Tangerang");
        Airport changiAirport = new Airport("Changi International Airport", "SIN", "WSSS", "Singapore");
        Airport hongKongInternational = new Airport("Hong Kong International Airport", "HKG", "VHHH", "Hong Kong");
        Airport hamadInternational = new Airport("Hamad International Airport", "DOH", "OTHH", "Doha");

        Penerbangan penerbangan1 = new Penerbangan("GA123");
        penerbangan1.setAirline(garudaIndonesia);
        penerbangan1.setPesawat(boeing737);
        penerbangan1.setPilots(List.of(pilot1, pilot2));
        penerbangan1.setPramugari(pramugari1);
        penerbangan1.setTeknisi(teknisi1);
        penerbangan1.setAirportAsal(soekarnoHatta);
        penerbangan1.setAirportTujuan(changiAirport);
        penerbangan1.setJumlahPenumpang(189);


        Penerbangan penerbangan2 = new Penerbangan("SQ456");
        penerbangan2.setAirline(singaporeAirlines);
        penerbangan2.setPesawat(airbusA350);
        penerbangan2.setPilots(List.of(pilot3, pilot4));
        penerbangan2.setPramugari(pramugari2);
        penerbangan2.setTeknisi(teknisi2);
        penerbangan2.setAirportAsal(changiAirport);
        penerbangan2.setAirportTujuan(hongKongInternational);
        penerbangan2.setJumlahPenumpang(303);

        Penerbangan penerbangan3 = new Penerbangan("CX789");
        penerbangan3.setAirline(cathayPacific);
        penerbangan3.setPesawat(boeing777);
        penerbangan3.setPilots(List.of(pilot1, pilot3));
        penerbangan3.setPramugari(pramugari3);
        penerbangan3.setTeknisi(teknisi3);
        penerbangan3.setAirportAsal(hongKongInternational);
        penerbangan3.setAirportTujuan(hamadInternational);
        penerbangan3.setJumlahPenumpang(368);

        Penerbangan penerbangan4 = new Penerbangan("QR012");
        penerbangan4.setAirline(qatarAirways);
        penerbangan4.setPesawat(airbusA380);
        penerbangan4.setPilots(List.of(pilot2, pilot4));
        penerbangan4.setPramugari(pramugari4);
        penerbangan4.setTeknisi(teknisi4);
        penerbangan4.setAirportAsal(hamadInternational);
        penerbangan4.setAirportTujuan(soekarnoHatta);
        penerbangan4.setJumlahPenumpang(517);

        printPenerbangan(penerbangan1);
        System.out.println();

        printPenerbangan(penerbangan2);
        System.out.println();

        printPenerbangan(penerbangan3);
        System.out.println();

        printPenerbangan(penerbangan4);
        System.out.println();
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
