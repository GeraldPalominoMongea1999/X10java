/**
 * The canonical "Hello, World" demo class expressed in X10
 */


import x10.io.Console;
import x10.util.Random;
public class Hello {

    static def imprimir(ra:Rail[Long]){
        for(x in ra)

            Console.OUT.print(x+"-");

        Console.OUT.println();

    }
    public static def main(argv:Rail[String]){
        val r=new Random();
        Console.OUT.println("Los elementos del Rail son inicializados a numero aleatorio");
        val r1 = new Rail[Long](10, (i:Long)=>r.nextLong(15));
        Console.OUT.print("r1= ");
        imprimir(r1);
        Console.OUT.println("Borrando los elementos 6,7,8");
        r1.clear(6, 3);
        imprimir(r1);
        Console.OUT.println("Borrrando todos los elementos");
        r1.clear();
        imprimir(r1);
        Console.OUT.println("Completando todo el rail con 7");
        r1.fill(7);
        imprimir(r1);
        var s:Long=0;
        finish{
            async for(var i:Long=1;i<=100;i+=2)

                atomic s=s+i;

            async for(var i:Long=2;i<=100;i+=2)

                atomic s=s+i;

        }
        Console.OUT.println("La suma es: "+s);
    }
}