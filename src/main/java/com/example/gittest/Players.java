package com.example.gittest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String procedencia;
    private Integer dorsal;
    private String posicion;
    private Double estatura;
    private Double peso;

    //Builder
    public Players(){}

    public Players(Long id, String nombre, String apellido, String procedencia, Integer dorsal, String posicion, Double estatura, Double peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.procedencia = procedencia;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.estatura = estatura;
        this.peso = peso;
    }

    //Getter and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // 2String

    @Override
    public String toString() {
        return "Jugadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", dorsal=" + dorsal +
                ", posicion='" + posicion + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                '}';
    }
}
