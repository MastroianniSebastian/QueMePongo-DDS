import java.util.List;

class QMP5 {

  public class Prenda{}

  public class Guardarropa{
    List<Prenda> prendas;
    TipoCriterio tipoCriterio = null;
    public void agregarPrenda(Prenda unaPrenda){
      prendas.add(unaPrenda);
    }
    public void quitarPrenda(Prenda unaPrenda){
      prendas.remove(unaPrenda);
    }

  }

  class GestorDePropuestas{
    List<Propuesta> propuestas;
    List<Propuesta> propuestasAceptadas;

  public void tomarPropuesta(Propuesta unaPropuesta){
    propuestas.add(unaPropuesta);
  }

  public List<Propuesta> getPropuestas(){
    return this.propuestas;
  }
  public void aceptarPropuesta(Propuesta unaPropuesta){
    unaPropuesta.execute();
    propuestas.remove(unaPropuesta);
    propuestasAceptadas.add(unaPropuesta);
  }



  public void aceptarTodasLasPropuestas(){
    this.propuestas.stream().forEach(unaPropuesta->aceptarPropuesta(unaPropuesta));
  }

  public void rechazarPropuesta(Propuesta unaPropuesta){
    this.propuestas.remove(unaPropuesta);
  }

  public void rechazarTodasLasPropuestas(){
    this.propuestas.stream().forEach(unaPropuesta->rechazarPropuesta(unaPropuesta));
  }

  public void deshacerPropuesta(Propuesta unaPropuesta){
    unaPropuesta.reverse();
    this.propuestasAceptadas.remove(unaPropuesta);
  }

  public void deshacerTodasLasPropuestas(){
    this.propuestasAceptadas.stream().forEach(unaPropuestaAceptada->deshacerPropuesta(unaPropuestaAceptada));
  }
  }


  class Usuario{
    List<Prenda> prendas;
    List<Guardarropa> guardarropas;
    List<Guardarropa> guardarropasCompartidosConmigo;
    GestorDePropuestas getorDePropuestas;
 public void sugerirAgregarPrendaAGuardarropas(Guardarropa guardarropa,Prenda unaPrenda){
   AgregarPrendaPeticion agregarPrendaPeticion = new AgregarPrendaPeticion(guardarropa, unaPrenda);
   getorDePropuestas.tomarPropuesta(agregarPrendaPeticion);
 }
 public void sugerirQuitarPrendaAGuardarropas(Guardarropa guardarropa,Prenda unaPrenda){
   QuitarPrendaPeticion quitarPrendaPeticion = new QuitarPrendaPeticion(guardarropa, unaPrenda);
   getorDePropuestas.tomarPropuesta(quitarPrendaPeticion);
 }
 public List<Propuesta> verPropuestasDeModificacion(){
   return getorDePropuestas.getPropuestas();
 }
  }

  interface Propuesta{
  public void execute();
  public void reverse();
  }

  class AgregarPrendaPeticion implements Propuesta{
    Prenda prenda;
    Guardarropa guardarropa;
    public AgregarPrendaPeticion(Guardarropa guardarropa, Prenda prenda){

    }
  public void execute(){
      guardarropa.agregarPrenda(prenda);
  }
  public void reverse(){
      guardarropa.quitarPrenda(prenda);
  }
  }

  class QuitarPrendaPeticion implements Propuesta{
    Prenda prenda;
    Guardarropa guardarropa;

    public QuitarPrendaPeticion(Guardarropa guardarropa, Prenda prenda){

    }
    public void execute(){
      guardarropa.quitarPrenda(prenda);
    }
    public void reverse(){
      guardarropa.agregarPrenda(prenda);
    }
  }

  enum TipoCriterio{
    ROPA_DE_VIAJE,
    ROPA_DE_ENTRECASA,

  }


}