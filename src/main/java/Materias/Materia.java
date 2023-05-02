package Materias;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

public class Materia {
    private String nombre;
    private List<String> correlativas;
    public Materia(String nombre, List<String> correlativas){
        this.nombre = nombre;
        this.correlativas = correlativas;

    }

    public List<String> getCorrelativas() {
        return correlativas;
    }

    public String getNombre() {
        return nombre;
    }
}
