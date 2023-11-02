package com.heroesyvillanos;

import java.util.Map;

public class Personaje extends Competidor {
	private String nombre;
	private String nombreFantasia;
	private Map<Caracteristica, Integer> caracteristicas;
	
	Personaje(String nombre, String nombreFantasia, Map<Caracteristica, Integer> caracteristicas, TipoCompetidor tipo) throws IllegalArgumentException{
		if(!esNombreValido(nombre)) {
			throw new IllegalArgumentException("Nombre invalido");
		}

		if(!esNombreValido(nombreFantasia)) {
			throw new IllegalArgumentException("Nombre fantasia invalido");
		}

		if(caracteristicas.size() < Caracteristica.values().length) {
			throw new IllegalArgumentException("Faltan valores para alguna/s caracteristica");
		}

		this.tipoCompetidor = tipo;
		this.nombre = nombre;
		this.nombreFantasia = nombreFantasia;
		this.caracteristicas = caracteristicas;
		estaDentroDeLiga = false;
	}
	
	// Getters y Setters -> nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Getters y Setters -> nombreFantasia
	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}
	
	@Override
	public int getPromedioCaracteristica(Caracteristica c) {
		return caracteristicas.get(c);
	}
	
	@Override
	protected int getSumaCaracteristica(Caracteristica c) {
		return caracteristicas.get(c);
	}
	
	@Override
	protected int getCantidadCompetidores() {
		return 1;
	}
	
	@Override
	public String toString() {
		return nombre + ", " + nombreFantasia;
	}

	public Map<Caracteristica, Integer> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Map<Caracteristica, Integer> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public TipoCompetidor isTipoCompetidor() {
		return tipoCompetidor;
	}

	public void setTipoCompetidor(TipoCompetidor tipoCompetidor) {
		this.tipoCompetidor = tipoCompetidor;
	}
	
	public String toFileLine() {
		String str = "";
		
		if(this.tipoCompetidor == TipoCompetidor.HEROE) {
			str = "Heroe";
		}else {
			str = "Villano";
		}
		//Velocidad, Fuerza, Resistencia, Destreza
		return str + ", " + this.nombre +", "+ this.nombreFantasia+", "+this.caracteristicas.get(Caracteristica.VELOCIDAD)+", "+this.caracteristicas.get(Caracteristica.FUERZA)+", "+this.caracteristicas.get(Caracteristica.RESISTENCIA)+", "+this.caracteristicas.get(Caracteristica.DESTREZA);
	}
}
