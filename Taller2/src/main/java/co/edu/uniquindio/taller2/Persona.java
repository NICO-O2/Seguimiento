package co.edu.uniquindio.taller2;

public class Persona {
    private String nombre;
    private String sexo;
    private String ciudad;

    public Persona(String nombre, String sexo, String ciudad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
