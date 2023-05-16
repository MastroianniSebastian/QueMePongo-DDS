package ar.edu.utn.frba.dds;

public class ProveedorDeMotor {
  static MotorSugerencias motor;

  static MotorSugerencias getMotor(){
    return motor;
  }

  static void setMotor(MotorSugerencias motor){
    ProveedorDeMotor.motor = motor;
  }
}
