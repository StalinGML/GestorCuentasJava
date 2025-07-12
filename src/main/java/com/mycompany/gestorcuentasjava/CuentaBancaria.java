package com.mycompany.gestorcuentasjava;

/**
 * Programa: Gestión de Cuentas Bancarias con Constructores en Java
 * Autor: Stalin Mendieta
 * ---------------------------------------------------------------
 */
public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String tipoCuenta;

    /**
     * Constructor por defecto.
     * Inicializa con valores predeterminados.
     */
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.titular = "Desconocido";
        this.saldo = 0.0;
        this.tipoCuenta = "No especificado";
    }

    /**
     * Constructor parametrizado.
     * Inicializa todos los atributos.
     */
    public CuentaBancaria(String numeroCuenta, String titular, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * Constructor sobrecargado.
     * Inicializa número de cuenta, titular y tipo de cuenta. Saldo por defecto = 0.
     */
    public CuentaBancaria(String numeroCuenta, String titular, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * Muestra la información de la cuenta.
     */
    public void mostrarInformacion() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("-----------------------------");
    }
}