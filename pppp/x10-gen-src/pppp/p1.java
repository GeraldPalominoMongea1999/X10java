package pppp;

@x10.runtime.impl.java.X10Generated
public class p1 extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<p1> $RTT = 
        x10.rtt.NamedType.<p1> make("pppp.p1",
                                    p1.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(pppp.p1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + p1.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        pppp.p1 $_obj = new pppp.p1((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public p1(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
    final public pppp.p1 pppp$p1$$this$pppp$p1() {
        
        //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
        return pppp.p1.this;
    }
    
    
    //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
    // creation method for java code (1-phase java constructor)
    public p1() {
        this((java.lang.System[]) null);
        pppp$p1$$init$S();
    }
    
    // constructor for non-virtual call
    final public pppp.p1 pppp$p1$$init$S() {
         {
            
            //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
            
            
            //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
            this.__fieldInitializers_pppp_p1();
        }
        return this;
    }
    
    
    
    //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/pppp/src/pppp/p1.x10"
    final public void __fieldInitializers_pppp_p1() {
        
    }
}

