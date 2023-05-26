package xyz.devien.sem10;

public class anime {
    public int id;
    public int img;
    public String nombre;
    public String descrp;

    public anime(int id, int img, String nombre, String descrp) {
        this.id = id;
        this.img = img;
        this.nombre = nombre;
        this.descrp = descrp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrp() {
        return descrp;
    }

    public void setDescrp(String descrp) {
        this.descrp = descrp;
    }
}
