package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.TipoDePrenda.*;

import java.util.List;

public enum Material {
  ALGODON(List.of(REMERA, CAMISA, PANTALON, SACO, CAMPERA, SHORT, POLLERA)),
  PIQUE(List.of(SACO, REMERA, CHOMBA)),
  ACETATO(List.of(SACO, CAMPERA, PANTALON, POLLERA)),
  LONA(List.of(ZAPATILLAS)),
  CUERO(List.of(CAMPERA, ZAPATOS, POLLERA, PANTALON));
  private final List<TipoDePrenda> tipoDePrendasValidas;


  Material(List<TipoDePrenda> tipoDePrendasValidas) {
    this.tipoDePrendasValidas = tipoDePrendasValidas;
  }

  public List<TipoDePrenda> getTipoDePrendasValidas() {
    return tipoDePrendasValidas;
  }
}
