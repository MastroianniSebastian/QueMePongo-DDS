package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.Material.*;
import static ar.edu.utn.frba.dds.TipoDePrenda.*;

public class SastreJohnson implements Sastre{

  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(CAMISA);
    borrador.especificarColorPrincipal(new Color(100,100,100));
    borrador.especificarMaterial(ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(PANTALON);
    borrador.especificarColorPrincipal(new Color(0,0,0));
    borrador.especificarMaterial(ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(ZAPATOS);
    borrador.especificarColorPrincipal(new Color(100,100,100));
    borrador.especificarMaterial(CUERO);
    return borrador.crearPrenda();
  }
}
