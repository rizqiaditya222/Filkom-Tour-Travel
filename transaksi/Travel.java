package transaksi;

import model.Pelanggan;
import model.Mobil;
import model.Karyawan;

public class Travel {
    private String lokAwal;
    private String lokTujuan;
    private String Tanggal;
    private double harga;
    private Pelanggan pelanggan;
    // private Mobil mobil;
    private Karyawan sopir;

    public Travel(String lokAwal, String lokTujuan, String Tanggal, double harga) {
        this.lokAwal = lokAwal;
        this.lokTujuan = lokTujuan;
        this.Tanggal = Tanggal;
        this.harga = harga;
    }
    
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    // public Mobil getMobil() {
    //     return mobil;
    // }

    // public void setMobil(Mobil mobil) {
    //     this.mobil = mobil;
    // }

    public Karyawan getSopir() {
        return sopir;
    }

    public void setSopir(Karyawan sopir) {
        this.sopir = sopir;
    }

    public void display(int noTrayek) {
        System.out.println(noTrayek);
        System.out.println("Lokasi Awal   : " + lokAwal);
        System.out.println("Lokasi Tujuan : " + lokTujuan);
        System.out.println("Tanggal       : " + Tanggal);
        System.out.printf("Harga         : Rp %.0f",harga);
        System.out.println("\n");
    }

    // Method untuk menampilkan invoice
    public void invoice() {
        System.out.println("=====================================");
        System.out.println("              INVOICE                ");
        System.out.println("=====================================");
    
        if (pelanggan != null) {
            System.out.println("Nama Pelanggan     : " + pelanggan.getNama());
            System.out.println("Nomor Telepon      : " + pelanggan.getNomorTelepon());
            System.out.println("Tanggal Pemesanan  : " + pelanggan.getTanggalPemesanan());
            System.out.println("-------------------------------------");
        }
    
        System.out.println("Lokasi Awal        : " + lokAwal);
        System.out.println("Lokasi Tujuan      : " + lokTujuan);
        System.out.println("Tanggal Keberangkatan : " + Tanggal);
        
        if (sopir != null) {
            System.out.println("-------------------------------------");
            System.out.println("Sopir              : " + sopir.getNama());
            System.out.println("Mobil              : " + sopir.getMerkMobil());
        }
        
        System.out.println("-------------------------------------");
        System.out.printf("Harga              : Rp %.0f", harga);
        System.out.println("\n=====================================");
    }
    
}
