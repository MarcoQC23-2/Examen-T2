/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mco_a
 */
public class Asistencia {
    private Date fecha;
    private List<Estudiante> estudiantesPresentes;

    // Constructor
    public Asistencia(Date fecha) {
        this.fecha = fecha;
        this.estudiantesPresentes = new ArrayList<>();
    }

    public void marcarAsistencia(Estudiante estudiante) {
        estudiantesPresentes.add(estudiante);
    }

    public List<Estudiante> getEstudiantesPresentes() {
        return estudiantesPresentes;
    }
}
