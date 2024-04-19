package model;

public class Karyawan {
    public String nama;
    private String alamat;
    private String noTelp;
    private String jenisKelamin;
    private String kategoriKaryawan;
    public int pilihan;
    public String merkMobil;
    Mobil mobil;

public Karyawan( ) {
}

public void setNama(String nama){
   this.nama = nama;
}
public void setAlamat(String alamat){
   this.alamat = alamat;
}
public void setNoTelp(String noTelp){
   this.noTelp = noTelp;
}
public void setJenisKelamin(String jenisKelamin){
   this.jenisKelamin = jenisKelamin;
}
public void setKategoriKaryawan(String kategoriKaryawan){
   this.kategoriKaryawan = kategoriKaryawan;
}

public void assignMobil(Mobil mobil) {
   this.mobil = mobil;
   this.merkMobil = mobil.getMerkMobil(); 
}

public String getNama (){
    return this.nama;
}
public String getAlamat (){
    return this.alamat;
}
public String getNoTelp (){
    return this.noTelp;
}
public String getJenisKelamin (){
   return this.jenisKelamin;
}
public String getKategori (){
   return this.kategoriKaryawan;
}
public String getMerkMobil (){
   return this.merkMobil;
}

public void display(int i) {
   System.out.println("\nDATA KARYAWAN " + i);
   System.out.println("=================================================");
   System.out.println("Nama               : " + getNama());
   System.out.println("Alamat             : " + getAlamat());
   System.out.println("Nomor Telepon      : " + getNoTelp());
   System.out.println("Jenis Kelamin      : " + getJenisKelamin());
   System.out.println("Kategori Karyawan  : " + getKategori());

   if (this.mobil != null) {
       System.out.println("Merk Mobil         : " + this.mobil.getMerkMobil());
   } else {
       System.out.println("Merk Mobil         : -");
   }

   System.out.println("=================================================");
}

}
