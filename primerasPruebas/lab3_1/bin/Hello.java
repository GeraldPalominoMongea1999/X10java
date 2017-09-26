
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
    
    

    
    
    //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
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
    public static void main(final x10.core.Rail<java.lang.String> id$1805) {
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$1944 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$0()));
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.core.Rail datos = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(10L)), ((x10.core.fun.Fun_0_1)(t$1944)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.Printer t$1945 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        t$1945.println(((java.lang.Object)(datos)));
        
        //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.File salida = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("c:\\hola\\resultados.txt")))));
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.Printer escribir = salida.printer();
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        escribir.println(((java.lang.Object)("Datos experimentales: ")));
        
        //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        long j$1976 = 0L;
        {
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            final double[] datos$value$1980 = ((double[])datos.value);
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1977 = j$1976;
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1978 = ((x10.core.Rail<x10.core.Double>)datos).size;
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final boolean t$1979 = ((t$1977) < (((long)(t$1978))));
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                if (!(t$1979)) {
                    
                    //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                    break;
                }
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1965 = j$1976;
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final double t$1966 = ((double)datos$value$1980[(int)t$1965]);
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final double t$1967 = ((double)(long)(((long)(2L))));
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final double t$1968 = ((t$1966) * (((double)(t$1967))));
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                escribir.println(x10.core.Double.$box(t$1968));
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1969 = j$1976;
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1970 = ((t$1969) + (((long)(1L))));
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                j$1976 = t$1970;
            }
        }
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        escribir.flush();
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.Printer t$1956 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        t$1956.println(((java.lang.Object)("Grabacion terminada")));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.File entrada = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("c:\\hola\\resultados.txt")))));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        long i = 0L;
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.ReaderIterator lines = entrada.lines();
        
        //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        ((x10.io.ReaderIterator<java.lang.String>)lines).next$G();
        {
            
            //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            final double[] datos$value$1981 = ((double[])datos.value);
            
            //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            while (true) {
                
                //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final boolean t$1962 = ((x10.io.ReaderIterator<java.lang.String>)lines).hasNext$O();
                
                //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                if (!(t$1962)) {
                    
                    //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                    break;
                }
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1971 = i;
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final java.lang.String t$1972 = ((x10.io.ReaderIterator<java.lang.String>)lines).next$G();
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final double t$1973 = java.lang.Double.parseDouble(t$1972);
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                datos$value$1981[(int)t$1971]=t$1973;
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1974 = i;
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                final long t$1975 = ((t$1974) + (((long)(1L))));
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
                i = t$1975;
            }
        }
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.Printer t$1963 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        t$1963.println(((java.lang.Object)(datos)));
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        final x10.io.Printer t$1964 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        t$1964.println(((java.lang.Object)("Lectura terminada")));
    }
    
    
    //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            
            
            //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticFunType.<$Closure$0> make($Closure$0.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$0 $_obj = new Hello.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Double.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public double $apply$D(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public double $apply$O(final long i) {
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            final double t$1943 = ((double)(long)(((long)(i))));
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3_1/src/Hello.x10"
            return t$1943;
        }
        
        public $Closure$0() {
             {
                
            }
        }
        
    }
    
}

