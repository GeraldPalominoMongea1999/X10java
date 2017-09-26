/**
 * The canonical "Hello, World" demo class expressed in X10
 */


import x10.array.*;
public class Hello {

    /**
     * The main method for the Hello class
     */
    
    static def imprimir(A:Array_3[Long],Letra:Char){
        for([i,j,k] in A.indices())
            Console.OUT.println(Letra+"("+i+","+j+","+k+") = "+A(i,j,k));
    }
    public static def main(Rail[String]) {
        /*
        val A=new Array_2[Long](5,10,(i:Long,j:Long)=>i*j);
        Console.OUT.println("Primera forma de imprimir");
        for(var i:Long=0;i<A.numElems_1;i++)
            for(var j:Long=0;j<A.numElems_2;j++)
                Console.OUT.println("A("+i+","+j+") = "+A(i,j));      
        Console.OUT.println("Segunda forma de imprimir");
        for(var i:Long=0;i<A.numElems_1;i++){
            for(var j:Long=0;j<A.numElems_2;j++)
                Console.OUT.printf( "%3d", A(i,j));    
            Console.OUT.println();    
        }
        for([i,j] in A.indices())
            Console.OUT.println("A("+i+","+j+") = "+A(i,j));
        Console.OUT.println("Tercera forma de imprimir");
        for(v in A)
            Console.OUT.println(v);
    	*/
        val A=new Array_3[Long](3,4,5,(i:Long,j:Long,k:Long)=>i+j+k);
        val B=new Array_3[Long](3,4,5);
        imprimir(A,'A');
        imprimir(B,'B');
        Console.OUT.println(A.rank());//La dimensión 3
        Console.OUT.println(A.size);//Cantidad de elementos 60
        Console.OUT.println(A.indices());//Los indices [0..2,0..3,0..4]
        Array.copy(A,B);//Copia A en B
        imprimir(B,'B');
        B.clear();//Todos los elementos de B son cero
        imprimir(B,'B');
        Array.copy(A,0,B,30,25);//Copia 25 elementos desde el indice 0 de A
        //en B a partir del índice 30 de B.
        //Si hay algún tipo de conflicto escriba x10.array.Array.copy(A,B)
        imprimir(B,'B');
        B.fill(7);//Todos los elementos de B son 7
        imprimir(B,'B');
        Array.swap(A,B);//Intercambia A y B
        //Si hay algún tipo de conflicto escriba x10.array.Array.swap(A,B)
        imprimir(A,'A');
        imprimir(B,'B');
     }
}