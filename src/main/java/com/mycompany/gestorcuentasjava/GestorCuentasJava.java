package com.mycompany.gestorcuentasjava;

/**
 * Clase principal para probar la clase CuentaBancaria.
 */
public class GestorCuentasJava {
    public static void main(String[] args) {
        // Encabezado visual del programa
        System.out.println("===========================================");
        System.out.println("  SISTEMA DE GESTION DE CUENTAS BANCARIAS  ");
        System.out.println("        Proyecto Banco en Java 2025       ");
        System.out.println("     Desarrollado por: Stalin Mendieta       ");
        System.out.println("===========================================\n");

        // Crear cuentas con distintos constructores
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("0246645647", "Stalin Mendieta", 1702.00, "Ahorros");
        CuentaBancaria cuenta3 = new CuentaBancaria("3183214662", "Maribel Silva", 2346.75, "Corriente");

        // Mostrar datos de cada cuenta
        System.out.println("Información de las cuentas bancarias:\n");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();
    }
}
