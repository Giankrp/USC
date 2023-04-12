package pakaje;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Persona persona = new pakaje.Persona("Gian", "Ruiz", 19);

        Estudiante estudiante1 = new pakaje.Estudiante("Gian", "Ruiz", 19, 4.0, 123);
        estudiante1.mostrarDatos();
        Estudiante estudiante2 = new pakaje.Estudiante("Pepe", "emidio", 24, 4.5, 323);
        estudiante2.mostrarDatos();
        Estudiante estudiante3 = new pakaje.Estudiante("XDDDDD", "papas", 21, 3.7, 354);
        estudiante3.mostrarDatos();
        if (estudiante1.notaFinal > estudiante2.notaFinal && estudiante1.notaFinal > estudiante3.notaFinal) {
            JOptionPane.showMessageDialog(null, "La nota mas alta es: " + estudiante1.notaFinal);
        } else if (estudiante2.notaFinal > estudiante1.notaFinal && estudiante2.notaFinal > estudiante3.notaFinal) {
            JOptionPane.showMessageDialog(null, "La nota mas alta es: " + estudiante2.notaFinal);
        } else {
            JOptionPane.showMessageDialog(null, "La nota mas alta es: " + estudiante3.notaFinal);
        }

        if (estudiante1.notaFinal < estudiante2.notaFinal && estudiante1.notaFinal < estudiante3.notaFinal) {
            JOptionPane.showMessageDialog(null, "La nota mas baja es: " + estudiante1.notaFinal);
        } else if (estudiante2.notaFinal < estudiante1.notaFinal && estudiante2.notaFinal < estudiante3.notaFinal) {
            JOptionPane.showMessageDialog(null, "La nota mas baja es: " + estudiante2.notaFinal);
        } else {
            JOptionPane.showMessageDialog(null, "La nota mas baja es: " + estudiante3.notaFinal);
        }
    }
}
