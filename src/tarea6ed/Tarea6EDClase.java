/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6ed;

/**
 *
 * @author cajag
 */
public class Tarea6EDClase {

    private static final int LIMITE_PARA_DESCUENTO = 3;
    private static final double DESCUENTO_MINORISTA = 0.95;
    private static final double DESCUENTO_MAYORISTA = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_PARA_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAYORISTA;
            precioFinal(total);
        } else {
            total = precioProducto * DESCUENTO_MINORISTA;
            precioFinal(total);
        }

    }

    private void precioFinal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
