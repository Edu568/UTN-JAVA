package Alumno;

import java.util.ArrayList;
import java.util.List;


    public class Alumno {
        private String nombre;
        private int legajo;
        private ArrayList<String> MateriasAprobadas = new ArrayList<>();

        public Alumno (String nombre, int legajo) {
            this.nombre = nombre;
            this.legajo = legajo;

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
            MateriasAprobadas = materiasAprobadas;
        }

        public void setLegajo(int legajo) {
            this.legajo = legajo;
        }

        public int getLegajo() {
            return legajo;
        }

        public ArrayList<String> getMateriasAprobadas() {
            return materiasAprobadas;
        }

        public boolean tieneCorrelativasAprobadas(List<String> correlativas) {
            for (String correlativa : correlativas) {
                if (!materiasAprobadas.contains(correlativa)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return "Alumno{" + "nombres=" + nombres + ", legajo=" + legajo + ", materiasAprobadas=" + materiasAprobadas + '}';
        }
    }

