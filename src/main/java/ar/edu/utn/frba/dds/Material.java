package ar.edu.utn.frba.dds;

import java.util.List;

public enum Material {
  ALGODON(List.of(TipoDePrenda.REMERA, TipoDePrenda.CAMISA, TipoDePrenda.PANTALON,
      TipoDePrenda.SACO, TipoDePrenda.CAMPERA, TipoDePrenda.SHORT, TipoDePrenda.POLLERA)),
  PIQUE(List.of(TipoDePrenda.SACO, TipoDePrenda.REMERA, TipoDePrenda.CHOMBA)),
  ACETATO(List.of(TipoDePrenda.SACO, TipoDePrenda.CAMPERA,
      TipoDePrenda.PANTALON, TipoDePrenda.POLLERA)),
  LONA(List.of(TipoDePrenda.ZAPATILLAS)),
  CUERO(List.of(TipoDePrenda.CAMPERA, TipoDePrenda.ZAPATOS,
      TipoDePrenda.POLLERA, TipoDePrenda.PANTALON));
  private final List<TipoDePrenda> tipoDePrendasValidas;


  Material(List<TipoDePrenda> tipoDePrendasValidas) {
    this.tipoDePrendasValidas = tipoDePrendasValidas;
  }

  public boolean tipoDePrendaValida(TipoDePrenda tipoDePrenda) {
    return tipoDePrendasValidas.contains(tipoDePrenda);
  }
}
