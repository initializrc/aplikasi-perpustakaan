package small.project.user;

import java.util.Scanner;

import static java.lang.System.exit;
import static small.project.Main.main;
import static small.project.role.Admin.menuAdmin;
import static small.project.service.BukuService.initBuku;


public class Menu {
    public static void start(){
        initBuku();
        Scanner menu = new Scanner(System.in);
        System.out.println("======= PERPUSTAKAAN SOMALIA =======");
        System.out.println("     ======= MENU UTAMA =======");
        System.out.println("[1] MENU ADMIN");
        System.out.println("[2] MENU CUSTOMER");
        System.out.println("[0] Keluar");

        System.out.println("______________");
        System.out.print("Pilih Menu : ");
        int pilihan = menu.nextInt();
        System.out.println("______________\n");

        if (pilihan == 1){
            menuAdmin();
        }else if (pilihan == 2){
            System.out.println("2");
        }else if (pilihan == 0){
           exit(0);
        }else{
            System.out.println("Inputan tidak ditemukan");
            System.out.println("_______________________");
        }

        String[] arguments = new String[]{"abc"};
        main(arguments);

    }
}
