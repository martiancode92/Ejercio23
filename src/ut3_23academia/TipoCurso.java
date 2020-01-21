
package ut3_23academia;


public class TipoCurso {
    

    private String denominacion;
    private int plazas;// plazas ofertada
    private int contador;// oplazas ocu0padas
     private float precio;
    
    
    public TipoCurso(String denominacion, int plazas, float precio){
        
        this.denominacion=denominacion;    
        this.plazas=plazas;
        this.precio=precio;
        
    }
    
    
    
    public String getDenominacion() {
        return denominacion;
    }
    
    // establecer y devolver nombre 
    
    public int getContador() {
        return contador;
    }

  
    public int getPlazas() {
        return plazas;
    }
    
    
    public void actualizarPlazas(){
  
    this.contador++;
    
    }
    public int plazasDisponibles()
    {
        return plazas-contador;
    }
    
    public float recaudacion(){
    
    return contador*precio;
    
    
    }
    
    
    
    
    
    
    
    
}
