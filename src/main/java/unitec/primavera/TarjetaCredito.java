/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

/**
 *
 * @author T-107
 */
public class TarjetaCredito {
    private String nombre;
    private int numero;
    
    public void pagar()
    {
        System.out.println("Pagar crédito");
    }

    public TarjetaCredito(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
