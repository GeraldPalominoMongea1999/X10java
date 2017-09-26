package lab4;

public class sumatoriaRara {
    var c1:Long=1;
    var c2:Long=1;
    val total:Long=3000;
    public static def sumaSinParalelisar():Double{
        var r:Double=0;
        var q:Double=0;
        var p:Double=1;
        for (var i:Long=1;i<=300;i++){
            p=1;
            q=0;
            for (var j:Long=1;j<=i-1;j++){
                q=0;
                
                for (var k:Long=1;k<=j;k++){
                    q=q+(k/((j+1.0)*(j+1.0)));
                    //entra=0;
                }
                p=p*(q);
                //Console.OUT.println("q="+q);
            }
            //notece que iniciamos p=1
            //para poder hacer la productoria 
            // pero si no entra al segundo for (j)
            // entonces p debe ser igual a 0
            if (q==0.0)
                p=0;
            r=r+p;
            //Console.OUT.println("p="+p);
            //Console.OUT.println("r="+r);
        }
        return r;
    }//async la maquina sola crea hilos 
    public static def sumaParalelisar2():Double{// version reducdda del algoritmo 
        var r:Double=0;
        var q:Double=0;
        var p:Double=1;
        var m:Double=0;
        var j:Long=0;
        //en version anterior  
        // para i: 2
        //      j: 1
        //      k: 1
        // en este punto p llega a valer 1/(1+1)^2
        // para i: 3
        //      j: 1 | 2
        //      k: 1 | 1
       //              2
       // en este punto p llega a valer primero(j=1): 1/(1+1)^2
       //                               segundo(j=2): 1/(1+1)^2*(1/(2+1)^2)
       // al hacer esto se repte muchas veces la misma tarea(calcular:1/(1+1)^2 )
       // esto se repite durante todo el proceso 
       // para evitar eso solo guardamos p y nos dshacemos de un for 
       // se obtine el mosmo resultado
        for (var i:Long=2;i<=3000;i++){
            q=0;
            finish{
            	async for (var k:Double=1;k<=i-1;k++){
                	q=q+(k/((i)*(i)));
            	}
            }
            p=p*(q);
            r=r+p;
            //Console.OUT.println("r="+r);
        }
        return r;
    }
    public static def sumaParalelisar3(ini:Long, fin:Long):Double{// version reducdda del algoritmo 
        var r:Double=0;
        var q:Double=0;
        var p:Double=1;
        var m:Double=0;
        for (var i:Long=ini;i<=fin;i++){
            p=1;
            q=0;
            for (var j:Long=1;j<=i-1;j++){
                q=0;
                
                for (var k:Long=1;k<=j;k++){
                    q=q+(k/((j+1.0)*(j+1.0)));
                    //entra=0;
                }
                p=p*(q);
                //Console.OUT.println("q="+q);
            }
            //notece que iniciamos p=1
            //para poder hacer la productoria 
            // pero si no entra al segundo for (j)
            // entonces p debe ser igual a 0
            if (q==0.0)
                p=0;
            r=r+p;
            //Console.OUT.println("p="+p);
            //Console.OUT.println("r="+r);
        }
        return r;
    }
    //suma(1)=1;
    
    //finish {async  {for (var k:Long=2;k<total;k++){
    //    suma(k)=suma(k-1)+k;
    //    //entra=0;
    //}}}
    
    
    
    
    
    
    public static def sumaParalelisar4():Double{// version reducdda del algoritmo 
        var r:Double=0;
        var q:Double=0;
        var p:Double=1;
        var total:Long=30;
        // prmiero calculamos los productos y los guarmos en un Rail 
        val productos =new Rail[Double](total,1);
        val suma =new Rail[Double](total,0);
        val s=new Rail[Double](total,(i:Long)=>i*1.0);
        //de la primera  sumatoria el factor (j+1)^2 puede salir  
        // lo que queda es una sumatroia desde 1 hasta j 
        // guardamos cada uno de esos en un vector 
        
        var k1:Long=1;
        var k2:Long=1;
        var j1:Long=1;
        var i1:Long=0;
        var contador :Long=1;
        
        finish {
            async { for (k1=1;k1<total;k1++){
                   k2=k1;
                   finish async{ for (j1=k2;j1<total;j1++){
            	     	suma(j1)+=k1*1.0;
            	     	//Console.OUT.println("q="+suma(j1));
            	   }
            	}
        }}}
        //Console.OUT.println("s="+suma);
        // luego le multiplicamos por su respectivo (j+1)^2 
        finish {async  {for (var j:Long=1;j<=total-1;j++){
            suma(j)=suma(j)/((j+1.0)*(j+1.0));
        }}}  
        //calculamos todos los productos en paralelo y los guardamos en un vector
        // luego lo sumamos
        var m:Long=0;
        
        finish async for (var j:Long=1;j<total-1;j++){
            m=j;
           for (var k:Long=m;k<total;k++){
               k1=k;
               productos(k1)*= suma(m);
                //entra=0;
            }
            r+=productos(j);
            //Console.OUT.println("q="+q);
        }
        return r;
    }    

