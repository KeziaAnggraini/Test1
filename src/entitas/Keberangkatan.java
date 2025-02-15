package entitas;

public class Keberangkatan {

    public Keberangkatan(int id_keberangkatan, String waktu_keberangkatan, int jumlah_harga){
        this.waktu_keberangkatan=waktu_keberangkatan;
        this.id_keberangkatan=id_keberangkatan;
        this.jumlah_harga=jumlah_harga;
    }


    int id_keberangkatan;
    String waktu_keberangkatan;
    int jumlah_harga;

    public int getId_keberangkatan() {
        return id_keberangkatan;
    }

    public void setId_keberangkatan(int id_keberangkatan) {
        this.id_keberangkatan = id_keberangkatan;
    }

    public String getWaktu_keberangkatan() {
        return waktu_keberangkatan;
    }

    public void setWaktu_keberangkatan(String waktu_keberangkatan) {
        this.waktu_keberangkatan = waktu_keberangkatan;
    }

    public int getJumlah_harga() {
        return jumlah_harga;
    }

    public void setJumlah_harga(int jumlah_harga) {
        this.jumlah_harga = jumlah_harga;
    }

    public int getHarga_jumlah() {
        return harga_jumlah;
    }

    public void setHarga_jumlah(int harga_jumlah) {
        this.harga_jumlah = harga_jumlah;
    }

    int harga_jumlah;
}
