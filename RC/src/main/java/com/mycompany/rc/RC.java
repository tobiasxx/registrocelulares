/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rc;

/**
 *
 * @author ARACELI
 */
public class RC {
    
    String marca;
    String modelo;
    int ram;
    String SO;
    double memoria;

    public RC() {
    }

    public RC(String marca, String modelo, int ram, String SO, double memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.SO = SO;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "RC{" + "marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", SO=" + SO + ", memoria=" + memoria + '}';
    }
    
    
}


