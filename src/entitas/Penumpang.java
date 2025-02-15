package entitas;

public class Penumpang {

    public Penumpang(int nik, String nama, int noHp){
        this.nama=nama;
        this.nik=nik;
        this.noHp=noHp;
    }


    String nama;
    int nik;
    int noHp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String alamat;
}
