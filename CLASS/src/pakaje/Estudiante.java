package pakaje;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    int codigoEstudiante = 0;
    double notaFinal = 0;

    public Estudiante(String nombre, String apellido, int edad, double notaFinal, int codigoEstudiante) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;

    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "\nApellido: " + getApellido()
                + "\nEdad: " + getEdad() + "\ncodigo estudiante: " + codigoEstudiante + "\n Nota final: "
                + notaFinal);
    }


}
