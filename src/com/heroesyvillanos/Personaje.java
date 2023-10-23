package com.heroesyvillanos;

import java.util.Map;

public class Personaje implements Competidor {
	private String nombre;
	private String nombreFantasia;
	private Map<Caracteristica, Integer> caracteristicas;
	private boolean tipoCompetidor; //true para heroe, false para villano, esto se deberia cambiar por otra variable.

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	public Map<Caracteristica, Integer> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Map<Caracteristica, Integer> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public boolean isTipoCompetidor() {
		return tipoCompetidor;
	}

	public void setTipoCompetidor(boolean tipoCompetidor) {
		this.tipoCompetidor = tipoCompetidor;
	}

	@Override
	public int getPromedioCaracteristica(Caracteristica c) {
		// Obtiene valor promedio
		return 0;
	}

	@Override
	public boolean esGanador(Competidor competidor, Caracteristica c) {
		// Determina si el personaje es ganador contra otro competidor basandose en una caracteristica especifica. 
		// Ojo que si da empate se usa la caracteristica que sigue.		
		return false;
	}
}
