
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
    
    

    
    
    //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static void imprimir__0$1x10$lang$Long$2(final x10.array.Array_3<x10.core.Long> A, final char Letra) {
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.Array_3 p$15130 = ((x10.array.Array_3)(A));
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long k$15131min$15132 = 0L;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long k$15131max$15133 = ((x10.array.Array_3<x10.core.Long>)p$15130).numElems_3;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long j$15148min$15149 = 0L;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long j$15148max$15150 = ((x10.array.Array_3<x10.core.Long>)p$15130).numElems_2;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long i$15165min$15166 = 0L;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long i$15165max$15167 = ((x10.array.Array_3<x10.core.Long>)p$15130).numElems_1;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        long i$15246 = i$15165min$15166;
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long t$15247 = i$15246;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final boolean t$15248 = ((t$15247) < (((long)(i$15165max$15167))));
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            if (!(t$15248)) {
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                break;
            }
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long i$15243 = i$15246;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            long j$15240 = j$15148min$15149;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                final long t$15241 = j$15240;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                final boolean t$15242 = ((t$15241) < (((long)(j$15148max$15150))));
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                if (!(t$15242)) {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    break;
                }
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                final long j$15237 = j$15240;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                long k$15234 = k$15131min$15132;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final long t$15235 = k$15234;
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final boolean t$15236 = ((t$15235) < (((long)(k$15131max$15133))));
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    if (!(t$15236)) {
                        
                        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                        break;
                    }
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final long k$15231 = k$15234;
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final x10.io.Printer t$15221 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15222 = (((x10.core.Char.$box(Letra))) + ("("));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15223 = ((t$15222) + ((x10.core.Long.$box(i$15243))));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15224 = ((t$15223) + (","));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15225 = ((t$15224) + ((x10.core.Long.$box(j$15237))));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15226 = ((t$15225) + (","));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15227 = ((t$15226) + ((x10.core.Long.$box(k$15231))));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15228 = ((t$15227) + (") = "));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final long t$15229 = x10.core.Long.$unbox(((x10.array.Array_3<x10.core.Long>)A).$apply$G((long)(i$15243), (long)(j$15237), (long)(k$15231)));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final java.lang.String t$15230 = ((t$15228) + ((x10.core.Long.$box(t$15229))));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    t$15221.println(((java.lang.Object)(t$15230)));
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final long t$15232 = k$15234;
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    final long t$15233 = ((t$15232) + (((long)(1L))));
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                    k$15234 = t$15233;
                }
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                final long t$15238 = j$15240;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                final long t$15239 = ((t$15238) + (((long)(1L))));
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
                j$15240 = t$15239;
            }
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long t$15244 = i$15246;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long t$15245 = ((t$15244) + (((long)(1L))));
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            i$15246 = t$15245;
        }
    }
    
    
    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
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
    public static void main(final x10.core.Rail<java.lang.String> id$14457) {
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.core.fun.Fun_0_3 t$15209 = ((x10.core.fun.Fun_0_3)(new Hello.$Closure$9()));
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.Array_3 A = ((x10.array.Array_3)(new x10.array.Array_3<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG).x10$array$Array_3$$init$S(((long)(3L)), ((long)(4L)), ((long)(5L)), ((x10.core.fun.Fun_0_3)(t$15209)), (x10.array.Array_3.__3$1x10$lang$Long$3x10$lang$Long$3x10$lang$Long$3x10$array$Array_3$$T$2) null)));
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.Array_3 B = ((x10.array.Array_3)(new x10.array.Array_3<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG).x10$array$Array_3$$init$S(((long)(3L)), ((long)(4L)), ((long)(5L)))));
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(A)), (char)('A'));
        
        //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
        
        //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.io.Printer t$15210 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long t$15211 = ((x10.array.Array_3<x10.core.Long>)A).rank$O();
        
        //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        t$15210.println(x10.core.Long.$box(t$15211));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.io.Printer t$15212 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long t$15213 = ((x10.array.Array<x10.core.Long>)A).size;
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        t$15212.println(x10.core.Long.$box(t$15213));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.io.Printer t$15214 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.DenseIterationSpace_3 t$15215 = ((x10.array.DenseIterationSpace_3)(((x10.array.Array_3<x10.core.Long>)A).indices()));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        t$15214.println(((java.lang.Object)(t$15215)));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.Array src$15058 = ((x10.array.Array)(A));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final x10.array.Array dst$15059 = ((x10.array.Array)(B));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long t$15216 = ((x10.array.Array<x10.core.Long>)src$15058).size;
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final long t$15217 = ((x10.array.Array<x10.core.Long>)dst$15059).size;
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final boolean t$15218 = ((long) t$15216) == ((long) t$15217);
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        final boolean t$15220 = !(t$15218);
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        if (t$15220) {
            
            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final x10.lang.FailedDynamicCheckException t$15219 = ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(src$15058.size == dst$15059.size)")))));
            
            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            throw t$15219;
        }
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        x10.array.Array.<x10.core.Long> copy__0$1x10$array$Array$$T$2__1$1x10$array$Array$$T$2(x10.rtt.Types.LONG, ((x10.array.Array)(src$15058)), ((x10.array.Array)(dst$15059)));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        ((x10.array.Array<x10.core.Long>)B).clear();
        
        //#line 46 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        x10.array.Array.<x10.core.Long> copy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.LONG, ((x10.array.Array)(A)), (long)(0L), ((x10.array.Array)(B)), (long)(30L), (long)(25L));
        
        //#line 50 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
        
        //#line 51 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        ((x10.array.Array<x10.core.Long>)B).fill__0x10$array$Array$$T(x10.core.Long.$box(7L));
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        x10.array.Array.<x10.core.Long> swap__0$1x10$array$Array$$T$2__1$1x10$array$Array$$T$2(x10.rtt.Types.LONG, ((x10.array.Array)(A)), ((x10.array.Array)(B)));
        
        //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(A)), (char)('A'));
        
        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.array.Array_3)(B)), (char)('B'));
    }
    
    
    //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            
            
            //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$9 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$9> $RTT = 
            x10.rtt.StaticFunType.<$Closure$9> make($Closure$9.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$9 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$9.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$9 $_obj = new Hello.$Closure$9((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$9(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2), x10.core.Long.$unbox(a3)));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply$O(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2), x10.core.Long.$unbox(a3));
            
        }
        
        
    
        
        public long $apply$O(final long i, final long j, final long k) {
            
            //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long t$15207 = ((i) + (((long)(j))));
            
            //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            final long t$15208 = ((t$15207) + (((long)(k))));
            
            //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/arrayPrueba/src/Hello.x10"
            return t$15208;
        }
        
        public $Closure$9() {
             {
                
            }
        }
        
    }
    
}

