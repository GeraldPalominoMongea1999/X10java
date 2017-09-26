package ppp;


@x10.runtime.impl.java.X10Generated
public class p1 extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<p1> $RTT = 
        x10.rtt.NamedType.<p1> make("ppp.p1",
                                    p1.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ppp.p1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + p1.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ppp.p1 $_obj = new ppp.p1((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public p1(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
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
            p1.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> argv) {
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.util.Random r = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.io.Printer t$22597 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        t$22597.println(((java.lang.Object)("Los elementos del Rail son inicializados a numero aleatorio")));
        
        //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.io.Printer t$22598 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        t$22598.print(((java.lang.String)("r1= ")));
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.io.Printer t$22599 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        t$22599.println(((java.lang.Object)("Borrando los elementos 6,7,8")));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.io.Printer t$22600 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        t$22600.println(((java.lang.Object)("Borrrando todos los elementos")));
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        final x10.io.Printer t$22601 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        t$22601.println(((java.lang.Object)("Completando todo el rail con 7")));
    }
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
    final public ppp.p1 ppp$p1$$this$ppp$p1() {
        
        //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
        return ppp.p1.this;
    }
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
    // creation method for java code (1-phase java constructor)
    public p1() {
        this((java.lang.System[]) null);
        ppp$p1$$init$S();
    }
    
    // constructor for non-virtual call
    final public ppp.p1 ppp$p1$$init$S() {
         {
            
            //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
            
            
            //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
            this.__fieldInitializers_ppp_p1();
        }
        return this;
    }
    
    
    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/ppp/src/ppp/p1.x10"
    final public void __fieldInitializers_ppp_p1() {
        
    }
}

