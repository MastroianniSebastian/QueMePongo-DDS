package ar.edu.utn.frba.dds;

public class SastreSanJuan implements Sastre {
  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoDePrenda.CHOMBA);
    borrador.especificarColorPrincipal(new Color(2, 3, 4));
    borrador.especificarMaterial(Material.PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoDePrenda.PANTALON);
    borrador.especificarColorPrincipal(new Color(343, 24, 44));
    borrador.especificarMaterial(Material.ACETATO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoDePrenda.ZAPATILLAS);
    borrador.especificarColorPrincipal(new Color(100, 100, 100));
    borrador.especificarMaterial(Material.LONA);
    return borrador.crearPrenda();
  }
}
