package auxiliar;

import java.util.Random;

import modelo.Datos;
import modelo.Equipo;
import modelo.Estudiante;

public class Practicas {
	// private static String[] diasSemana = { "lunes", "martes", "miercoles",
	// "jueves", "viernes", "s�bado", "domingo" };

	// ORDENACION
	public void ordenaEnteros(int[] numeros) {
		for (int i = 0; i < numeros.length - 1; i++)
			for (int j = i + 1; j < numeros.length; j++)
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
	}

	public void ordenaCadenas(String[] cadenas) {
		for (int i = 0; i < cadenas.length - 1; i++)
			for (int j = i + 1; j < cadenas.length; j++)
				if (cadenas[i].compareTo(cadenas[j]) > 0) {
					String aux = cadenas[i];
					cadenas[i] = cadenas[j];
					cadenas[j] = aux;
				}

	}

	public void ordenaEstudiantes(Estudiante[] estudiantes) {
		for (int i = 0; i < estudiantes.length - 1; i++)
			for (int j = i + 1; j < estudiantes.length; j++)
				if (estudiantes[i].compareTo(estudiantes[j]) > 0) {
					Estudiante aux = estudiantes[i];
					estudiantes[i] = estudiantes[j];
					estudiantes[j] = aux;
				}
	}

	public float calculaSaldo(float saldoInicial, float[] movimientos) {
		float saldoFinal = saldoInicial;
		for (int i = 0; i < movimientos.length; i++)
			saldoFinal += movimientos[i];
		return saldoFinal;
	}

	public int[] convierteCadenasANumeros(String[] cadenas) {
		int[] resultado = new int[cadenas.length];
		for (int i = 0; i < resultado.length; i++) {

			try {

				resultado[i] = Integer.parseInt(cadenas[i]);
			} catch (NumberFormatException e) {

				resultado[i] = -1;
			}
		}
		return resultado;
	}

	public void muestraNumeros() {

		int x = 0;
		while (x <= 1000) {
			System.out.println("x: " + x);
			x++;
		}
	}

