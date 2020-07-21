package small.project.role;

import java.util.Scanner;

import static small.project.service.BukuService.*;

public class Customer {

    public static void menuCustomer(){
        Scanner menu = new Scanner(System.in);
        System.out.println(" ========== MENU CUSTOMER ==========");

        System.out.println("[1] List Buku");
        System.out.println("[2] Daftar Buku Tersedia");
        System.out.println("[3] Pinjam Buku");
        System.out.println("[0] Kembali Ke Menu Utama");

        System.out.println("________________");
        System.out.println("Masukan Pilihan : ");
        int pilihan = menu.nextInt();
        System.out.println("________________");

        if (pilihan == 1){
            listBuku();
        }else if (pilihan == 2){
            listBukuTersedia();
        }else if (pilihan == 3){
            updatePeminjaman();
        }else {
            System.out.println("Maaf, Inputan tidak terseida");
        }
    }
}
