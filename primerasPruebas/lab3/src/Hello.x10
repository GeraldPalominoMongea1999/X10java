/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import x10.util.StringUtil;

public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def main(Rail[String]) {
        //Funciones de cadena y caracteres
        Console.OUT.println("Funciones de cadena y caracteres");
        var palabra1:String;
        var palabra2:String;
        var semana:String;
        var numeroS:String="456";
        var numero:Double=123;
        //Convierte String a numero Byte, Int, Long Short
        Console.OUT.println("parseLong: "+(numero+StringUtil.parseLong(numeroS)));
        Console.OUT.println("parse: "+(numero+Double.parse(numeroS))); //Forma más general
        palabra1=numero.toString();//Convierte numero a string
        Console.OUT.println("chars: "+palabra1.chars());//Convierte String a Rail de caracteres
        palabra1="Felzz Navidad";
        //Retorna el caracter en la posicion 6
        Console.OUT.println("charAT: "+palabra1.charAt(6n));
        //Retorna el caracter en la posicion 6
        Console.OUT.println("operator: "+palabra1.operator()(6n));
        val palachar=palabra1.chars();//Convierte string a Rail de caracteres
        palachar(3)='i';//Cambiamos la z por la i
        Console.OUT.println("chars: "+palachar);
        palabra1=new String(palachar);//Crea un String a partir del Rail
        Console.OUT.println(palabra1);
        Console.OUT.println("compareTo:");//Compara dos textos
        Console.OUT.println("Mayor: "+"manzana".compareTo("mandarina"));
        Console.OUT.println("Igual: "+"hola".compareTo("hola"));
        Console.OUT.println("Menor: "+"hoLa".compareTo("hola"));
        Console.OUT.println("compareToIgnoreCase:"+"hoLa".compareToIgnoreCase("hola"));
        semana="domingo lunes martEs miércoles juevEs viernes sábado";
        //Checkea si un texto esta al principio o final de un texto
        Console.OUT.println(semana);
        Console.OUT.println("startsWith: "+semana.startsWith("domi"));
        Console.OUT.println("startsWith: "+semana.startsWith("lunes"));
        Console.OUT.println("endsWith: "+semana.endsWith("sábado"));
        Console.OUT.println("endsWith: "+semana.endsWith("lunes"));
        //Retorna verdadero o falso si son o no iguales
        Console.OUT.println("equals: "+"hola".equals("Hola"));
        Console.OUT.println("equalsIgnoreCase: "+"hola".equalsIgnoreCase("Hola"));
        //Retorna el Indice de la ocurrencia de una cadena dentro de otra
        Console.OUT.println(semana);
        Console.OUT.println("indexOf y lastIndexOf");
        Console.OUT.println(semana.indexOf("Es"));
        Console.OUT.println(semana.indexOf("Es",19n));
        Console.OUT.println(semana.lastIndexOf("Es"));
        Console.OUT.println(semana.lastIndexOf("Es",34n));
        Console.OUT.println(palabra1);
        Console.OUT.println("length: "+palabra1.length());//Longitud de una cadena
        Console.OUT.println("Operadores +, <, <=, >, >= :");
        palabra2=palabra1+" y AÑO Nuevo 2016";
        Console.OUT.println(palabra2);
        Console.OUT.println("operator+: "+String.operator+(palabra2," 2017"));
        Console.OUT.println("manzana">="mandarina");
        Console.OUT.println("manZana">="mandarina");
        Console.OUT.println("manzana".operator>=("mandarina"));
        Console.OUT.println("manZana".operator>=("mandarina"));
        val cadena=palabra2.split(" ");//Divide la cadena
        Console.OUT.println("split: "+cadena);
        Console.OUT.println(palabra2);//Retorna una subcadena
        Console.OUT.println("substring: "+palabra1.substring(3n));
        Console.OUT.println("substring: "+palabra1.substring(3n,8n));
        Console.OUT.println("toLowerCase: "+palabra2.toLowerCase());//A minusculas
        Console.OUT.println("toUpperCase: "+palabra2.toUpperCase());//A mayusculas
        var texto:String=" hola como estas ";
        Console.OUT.println(texto);
        Console.OUT.println(texto.length());
        texto=texto.trim();//Elimina el espacio antes y despues de la cadena
        Console.OUT.println("trim: "+texto);
        Console.OUT.println(texto.length());
        Console.OUT.println("-------------------");
        Console.OUT.println("chr: "+Char.chr(65n));//Retorna el caracter del codigo
        Console.OUT.println("ord: "+'A'.ord());//Retorna el codigo del carácter
        //Almacena en un rail los codigos de cada caracter del string
        val railbit=texto.bytes();
        Console.OUT.println("bytes: "+railbit);
        var letra:Char='z';
        var digito:Char='7';
        var espacio:Char=' ';//Verdadero o Falso si es digito o letra o espacio
        Console.OUT.println("IsDigit: "+letra.isDigit());
        Console.OUT.println("isLetter: "+letra.isLetter());
        Console.OUT.println("isLetterOrDigit: "+espacio.isLetterOrDigit());
        Console.OUT.println("isSpaceChar: "+espacio.isSpaceChar());
        //Verdadero o Falso si es minuscula o mayuscula
        Console.OUT.println("isLowerCase: "+letra.isLowerCase());
        Console.OUT.println("isUpperCase: "+letra.isUpperCase());
        Console.OUT.println("Operadores +, -, <, <=, >, >= :");
        Console.OUT.println("Operador -: "+(letra-1n));
        Console.OUT.println("Operador +: "+(letra+1n));
        Console.OUT.println("Operador -: "+Char.operator-(letra,1n));
        Console.OUT.println("Operador +: "+Char.operator+(letra,1n));
    }

}