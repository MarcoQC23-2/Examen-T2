/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mco_a
 */
public class Aula {
    private int numeroCarpetas;
    private List<Estudiante> estudiantesEnAula;

    // Constructor
    public Aula(int numeroCarpetas) {
        this.numeroCarpetas = numeroCarpetas;
        this.estudiantesEnAula = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantesEnAula.add(estudiante);
    }

    public void removerEstudiante(Estudiante estudiante) {
        estudiantesEnAula.remove(estudiante);
    }

    public int getNumeroCarpetasDisponibles() {
        return numeroCarpetas - estudiantesEnAula.size();
    }
}
