
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
    
    

    
    
    //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
    public static void imprimir__0$1x10$lang$Long$2(final x10.core.Rail<x10.core.Long> ra) {
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.core.Rail rail$8406 = ((x10.core.Rail)(ra));
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final long size$8407 = ((x10.core.Rail<x10.core.Long>)rail$8406).size;
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        long idx$8403 = 0L;
        {
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            final long[] rail$8406$value$8883 = ((long[])rail$8406.value);
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long t$8404 = idx$8403;
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final boolean t$8405 = ((t$8404) < (((long)(size$8407))));
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                if (!(t$8405)) {
                    
                    //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    break;
                }
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long t$8399 = idx$8403;
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long x$8400 = ((long)rail$8406$value$8883[(int)t$8399]);
                
                //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final x10.io.Printer t$8397 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final java.lang.String t$8398 = (((x10.core.Long.$box(x$8400))) + ("-"));
                
                //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                t$8397.print(((java.lang.String)(t$8398)));
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long t$8401 = idx$8403;
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long t$8402 = ((t$8401) + (((long)(1L))));
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                idx$8403 = t$8402;
            }
        }
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8370 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8370.println();
    }
    
    
    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
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
    public static void main(final x10.core.Rail<java.lang.String> argv) {
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.util.Random r = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8371 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8371.println(((java.lang.Object)("Los elementos del Rail son inicializados a numero aleatorio")));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$8373 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$13(r)));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.core.Rail r1 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(10L)), ((x10.core.fun.Fun_0_1)(t$8373)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8374 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8374.print(((java.lang.String)("r1= ")));
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.core.Rail)(r1)));
        
        //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8375 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8375.println(((java.lang.Object)("Borrando los elementos 6,7,8")));
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        ((x10.core.Rail<x10.core.Long>)r1).clear((long)(6L), (long)(3L));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.core.Rail)(r1)));
        
        //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8376 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8376.println(((java.lang.Object)("Borrrando todos los elementos")));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        ((x10.core.Rail<x10.core.Long>)r1).clear();
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.core.Rail)(r1)));
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8377 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8377.println(((java.lang.Object)("Completando todo el rail con 7")));
        
        //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        ((x10.core.Rail<x10.core.Long>)r1).fill__0x10$lang$Rail$$T(x10.core.Long.$box(7L));
        
        //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$Long$2(((x10.core.Rail)(r1)));
        
        //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        long s = 0L;
        {
            
            //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            final x10.xrx.FinishState fs$8880 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                final long[] $s$8882 = new long[1];
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                $s$8882[(int)0]=s;
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                try {{
                    {
                        
                        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$14($s$8882))));
                        
                        //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$15($s$8882))));
                    }
                }}catch (java.lang.Throwable ct$8422) {
                    
                    //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$8422)));
                    
                    //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$8880)));
                 }}
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                s = ((long)$s$8882[(int)0]);
                }
            }
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final x10.io.Printer t$8395 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final long t$8394 = s;
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        final java.lang.String t$8396 = (("La suma es: ") + ((x10.core.Long.$box(t$8394))));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        t$8395.println(((java.lang.Object)(t$8396)));
        }
    
    
    //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            
            
            //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$13 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$13> $RTT = 
            x10.rtt.StaticFunType.<$Closure$13> make($Closure$13.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$13 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$13.class + " calling"); } 
            $_obj.r = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$13 $_obj = new Hello.$Closure$13((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.r);
            
        }
        
        // constructor just for allocation
        public $Closure$13(final java.lang.System[] $dummy) {
            
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
            
            //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            final long t$8372 = this.r.nextLong$O((long)(15L));
            
            //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            return t$8372;
        }
        
        public x10.util.Random r;
        
        public $Closure$13(final x10.util.Random r) {
             {
                this.r = ((x10.util.Random)(r));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$14 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$14> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$14> make($Closure$14.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$14 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$14.class + " calling"); } 
            $_obj.$s$8882 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$14 $_obj = new Hello.$Closure$14((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$s$8882);
            
        }
        
        // constructor just for allocation
        public $Closure$14(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            try {{
                
                //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                long i = 1L;
                
                //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8379 = i;
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final boolean t$8385 = ((t$8379) <= (((long)(100L))));
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    if (!(t$8385)) {
                        
                        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        break;
                    }
                    
                    //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    try {{
                        
                        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        x10.xrx.Runtime.enterAtomic();
                        {
                            
                            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8408 = ((long)this.$s$8882[(int)0]);
                            
                            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8409 = i;
                            
                            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8410 = ((t$8408) + (((long)(t$8409))));
                            
                            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            this.$s$8882[(int)0]=t$8410;
                        }
                    }}finally {{
                          
                          //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                          x10.xrx.Runtime.exitAtomic();
                      }}
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8411 = i;
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8412 = ((t$8411) + (((long)(2L))));
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    i = t$8412;
                    }
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
        
        public long[] $s$8882;
        
        public $Closure$14(final long[] $s$8882) {
             {
                this.$s$8882 = $s$8882;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$15 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$15> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$15> make($Closure$15.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$15 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$15.class + " calling"); } 
            $_obj.$s$8882 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$15 $_obj = new Hello.$Closure$15((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$s$8882);
            
        }
        
        // constructor just for allocation
        public $Closure$15(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
            try {{
                
                //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                long i = 2L;
                
                //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8387 = i;
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final boolean t$8393 = ((t$8387) <= (((long)(100L))));
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    if (!(t$8393)) {
                        
                        //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        break;
                    }
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    try {{
                        
                        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                        x10.xrx.Runtime.enterAtomic();
                        {
                            
                            //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8413 = ((long)this.$s$8882[(int)0]);
                            
                            //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8414 = i;
                            
                            //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            final long t$8415 = ((t$8413) + (((long)(t$8414))));
                            
                            //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                            this.$s$8882[(int)0]=t$8415;
                        }
                    }}finally {{
                          
                          //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                          x10.xrx.Runtime.exitAtomic();
                      }}
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8416 = i;
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    final long t$8417 = ((t$8416) + (((long)(2L))));
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    i = t$8417;
                    }
                }}catch (java.lang.Error __lowerer__var__2__) {
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    throw __lowerer__var__2__;
                }catch (java.lang.Throwable __lowerer__var__3__) {
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                }
            }
        
        public long[] $s$8882;
        
        public $Closure$15(final long[] $s$8882) {
             {
                this.$s$8882 = $s$8882;
            }
        }
        
        }
        
    }
    
    