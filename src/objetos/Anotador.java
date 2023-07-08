package objetos;

import java.util.Calendar;

public class Anotador {

    protected String titulo;

    protected String anotacion;

    protected Calendar fecha;

    protected Usuario user;

    public Anotador() {
        
    }

    public Anotador(String titulo, String anotacion, Calendar fecha, Usuario user) {
        try {
            
            this.titulo = titulo;
            this.anotacion = anotacion;
            this.fecha = fecha;
            this.user = user;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
       
        return "Anotacion"
                + ", titulo:" + titulo
                + ", anotacion:" + anotacion
                + ", fecha:" + fecha
                +", usuario:" + user
                ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void anotar(){
        
    }
    
    
}
