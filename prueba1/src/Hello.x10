/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.io.Console;
import x10.util.Random;
public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def lol(){
        for (var i:Long=0;i<10;i++)
        	Console.OUT.println("lolis");
    }
   
    public static def main(Rail[String]) {
        var s:Long=0;
        //finish{
        //    async for(var i:Long=1;i<=1000000;i+=2)
        //        atomic s=s+i;
        //    async for(var i:Long=2;i<=1000000;i+=2)
        //        atomic s=s+i;
        //}
        //Console.OUT.println("La suma es: "+s);
        val r=new Random();
        val R=new Rail[Long](100,(i:Long)=>r.nextLong(700));
        //for (x in R)
        //    Console.OUT.println(x);
        lol();
        val c= new miClase();
        //c.cuantasMonas();
        //c.masMonas();
        //c.cuantasMonas();
    }
    
}
class miClase{
    //public var monas:Long=0;
    //public var chinas:Long=10;
    //public def masMonas(){
    //    monas++; 
    //    return 0;
    //}
    //public def cuantasMonas(){
    //    Console.OUT.println("numero de moenas chinas"+monas);
    //    return 0;
    //}
    def this(){
    }
}
