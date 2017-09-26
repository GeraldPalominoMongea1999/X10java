/**
 * The canonical "Hello, World" demo class expressed in X10
 */

import x10.util.StringUtil;
public class Hello {

    /**
     * The main method for the Hello class
     */
    
    public static def prueba1(){
        finish {
            async { //to be removed
                for (i in [1,2,3]) {
                    async {
                        Console.OUT.println("Hello from executing activity " + i + "!");                        
                    }
                }

                System.sleep(3000l); //wait 3s
                Console.OUT.println("Hello from loop!");

            }
            Console.OUT.println("Hello from Starter!");
        }
    }
    public static def sumarRail(r:Rail[Double],ini:Long,fin:Long):Double{
        if (ini==fin){
            //Console.OUT.println("ini="+ini);
            return r(ini);
        }else{
            if (ini>fin){
                //Console.OUT.println("i="+ini);
                return 0;
            }
            var r1:Double=0;
            var r2:Double=0;
            val centro:Long=(ini+fin)/2;
            //Console.OUT.println("ini"+ini+"centro="+centro+"fin"+fin);
            finish{
                async r1=sumarRail(r,ini,centro);
                async r2=sumarRail(r,centro+1,fin);
            }
            return r1+r2;
        }
    }
    
    public static def prueba2(){
        var l:Long=0;
        val total:Long=5;
        val l2=new Rail[Double](total,0);
        val l3=new Rail[Double](10000000,(i:Long)=>i*1.0);
        var c:Double=0;
        finish {
            for(var i:Long=1;i<total;i++){
                val i1:Long=i;
                
                async {
                    l=i1+l;
                    l2(i1)=i1;;
                    //Console.OUT.println("i1="+i1);
                    }
            }
                
        }
        Console.OUT.println("l="+l);
        Console.OUT.println("deveria ser l="+(total*(total-1)/2.0));
        Console.OUT.println("l 2 ="+l2);
        
        
        Console.OUT.println("c ="+sumarRail(l2,0,total-1));
    }
    public static def porJ(r:Rail[Double],ini:Long,fin:Long):Double{
        if (ini==fin){
            //Console.OUT.println("i="+ini);
            return 0;
        }else{
            if (ini>fin){
                //Console.OUT.println("i="+ini);
                return 0;
            }
            
            
            val p:Long=(ini+fin)/2;
            
            r(p)=r(p)*1/((1+p)*(1+p));
            finish{
                async porJ(r,ini,p);
                async porJ(r,p+1,fin);
            }
        }
        return 0;
    }
    public static def prodP(r:Rail[Double],ini:Long,fin:Long):Double{
        if (ini==fin){
            //Console.OUT.println("i="+ini);
            return r(ini);
        }else{
            if (ini>fin){
                //Console.OUT.println("i="+ini);
                return 1;
            }
            
            var r1:Double=0;
            var r2:Double=0;
            val centro:Long=(ini+fin)/2;
            //Console.OUT.println("centro="+centro);
            finish{
                async r1=prodP(r,ini,centro);
                async r2=prodP(r,centro+1,fin);
            }
            return r1*r2;
        }
    }
    
    
    
    public static def sumarTodo(r:Rail[Double],ini:Long,fin:Long):Double{
        if (ini==fin){
            //Console.OUT.println("i="+ini);
            return r(ini);
        }else{
            if (ini>fin){
                //Console.OUT.println("i="+ini);
                return 0;
            }
            
            var r1:Double=0;
            var r2:Double=0;
            val centro:Long=(ini+fin)/2;
            //Console.OUT.println("centro="+centro);
            finish{
                async r1=sumarRail(r,ini,centro);
                async r2=sumarRail(r,centro+1,fin);
            }
            return r1+r2;
        }
    }
    
    public static def prueba3(){
        var l:Long=0;
        val total:Long=3000;
        val l2=new Rail[Double](total,(i:Long)=>i*1.0);
        val l3=new Rail[Double](total,0);
        val l4=new Rail[Double](total,(i:Long)=>(i*(i+1)/2.0)/((i+1)*(1+i)));
        finish {
            for(var i:Long=0;i<total;i++){
                val i1:Long=i;
                async {
                    l3(i1)=sumarRail(l2,0,i1);
                    //Console.OUT.println("i1="+i1);
                }
            }
            
        }
        finish {
            porJ(l3,0,total);
        }
        var su:Double=0;
        var su2:Double=0;
        var su3:Double=0;
        val l5=new Rail[Double](total,0);
        finish {
            for(var i:Long=0;i<total;i++){
                val i1:Long=i;
                async {
                    l5(i1)=prodP(l3,1,i1);
                }
            }
            
        }
        finish{
           su=sumarTodo(l5,1,total-1);
        }
        
        
        //Console.OUT.println("l 3 ="+l3);
        //Console.OUT.println("l 4 ="+l4);
        Console.OUT.println("su ="+su);
       // Console.OUT.println("su2 ="+su2);
       // Console.OUT.println("su3 ="+su3);
        //var pp:Long=1/2;
        //Console.OUT.println("pp ="+pp);
    }
    public static def prueba(){
        
    }
    public static def main(Rail[String]) {
        prueba3();
    }

}