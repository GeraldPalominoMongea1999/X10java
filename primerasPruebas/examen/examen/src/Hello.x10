/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.lang.Char;
import x10.lang.Int;
import x10.io.File;
//import x10.util.StringUtil;
import x10.lang.String;
public class Hello {

    /**
     * The main method for the Hello class
     */
	public static def asccii(c:Char):Long{
		if(c=='a'){
			return 1;
		}
		if(c=='b'){
			return asccii("a".charAt(Int.operator_as(0)))+1;
		}
		if(c=='c'){
			return asccii("b".charAt(Int.operator_as(0)))+1;
		}
		if(c=='d'){
			return asccii("c".charAt(Int.operator_as(0)))+1;
		}
		if(c=='e'){
			return asccii("d".charAt(Int.operator_as(0)))+1;
		}
		if(c=='f'){
			return asccii("e".charAt(Int.operator_as(0)))+1;
		}
		if(c=='g'){
			return asccii("f".charAt(Int.operator_as(0)))+1;
		}
		if(c=='h'){
			return asccii("g".charAt(Int.operator_as(0)))+1;
		}
		if(c=='i'){
			return asccii("h".charAt(Int.operator_as(0)))+1;
		}
		if(c=='j'){
			return asccii("i".charAt(Int.operator_as(0)))+1;
		}
		if(c=='k'){
			return asccii("j".charAt(Int.operator_as(0)))+1;
		}
		if(c=='l'){
			return asccii("k".charAt(Int.operator_as(0)))+1;
		}
		if(c=='m'){
			return asccii("l".charAt(Int.operator_as(0)))+1;
		}
		if(c=='n'){
			return asccii("m".charAt(Int.operator_as(0)))+1;
		}
		if(c=='ñ'){
			return asccii("n".charAt(Int.operator_as(0)))+1;
		}
		
		if(c=='o'){
			return asccii("ñ".charAt(Int.operator_as(0)))+1;
		}
		if(c=='p'){
			return asccii("o".charAt(Int.operator_as(0)))+1;
		}
		if(c=='q'){
			return asccii("p".charAt(Int.operator_as(0)))+1;
		}
		if(c=='r'){
			return asccii("q".charAt(Int.operator_as(0)))+1;
		}
		if(c=='s'){
			return asccii("r".charAt(Int.operator_as(0)))+1;
		}
		if(c=='t'){
			return asccii("s".charAt(Int.operator_as(0)))+1;
		}
		if(c=='v'){
			return asccii("t".charAt(Int.operator_as(0)))+1;
		}
		if(c=='w'){
			return asccii("v".charAt(Int.operator_as(0)))+1;
		}
		if(c=='x'){
			return asccii("w".charAt(Int.operator_as(0)))+1;
		}
		if(c=='y'){
			return asccii("x".charAt(Int.operator_as(0)))+1;
		}
		if(c=='z'){
			return asccii("y".charAt(Int.operator_as(0)))+1;
		}
		
		return 0;
	}
	public static def encri(c:Char):Char{
		if(c=='a'){
			return 'e';
		}
		if(c=='b'){
			return 'f';
		}
		if(c=='c'){
			return 'g';
		}
		
		if(c=='d'){
			return 'h';
		}
		if(c=='e'){
			return 'i';
		}
		
		if(c=='f'){
			return 'j';
		}
		if(c=='g'){
			return 'k';
		}
		
		if(c=='h'){
			return 'l';
		}
		if(c=='i'){
			return 'm';
		}
		if(c=='j'){
			return 'n';
		}
		
		if(c=='k'){
			return 'ñ';
		}
		if(c=='l'){
			return 'o';
		}
		if(c=='m'){
			return 'p';
		}
		
		if(c=='n'){
			return 'q';
		}
		if(c=='ñ'){
			return 'r';
		}
		if(c=='o'){
			return 's';
		}
		
		if(c=='p'){
			return 't';
		}
		if(c=='q'){
			return 'u';
		}
		if(c=='r'){
			return 'v';
		}
		
		if(c=='s'){
			return 'w';
		}
		if(c=='t'){
			return 'x';
		}
		if(c=='u'){
			return 'y';
		}
		if(c=='v'){
			return 'z';
		}
		
		if(c=='w'){
			return 'a';
		}
		if(c=='x'){
			return 'b';
		}
		if(c=='y'){
			return 'c';
		}	
		if(c=='z'){
			return 'd';
		}
		
		
		if(c=='A'){
			return 'e';
		}
		if(c=='B'){
			return 'f';
		}
		if(c=='C'){
			return 'g';
		}
		
		if(c=='D'){
			return 'h';
		}
		if(c=='E'){
			return 'i';
		}
		
		if(c=='F'){
			return 'j';
		}
		if(c=='G'){
			return 'k';
		}
		
		if(c=='H'){
			return 'l';
		}
		if(c=='I'){
			return 'm';
		}
		if(c=='J'){
			return 'n';
		}
		
		if(c=='K'){
			return 'ñ';
		}
		if(c=='L'){
			return 'o';
		}
		if(c=='M'){
			return 'p';
		}
		
		if(c=='N'){
			return 'q';
		}
		if(c=='Ñ'){
			return 'r';
		}
		if(c=='O'){
			return 's';
		}
		
		if(c=='P'){
			return 't';
		}
		if(c=='Q'){
			return 'u';
		}
		if(c=='R'){
			return 'v';
		}
		
		if(c=='S'){
			return 'w';
		}
		if(c=='T'){
			return 'x';
		}
		if(c=='U'){
			return 'y';
		}
		if(c=='V'){
			return 'z';
		}
		
		if(c=='W'){
			return 'a';
		}
		if(c=='X'){
			return 'b';
		}
		if(c=='Y'){
			return 'c';
		}	
		if(c=='Z'){
			return 'd';
		}
		
		
		if(c=='0'){
			return '5';
		}
		
		if(c=='1'){
			return '6';
		}
		
		if(c=='2'){
			return '7';
		}
		
		if(c=='3'){
			return '8';
		}
		
		if(c=='4'){
			return '9';
		}
		
		if(c=='5'){
			return '0';
		}
		
		if(c=='6'){
			return '1';
		}
		
		if(c=='7'){
			return '2';
		}
		
		if(c=='8'){
			return '3';
		}
		
		if(c=='9'){
			return '4';
		}
		
		
		
		
		
		
		return c;
	}
	public static def desencri(c:Char):Char{
		if(c=='a'){
			return 'w';
		}
		if(c=='b'){
			return 'x';
		}
		if(c=='c'){
			return 'y';
		}
		
		if(c=='d'){
			return 'z';
		}
		if(c=='e'){
			return 'a';
		}
		
		if(c=='f'){
			return 'b';
		}
		if(c=='g'){
			return 'c';
		}
		
		if(c=='h'){
			return 'd';
		}
		if(c=='i'){
			return 'e';
		}
		if(c=='j'){
			return 'f';
		}
		
		if(c=='k'){
			return 'g';
		}
		if(c=='l'){
			return 'h';
		}
		if(c=='m'){
			return 'i';
		}
		
		if(c=='n'){
			return 'j';
		}
		if(c=='ñ'){
			return 'k';
		}
		if(c=='o'){
			return 'l';
		}
		
		if(c=='p'){
			return 'm';
		}
		if(c=='q'){
			return 'n';
		}
		if(c=='r'){
			return 'ñ';
		}
		
		if(c=='s'){
			return 'o';
		}
		if(c=='t'){
			return 'p';
		}
		if(c=='u'){
			return 'q';
		}
		if(c=='v'){
			return 'r';
		}
		
		if(c=='w'){
			return 's';
		}
		if(c=='x'){
			return 't';
		}
		if(c=='y'){
			return 'u';
		}
		if(c=='z'){
			return 'v';
		}
		
		if(c=='A'){
			return 'w';
		}
		if(c=='B'){
			return 'x';
		}
		if(c=='C'){
			return 'y';
		}
		
		if(c=='D'){
			return 'z';
		}
		if(c=='E'){
			return 'a';
		}
		
		if(c=='F'){
			return 'b';
		}
		if(c=='G'){
			return 'c';
		}
		
		if(c=='H'){
			return 'd';
		}
		if(c=='I'){
			return 'e';
		}
		if(c=='J'){
			return 'f';
		}
		
		if(c=='K'){
			return 'g';
		}
		if(c=='L'){
			return 'h';
		}
		if(c=='M'){
			return 'i';
		}
		
		if(c=='N'){
			return 'j';
		}
		if(c=='Ñ'){
			return 'k';
		}
		if(c=='O'){
			return 'l';
		}
		
		if(c=='P'){
			return 'm';
		}
		if(c=='Q'){
			return 'n';
		}
		if(c=='R'){
			return 'ñ';
		}
		
		if(c=='S'){
			return 'o';
		}
		if(c=='T'){
			return 'p';
		}
		if(c=='U'){
			return 'q';
		}
		if(c=='V'){
			return 'r';
		}
		
		if(c=='W'){
			return 's';
		}
		if(c=='X'){
			return 't';
		}
		if(c=='Y'){
			return 'u';
		}
		if(c=='Z'){
			return 'v';
		}
		
		if(c=='0'){
			return '5';
		}
		
		if(c=='1'){
			return '6';
		}
		
		if(c=='2'){
			return '7';
		}
		
		if(c=='3'){
			return '8';
		}
		
		if(c=='4'){
			return '9';
		}
		
		if(c=='5'){
			return '0';
		}
		
		if(c=='6'){
			return '1';
		}
		
		if(c=='7'){
			return '2';
		}
		
		if(c=='8'){
			return '3';
		}
		
		if(c=='9'){
			return '4';
		}
		
		return c;
	}

