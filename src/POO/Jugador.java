
package POO;

//Jugador es la clase Padre o super 
public class Jugador 
{
    
    //Metodos
    private String nombre;
    private int codigo;
    private float tiempoJugando;
    private String modalidad; 

    //Constructor
    public Jugador(String nombre, int codigo, float tiempoJugando, String modalidad)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tiempoJugando = tiempoJugando;
        this.modalidad = modalidad;
    }
    
    //Metodos Setters y Getters
    
     public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
       
    public int getCodigo() 
    {
        return codigo;
    }

    public void setTiempoJugando(float tiempoJugando)
    {
        this.tiempoJugando = tiempoJugando;
    }
    
    public float getTiempoJugando() 
    {
        return tiempoJugando;
    }
    
    public void setModalidad(String modalidad)
    {
        this.modalidad = modalidad;
    }
    
    public String getModalidad() 
    {
        return modalidad;
    } 
       
}
