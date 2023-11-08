package com.heroesyvillanos;

public abstract class Competidor implements Comparable<Competidor> {
	protected TipoCompetidor tipoCompetidor;
	protected boolean estaDentroDeLiga;
	private static Ordenamiento orden = new Ordenamiento(); //convertir en singleton? Esta bien que cada competidor tenga un orden?
	
	abstract protected int getPromedioCaracteristica(Caracteristica c);
	abstract protected int getSumaCaracteristica(Caracteristica c);
	abstract protected int getCantidadCompetidores();
	
	protected boolean esNombreValido(String name) {
		if(name.length() == 0) return false;
		
		return true;
	}  
	
	protected void setEstaDentroDeLiga(boolean b) {
		estaDentroDeLiga = b;
	}
	
	protected boolean puedeEntrarEnLiga() {
		return !estaDentroDeLiga;
	}
	
	protected TipoCompetidor getTipoCompetidor() {
		return tipoCompetidor;
	}
	
	protected int compareToCompetidor(Competidor comp_1, Competidor comp_2, Caracteristica c) {
		return comp_1.getPromedioCaracteristica(c) - comp_2.getPromedioCaracteristica(c);
	}
	
	public int esGanador(Competidor competidor, Caracteristica c) throws Exception {
		if(this.tipoCompetidor == competidor.tipoCompetidor) {
			throw new Exception("No se pueden enfrentar competidores del mismo tipo");
		}
		
		int pos = c.ordinal();
		int len = Caracteristica.values().length;
		Caracteristica carac_values[] = Caracteristica.values();
		int result = 0;
		int carac_vistas = 0;
		
		// Comparacion con todas las caracteristicas en forma de lista circular
		while(result == 0 && carac_vistas < len) { 
			result = compareToCompetidor(this, competidor, carac_values[pos]);
			carac_vistas++;
			pos++;
			if(pos >= len) pos = 0;
		}
		
		return result;
	}
	
	public int compareTo(Competidor c) {
		int resultado = 0;
		
		for (Caracteristica caracteristicaDeComparacion : orden.ordenCaracteristicas) {
			resultado =
				this.getPromedioCaracteristica(caracteristicaDeComparacion) -
				c.getPromedioCaracteristica(caracteristicaDeComparacion);
			if (resultado != 0) {
				break;
			}
		}
		return resultado;
	}
}
