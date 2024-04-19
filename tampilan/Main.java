package tampilan;

import java.util.*;

import model.Karyawan;
import model.Mobil;
import model.Pelanggan;
import transaksi.Travel;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlhKaryawan = 6;
        Karyawan[] karyawan = new Karyawan[jmlhKaryawan];

        int jmlhMobil = 6;
        Mobil[] mobil = new Mobil[jmlhMobil];

        int jmlhTrayek = 5;
        Travel[] travel = new Travel[jmlhTrayek];
        travel[0] = new Travel("Surabaya", "Malang", "19/4/2023",150000);
        travel[1] = new Travel("Madura", "Malang", "20/4/2023",175000);
        travel[2] = new Travel("Banyuwangi", "Malang", "19/4/2023",160000);
        travel[3] = new Travel("Situbondo", "Malang", "21/4/2023",200000);
        travel[4] = new Travel("Tulungagung", "Malang", "20/4/2023",180000);

        int jmlhPelanggan = 5;
        Pelanggan[] pelanggan = new Pelanggan[jmlhPelanggan];

        int i = 0;
        int j = 0;
        int p = 0;

        while (true) {
            System.out.println("\n============== MENU UTAMA ==============");
            System.out.println("1. Karyawan");
            System.out.println("2. Customer");
            System.out.print("Masuk sebagai : ");
            int choiceAs = input.nextInt();

            if (choiceAs == 1) {
                System.out.println("\n=========== MANAJEMEN KARYAWAN ==========");
                System.out.println("1. Data Karyawan");
                System.out.println("2. Data Mobil");
                System.out.print("Pilih data yang akan di manage : ");
                int choiceData = input.nextInt();

                if (choiceData == 1) {
                    while (true) {
                        System.out.println("\n=========== MANAJEMEN DATA KARYAWAN ==========");
                        System.out.println("1. Input data karyawan");
                        System.out.println("2. Tampilkan Data karyawan");
                        System.out.println("3. Update Data Karyawan");
                        System.out.println("4. Assign Mobil");
                        System.out.println("5. Kembali");
                        System.out.print("Masukkan Perintah : ");
                        int perintahKaryawan = input.nextInt();
                
                        if (perintahKaryawan == 1) {
                            if (i < jmlhKaryawan) {
                                karyawan[i] = new Karyawan();
                
                                System.out.println("\nINPUT DATA KARYAWAN " + (i + 1));
                                System.out.print("Masukkan nama karyawan\t\t: ");
                                input.nextLine();
                                karyawan[i].setNama(input.nextLine());
                
                                System.out.print("Masukkan alamat karyawan\t: ");
                                karyawan[i].setAlamat(input.nextLine());
                
                                System.out.print("Masukkan nomor telepon karyawan\t: ");
                                karyawan[i].setNoTelp(input.nextLine());
                
                                System.out.print("Masukkan jenis kelamin karyawan\t: ");
                                karyawan[i].setJenisKelamin(input.nextLine());
                
                                System.out.println("\n1. Sopir\n2. Sopir Rentcar\n3. Admin");
                                while (true) {
                                    System.out.print("Pilih kategori karyawan\t\t: ");
                                    int pilihKaryawan = input.nextInt();
                                    if (pilihKaryawan == 1) {
                                        karyawan[i].setKategoriKaryawan("Sopir");
                                        break;
                                    } else if (pilihKaryawan == 2) {
                                        karyawan[i].setKategoriKaryawan("Sopir Rentcar");
                                        break;
                                    } else if (pilihKaryawan == 3) {
                                        karyawan[i].setKategoriKaryawan("Admin");
                                        break;
                                    } else {
                                        System.out.println("Kategori karyawan invalid");
                                        continue;
                                    }
                                }
                
                                if (karyawan[i] != null) {
                                    karyawan[i].display(i + 1);
                                    System.out.println("\n");
                                }
                                i++;
                            } else {
                                System.out.println("Jumlah Karyawan sudah terpenuhi");
                                break;
                            }
                        } else if (perintahKaryawan == 2) {
                            for (int k = 0; k < jmlhKaryawan; k++) {
                                if (karyawan[k] != null) {
                                    karyawan[k].display(k + 1);
                                }
                            }
                        } else if (perintahKaryawan == 3) {
                            System.out.print("Masukan nomor karyawan yang ingin di update: ");
                            int noKaryawan = input.nextInt();
                            if (noKaryawan > 0 && noKaryawan <= jmlhKaryawan) {
                                if (karyawan[noKaryawan - 1] != null) {
                                    karyawan[noKaryawan - 1].display(noKaryawan);
                                } else {
                                    System.out.println("Data Karyawan tidak tersedia.");
                                }

                                while (true) {
                                    System.out.println("1. Alamat\n2. Nomor telepon\n3. Kategori karyawan");
                                    System.out.print("Pilih data karyawan yang ingin di update : ");
                                    int update = input.nextInt();
                                    input.nextLine();
                                    if (update == 1) {
                                        System.out.print("Masukkan alamat baru : ");
                                        karyawan[noKaryawan - 1].setAlamat(input.nextLine());
                                        break;
                                    } else if (update == 2) {
                                        System.out.print("Masukkan nomor telepon baru : ");
                                        karyawan[noKaryawan - 1].setNoTelp(input.nextLine());
                                        break;
                                    } else if (update == 3) {
                                        while (true) {
                                            System.out.println("\n1. Sopir\n2. Sopir Rentcar\n3. Admin");
                                            System.out.print("Pilih kategori baru karyawan\t\t: ");
                                            int pilihKaryawan = input.nextInt();
                                            input.nextLine();
                                            if (pilihKaryawan == 1) {
                                                karyawan[noKaryawan - 1].setKategoriKaryawan("sopir");
                                                break;
                                            } else if (pilihKaryawan == 2) {
                                                karyawan[noKaryawan - 1].setKategoriKaryawan("sopir rentcar");
                                                break;
                                            } else if (pilihKaryawan == 3) {
                                                karyawan[noKaryawan - 1].setKategoriKaryawan("admin");
                                                break;
                                            } else {
                                                System.out.println("Kategori karyawan invalid");
                                                continue;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Pilihan invalid");
                                    }
                                }
                                karyawan[noKaryawan - 1].display(noKaryawan);
                            } else {
                                System.out.println("Nomor Karyawan invalid");
                            }
                        } else if (perintahKaryawan == 4) {
                            for (i = 0; i < jmlhKaryawan; i++) {
                                if (karyawan[i] != null) {
                                    karyawan[i].display(i + 1);
                                }
                            }

                            System.out.print("Pilih nomor karyawan yang ingin di assign : ");
                            int noKaryawan = input.nextInt();

                            for (int k = 0; k < jmlhMobil; k++) {
                                if (mobil[k] != null) {
                                    mobil[k].display(k + 1);
                                }
                            }

                            System.out.print("Pilih nomor mobil yang digunakan : ");
                            int noMobil = input.nextInt();
                            karyawan[noKaryawan - 1].assignMobil(mobil[noMobil - 1]);

                            for (i = 0; i < jmlhKaryawan; i++) {
                                if (karyawan[i] != null) {
                                    karyawan[i].display(i + 1);
                                }
                            }
                        } else if (perintahKaryawan == 5) {
                            break;
                        }
                    }

                } else if (choiceData == 2) {
                    while (true) {
                        System.out.println("\n=========== MANAJEMEN DATA MOBIL ==========");
                        System.out.println("1. Input Data Mobil");
                        System.out.println("2. Tampilkan Data Mobil");
                        System.out.println("3. Update Data Mobil");
                        System.out.println("4. Kembali");
                        System.out.print("Masukkan Perintah : ");
                        int perintahMobil = input.nextInt();

                        if (perintahMobil == 1) {
                            if (j < jmlhMobil) {
                                mobil[j] = new Mobil();

                                System.out.println("\nINPUT DATA MOBIL " + (j + 1));
                                System.out.print("Masukkan nomor plat\t\t: ");
                                input.nextLine();
                                mobil[j].setNoPlat(input.nextLine());

                                System.out.print("Masukkan merk mobil\t\t: ");
                                mobil[j].setMerkMobil(input.nextLine());

                                System.out.print("Masukkan warna mobil\t\t: ");
                                mobil[j].setWarnaMobil(input.nextLine());

                                System.out.print("Masukkan tahun keluaran\t\t: ");
                                mobil[j].setTahunKeluaran(input.nextInt());

                                if (mobil[j] != null) {
                                    mobil[j].display(j + 1);
                                    System.out.println("\n");
                                }

                                j++;
                            } else {
                                System.out.println("Jumlah Mobil sudah terpenuhi");
                                break;
                            }
                        } else if (perintahMobil == 2) {
                            for (int k = 0; k < jmlhMobil; k++) {
                                if (mobil[k] != null) {
                                    mobil[k].display(k + 1);
                                }
                            }
                        } else if (perintahMobil == 3) {
                            System.out.print("Masukan nomor mobil yang ingin di update: ");
                            int noMobil = input.nextInt();
                            if (noMobil > 0 && noMobil <= jmlhMobil) {
                                if (mobil[noMobil - 1] != null) {
                                    mobil[noMobil - 1].display(noMobil);

                                    System.out.println("1. Warna");
                                    System.out.print("Pilih data mobil yang ingin diupdate : ");
                                    int update = input.nextInt();
                                    input.nextLine();
                                    if (update == 1) {
                                        System.out.print("Masukkan warna baru : ");
                                        mobil[noMobil - 1].setWarnaMobil(input.nextLine());
                                    }
                                } else {
                                    System.out.println("Data Mobil tidak tersedia.");
                                }
                            } else {
                                System.out.println("Nomor Mobil invalid");
                            }
                        } else if (perintahMobil == 4) {
                            break;
                        }
                    }
                }
            }  else if (choiceAs == 2) {
                System.out.println("\n=========== LAYANAN KHUSUS ==========");
                System.out.println("1. Travel");
                System.out.println("2. Rental Mobil");
                System.out.print("Pilih jasa yang ingin digunakan : ");
                int choiceService = input.nextInt();
            
                if (choiceService == 1) {
                    System.out.println("\n=========== INPUT DATA PELANGGAN ==========");
                    if (p < jmlhPelanggan) {
                        pelanggan[p] = new Pelanggan();
            
                        System.out.print("Masukkan nama pelanggan\t\t: ");
                        input.nextLine();
                        pelanggan[p].setNama(input.nextLine());
            
                        System.out.print("Masukkan NIK pelanggan\t\t: ");
                        pelanggan[p].setNIK(input.nextLine());
            
                        System.out.print("Masukkan nomor telepon pelanggan\t: ");
                        pelanggan[p].setNomorTelepon(input.nextLine());
            
                        System.out.print("Masukkan alamat pelanggan\t: ");
                        pelanggan[p].setAlamat(input.nextLine());
            
                        System.out.print("Masukkan tanggal pemesanan\t: ");
                        pelanggan[p].setTanggalPemesanan(input.nextLine());
            
                        p++;
                    } else {
                        System.out.println("Jumlah Pelanggan sudah terpenuhi");
                    }
            
                    System.out.println("\n=========== PILIHAN TRAYEK TRAVEL ==========");
                    for (int noTrayek = 0; noTrayek < jmlhTrayek; noTrayek++) {
                        travel[noTrayek].display(noTrayek + 1);
                    }
                    System.out.print("Pilih trayek yang ingin Anda gunakan : ");
                    int pilihTrayek = input.nextInt();
            
                    System.out.println("\n=========== PILIHAN KENDARAAN TRAVEL ==========");
                    for (i = 0; i < jmlhKaryawan; i++) {
                        if (karyawan[i] != null && "sopir".equalsIgnoreCase(karyawan[i].getKategori())) {
                            System.out.println((i + 1) + ". " + karyawan[i].getMerkMobil() + " - " + karyawan[i].getNama());
                        }
                    }
                    System.out.print("Pilih kendaraan yang ingin Anda gunakan : ");
                    int pilihKendaraan = input.nextInt();
            
                    travel[pilihTrayek - 1].setPelanggan(pelanggan[p - 1]);
                    travel[pilihTrayek - 1].setSopir(karyawan[pilihKendaraan - 1]);

                    System.out.println("\n=========== INVOICE ==========");
                    travel[pilihTrayek - 1].invoice();
                }
            }
        }  
        }
    }


