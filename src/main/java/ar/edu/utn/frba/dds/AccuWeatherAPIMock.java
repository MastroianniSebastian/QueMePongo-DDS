package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeatherAPIMock {

  public List<Map<String,Object>> getWeather(String city){
    Map<String,Object> variablesClimaticasBuenosAires = new HashMap<>();
    variablesClimaticasBuenosAires.put("PrecipitationProbability",0);
    variablesClimaticasBuenosAires.put("Temperature",15);
    variablesClimaticasBuenosAires.put("Wetness",90);
    List<Map<String,Object>> listadoDeCiudades = new ArrayList<>();
    return listadoDeCiudades;
  }
}
