package tpdamian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Partido {

	public static void main(String[] args) {
		BufferedReader Partido = null;
		BufferedReader Pronostico = null;
		ArrayList <String> guardarDatos= new ArrayList<String>();
		ArrayList <String> guardarPronostico= new ArrayList<String>();
		// creamos un contador para los condicionales del final
		int contador = 0;
		
		System.out.println("Grupo 2 - Integrantes: Damian Marquez - Sandra Gomez Heredia" );
		//creamos objeto de Equipo para cada equipo participante
		
		equipo equipo1 = new equipo("1 "," Argentina "," Seleccionado Nacional ");
		equipo equipo2 = new equipo("2 "," Arabia Saudita "," Seleccionado Arabe ");
		equipo equipo3 = new equipo("3 "," Polonia"," Seleccionado Polines ");
		equipo equipo4 = new equipo("4 "," Mexico "," Seleccionado Mexican ");
		
		//comenzamos a imprimir las categorias y la presentacion con los datos de los equipos
		
		System.out.println("----------BIENVENIDO AL PRONOSTICO DEPORTIVO---------");
		System.out.println();
		System.out.println("LOS EQUIPOS INTERVINIENTES SON: "); 
		System.out.println(equipo1.getId() + "-->" + equipo1.getEquipo() + equipo1.getDescripcion());
		System.out.println(equipo2.getId() + "-->"  + equipo2.getEquipo() + equipo2.getDescripcion());
		System.out.println(equipo3.getId() + "-->"  + equipo3.getEquipo() + equipo3.getDescripcion());
		System.out.println(equipo4.getId() + "-->"  + equipo4.getEquipo() + equipo4.getDescripcion());
		
		System.out.println();System.out.println();System.out.println("pronostico de -------");
		System.out.println();System.out.println();
		
		//intentamos abrir los archivos 
		
		try {
			//abrir el csv en buffer modo de lectura
			Partido = new BufferedReader(new FileReader("Partidos.csv"));
			Pronostico = new BufferedReader(new FileReader("Pronostico.csv"));
			//leer la linea del archivo
			String lineaActual = Partido.readLine();
			String lineaPronostico = Pronostico.readLine();
			
			
			//comenzamos a leer y guardar los datos del archivo PARTIDOS
			
			//si no esta vacio seguimos leyendo el archivo
			while(lineaActual != null) {
				
				//separamos cada linea por ;
				String arrayPartidos[] = lineaActual.split(";");
				
				//iteramos los valores para guardarlos en el array que corresponda
				
				for(int i=0; i<arrayPartidos.length; i++) {
					guardarDatos.add(arrayPartidos[i]);	
				}
				
				//volvemos a nombrar a lineaActual para que el while no haga bucle.
				lineaActual = Partido.readLine();
				
				
			}
			
			//comenzamos a leer y guardar los datos del archivo PRONOSTICO
			
			//si no esta vacio seguimos leyendo el archivo 
			while(lineaPronostico != null) {
				
				//separamos cada linea  por ;
				
				String arrayPronostico[] = lineaPronostico.split(";");
		
				//iteramos los valores para guardarlos en el array que corresponda
				
				for(int i=0; i<arrayPronostico.length; i++) {
					guardarPronostico.add(arrayPronostico[i]);	
				}
				
				lineaPronostico = Pronostico.readLine();	
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}finally {
			//cerramos el buffer de lectura 
			if(Partido !=null) {
				try {
					Partido.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println();
		//prueba de imprimir por pantalla los resultados de los archivos .get(posicion en el archivo csv)
		
		// guardamos los datos de cada valor del archivo csv en una variable y lo convertimos en integer 
		// ya que guardarDatos.get() es un String 
		
		int valor1 = Integer.parseInt(guardarDatos.get(5));
		int valor2 = Integer.parseInt(guardarDatos.get(6));
		int valor3 = Integer.parseInt(guardarDatos.get(9));
		int valor4 = Integer.parseInt(guardarDatos.get(10));
		
		//empezamos con los condicionales para detectar si ha acertado en los resultados
		// comenzamos los condicionales del primer partido
		
		if (valor1 < valor2  && guardarPronostico.get(7) =="" && guardarPronostico.get(6) ==""  ) {
			
			contador = contador +1;
			System.out.println("------- ha ganado un punto ya que " + equipo2.getEquipo() + 
					" le ha ganado a " + equipo1.getEquipo() );
			
		}else if(valor1 > valor2  && guardarPronostico.get(7) =="" && guardarPronostico.get(8) ==""  ){
		
			contador = contador +1;
			System.out.println("------- ha ganado un punto ya que " + equipo1.getEquipo() + 
					" le ha ganado a " + equipo2.getEquipo() );
			
		}else if (valor1 == valor2  && guardarPronostico.get(6) =="" && guardarPronostico.get(8) ==""  ) {
			
			contador = contador +1;
			System.out.println("------- ha ganado un punto ya que " + equipo1.getEquipo() + 
					" ha empatado con " + equipo2.getEquipo() );
			
		}else {
			contador = contador+0;
		}
		
		
		// comenzamos los condicionales del segundo partido
		
		if (valor3 < valor4  && guardarPronostico.get(11) =="" && guardarPronostico.get(12) ==""  ) {
			
			contador = contador +1;
			System.out.println("El participante ------- ha ganado esta apuesta ya que " + equipo4.getEquipo() + 
					" le ha ganado a " + equipo3.getEquipo() );
			
		}else if (valor3 > valor4  && guardarPronostico.get(12) =="" && guardarPronostico.get(13) ==""  ) {
			
			contador = contador +1;
			System.out.println("El participante ------- ha ganado esta apuesta ya que " + equipo3.getEquipo() + 
					" le ha ganado a " + equipo4.getEquipo() );
			
		}else if (valor3 == valor4  && guardarPronostico.get(11) =="" && guardarPronostico.get(13) ==""  ) {
			
			contador = contador +1;
			System.out.println("Sandra ha ganado esta apuesta ya que " + equipo4.getEquipo() + 
					" han empatado con " + equipo3.getEquipo() );
			
		}else {
			contador = contador+0;
		}
		
		System.out.println();
		System.out.println("Felicitaciones ------- llevas un total de : " + contador + " puntos acumulados");
		System.out.println("                --Fin del programa--");
		

	}
}
