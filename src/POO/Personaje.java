
package POO;

//Metodos de la clase hija
public class Personaje extends Jugador
{
    
    //Metodos de la clase hija
    
    private String genero;
    private float altura;
    private String habilidad;
    private int nivelExperiencia;
    
    Jugador jugador1 = new Jugador();

    public Personaje(String genero, float altura, String habilidad, int nivelExperiencia, String nombre, int codigo, float tiempoJugando, String modalidad)
    {
        super(nombre, codigo, tiempoJugando, modalidad);
        this.genero = genero;
        this.altura = altura;
        this.habilidad = habilidad;
        this.nivelExperiencia = nivelExperiencia;
    }
    
    Personaje(){}
    
    //  Metodos Setters y Getters de la clase hija
    
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }
    
    public float getAltura() 
    {
        return altura;
    }
    
    public void setHabilidad(String habilidad) 
    {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }
    
    public void setNivelExperiencia(int nivelExperiencia) 
    {
        this.nivelExperiencia = nivelExperiencia;
    }
    
    public int getNivelExperiencia() 
    {
        return nivelExperiencia;
    }
   
}
