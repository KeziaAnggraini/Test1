package entitas;

public class Kelas {

    public Kelas(int id_kelas, String nama_kelas, int harga){
        this.nama_kelas=nama_kelas;
        this.harga=harga;
        this.id_kelas=id_kelas;

    }


    int id_kelas;
    String nama_kelas;
    int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }
}
