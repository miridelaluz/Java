
import java.util.Scanner;

/*
 *Mi clase en Java
 */

/**
 *Fundamentos - Java
 * @miridelaluz
 */
public class HolaMundo {
    public static void main (String args[]){
        System.out.println("Hola Mundo JAVA");
        
        //Se reutilizó esta clase para la explicación de variables
        
        //Definimos variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
        
        // var - Inferencia de Tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "hasta luego.";
        System.out.println(miVariableCadena2);
        
        //Concatenación de cadenas
        System.out.println(miVariableCadena + ", " + miVariableCadena2);
        
        //valores permitidos en el nombre de la variables 
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3; 
        // var áVariable = 10; No se recomienda utilizar 
        // var #miVariable = 2; No se permite utilizar caracteres especiales.
        
        // ----- CARACTERES ESPECIALES CON JAVA -----
        
        var nombre = "Karla";
        
        System.out.println("Nueva línea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        // ----- CLASE SCANNER -----
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        
        
    }
}
