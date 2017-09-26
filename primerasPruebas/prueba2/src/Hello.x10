/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.util.StringUtil;
import x10.io.File;
public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def imprimir(datos:Rail[String], paralelo:Long ){
        //if (paralelo==1)
        async for (var i:Long=0;i<8*(paralelo);i++){
            Console.OUT.println(datos(i));
        }
        //else
            for (var i:Long=0;i<8*(1-paralelo);i++){
                Console.OUT.println(datos(i));
            }
    }
    public static def ordenar(datos:Rail[String],indice:Rail[Long]):Rail[Long]{
        var largo:Long=indice.size/2;
        val v=new Rail[Long](largo);
        if (largo>1){
        	val indice1=new Rail[Long](largo,(i:Long)=>i);
        	val indice2=new Rail[Long](indice.size-largo,(i:Long)=>i+indice.size);
        	//var indice2:Rail[Long](indice.size-indice.size/2,(i:Long)=>i+indice.size/2);
        	val id1=ordenar(datos,indice1);
        	val id2=ordenar(datos,indice2);
        	
        }else{
            if (datos(indice(1))>datos(indice(2))){
                var temp:Long=v(1);
                v(1)=v(2);
                v(2)=temp;
            }
        }
        
        return v; 
     
    }
    public static def leer(lista:File):Rail[String]{
        val linea=lista.lines();
        val datos=new Rail[String](8);
        for (var i:Long=0;i<8;i++){
            datos(i)=linea.next();
        }
        return datos;
    }
    
    public static def main(Rail[String]) {
        //var c=new miClase();
       // MiClase.cuantasMonas();
        var palabra1:String="453";
        var numero:Double=777;
        Console.OUT.println(" pasado a numero "+StringUtil.parseLong(palabra1));
        Console.OUT.println("pasando a entero "+Double.parse(palabra1));
        Console.OUT.println(" pasado a numero "+palabra1.charAt(0n));
        
        val texto=new File("C:\\Users\\GERALD\\Desktop\\holo.txt");
        //var linea=texto.lines();
        val escribir=texto.printer();
        escribir.println(palabra1);
        escribir.flush();
        val lista1=new File("C:\\Users\\GERALD\\Desktop\\lista1.txt");
        val datos1=leer(lista1);
        imprimir(datos1,0);
        
        val lista2=new File("C:\\Users\\GERALD\\Desktop\\lista2.txt");
        val datos2=leer(lista2);
        imprimir(datos2,0);
        Console.OUT.println(" pasado a numero ffd"+(7-7/2) );
        
        finish {
             //imprimir(datos1,1);
             //imprimir(datos2,1);
            async for (var i:Long=0 ;i<10;i++,i++)
            	Console.OUT.println(" pasado a numero bb ffd"+i );
            async for (var j:Long=1 ;j<10;j++,j++)
                Console.OUT.println(" pasado a numero aa ffd"+j );
        }
        
    }
    
}