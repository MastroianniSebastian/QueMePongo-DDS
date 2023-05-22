package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  List<Prenda> prendas = new ArrayList<>();
  Integer edad;
  MotorSugerencias motorSugerencias;

  public Usuario(Integer edad, MotorSugerencias motor) {
    this.edad = edad;
    this.motorSugerencias = motor;
  }

  List<Sugerencia> generarSugerencias(String ciudad) {
    return this.motorSugerencias.generarSugerencias(this, ciudad);
  }

  public void setMotor(MotorSugerencias motor) {
    this.motorSugerencias = motor;
  }

  public MotorSugerencias getMotor() {
    return this.motorSugerencias;
  }

  public Integer getEdad() {
    return edad;
  }

  public List<Prenda> getPrendas() {
    return List.copyOf(prendas);
  }
}
