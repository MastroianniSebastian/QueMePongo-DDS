package ar.edu.utn.frba.dds;

import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServicioClimatico{
  @Override
  public Integer obtenerTemperaturaActualEnLaCiudad(String ciudad) {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    condicionesClimaticas.get(0).get("PrecipitationProbability");

    return (Integer) condicionesClimaticas.get(0).get("Temperature");  }
}
