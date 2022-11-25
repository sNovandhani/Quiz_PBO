package quiz_pbo1;

public class Data {
    String nama, nik, alamat, tlp, pekerjaan, kantor, status, menikah, jml_anak;

    void data(String nama, String nik, String alamat, String tlp) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.tlp = tlp;

    }

    void data(String pekerjaan, String kantor) {
        this.pekerjaan = pekerjaan;
        this.kantor = kantor;

    }

    void data(String status, String menikah, String jml_anak) {
        this.status = status;
        this.jml_anak = jml_anak;

    }

}

class iuran extends Data {

    int sampah, keamanan, sumbangan;

    int data(int sampah, int keamanan, int sumbangan) {
        this.sampah = sampah;
        this.keamanan = keamanan;
        this.sumbangan = sumbangan;
        int total = sampah + keamanan + sumbangan;
        return total;

    }

}
