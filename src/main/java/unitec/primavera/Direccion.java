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
public class Direccion {
    private String calle;
    private String municipio;
    private long cp;

    public Direccion() {
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", municipio=" + municipio + ", cp=" + cp + '}';
    }

    public Direccion(String calle, String municipio, long cp) {
        this.calle = calle;
        this.municipio = municipio;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }
}
