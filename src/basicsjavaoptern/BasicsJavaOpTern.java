
package basicsjavaoptern;

/**
 * @author trm = tomas rodriguez-mata
 * Ejercicios básicos java, resueltos con operadores ternarios
 */
public class BasicsJavaOpTern {
    /**
     * Función que califica como fiesta de éxito o no, dependiendo
     * cuantas bellotas haya(40 - 60) y si es fin de semana
     * @param numBellotas
     * @param finDeSemana
     * @return 
     */
    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        return (finDeSemana || numBellotas >= 40)?true:false;
    }
    /**
     * Dependiendo de tu velocidad y de si es tu cumpleaños,
     * tu multa puede ser de 0. 1. 2.
     * @param velocidad
     * @param birthday
     * @return 
     */
    public int multa(int velocidad, boolean birthday){
        // si es tu cumple, le resta 5 a la velocidad
        if (birthday){
            velocidad -= 5;
        }
        return velocidad >= 81 ? 2 : velocidad > 60 && velocidad <= 80 ? 1:0;
    }
    
    /**
     * Si numero es multiplo de 11, o si es una de mas de un multiplo,
     * devuelve true
     * @param n
     * @return 
     */
    public boolean muyVanidoso(int n){
        return (n % 11) == 0 || ((n % 11) == 1) ? true : false;
    }
    
    /**
     * Funcion que evalua true si debe coger el movildependiendo quien sea,
     * y si es por la mañana o no.
     * @param matinal
     * @param madre
     * @param dormido
     * @return 
     */
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        return matinal && !madre ? false : dormido ? false : true;
    }
    
    /**
     * Devuelve true, si la diferencia entre alguno de los 
     * enteros, es exactamente 10
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean menorPor10(int a, int b, int c){
        return a + 10 == b || b + 10 == a ? true : b + 10 == c || c + 10 == b ? true : c + 10 == a || a + 10 == c ? true : false;
    }
    
    /**
     * Devuelve true, si alguno de las cifras de los numeros recibidos,
     * de dos cifras, es igual que el del otro numero
     * @param a
     * @param b
     * @return 
     */
    public boolean digitoIgual(int a, int b){
        return a / 10 == b / 10 || a / 10 == b % 10 ? true : a % 10 == b / 10 || a % 10 == b % 10 ? true : b / 10 == a / 10 || b / 10 == a % 10 ? true : b % 10 == a / 10 || b % 10 == a % 10 ? true : false;
    }
    
    /**
     * Devuelve true si el numero es multiplo de 3 y de 5,
     * pero NO de los dos a la vez
     * @param a
     * @return 
     */
    public boolean multiploMultiple(int a){
        return a % 3 == 0 && a % 5 == 0 ? false : a % 3 == 0 || a % 5 == 0 ? true : false;
    }
    
    /**
     * Devuelve true, si el numero es 1 o 2 menos que un multiplo de 20
     * @param a
     * @return 
     */
    public boolean menos20(int a){
        return (a % 20) - 2 >= 2 ? true : false;
    }
    
    /**
     * Si son todos de valor 2, devuelve 10
     * Si son iguales, pero dif de 2, devuelve 5
     * Si no devuelve 0
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int loteria(int a, int b, int c){
      return a == 2 && b == 2 && c == 2 ? 10 : a == b && b == c ? 5 : 0;
    }
    
    /**
     * Devuelve el valor sumado de la tirada de los 2 dados
     * Si noDoubles es true, y las dos tiradas tienen el mismo valor,
     * devuelve la suma de los dados + 1.
     * @param dado1
     * @param dado2
     * @param noDoubles
     * @return 
     */
    public int withoutDoubles(int dado1, int dado2, boolean noDoubles){
        return dado1 == dado2 && noDoubles ? dado1 + dado2 + 1 : dado1 + dado2;
    }


    /**         MAIN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase (Ejercicios basicosJava)
        BasicsJavaOpTern ejercicio = new BasicsJavaOpTern();
        
        // Salida por terminal del EJERCICIO 01
        System.out.println("EJERCICIO 01 - FIESTA DE ARDILLAS");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        // Salida por terminal del EJERCICIO 02
        System.out.println("EJERCICIO 02 - MULTA");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));   
        
        // Salida por terminal del EJERCICIO 03
        System.out.println("EJERCICIO 03 - MUY VANIDOSO");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
        // Salida por terminal del EJERCICIO 04
        System.out.println("EJERCICIO 04 - CONTESTA AL MOVIL");
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, false));
        
        // Salida por terminal del EJERCICIO 05
        System.out.println("EJERCICIO 05 - DIFERENCIA DE 10");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        
        // Salida por terminal del EJERCICIO 06
        System.out.println("EJERCICIO 06 - DIGITO IGUAL");
        System.out.println(ejercicio.digitoIgual(12, 23));
        System.out.println(ejercicio.digitoIgual(12, 43));
        System.out.println(ejercicio.digitoIgual(12, 44));
        
        // Salida por terminal del EJERCICIO 07
        System.out.println("EJERCICIO 07 - MULTIPLO MULTIPLE");
        System.out.println(ejercicio.multiploMultiple(3));
        System.out.println(ejercicio.multiploMultiple(10));
        System.out.println(ejercicio.multiploMultiple(15));
        
        // Salida por terminal del EJERCICIO 08
        System.out.println("EJERCICIO 08 - MENOS 20");
        System.out.println(ejercicio.menos20(18));
        System.out.println(ejercicio.menos20(19));
        System.out.println(ejercicio.menos20(20));
        
        // Salida por terminal del EJERCICIO 09   
        System.out.println("EJERCICIO 09 - LOTERIA");
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(2, 2, 1));
        System.out.println(ejercicio.loteria(0, 0, 0));
        
        // Salida por terminal del EJERCICIO 10
        System.out.println("EJERCICIO 10 - SUMA DADOS");
        System.out.println(ejercicio.withoutDoubles(2, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, false));
        System.out.println(ejercicio.withoutDoubles(6, 6, true));
    }
    
}
