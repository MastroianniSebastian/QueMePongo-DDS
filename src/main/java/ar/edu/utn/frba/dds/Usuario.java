package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  List<Prenda> prendas = new ArrayList<>();
  Integer edad;
  MotorSugerencias motorSugerencias;

  ServicioClimatico servicioClimatico;

  public Usuario(Integer edad, MotorSugerencias motor, ServicioClimatico servicioClimatico) {
    this.edad = edad;
    this.motorSugerencias = motor;
    this.servicioClimatico = servicioClimatico;
  }

  List<Sugerencia> generarSugerencias(String ciudad) {
    return this.motorSugerencias.generarSugerencias(this, servicioClimatico.obtenerTemperaturaActualEnLaCiudad(ciudad));
  }

  public void setMotor(MotorSugerencias motor) {
    this.motorSugerencias = motor;
  }

  public MotorSugerencias getMotor() {
    return this.motorSugerencias;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public Integer getEdad() {
    return edad;
  }

  public MotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }
}
