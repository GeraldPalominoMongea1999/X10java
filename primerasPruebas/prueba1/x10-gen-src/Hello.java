
@x10.runtime.impl.java.X10Generated
public class Hello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Hello> $RTT = 
        x10.rtt.NamedType.<Hello> make("Hello",
                                       Hello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static void lol() {
        
        //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        long i = 0L;
        
        //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final long t$8954 = i;
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final boolean t$8958 = ((t$8954) < (((long)(10L))));
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            if (!(t$8958)) {
                
                //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
                break;
            }
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final x10.io.Printer t$8961 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            t$8961.println(((java.lang.Object)("lolis")));
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final long t$8962 = i;
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final long t$8963 = ((t$8962) + (((long)(1L))));
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            i = t$8963;
        }
    }
    
    
    //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Hello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> id$8910) {
        
        //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        long s = 0L;
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        final x10.util.Random r = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$8960 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$16(r)));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        final x10.core.Rail R = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(100L)), ((x10.core.fun.Fun_0_1)(t$8960)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        Hello.lol();
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        final miClase c = ((miClase)(new miClase((java.lang.System[]) null).miClase$$init$S()));
    }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$16 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$16> $RTT = 
            x10.rtt.StaticFunType.<$Closure$16> make($Closure$16.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$16 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$16.class + " calling"); } 
            $_obj.r = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$16 $_obj = new Hello.$Closure$16((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.r);
            
        }
        
        // constructor just for allocation
        public $Closure$16(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            final long t$8959 = this.r.nextLong$O((long)(700L));
            
            //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            return t$8959;
        }
        
        public x10.util.Random r;
        
        public $Closure$16(final x10.util.Random r) {
             {
                this.r = ((x10.util.Random)(r));
            }
        }
        
    }
    
}


