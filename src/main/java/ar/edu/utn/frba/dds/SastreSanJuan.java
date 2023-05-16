package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.Material.*;
import static ar.edu.utn.frba.dds.TipoDePrenda.*;

public class SastreSanJuan implements Sastre{
  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(CHOMBA);
    borrador.especificarColorPrincipal(new Color(2,3,4));
    borrador.especificarMaterial(PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(PANTALON);
    borrador.especificarColorPrincipal(new Color(343,24,44));
    borrador.especificarMaterial(ACETATO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(ZAPATILLAS);
    borrador.especificarColorPrincipal(new Color(100,100,100));
    borrador.especificarMaterial(LONA);
    return borrador.crearPrenda();
  }
}