    public static def sumaParalelisar5():Double{// version reducdda del algoritmo 
        var r:Double=0;
        var q:Double=0;
        var p:Double=1;
        var total:Long=30;
        // prmiero calculamos los productos y los guarmos en un Rail 
        val productos =new Rail[Double](total,1);
        val suma =new Rail[Double](total,0);
        val s=new Rail[Double](total,(i:Long)=>i*1.0);
        
        
        //de la primera  sumatoria el factor (j+1)^2 puede salir  
        // lo que queda es una sumatroia desde 1 hasta j 
        // guardamos cada uno de esos en un vector 
        
        var k1:Long=1;
        var k2:Long=1;
        var j1:Long=1;
        var i1:Long=0;
        var contador :Long=1;
        
        var j2:Long=1;
        finish {
            for (k1=1;k1<total;k1++){
                
                async{
                    atomic  k2=k1;
                    for (j1=k2;j1<total;j1++){
                    
                    async{ 
                        atomic j2=j1;
                        suma(j2)+=k2*1.0;
                    
                    //Console.OUT.println("q="+suma(j1));
                    }
                }
            }}}

        
        //Console.OUT.println("s="+suma);
        // luego le multiplicamos por su respectivo (j+1)^2 
        finish {async  {for (var j:Long=1;j<=total-1;j++){
            suma(j)=suma(j)/((j+1.0)*(j+1.0));
        }}}  
        //calculamos todos los productos en paralelo y los guardamos en un vector
        // luego lo sumamos
        var m:Long=0;
        
        finish async for (var j:Long=1;j<total-1;j++){
            m=j;
            for (var k:Long=m;k<total;k++){
                k1=k;
                productos(k1)*= suma(m);
                //entra=0;
            }
            r+=productos(j);
            //Console.OUT.println("q="+q);
        }
        return r;
    }
    
    public static def lolero(lol:Rail[Long],i2:Long):Long{
        //atomic lol(i)=1;
        //if(lol(i)==1){
        //Console.OUT.println("respuesta paralelisando1 "+ lol(1));
        //for (var mm:Long=1;mm<10000000; mm++){
        //}
        //Console.OUT.println("respuesta paralelisando2 "+ lol(2));
        //}
        return i2;
    }

    
    
    public static def main(args: Rail[String]) {
        // TODO auto-generated stub
        Console.OUT.println("respuesta sin paralelisar "+sumaSinParalelisar());
        var r1:Double=0;
        var r2:Double=0;
        var total:Long=30;
        //finish{
        //    async {r1=sumaParalelisar3(2,150);}
        //    async {r2=sumaParalelisar3(150,300);}    
        //    }
        //Console.OUT.println("respuesta paralelisando "+sumaParalelisar5());
        var i:Long=0;
        //var s:Long=0;
        val lol=new Rail[Long](10,(i:Long)=>i);
        var tt:Long=0;
        val tetera=new Rail[Double](10,0);
        finish {
            for (i=0;i<10; i++){
                val i1:Long=i;
                async{ 	 
                    Console.OUT.println("i1 "+i1);
                		 tetera(i1)+=lolero(lol,i1);
                		 
                }
         }
        }
        Console.OUT.println("suma "+tetera);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}