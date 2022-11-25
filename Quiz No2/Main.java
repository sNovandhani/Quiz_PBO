package quiz_pbo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama, nik, alamat, tlp, pekerjaan, kantor, status, menikah, jml_anak, input;
        int sampah, keamanan, sumbangan;
        iuran iuran = new iuran();
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("========================================");
        System.out.println("1. input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("");
        System.out.print("PILIHAN MENU : ");
        input = sc.next();
        System.out.println("----------------------o0o----------------------");
        if (input.equals("1")) {
            System.out.println("*** Data Warga ***");
            System.out.println("Masukkan Nama : ");
            nama = sc.next();
            System.out.println("Masukkan NIK : ");
            nik = sc.next();
            System.out.println("Masukkan Alamat: ");
            alamat = sc.next();
            System.out.println("Masukkan No Tlp : ");
            System.out.print("+62 ");
            tlp = sc.next();
            // =====
            iuran.data(nama, nik, alamat, tlp);
            // =====
            System.out.println("----------------------o0o----------------------");
            System.out.println("*** Data Pekerjaan ***");
            System.out.println("Masukkan Pekerjaan :");
            pekerjaan = sc.next();
            System.out.println("Masukkan Alamat Kantor :");
            kantor = sc.next();
            // =====
            iuran.data(pekerjaan, kantor);
            // =====
            System.out.println("----------------------o0o----------------------");
            System.out.println("*** Data Status ***");
            System.out.println("Masukkan Status :");
            status = sc.next();
            System.out.println("Masukkan Nama Suami/Istri :");
            menikah = sc.next();
            System.out.println("Masukkan Jumlah Anak :");
            jml_anak = sc.next();
            // ======
            iuran.data(status, menikah, jml_anak);
            // ==========================
            System.out.println("Lanjut Bayar Iuran ? Y/T");
            input = sc.next();
            if (input.equals("Y")) {
                System.out.println("----------------------o0o----------------------");
                System.out.println("*** Data Iuran Pokok ***");
                System.out.println("NIK = > " + iuran.nik);
                System.out.println("Masukkan Iuran Sampah :");
                sampah = sc.nextInt();
                System.out.println("Masukkan Iuran Keamanan :");
                keamanan = sc.nextInt();
                System.out.println("");
                System.out.println("*** Data Iuran Sekunder ***:");
                System.out.println("Masukkan Sumbangan :");
                sumbangan = sc.nextInt();
                System.out.println("Lanjutkan Bayar Iuran : T");
                input = sc.next();
                if (input.equals("T")) {
                    System.out.println("NIK =>" + iuran.nik);
                    System.out.println("Total Pembayaran Iuran Warga => " + iuran.data(sampah, keamanan, sumbangan));
                    System.out.println("Terimakasih " + iuran.nama + " Iuran Anda Sudah di Bayarkan");

                } else {
                }

            }
        }
    }

}
