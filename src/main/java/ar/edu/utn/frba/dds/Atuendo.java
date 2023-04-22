package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Excepciones.PrendaException;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  private Prenda parteInferior;
  private Prenda parteSuperior;
  private Prenda calzado;
  private List<Prenda> accesorios = new ArrayList<>();



  public Atuendo(Prenda parteInferior, Prenda parteSuperior, Prenda calzado, List<Prenda> accesorios) {


    if(parteInferior == null){
      throw new PrendaException("La prenda para la parte inferior no puede ser un valor nulo");
    }

    if(parteSuperior == null){
      throw new PrendaException("La prenda para la parte superior no puede ser un valor nulo");
    }

    if(calzado == null){
      throw new PrendaException("La prenda para el calzado no puede ser un valor nulo");
    }
    if(accesorios.isEmpty()){
      throw new PrendaException("Al menos debe cargar un accesorio");
    }

      this.parteInferior = parteInferior;
      this.parteSuperior = parteSuperior;
      this.calzado = calzado;
      this.accesorios = accesorios;

  }

}
