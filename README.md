# Gestor de Cuentas de Banco con Constructores en Java - POO

## Datos del estudiante
  **Nombre:** Stalin Mendieta
  **Segundo Nivel - 2025**
  **Tarea Semana 7 - POO: Implementación de Constructores en Java**
  **Tema:** Gestor de Cuentas de Banco con Constructores en Java

## Descripción del programa

Este programa en Java implementa una aplicación orientada a objetos para gestionar cuentas bancarias, utilizando distintos tipos de **constructores**:

- Constructor por defecto
- Constructores parametrizados
- Sobrecarga de constructores

La clase `CuentaBancaria` contiene atributos como número de cuenta, titular, saldo, tipo de cuenta y nombre del banco. El objetivo es demostrar cómo inicializar correctamente los atributos de un objeto mediante constructores, aplicando principios como el **encapsulamiento** y el uso de la palabra clave `this`.
Desde la clase `GestorCuentasJava` se crean varias instancias de la clase `CuentaBancaria` utilizando los diferentes constructores. Luego, se llama al método `mostrarInformacion()` para visualizar los datos almacenados en cada cuenta.

## Ejemplo de uso

El programa se ejecuta desde la clase principal `GestorCuentasJava`, donde se crean objetos de tipo `CuentaBancaria` de distintas maneras:

- Usando el constructor por defecto para crear una cuenta con valores genéricos.
- Usando un constructor parametrizado para crear una cuenta completa con número, titular, saldo, tipo de cuenta y banco.
- Usando un constructor sobrecargado para crear una cuenta sin saldo inicial, pero especificando el tipo de cuenta y banco.

Cada objeto es creado e impreso en consola para demostrar cómo los constructores permiten inicializar atributos de manera flexible y controlada.
