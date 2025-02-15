package entitas;

public class Gerai {

    public Gerai(int id_gerai, String nama_gerai){
        this.nama_gerai=nama_gerai;
        this.id_gerai=id_gerai;
    }


    public int getId_gerai() {
        return id_gerai;
    }

    public void setId_gerai(int id_gerai) {
        this.id_gerai = id_gerai;
    }

    public String getNama_gerai() {
        return nama_gerai;
    }

    public void setNama_gerai(String nama_gerai) {
        this.nama_gerai = nama_gerai;
    }

    int id_gerai;
    String nama_gerai;
}
