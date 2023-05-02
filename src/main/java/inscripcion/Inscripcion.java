package inscripcion;

import java.util.Date;

public class Inscripcion {
    public class Inscripcion {
        private Materia materia;
        private Alumno alumno;
        private Date fecha;
        private boolean aprobada;

        public Inscripcion(Materia materia, Alumno alumno, Date fecha, boolean aprobada) {
            this.materia = materia;
            this.alumno = alumno;
            this.fecha = fecha;
            this.aprobada = aprobada;
        }

        public Materia getMateria() {
            return materia;
        }

        public Alumno getAlumno() {
            return alumno;
        }

        public Date getFecha() {
            return fecha;
        }

        public boolean isAprobada() {
            return aprobada;
        }



    }
}
