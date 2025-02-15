package entitas;

public class Atm {

    public Atm(int id_atm, String nama_atm){
        this.nama_atm=nama_atm;
        this.id_atm=id_atm;
    }

    int id_atm;

    public String getNama_atm() {
        return nama_atm;
    }

    public void setNama_atm(String nama_atm) {
        this.nama_atm = nama_atm;
    }

    public int getId_atm() {
        return id_atm;
    }

    public void setId_atm(int id_atm) {
        this.id_atm = id_atm;
    }

    String nama_atm;
}
