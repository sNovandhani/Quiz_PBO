package quiz_pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);
        String inputUser, pilihanUser;
        Login user = new Login();
        // ==============================
        System.out.println("\t--- Distributor PT. Garuda Abadi Group ---");
        System.out.println("\t============================================");
        System.out.println("");
        System.out.println("Silahkan Masukkan ID Anda");
        System.out.println("===========================");
        System.out.print("ID : ");
        // Ambil input id user
        inputUser = terminalInput.next();
        // Cek id user
        if (user.cekUser(inputUser)) {
            System.out.println("");
            System.out.println("Pilih Cek Data Barang");
            System.out.println("1. Barang Masuk");
            System.out.println("2. Barang Keluar");
            System.out.println("");
            System.out.print("Masukkan Pilihan Data :\t");
            // Ambil pilihan user
            pilihanUser = terminalInput.next();
            System.out.println("=============================");
            System.out.println("");

            if (pilihanUser.equals("1")) {
                BarangMasuk masuk = new BarangMasuk();
                // ================================
                masuk.data();
                masuk.list();
                masuk.hitung();

            } else if (pilihanUser.equals("2")) {
                BarangKeluar keluar = new BarangKeluar();
                // ================================
                keluar.data();
                keluar.list();
                keluar.hitung();

            } else {
                System.exit(0);
            }

        } else

        {
            System.out.println("ID Anda Salah => " + inputUser);
            System.out.println("");
            System.out.println("");
            System.out.println("Administrasi Persediaan Barang Distibutor PT. Garuda Abadi Group");
            System.out.println("Check, Data, dan Antar, Ketelitian Anda dalam Administrasi Sangat Di Utamakan (*_*)");
        }

    }

}