	public static def encriptar(s:String):String{
		var pal:String="";
		
		
		for (var i:Int=Int.operator_as(0);i<s.length();i++){
			
			pal=pal+encri(s.charAt(i));
		}
		return pal;
	} 
	public static def desencriptar(s:String):String{
		var pal:String="";
		//
		for (var i:Int=Int.operator_as(0);i<s.length();i++){
			pal=pal+desencri(s.charAt(i));
			//Console.OUT.println("lol");
		}
		//Console.OUT.println("lol");
		return pal;
	}
	public static def contar (c:Char , s:String ):String{
		var cont:Long =0;
		for (var i:Int =Int.operator_as(0);i<s.length();i++){
			if(s.charAt(i)==c)
				cont++;
		}
		return (""+c+" se repite " + cont+" veces ");
	}
    public static def main(Rail[String]) {
    	//var pal:String="lol";
        //Console.OUT.printf("%s",asccii(pal.charAt(2n))+" ");
        //var j:Int;
        //j=Int.operator_as(0);
        //Console.OUT.println(desencriptar(encriptar("humanos")));
        
    	// encriptar <-------------
    	var total:Long=200;
        var total2:Long=0;
        val rast=new Rail[String](total);
        
        val arc = new File("c:\\Users\\GERALD\\Desktop\\examen\\original.txt");//Escritura en un archivo
        val lines = arc.lines();
        val rast0=new Rail[String](total);
        while(lines.hasNext()) {
        	rast0(total2)=lines.next();
        	total2++;
        }
        
        for (var j:Long=0; j<total2;j++) {
        	rast(j)=encriptar(rast0(j));
        }
        
        
        //Console.OUT.println(total2);
        
        val salida = new File("c:\\Users\\GERALD\\Desktop\\examen\\salida.txt");//Escritura en un archivo
        val escribir = salida.printer();
        
        for (var j:Long=0; j<total2;j++) {
        	escribir.println(rast(j));
        }
        escribir.flush();
        // desencriptar <---------
        var total3:Long=0;
        val lines2 = salida.lines();
        val rast3=new Rail[String](total2+1);
        val salida2 = new File("c:\\Users\\GERALD\\Desktop\\examen\\salida2.txt");//Escritura en un archivo
        val escribir2 = salida2.printer();
        
        while(lines2.hasNext()) {
        	rast3(total3)=desencriptar(lines2.next());
        	//Console.OUT.println(rast3(total3));
        	total3++;
        }
        for (var j:Long=0; j<total3;j++) {
        	//rast3=encriptar("lol");
        	//Console.OUT.println(rast3);
        	escribir2.println(rast3(j));
        }
        escribir2.flush();
        //Console.OUT.println(total3);
        
        // version paralelal <-----------------------
        
        // se a leido el orignal 
        
        val s:String="a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
        Console.OUT.println((s));
        Console.OUT.println(encriptar(s));
        
        
        val rast4=new Rail[String](total2+1);
        for (var ii:Long=0;ii<total2;ii+=8){
        	val iii:Long=ii;
        	val t:Long=total2;
        	
        	async{
        		var s1:String="abcdefghijklmnñopqrstuvwxyz";
        		var s2:String="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        		for (var jjj:Long=iii;jjj<iii+8 && jjj< t;jjj++){
        			for (var m:Int=Int.operator_as(0);m<s1.length();m++){
        				Console.OUT.println(contar(s1.charAt(m),rast0(jjj)));
        				Console.OUT.println(contar(s2.charAt(m),rast0(jjj)));
        			}
        		}
        		
        		
        	}
        	
        }
        
        
        
        
        
        
    }

}