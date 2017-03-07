package arqSw.proyecto.Hibernate;
// Generated 3/03/2017 01:29:57 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Artista generated by hbm2java
 */
public class Artista  implements java.io.Serializable {


     private int idArtista;
     private String usuario;
     private String password;
     private Set<Venta> ventas = new HashSet<Venta>(0);
     private Set<Estampa> estampas = new HashSet<Estampa>(0);

    public Artista() {
    }

	
    public Artista(int idArtista) {
        this.idArtista = idArtista;
    }
    public Artista(int idArtista, String usuario, String password, Set<Venta> ventas, Set<Estampa> estampas) {
       this.idArtista = idArtista;
       this.usuario = usuario;
       this.password = password;
       this.ventas = ventas;
       this.estampas = estampas;
    }
   
    public int getIdArtista() {
        return this.idArtista;
    }
    
    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }
    public Set<Estampa> getEstampas() {
        return this.estampas;
    }
    
    public void setEstampas(Set<Estampa> estampas) {
        this.estampas = estampas;
    }




}

