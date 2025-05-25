package THT9;

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.1;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return hitungHargaTiket() * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return hitungHargaTiket() * 1.50;
        }
        return hitungHargaTiket(); 
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.2;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return hitungHargaTiket() * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return hitungHargaTiket() * 1.5;
        }
        return hitungHargaTiket(); 
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return hitungHargaTiket() * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return hitungHargaTiket() * 1.5;
        }
        return hitungHargaTiket();
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];
        daftarTransportasi[0] = new Bus("Bus", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta", 100, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Pesawat", 200, "Medan");

        for (Transportasi t : daftarTransportasi) {
            System.out.printf("%s ke %s - Harga tiket (default): %.1f\n",
                t.getNama(), t.getTujuan(), t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.printf("%s ke %s - Harga tiket (Bisnis): %.1f\n",
                    t.getNama(), t.getTujuan(), ((Bus) t).hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                System.out.printf("%s ke %s - Harga tiket (VIP): %.1f\n",
                    t.getNama(), t.getTujuan(), ((Kereta) t).hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                System.out.printf("%s ke %s - Harga tiket (Ekonomi): %.1f\n",
                    t.getNama(), t.getTujuan(), ((Pesawat) t).hitungHargaTiket("Ekonomi"));
            }

            System.out.println(); 
        }
    }
}
