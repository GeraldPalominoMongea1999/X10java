/**
 * The canonical "Hello, World" demo class expressed in X10
 */
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
    
    

    
    
    //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static void avansar(final long carro, final double v) {
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        final long total = 100L;
        
        //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        double distancia = ((double)(long)(((long)(0L))));
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        while (true) {
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final double t$94080 = distancia;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final double t$94081 = ((double)(long)(((long)(5L))));
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final boolean t$94089 = ((t$94080) < (((double)(t$94081))));
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            if (!(t$94089)) {
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                break;
            }
            
            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final double t$94091 = distancia;
            
            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final double t$94092 = ((t$94091) + (((double)(v))));
            
            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            distancia = t$94092;
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final x10.io.Printer t$94093 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final java.lang.String t$94094 = (("carro  ") + ((x10.core.Long.$box(carro))));
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final java.lang.String t$94095 = ((t$94094) + (" d= "));
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final double t$94096 = distancia;
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final java.lang.String t$94097 = ((t$94095) + ((x10.core.Double.$box(t$94096))));
            
            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            t$94093.println(((java.lang.Object)(t$94097)));
            
            //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            x10.lang.Clock.advanceAll();
        }
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        return;
    }
    
    
    //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
    public static void decir(final java.lang.String s) {
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        final x10.io.Printer t$94090 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        t$94090.println(((java.lang.Object)(s)));
    }
    
    
    //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
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
    public static void main(final x10.core.Rail<java.lang.String> id$93924) {
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        final x10.lang.Clock c1 = x10.lang.Clock.make();
        {
            
            //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            final x10.xrx.FinishState fs$94107 = x10.xrx.Runtime.startFinish();
            
            //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            try {{
                {
                    
                    //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$593())));
                    
                    //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$594())));
                    
                    //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$595())));
                }
            }}catch (java.lang.Throwable ct$94104) {
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$94104)));
                
                //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$94107)));
             }}
            }
        }
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            
            
            //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$593 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$593> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$593> make($Closure$593.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$593 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$593.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$593 $_obj = new Hello.$Closure$593((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$593(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            try {{
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                Hello.avansar((long)(1L), (double)(0.5));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public $Closure$593() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$594 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$594> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$594> make($Closure$594.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$594 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$594.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$594 $_obj = new Hello.$Closure$594((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$594(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            try {{
                
                //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                Hello.avansar((long)(2L), (double)(0.6));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public $Closure$594() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$595 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$595> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$595> make($Closure$595.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$595 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$595.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$595 $_obj = new Hello.$Closure$595((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$595(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
            try {{
                
                //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                Hello.avansar((long)(3L), (double)(0.7));
            }}catch (java.lang.Error __lowerer__var__4__) {
                
                //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw __lowerer__var__4__;
            }catch (java.lang.Throwable __lowerer__var__5__) {
                
                //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/clocks/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__5__) ? (java.lang.RuntimeException)(__lowerer__var__5__) : new x10.lang.WrappedThrowable(__lowerer__var__5__);
            }
        }
        
        public $Closure$595() {
             {
                
            }
        }
        
    }
    
    }
    
    