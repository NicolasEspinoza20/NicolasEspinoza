/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zicko
 */
public class Registro {

    public boolean agregar(Pelicula pelicula) {

        Date date;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            date = pelicula.getPublicacionPelicula();
            String query = "INSERT INTO PELICULA(titulopelicula,autorpelicula,publicacionpelicula,preciopelicula,disponible) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, pelicula.getTituloPelicula());
            stmt.setString(2, pelicula.getAutorPelicula());
            stmt.setDate(3, new java.sql.Date(date.getTime()));
            stmt.setInt(4, pelicula.getPrecioPelicula());
            stmt.setBoolean(5, pelicula.isDisponible());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Error sql al agregar pelicula");
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar pelicula");
            return false;
        }

    }

    public boolean actualizar(Pelicula pelicula) {

        Date date;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            date = pelicula.getPublicacionPelicula();
            String query = "UPDATE libro SET titulopelicula=?,autor =?,publicacionpelicula=?,preciopelicula=?,disponible=? WHERE = idpelicula=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, pelicula.getTituloPelicula());
            stmt.setString(2, pelicula.getAutorPelicula());
            stmt.setDate(3, new java.sql.Date(date.getTime()));
            stmt.setInt(4, pelicula.getPrecioPelicula());
            stmt.setBoolean(5, pelicula.isDisponible());
            stmt.setInt(6, pelicula.getIdPelicula());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Error sql al actualizar pelicula");
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar pelicula");
            return false;
        }

    }

    public boolean eliminar(int idLibro) {
        Date date;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM pelicula WHERE = idpelicula=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idLibro);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Error sql al eliminar Pelicula");
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar pelicula");
            return false;
        }
    }

    public Pelicula buscarPorId(int idPelicula) {
        Pelicula pelicula = new Pelicula();
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM pelicula WHERE = idpelicula=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idPelicula);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pelicula.setIdPelicula(rs.getInt("idpelicula"));
                pelicula.setTituloPelicula(rs.getString("titulopelicula"));
                pelicula.setAutorPelicula(rs.getString("autorpelicula"));
                pelicula.setPublicacionPelicula(rs.getDate("publicacionpelicula"));
                pelicula.setPrecioPelicula(rs.getInt("preciopelicula"));    
                pelicula.setDisponible(rs.getBoolean("disponible"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error sql al listar la pelicula por id " + e.getMessage());

        }
        return pelicula;

    }

    public List<Pelicula> buscarTodos() {

        List<Pelicula> lista = new ArrayList<>();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM pelicula order by titulopelicula";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(rs.getInt("idpelicula"));
                pelicula.setTituloPelicula(rs.getString("titulopelicula"));
                pelicula.setAutorPelicula(rs.getString("autorpelicula"));
                pelicula.setPublicacionPelicula(rs.getDate("publicacionpelicula"));
                pelicula.setPrecioPelicula(rs.getInt("Preciopelicula"));
                pelicula.setDisponible(rs.getBoolean("disponible"));
                
                lista.add(pelicula);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error sql al listar todas las peliculas" + e.getMessage());

        }
        return lista;

    }
    
    public boolean buscarPelicula(List<Pelicula>lista,String tituloPelicula){
    
        for (Pelicula pelicula : lista){
            if (pelicula.getTituloPelicula().equalsIgnoreCase(tituloPelicula)) {
                return true;
                
            }
            
            
        }
        return false;
    }

}

