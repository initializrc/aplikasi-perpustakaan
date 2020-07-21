package small.project.service;

import com.sun.org.apache.xpath.internal.objects.XNull;
import small.project.entity.Buku;
import small.project.repository.BukuRepositoy;

import java.util.Scanner;

public class BukuService extends BukuRepositoy {

    public static void insertBuku(){
        System.out.println(">>>>> INSERT BUKU <<<<<");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id Buku\t : ");
        int id = scanner.nextInt();
        System.out.print("Judul\t : ");
        String judul = scanner.next();
        System.out.print("Penulis\t : ");
        String penulis = scanner.next();
        System.out.print("Tahun\t : ");
        int tahun = scanner.nextInt();
        System.out.print("Ketersediaan\t : ");
        String ketersediaan = scanner.next();

        Buku inputBuku = new Buku(id, judul, penulis, tahun, ketersediaan.equalsIgnoreCase("Ya"));
        daftarBuku.add(inputBuku);
    }

    public static void listBuku(){
        System.out.println(">>> LIST BUKU <<<");
        for (Buku buku : daftarBuku){
            System.out.printf("Id : %d | Judul : %s\t| Penulis : %s\t| Tahun : %d\n",
                    buku.getId(), buku.getJudul(), buku.getPenulis(), buku.getTahunTerbit());
        }
        System.out.println("___________________\n");
    }

    public static void listBukuTersedia(){
        System.out.println(">>> DAFTAR BUKU TERSEDIA <<<");
        for (Buku buku : daftarBuku){
            if (buku.isKetersediaan() == true){
                System.out.printf("Id : %d\t|\t Judul : %s        \t|\tPenulis : %s\t| Tahun Terbit : %d\t| Tersedia : %b %n",
                        buku.getId(),
                        buku.getJudul(),
                        buku.getPenulis(),
                        buku.getTahunTerbit(),
                        buku.isKetersediaan());
            }
        }
        System.out.println("_________________\n");
    }

    public static void listBukuDipinjam(){
        System.out.println(">>> DAFTAR  BUKU DIPINJAM <<<");
        for (Buku buku : daftarBuku) {
            if (buku.isKetersediaan() == false){
                System.out.printf("Id : %d\t|\t Judul : %s        \t|\tPenulis : %s\t| Tahun Terbit : %d\t| Tersedia : %b %n",
                        buku.getId(),
                        buku.getJudul(),
                        buku.getPenulis(),
                        buku.getTahunTerbit(),
                        buku.isKetersediaan());
            }
        }
        System.out.println("__________________\n");
    }

    public static Buku cariBuku(int id){
        for (Buku buku : daftarBuku) {
            if (buku.getId() == id){
                return buku;
            }
        }
        return null;
    }

    public static void updateKetesrsediaan(){
        System.out.println(">>> SET KETERSEDIAAN BUKU <<<");
        Scanner inputId = new Scanner(System.in);
        System.out.print("Masukan Id Buku : ");
        int id = inputId.nextInt();

        if (cariBuku(id) != null){
            cariBuku(id).setKetersediaan(true);
            System.out.println("_______________");
            System.out.println("Buku sudah tersedia kembali");
            System.out.println("_______________");
        } else {
            System.out.println("_______________");
            System.out.println("Buku tidak ditemukan");
            System.out.println("_______________");
        }
    }

    public static void updatePeminjaman(){
        System.out.println(">>> SET PEMINJAMAN BUKU <<<");
        Scanner inputId = new Scanner(System.in);
        System.out.print("Masukan Id Buku");
        int id = inputId.nextInt();

        if (cariBuku(id) != null){
            cariBuku(id).setKetersediaan(false);
            System.out.println("_________________");
            System.out.println("Buku dalam peminjaman");
            System.out.println("_________________");
        } else {
            System.out.println("_________________");
            System.out.println("Buku tidak ditemukan");
            System.out.println("_________________");
        }
    }

    public static void updateBuku(){
        System.out.println(">>> PERBAHARUI BUKU <<<");
        Scanner inputBuku = new Scanner(System.in);
        System.out.print("Masukan Id Buku : ");
        int id = inputBuku.nextInt();
        System.out.print("Masukan Judul Buku Terbaru : ");
        String judulBaru = inputBuku.next();
        System.out.print("Masukan Tahun Terbit : ");
        int tahunTerbit = inputBuku.nextInt();

        for (Buku buku : daftarBuku) {
            if (id == buku.getId()){
                buku.setJudul(judulBaru);
                buku.setTahunTerbit(tahunTerbit);
            }
        }
        System.out.println("______________");
        System.out.println("Buku berhasil diperbaharui");
        System.out.println("______________");;
    }

    public static void hapusBuku(){
        System.out.println(">>> HAPUS BUKU <<<");
        Scanner inputId = new Scanner(System.in);
        System.out.println("Masukan Id Buku : ");
        int id = inputId.nextInt();

        for (Buku buku : daftarBuku) {
            if (id == buku.getId()){
                daftarBuku.remove(id);
                return;
            }
        }
    }

    public static void initBuku(){
        if (daftarBuku.size() == 0){
            Buku bukuDummy1 = new Buku(1,"Java", "Dimas",2019,true);
            daftarBuku.add(bukuDummy1);
            Buku bukuDummy2 = new Buku(2,"Python","Tegar",2018,true);
            daftarBuku.add(bukuDummy2);
            Buku bukuDummy3 = new Buku(3,"PHP","Panji",2017,true);
            daftarBuku.add(bukuDummy3);
            Buku bukuDummy4 = new Buku(4,"Golang","Rosyid",2016,true);
            daftarBuku.add(bukuDummy4);
            Buku bukuDummy5 = new Buku(5,"Ruby","Hono",2015,true);
            daftarBuku.add(bukuDummy5);
            Buku bukuDummy6 = new Buku(6,"C++","Dimas",2020,true);
            daftarBuku.add(bukuDummy6);
            Buku bukuDummy7 = new Buku(7,"Node JS","Tegar",2018,true);
            daftarBuku.add(bukuDummy7);
            Buku bukuDummy8 = new Buku(8,"Kotlin","Panji",2020,true);
            daftarBuku.add(bukuDummy8);
            Buku bukuDummy9 = new Buku(9,"HTML","Rosyid",2019,true);
            daftarBuku.add(bukuDummy9);
            Buku bukuDummy10 = new Buku(10,"CSS","Hono",2018,true);
            daftarBuku.add(bukuDummy10);
        }
    }
}

