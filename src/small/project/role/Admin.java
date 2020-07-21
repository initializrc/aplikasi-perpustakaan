package small.project.role;

import java.util.Scanner;

import static small.project.Main.main;
import static small.project.service.BukuService.*;
import static small.project.user.Menu.start;


public class Admin {

    public static void menuAdmin() {
        System.out.println(">>>>> ADMIN <<<<<");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] Input Buku ");
        System.out.println("[2] List Buku");
        System.out.println("[3] Daftar buku Tersedia");
        System.out.println("[4] Daftar Buku Dipinjam");
        System.out.println("[5] Set Ketersediaan Buku");
        System.out.println("[6] Set Peminjaman Buku");
        System.out.println("[7] Perbarui Buku");
        System.out.println("[8] Hapus Buku");
        System.out.println("[0] Kembali Ke Menu Utama");

        System.out.println("_________________");
        System.out.print("Masukan Pilihan : ");
        int pilihan = scanner.nextInt();
        System.out.println("_________________");

        if (pilihan == 1){
            insertBuku();
        } else if (pilihan == 2){
            listBuku();
        } else if(pilihan == 3){
            listBukuTersedia();
        }else if(pilihan == 4){
            listBukuDipinjam();
        }else if(pilihan == 5){
            updateKetesrsediaan();
        }else if(pilihan == 6){
            updatePeminjaman();
        }else if(pilihan == 7){
            updateBuku();
        }else if (pilihan == 8){
            hapusBuku();
        }else if (pilihan == 0){
            start();
        }else {
            System.out.println("Maaf, Inputan tidak tersedia");
            System.out.println("____________________________");
        }
        menuAdmin();
    }
}
