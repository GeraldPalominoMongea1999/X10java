/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.io.File;
public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def main(Rail[String]) {
        val datos = new Rail[Double](10,(i:Long)=>i as Double);
        Console.OUT.println(datos);
        val salida = new File("c:\\hola\\resultados.txt");//Escritura en un archivo
        val escribir = salida.printer();
        escribir.println("Datos experimentales: ");
        for (var j:Long=0; j<datos.size;j++) {
            escribir.println(datos(j)*2);
        }
        escribir.flush(); 
        Console.OUT.println("Grabacion terminada");//Lectura desde un archivo
        val entrada = new File("c:\\hola\\resultados.txt");
        var i:Long=0;
        val lines = entrada.lines();
        lines.next();//Para no tomar en cuenta el titulo "Datos experimentales:"
        while(lines.hasNext()) {
            datos(i)=Double.parse(lines.next());
            i++;
        }
        Console.OUT.println(datos);
        Console.OUT.println("Lectura terminada");
    }
}