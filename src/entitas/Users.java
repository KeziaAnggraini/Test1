package entitas;

public class Users {

    public Users(int id, String username, String email){
        this.username=username;
        this.id=id;
        this.email=email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmial() {
        return email;
    }

    public void setEmial(String emial) {
        this.email = emial;
    }


    int id;
    String username;
    String email;

}