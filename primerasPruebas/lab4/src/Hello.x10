/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.util.StringUtil;
import x10.io.File;
public class Hello {
    static def ordenar(Lista:Rail[String]){
        for(var i:Long=2; i<=Lista.size;i++){
            for(var j:Long=0;j<=(Lista.size)-i;j++){
                if(Lista(j)>Lista(j+1)){
                    var temp:String=Lista(j);
                    Lista(j)=Lista(j+1);
                    Lista(j+1)=temp;
                }
            }
        }
    }
    static def imprimir(Lista:Rail[String]){
        for(x in Lista)
            Console.OUT.println(x);
        Console.OUT.println();
        //en vez de imprimir, escriba en el archivo
    }
    public static def main(args: Rail[String]) {
        val Lista1 = new Rail[String](8);
        val Lista2 = new Rail[String](8);
        val Lista1Ord = new Rail[String](8);
        val Lista2Ord = new Rail[String](8);
        val entrada1 = new File("C:\\Users\\GERALD\\Desktop\\Lista1.txt");
        var i:Long=0;
        val lines1 = entrada1.lines();
        while(lines1.hasNext()) {
            Lista1(i)=lines1.next();
            i++;
        }
        val entrada2 = new File("C:\\Users\\GERALD\\Desktop\\Lista2.txt");
        i=0;
        val lines2 = entrada2.lines();
        while(lines2.hasNext()) {
            Lista2(i)=lines2.next();
            i++;
        }
        finish{                   
            async ordenar(Lista1);  
            async ordenar(Lista2);
        }
        imprimir(Lista1);  
        imprimir(Lista2);
        Console.OUT.print("Fin del programa");
    }

}