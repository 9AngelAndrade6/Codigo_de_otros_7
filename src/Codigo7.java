import java.util.HashMap;
import java.util.Scanner;
//se agrega el import del scanner y del Hashmap

public class Codigo7 {
	// Se agrega el main
	public static void main(String[] arg) {
		//Se cambia el nombre del scanner por sc
		// se agrega el input del Scanner
		Scanner sc= new Scanner(System.in);
// se corrige el nombre de ca por capitales ademas de modificar el tipo de Dato por String en el HashMap
	    HashMap<String, String> capitales = new HashMap<>();
	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //Se agrega la capital de El Salvador
	    capitales.put("El Salvador","San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   // Se agrega la letra r en String
	    String c = "";
	    do {
	    	//Se corrige el Sysout
	      System.out.println("Escribe el nombre de un país y te diré su capital: ");
	      //se corrige el next
	      c = sc.next();
	      // se agrega la s a equal
	      if (!c.equals("salir")) {
	    	  //se corrige ca por capitales en multiples ubicaciones
	        if (capitales.containsValue(c)) {
	        	//se corrige el sysout
	          System.out.println("La capital de " + c);
	          System.out.println(" es " + capitales.get(capitales));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = sc.nextLine();
	          capitales.get(c);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));
	  }
	
	}