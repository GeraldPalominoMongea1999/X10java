@x10.runtime.impl.java.X10Generated
public class miClase extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<miClase> $RTT = 
        x10.rtt.NamedType.<miClase> make("miClase",
                                         miClase.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(miClase $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + miClase.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        miClase $_obj = new miClase((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public miClase(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public miClase() {
        this((java.lang.System[]) null);
        miClase$$init$S();
    }
    
    // constructor for non-virtual call
    final public miClase miClase$$init$S() {
         {
            
            //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            
            
            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
            this.__fieldInitializers_miClase();
        }
        return this;
    }
    
    
    
    //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    final public miClase miClase$$this$miClase() {
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
        return miClase.this;
    }
    
    
    //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/prueba1/src/Hello.x10"
    final public void __fieldInitializers_miClase() {
        
    }
}