	public void muestraNumeros(int min, int max) {

		if (min <= max) {
			int x = min;
			while (x <= max) {
				System.out.println("x: " + x);
				x++;
			}
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void muestraNumeros2(int min, int max) {

		if (min <= max) {
			int x = min;
			do {
				System.out.println("x: " + x);
				x++;
			} while (x <= max);
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void muestraNumeros3(int min, int max) {
		int x = min;
		if (min <= max) {
			// for (int x = min; x < max; x++) {
			// for (;;) {
			while (true) {
				System.out.println("x: " + x);
				x++;
			}
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void generaAleatorios(int cuantos, int inferior, int superior) // max 30, min 10
	{

		for (int i = 0; i < cuantos; i++)
			System.out.println(inferior + (int) (Math.random() * (superior - inferior + 1)));

	}

	public void generaAleatorios2(int cuantos, int inferior, int superior) // max 30, min 10
	{

		Random rnd = new Random();
		for (int i = 0; i < cuantos; i++)
			System.out.println(inferior + rnd.nextInt(superior - inferior + 1));
	}

	public int[] generaAleatorios3(int cuantos, int inferior, int superior) // max 30, min 10
	{
		int[] resultado = new int[cuantos];
		Random rnd = new Random();
		for (int i = 0; i < cuantos; i++)
			// System.out.println(inferior + rnd.nextInt(superior - inferior + 1));
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
		return resultado;
	}

	public int[] frecuenciaAparicion(int cuantos, int inferior, int superior) {
		int[] resultado = new int[superior - inferior + 1];
		int[] lanzamientos = this.generaAleatorios3(cuantos, inferior, superior);
		for (int i = 0; i < lanzamientos.length; i++) {
			resultado[lanzamientos[i] - 1]++;
		}
		return resultado;

	}

	public void estadisticaCadena(String cadena) {
		int contadorVocales = 0;
		int contadorMayusculas = 0;
		int contadorEspeciales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E'
					|| cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U')
				contadorVocales++;
			if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z')
				contadorMayusculas++;
			int caracterAscii = cadena.charAt(i);
			if ((caracterAscii >= 0 && caracterAscii <= 47) || (caracterAscii >= 58 && caracterAscii <= 64) ||

					(caracterAscii >= 91) && (caracterAscii <= 96))

				contadorEspeciales++;
		}
		// System.out.println("Hay " + contadorVocales + " vocales en " + cadena);
		System.out.println("Hay " + contadorEspeciales + " caracteres especiales en " + cadena);

	}

	public void listaDiasSemana() {
		Datos datos = new Datos();
		// String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes",
		// "s�bado", "domingo" };
		// for (int i = 0; i < datos.getDiasSemana().length; i++)
		for (String dia : datos.getDiasSemana())
			// System.out.println(datos.getDiasSemana()[i]);
			System.out.println(dia);
	}

	public void listaEstudiantes(Estudiante[] lista) {
		for (Estudiante estudiante : lista) {
			// if (estudiante != null)
			try {
				System.out.println(estudiante.getNombre());
			} catch (NullPointerException e) {

			}
		}
	}

	public int visitantesIslaYear(int isla, int[][] v) {
		int acu = 0;
		for (int j = 0; j < v[0].length; j++)
			acu += v[isla][j];
		return acu;
	}

	public int visitantesMesYear(int mes, int[][] v) {
		int acu = 0;
		for (int i = 0; i < v.length; i++)
			acu += v[i][mes];
		return acu;
	}

	public int[] mezclaListasOrdenadas(int[] lista1, int[] lista2) {

		int i = 0;
		int j = 0;
		int[] resultado = new int[lista1.length + lista2.length];
		int k = 0;
		while (k < resultado.length) {
			if (i >= lista1.length) {
				resultado[k] = lista2[j];
				k++;
				j++;
			} else if (j >= lista2.length) {
				resultado[k] = lista1[i];
				k++;
				i++;
			} else {

				if (lista1[i] < lista2[j]) {
					resultado[k] = lista1[i];
					k++;
					i++;
				} else if (lista1[i] >= lista2[j]) {
					resultado[k] = lista2[j];
					k++;
					j++;
				}
			}
		}

		return resultado;
	}

	public int[] mezclaListasOrdenadasProfesor(int[] l1, int[] l2) {
		int i = 0, j = 0, k = 0;
		int[] resultado = new int[l1.length + l2.length];

		while (l1[i] != Integer.MAX_VALUE || l2[j] != Integer.MAX_VALUE) {
			if (l1[i] < l2[j])
				resultado[k] = l1[i++];
			else
				resultado[k] = l2[j++];
			k++;

			if (i == l1.length)
				l1[--i] = Integer.MAX_VALUE;

			if (j == l2.length)
				l2[--j] = Integer.MAX_VALUE;
		}
		return resultado;
	}

	public int[] obtenerClasificacion(String[][] goles) {
		int[] puntosEquipos = new int[goles.length];
		String[] resultadosParciales;
		for (int i = 0; i < goles.length; i++) {
			for (int j = 0; j < goles[i].length; j++) {
				if (goles[i][j].indexOf("-") != -1) {//comprobamos si el resultado no tiene goles
					resultadosParciales = goles[i][j].split("-");
					if (Integer.parseInt(resultadosParciales[0]) > Integer.parseInt(resultadosParciales[1])) {
						// Gana equipo local
						puntosEquipos[i] += 3;

					} else if (Integer.parseInt(resultadosParciales[0]) < Integer.parseInt(resultadosParciales[1])) {
						// Gana equipo visitante
						puntosEquipos[j] += 3;

					} else {
						// empatan
						puntosEquipos[i]++;
						puntosEquipos[j]++;

					}
				}

			}

		}

		return puntosEquipos;
	}

	public int[] obtenerClasificacion2(String[][] goles) {
		int[] puntosEquipos = new int[goles.length];
		String[] resultadosParciales;
		for (int j = 0; j < goles[0].length; j++) {
			for (int i = 0; i < goles.length; i++) {
				if (goles[i][j].indexOf("-") != -1) {//comprobamos si el resultado no tiene goles
					resultadosParciales = goles[i][j].split("-");
					if (Integer.parseInt(resultadosParciales[0]) > Integer.parseInt(resultadosParciales[1])) {
						// Gana equipo local
						puntosEquipos[i] += 3;

					} else if (Integer.parseInt(resultadosParciales[0]) < Integer.parseInt(resultadosParciales[1])) {
						// Gana equipo visitante
						puntosEquipos[j] += 3;

					} else {
						// empatan
						puntosEquipos[i]++;
						puntosEquipos[j]++;

					}
				}

			}

		}

		return puntosEquipos;
	}
	
	public Equipo[] obtenerClasificacion3(int [][] puntos) {
		int obtenerPuntos;
		int nuevosPuntos;
		Equipo [] clasificacion = new Datos().getListadoEquipo();
		for (int j = 0; j < puntos[0].length; j++) {
			for (int i = 0; i < puntos[j].length; i++) {
				obtenerPuntos = clasificacion[j].getPuntos();
				nuevosPuntos = obtenerPuntos + puntos[i][j];
				clasificacion[j].setPuntos(nuevosPuntos);
			}
		}
		//ordenamos de mas puntos menos puntos los equipos del array de salida
		Equipo aux;
		for (int i = 0; i < clasificacion.length - 1; i++)
			for (int j = i + 1; j < clasificacion.length; j++)
				if (clasificacion[i].getPuntos() < clasificacion[j].getPuntos()) {
					aux = clasificacion[i];
					clasificacion[i] = clasificacion[j];
					clasificacion[j] = aux;
				}
		
		
		return clasificacion;
	}
	
}
