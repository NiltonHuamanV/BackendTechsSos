package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtecnico;
    @Column(name = "nombres", nullable = false)
    private String nombre;
    @Column(name = "apellidos", nullable = false)
    private String apellido;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "años experiencia", nullable = false)
    private int aniosexperiencia;

    public Tecnico(int idtecnico, String nombre, String apellido, int edad, int aniosexp) {
        this.idtecnico = idtecnico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.aniosexperiencia = aniosexp;
    }

    public Tecnico() {

    }

    public int getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(int idtecnico) {
        this.idtecnico = idtecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosexp() {
        return aniosexperiencia;
    }

    public void setAniosexp(int aniosexp) {
        this.aniosexperiencia = aniosexp;
    }
}
