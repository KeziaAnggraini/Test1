package entitas;

public class Kursi {

    public Kursi(int id_kursi, String nama_kursi){
        this.nama_kursi=nama_kursi;
        this.id_kursi=id_kursi;
    }


    public int getId_kursi() {
        return id_kursi;
    }

    public void setId_kursi(int id_kursi) {
        this.id_kursi = id_kursi;
    }

    public String getNama_kursi() {
        return nama_kursi;
    }

    public void setNama_kursi(String nama_kursi) {
        this.nama_kursi = nama_kursi;
    }

    int id_kursi;
    String nama_kursi;
}
