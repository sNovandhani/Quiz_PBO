package quiz_pbo;

import java.util.Scanner;

abstract class Barang implements admin {
    protected String setNama, setNIK;
    protected int modalAwal = 20000000;

    public abstract void list();

    public abstract void data();

}

class BarangMasuk extends Barang {
    int masuk, pilihan, total;

    public void hitung() {
        BarangKeluar keluar = new BarangKeluar();
        Scanner sc = new Scanner(System.in);
        int harga;
        // =================================
        System.out.print("Pilihan Anda : ");
        pilihan = sc.nextInt();
        if (pilihan == 0) {
            System.out.println("Selesai");
            System.out.println("Total Pemasukan => Rp." + total);
            System.out.println("");
            System.out.println("Total Kas       => Rp. " + (modalAwal += total));
            System.out.println("");
            System.out.println("");
            keluar.list();
            keluar.hitung();
            System.exit(0);
        } else {
            System.out.print("Banyaknya barang yang masuk : ");
            masuk = sc.nextInt();
            System.out.println("Data Tersimpan");
            switch (pilihan) {
                case 1:
                    harga = masuk * 45000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 2:
                    harga = masuk * 50000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 3:
                    harga = masuk * 40000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 4:
                    harga = masuk * 38000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 5:
                    harga = masuk * 32000;
                    total += harga;
                    System.out.println("Harga Sebesar " + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
            }

        }

    }

    @Override
    public void list() {
        System.out.println("*** Pendataan Barang Masuk Pt. Garuda Abadi Group***");
        System.out.println("=======================================================");
        System.out.println("||Jenis Barang || Nama Barang || Jumlah ||   Harga   ||");
        System.out.println("||1. Buku      ||Buku Tulis   ||1 Pax   ||Rp. 45.000 ||");
        System.out.println("||2. Buku      ||Buku Gambar  ||1 Pax   ||Rp. 50.000 ||");
        System.out.println("||3. Kertas    ||Kertas A4    ||1 Rim   ||Rp. 40.000 ||");
        System.out.println("||4. Bulpen    ||Bulpen Biru  ||1 Pax   ||Rp. 38.000 ||");
        System.out.println("||5. Pensil    ||Pensil Raut  ||1 Pax   ||Rp. 32.000 ||");
        System.out.println("=======================================================");
        System.out.println("=======================================================");
    }

    @Override
    public void data() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Data Anda");
        System.out.println("============================");
        System.out.print("Nama Admin : ");
        setNama = sc.next();
        System.out.print("NIK Admin : ");
        setNIK = sc.next();
        System.out.println("");

    }

}

class BarangKeluar extends Barang {
    int pilihan, keluar, total;

    public void hitung() {
        Scanner sc = new Scanner(System.in);
        int harga;
        // =================================
        System.out.print("Pilihan Anda : ");
        pilihan = sc.nextInt();
        if (pilihan == 0) {
            System.out.println("Selesai");
            System.out.println("Total Pengeluaran => Rp." + total);
            System.out.println("");
            System.out.println("Sisa Kas dari Total Pengeluaran : Rp. " + (modalAwal -= total));
            System.out.println("Administrasi Persediaan Barang Distibutor PT. Garuda Abadi Group");
            System.out.println("Check, Data, dan Antar, Ketelitian Anda dalam Administrasi Sangat Di Utamakan (^_^)");
            System.exit(0);
        } else {
            System.out.print("Banyaknya barang yang keluar : ");
            keluar = sc.nextInt();
            System.out.println("Data Tersimpan");
            switch (pilihan) {
                case 1:
                    harga = keluar * 45000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 2:
                    harga = keluar * 50000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 3:
                    harga = keluar * 40000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 4:
                    harga = keluar * 38000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
                case 5:
                    harga = keluar * 32000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp." + harga);
                    System.out.println("=============================");
                    System.out.println("");
                    hitung();
                    break;
            }

        }

    }

    @Override
    public void list() {
        System.out.println("*** Pendataan Barang Keluar PT. Garuda Abadi Group ***");
        System.out.println("=======================================================");
        System.out.println("||Jenis Barang || Nama Barang || Jumlah ||   Harga   ||");
        System.out.println("||1. Buku      ||Buku Tulis   ||1 Pax   ||Rp. 45.000 ||");
        System.out.println("||2. Buku      ||Buku Gambar  ||1 Pax   ||Rp. 50.000 ||");
        System.out.println("||3. Kertas    ||Kertas A4    ||1 Rim   ||Rp. 40.000 ||");
        System.out.println("||4. Bulpen    ||Bulpen Biru  ||1 Pax   ||Rp. 38.000 ||");
        System.out.println("||5. Pensil    ||Pensil Raut  ||1 Pax   ||Rp. 32.000 ||");
        System.out.println("=======================================================");
        System.out.println("=======================================================");
    }

    @Override
    public void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Data Anda");
        System.out.println("============================");
        System.out.print("Nama Admin : ");
        setNama = sc.next();
        System.out.print("NIK Admin : ");
        setNIK = sc.next();
        System.out.println("");

    }

}
