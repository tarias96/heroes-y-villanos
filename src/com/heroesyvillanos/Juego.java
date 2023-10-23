package com.heroesyvillanos;

import java.util.List;
import java.util.Scanner;

public class Juego {
	private List<Personaje> personajes;
	private List<Liga> ligas;
	private Ordenamiento ordenamiento;
    private Scanner scanner = new Scanner(System.in);
    
    public void mostrarMenu() {
        boolean continuar = true;

        while(continuar) {
            System.out.println("");
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Administración de Personajes");
            System.out.println("2. Administración de Ligas");
            System.out.println("3. Realización de combates");
            System.out.println("4. Reportes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    menuPersonajes();
                    break;
                case 2:
                    menuLigas();
                    break;
                case 3:
                    menuCombates();
                    break;
                case 4:
                    menuReportes();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
 // ========== INICIO MENU PERSONAJES ==========
    
    private void menuPersonajes() {
        boolean seguir = true;

        while (seguir) {
            System.out.println("");
            System.out.println("===== Administración de Personajes =====");
            System.out.println("1. Carga desde archivo");
            System.out.println("2. Creación");
            System.out.println("3. Listado");
            System.out.println("4. Guardar en archivo todos los personajes");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    cargarPersonajesDesdeArchivo();
                    break;
                case 2:
                    crearPersonaje();
                    break;
                case 3:
                    listarPersonajes();
                    break;
                case 4:
                    guardarPersonajesEnArchivo();
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
        
	public void cargarPersonajesDesdeArchivo() {
        System.out.println("");
		System.out.println("Cargando personajes desde archivo...");
	}
	
	public void crearPersonaje() {
        System.out.println("");
		System.out.println("Creando personaje...");
	}
	
	public void listarPersonajes() {
        System.out.println("");
		System.out.println("Listando personajes...");
	}
	
	public void guardarPersonajesEnArchivo() {
        System.out.println("");
		System.out.println("Guardando personajes en archivo...");
	}
	
	// ========== FIN MENU PERSONAJES ==========
	
	// ========== INICIO MENU LIGAS ==========

    private void menuLigas() {
        boolean seguir = true;

        while (seguir) {
            System.out.println("");
            System.out.println("===== Administración de Ligas =====");
            System.out.println("1. Carga desde archivo");
            System.out.println("2. Creación");
            System.out.println("3. Listado");
            System.out.println("4. Guardar en archivo todas las ligas");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    cargarLigasDesdeArchivo();
                    break;
                case 2:
                    crearLiga();
                    break;
                case 3:
                    listarLigas();
                    break;
                case 4:
                    guardarLigasEnArchivo();
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
	public void cargarLigasDesdeArchivo() {
        System.out.println("");
		System.out.println("Cargando ligas desde archivo...");
	}
	
	public void crearLiga() {
        System.out.println("");
		System.out.println("Creando liga...");
	}
	
	public void listarLigas() {
        System.out.println("");
		System.out.println("Listando ligas...");
	}
	
	public void guardarLigasEnArchivo() {
        System.out.println("");
		System.out.println("Guardando ligas en archivo...");
	}
	
	// ========== FIN MENU LIGAS ==========
	
	// ========== INICIO MENU COMBATES ==========

    private void menuCombates() {
        boolean seguir = true;

        while (seguir) {
            System.out.println("");
            System.out.println("===== Realización de Combates =====");
            System.out.println("1. Personaje contra Liga");
            System.out.println("2. Liga contra Liga");
            System.out.println("3. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                	// Personaje contra liga
                	realizarCombate();
                    break;
                case 2:
                	// Liga contra liga
                	realizarCombate();
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
	public void realizarCombate() {
		// Toma dos competidores y una caracteristica
        System.out.println("");
		System.out.println("Realizando combate...");
	}
    
	// ========== FIN MENU COMBATES ==========

	// ========== INICIO MENU REPORTES ==========

    private void menuReportes() {
        boolean seguir = true;

        while (seguir) {
            System.out.println("");
            System.out.println("===== Reportes =====");
            System.out.println("1. Personajes o ligas que vencen a un personaje dado");
            System.out.println("2. Listado ordenado de personajes por características");
            System.out.println("3. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    obtenerVencedoresContra();
                    break;
                case 2:
                    // TO DO: seleccionar las características por las que quieres ordenar
                    List<Caracteristica> criterios = seleccionarCriteriosOrdenamiento();
                    listadoOrdenadoPorCaracteristica(criterios);
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
	public void obtenerVencedoresContra() {
        System.out.println("");
		// Toma un competidor y una caracteristica, obtiene lista de competidores que vencerian a un competidor basandose en una caracteristica
		System.out.println("Obtiene listado de personajes o ligas que vencen a un personaje dado");
	}
	
	private List<Caracteristica> seleccionarCriteriosOrdenamiento() {
        System.out.println("");
		System.out.println("Obtiene listado ordenado de personajes por caracteristicas...");
		return null;
	}
	
	public void listadoOrdenadoPorCaracteristica(List<Caracteristica> criterios) {
		// Devuelve lista de personajes ordenada por las caracteristicas especificadas.
	}
	
	// ========== INICIO MENU REPORTES ==========
}
