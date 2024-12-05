/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registromaraton;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class RegistroMaraton {

    String nombre;
    int edad;
    int numCorredor;
    String categoriaCorredor = "";
    double tiempoEstimado;
    public RegistroMaraton[] RegistroMaraton;
    private final int dumpRunners = 500;

    /*
    Ingreso de metodos 
     */
    public void llenaCorredores() {
        /*
        Llena de forma aleatoria los corredores
         */
        for (int i = 0; i < dumpRunners; i++) {
            nombre = "Pepe" + i;
            edad = 25;
            categoriaCorredor = "Adulto";
            tiempoEstimado = 155.56 + i;
            RegistroMaraton[i] = new RegistroMaraton(nombre, edad, i, categoriaCorredor, tiempoEstimado);
        }
    }

    public String seleccionCategoria(int edad) {
        /*
        Este metodo crea al seleccion de categorias
         */
        String categoria = "";
        if (edad < 18) {
            categoria = "Juvenil";
        }
        if (edad >= 40) {
            categoria = "Adulto";
        }
        if (edad < 40) {
            categoria = "Adulto";
        }
        return categoria;
    }

    public RegistroMaraton[] iniciarMetodos() {
        /*
        Inicia los metodos para trabajar
         */
        int matrixSize = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos corredores va ingresar?"));
        RegistroMaraton[] reservaNueva = new RegistroMaraton[matrixSize];
        return reservaNueva;
    }

    public void ingresarReserva() {
        /*
        Ingresa informacion sobre corredores
         */
        RegistroMaraton[] reservaNueva = iniciarMetodos();
        for (int i = 0; i < reservaNueva.length; i++) {
            String nombreCorredor = JOptionPane.showInputDialog("Ingrese nombre del corredor:");
            int edadCorredor = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es la edad del corredor?"));
            String categoriaCorredor = seleccionCategoria(edadCorredor);
            int numCorredor = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el numero del corredor?"));
            double tiempoEstimado = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el tiempo estimado?"));
            /*
            Verificar si el idEmpleado ya está registrado
             */
            boolean existeReserva = false;
            for (int j = 0; j < i; j++) {
                String x = String.valueOf(reservaNueva[j].getNumCorredor());
                if (x.equals(String.valueOf(numCorredor))) {
                    existeReserva = true;
                    break;
                }
            }

            if (existeReserva) {
                JOptionPane.showMessageDialog(null, "Error: Usuario con reserva existente.");
                i--; // Tolerancia al fallo de usuario
                continue;
            }

            reservaNueva[i] = new RegistroMaraton(nombreCorredor, edadCorredor, numCorredor, categoriaCorredor, tiempoEstimado);
        }
        System.out.println(reservaNueva.toString());
    }

    public void BuscarCorredor() {

        System.out.println("Se usara para modificar reservas!");
        String idCorredor = JOptionPane.showInputDialog("Ingrese el numero de corredor:");
        boolean reservaEncontrada = false;

        // Buscar la reserva por numCorredor
        for (int i = 0; i < RegistroMaraton.length; i++) {
            if (RegistroMaraton[i] != null && String.valueOf(RegistroMaraton[i].getNumCorredor()).equals(idCorredor)) {
                reservaEncontrada = true;
                JOptionPane.showMessageDialog(null, "Corredor Encontrado: " + RegistroMaraton[i].toString());
                String confirmation = JOptionPane.showInputDialog("Desea eliminar corredor?");
                if (confirmation.equalsIgnoreCase("yes")) {
                }
                break;
            }
        }

        // Si no se encuentra la reserva
        if (!reservaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva para el empleado con cédula: " + idCorredor);
        }

    }

    public void listarReservas() {
        /*
        Regresa la lista de corredores
         */
        StringBuilder reservasLista = new StringBuilder();
        for (int i = 0; i < RegistroMaraton.length; i++) {
            System.out.println("Se va usar para dar lista de reservas");
            reservasLista.append(RegistroMaraton[i].toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, "Reserva modificada: " + RegistroMaraton.toString());

    }


    /*
    Constructores
     */
    public RegistroMaraton() {
//        llenaCorredores();
    }

    public RegistroMaraton(String nombre, int edad, int numCorredor, String categoriaCorredor, double tiempoEstimado) {
        this.nombre = nombre;
        this.edad = edad;
        this.numCorredor = numCorredor;
        this.categoriaCorredor = categoriaCorredor;
        this.tiempoEstimado = tiempoEstimado;
    }

    /*
    Get & Setters
     */
    public String getNombre(String nombreCorredor) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumCorredor() {
        return numCorredor;
    }

    public void setNumCorredor(int numCorredor) {
        this.numCorredor = numCorredor;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getCategoriaCorredor() {
        return categoriaCorredor;
    }

    public void setCategoriaCorredor(String categoriaCorredor) {
        this.categoriaCorredor = categoriaCorredor;
    }

}
