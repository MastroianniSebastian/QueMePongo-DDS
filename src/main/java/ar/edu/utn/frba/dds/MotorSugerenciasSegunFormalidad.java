package ar.edu.utn.frba.dds;

import java.util.List;
import java.util.stream.Collectors;

public class MotorSugerenciasSegunFormalidad implements MotorSugerencias {

  public List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getEdad() > 55 ? usuario.getPrendas().stream()
        .filter(p -> !p.esInformal())
        .collect(Collectors.toList()) : usuario.getPrendas();
  }
}
