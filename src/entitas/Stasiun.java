package entitas;

public class Stasiun {

    public Stasiun(int id_stasiun, String kota_stasiun, int no_km){
        this.kota_stasiun=kota_stasiun;
        this.id_stasiun=id_stasiun;
        this.no_km=no_km;
    }


    public int getId_stasiun() {
        return id_stasiun;
    }

    public void setId_stasiun(int id_stasiun) {
        this.id_stasiun = id_stasiun;
    }

    public String getKota_stasiun() {
        return kota_stasiun;
    }

    public void setKota_stasiun(String kota_stasiun) {
        this.kota_stasiun = kota_stasiun;
    }

    public int getNo_km() {
        return no_km;
    }

    public void setNo_km(int no_km) {
        this.no_km = no_km;
    }

    int id_stasiun;
    String kota_stasiun;
    int no_km;
}
