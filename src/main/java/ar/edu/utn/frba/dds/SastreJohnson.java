package ar.edu.utn.frba.dds;

public class SastreJohnson implements Sastre {

  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoDePrenda.CAMISA);
    borrador.especificarColorPrincipal(new Color(100, 100, 100));
    borrador.especificarMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoDePrenda.PANTALON);
    borrador.especificarColorPrincipal(new Color(0, 0, 0));
    borrador.especificarMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoDePrenda.ZAPATOS);
    borrador.especificarColorPrincipal(new Color(100, 100, 100));
    borrador.especificarMaterial(Material.CUERO);
    return borrador.crearPrenda();
  }
}
