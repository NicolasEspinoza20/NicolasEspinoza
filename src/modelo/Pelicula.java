/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Nicolas Espinoza
 */
public class Pelicula {
    
    private int idPelicula;
    private String tituloPelicula;
    private String autorPelicula;
    private Date publicacionPelicula;
    private int precioPelicula;
    
    
    
    private boolean disponible;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String tituloPelicula, String autorPelicula, Date publicacionPelicula, int precioPelicula, boolean disponible) {
        this.idPelicula = idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.autorPelicula = autorPelicula;
        this.publicacionPelicula = publicacionPelicula;
        this.precioPelicula = precioPelicula;
        this.disponible = disponible;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getAutorPelicula() {
        return autorPelicula;
    }

    public void setAutorPelicula(String autorPelicula) {
        this.autorPelicula = autorPelicula;
    }

    public Date getPublicacionPelicula() {
        return publicacionPelicula;
    }

    public void setPublicacionPelicula(Date publicacionPelicula) {
        this.publicacionPelicula = publicacionPelicula;
    }

    public int getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(int precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    
    
}
