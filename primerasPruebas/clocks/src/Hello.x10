/**
 * The canonical "Hello, World" demo class expressed in X10
 */
public class Hello {

    /**
     * The main method for the Hello class
     */
    
    static def avansar(carro:Long,v:Double){
        val total:Long=100;
        //val r=new Rail[Double](total);
        var distancia:Double=0;
        while (distancia<5){
            distancia+=v;
            Console.OUT.println("carro  "+carro+" d= "+distancia);
            Clock.advanceAll();
        }
        return ;
    }
    static def decir(s:String) {
        Console.OUT.println(s);
    }
    public static def main(Rail[String]) {
        val c1=Clock.make();
        finish{
            async avansar(1,0.5);
            async avansar(2,0.6);
            async avansar(3,0.7);
        }
        //async clocked(c1){
        //    decir("A-1");
        //    Clock.advanceAll();
        //    decir("A-2");
        //    Clock.advanceAll();
        //    decir("A-3");
        //}
        //async clocked(c1){
        //    decir("B-1");
        //    Clock.advanceAll();
        //    decir("B-2");
        //    Clock.advanceAll();
        //    decir("B-3");
        //}
    }

}