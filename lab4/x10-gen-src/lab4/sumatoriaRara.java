package lab4;

@x10.runtime.impl.java.X10Generated
public class sumatoriaRara extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<sumatoriaRara> $RTT = 
        x10.rtt.NamedType.<sumatoriaRara> make("lab4.sumatoriaRara",
                                               sumatoriaRara.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + sumatoriaRara.class + " calling"); } 
        $_obj.c1 = $deserializer.readLong();
        $_obj.c2 = $deserializer.readLong();
        $_obj.total = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        lab4.sumatoriaRara $_obj = new lab4.sumatoriaRara((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.c1);
        $serializer.write(this.c2);
        $serializer.write(this.total);
        
    }
    
    // constructor just for allocation
    public sumatoriaRara(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public long c1;
    
    //#line 5 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public long c2;
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public long total;
    
    
    //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public static double sumaSinParalelisar$O() {
        
        //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double r = ((double)(long)(((long)(0L))));
        
        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double q = ((double)(long)(((long)(0L))));
        
        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double p = ((double)(long)(((long)(1L))));
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long i$370021 = 1L;
        
        //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        for (;
             true;
             ) {
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370022 = i$370021;
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final boolean t$370023 = ((t$370022) <= (((long)(300L))));
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            if (!(t$370023)) {
                
                //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                break;
            }
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370011 = ((double)(long)(((long)(1L))));
            
            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            p = t$370011;
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370012 = ((double)(long)(((long)(0L))));
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            q = t$370012;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long j$370006 = 1L;
            
            //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            for (;
                 true;
                 ) {
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370007 = j$370006;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370008 = i$370021;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370009 = ((t$370008) - (((long)(1L))));
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final boolean t$370010 = ((t$370007) <= (((long)(t$370009))));
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                if (!(t$370010)) {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    break;
                }
                
                //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370000 = ((double)(long)(((long)(0L))));
                
                //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                q = t$370000;
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                long k$369996 = 1L;
                
                //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369997 = k$369996;
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369998 = j$370006;
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final boolean t$369999 = ((t$369997) <= (((long)(t$369998))));
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    if (!(t$369999)) {
                        
                        //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        break;
                    }
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369982 = q;
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369983 = k$369996;
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369984 = ((double)(long)(((long)(t$369983))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369985 = j$370006;
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369986 = ((double)(long)(((long)(t$369985))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369987 = ((t$369986) + (((double)(1.0))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369988 = j$370006;
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369989 = ((double)(long)(((long)(t$369988))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369990 = ((t$369989) + (((double)(1.0))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369991 = ((t$369987) * (((double)(t$369990))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369992 = ((t$369984) / (((double)(t$369991))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369993 = ((t$369982) + (((double)(t$369992))));
                    
                    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    q = t$369993;
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369994 = k$369996;
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$369995 = ((t$369994) + (((long)(1L))));
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    k$369996 = t$369995;
                }
                
                //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370001 = p;
                
                //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370002 = q;
                
                //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370003 = ((t$370001) * (((double)(t$370002))));
                
                //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                p = t$370003;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370004 = j$370006;
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370005 = ((t$370004) + (((long)(1L))));
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                j$370006 = t$370005;
            }
            
            //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370013 = q;
            
            //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final boolean t$370014 = ((double) t$370013) == ((double) 0.0);
            
            //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            if (t$370014) {
                
                //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370015 = ((double)(long)(((long)(0L))));
                
                //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                p = t$370015;
            }
            
            //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370016 = r;
            
            //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370017 = p;
            
            //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370018 = ((t$370016) + (((double)(t$370017))));
            
            //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            r = t$370018;
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370019 = i$370021;
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370020 = ((t$370019) + (((long)(1L))));
            
            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            i$370021 = t$370020;
        }
        
        //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369757 = r;
        
        //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        return t$369757;
    }
    
    
    //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public static double sumaParalelisar2$O() {
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double r = ((double)(long)(((long)(0L))));
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double q = ((double)(long)(((long)(0L))));
        
        //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double p = ((double)(long)(((long)(1L))));
        
        //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double m = ((double)(long)(((long)(0L))));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long j = 0L;
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long i$370049 = 2L;
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        for (;
             true;
             ) {
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370050 = i$370049;
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final boolean t$370051 = ((t$370050) <= (((long)(3000L))));
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            if (!(t$370051)) {
                
                //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                break;
            }
            
            //#line 58 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370034 = ((double)(long)(((long)(0L))));
            
            //#line 58 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            q = t$370034;
            {
                
                //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.xrx.FinishState fs$370208 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $i$370049$370260 = new long[1];
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $i$370049$370260[(int)0]=i$370049;
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double[] $q$370261 = new double[1];
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $q$370261[(int)0]=q;
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        {
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$965($i$370049$370260, $q$370261))));
                        }
                    }}catch (java.lang.Throwable ct$370206) {
                        
                        //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370206)));
                        
                        //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370208)));
                     }}
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    i$370049 = ((long)$i$370049$370260[(int)0]);
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    q = ((double)$q$370261[(int)0]);
                    }
                }
            
            //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370041 = p;
            
            //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370042 = q;
            
            //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370043 = ((t$370041) * (((double)(t$370042))));
            
            //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            p = t$370043;
            
            //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370044 = r;
            
            //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370045 = p;
            
            //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370046 = ((t$370044) + (((double)(t$370045))));
            
            //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            r = t$370046;
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370047 = i$370049;
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370048 = ((t$370047) + (((long)(1L))));
            
            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            i$370049 = t$370048;
            }
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369786 = r;
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        return t$369786;
        }
    
    
    //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public static double sumaParalelisar3$O(final long ini, final long fin) {
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double r = ((double)(long)(((long)(0L))));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double q = ((double)(long)(((long)(0L))));
        
        //#line 73 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double p = ((double)(long)(((long)(1L))));
        
        //#line 74 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double m = ((double)(long)(((long)(0L))));
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long i$370091 = ini;
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        for (;
             true;
             ) {
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370092 = i$370091;
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final boolean t$370093 = ((t$370092) <= (((long)(fin))));
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            if (!(t$370093)) {
                
                //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                break;
            }
            
            //#line 76 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370081 = ((double)(long)(((long)(1L))));
            
            //#line 76 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            p = t$370081;
            
            //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370082 = ((double)(long)(((long)(0L))));
            
            //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            q = t$370082;
            
            //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long j$370076 = 1L;
            
            //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            for (;
                 true;
                 ) {
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370077 = j$370076;
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370078 = i$370091;
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370079 = ((t$370078) - (((long)(1L))));
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final boolean t$370080 = ((t$370077) <= (((long)(t$370079))));
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                if (!(t$370080)) {
                    
                    //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    break;
                }
                
                //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370070 = ((double)(long)(((long)(0L))));
                
                //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                q = t$370070;
                
                //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                long k$370066 = 1L;
                
                //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370067 = k$370066;
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370068 = j$370076;
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final boolean t$370069 = ((t$370067) <= (((long)(t$370068))));
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    if (!(t$370069)) {
                        
                        //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        break;
                    }
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370052 = q;
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370053 = k$370066;
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370054 = ((double)(long)(((long)(t$370053))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370055 = j$370076;
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370056 = ((double)(long)(((long)(t$370055))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370057 = ((t$370056) + (((double)(1.0))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370058 = j$370076;
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370059 = ((double)(long)(((long)(t$370058))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370060 = ((t$370059) + (((double)(1.0))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370061 = ((t$370057) * (((double)(t$370060))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370062 = ((t$370054) / (((double)(t$370061))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$370063 = ((t$370052) + (((double)(t$370062))));
                    
                    //#line 82 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    q = t$370063;
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370064 = k$370066;
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long t$370065 = ((t$370064) + (((long)(1L))));
                    
                    //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    k$370066 = t$370065;
                }
                
                //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370071 = p;
                
                //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370072 = q;
                
                //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370073 = ((t$370071) * (((double)(t$370072))));
                
                //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                p = t$370073;
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370074 = j$370076;
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long t$370075 = ((t$370074) + (((long)(1L))));
                
                //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                j$370076 = t$370075;
            }
            
            //#line 92 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370083 = q;
            
            //#line 92 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final boolean t$370084 = ((double) t$370083) == ((double) 0.0);
            
            //#line 92 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            if (t$370084) {
                
                //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$370085 = ((double)(long)(((long)(0L))));
                
                //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                p = t$370085;
            }
            
            //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370086 = r;
            
            //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370087 = p;
            
            //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$370088 = ((t$370086) + (((double)(t$370087))));
            
            //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            r = t$370088;
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370089 = i$370091;
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$370090 = ((t$370089) + (((long)(1L))));
            
            //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            i$370091 = t$370090;
        }
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369829 = r;
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        return t$369829;
    }
    
    
    //#line 112 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
    public static double sumaParalelisar4$O() {
        
        //#line 113 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double r = ((double)(long)(((long)(0L))));
        
        //#line 114 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double q = ((double)(long)(((long)(0L))));
        
        //#line 115 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        double p = ((double)(long)(((long)(1L))));
        
        //#line 116 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long total = 30L;
        
        //#line 118 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final long t$369830 = total;
        
        //#line 118 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369831 = ((double)(long)(((long)(1L))));
        
        //#line 118 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final x10.core.Rail productos = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369830, x10.core.Double.$box(t$369831), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 119 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final long t$369832 = total;
        
        //#line 119 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369833 = ((double)(long)(((long)(0L))));
        
        //#line 119 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final x10.core.Rail suma = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369832, x10.core.Double.$box(t$369833), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final long t$369836 = total;
        
        //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final x10.core.fun.Fun_0_1 t$369837 = ((x10.core.fun.Fun_0_1)(new lab4.sumatoriaRara.$Closure$966()));
        
        //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final x10.core.Rail s = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369836, ((x10.core.fun.Fun_0_1)(t$369837)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 125 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long k1 = 1L;
        
        //#line 126 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long k2 = 1L;
        
        //#line 127 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long j1 = 1L;
        
        //#line 128 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long i1 = 0L;
        
        //#line 129 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long contador = 1L;
        {
            
            //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.xrx.FinishState fs$370220 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $k1$370266 = new long[1];
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $k1$370266[(int)0]=k1;
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $total$370267 = new long[1];
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $total$370267[(int)0]=total;
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $k2$370268 = new long[1];
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $k2$370268[(int)0]=k2;
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $j1$370269 = new long[1];
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $j1$370269[(int)0]=j1;
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                try {{
                    {
                        
                        //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$968($k1$370266, $total$370267, $k2$370268, $j1$370269, suma, (lab4.sumatoriaRara.$Closure$968.__4$1x10$lang$Double$2) null))));
                    }
                }}catch (java.lang.Throwable ct$370218) {
                    
                    //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370218)));
                    
                    //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370220)));
                 }}
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                k1 = ((long)$k1$370266[(int)0]);
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                total = ((long)$total$370267[(int)0]);
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                k2 = ((long)$k2$370268[(int)0]);
                
                //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                j1 = ((long)$j1$370269[(int)0]);
                }
            }
        {
            
            //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.xrx.FinishState fs$370226 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $total$370270 = new long[1];
                
                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $total$370270[(int)0]=total;
                
                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                try {{
                    {
                        
                        //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$969($total$370270, suma, (lab4.sumatoriaRara.$Closure$969.__1$1x10$lang$Double$2) null))));
                    }
                }}catch (java.lang.Throwable ct$370224) {
                    
                    //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370224)));
                    
                    //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370226)));
                 }}
                
                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                total = ((long)$total$370270[(int)0]);
                }
            }
        
        //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        long m = 0L;
        {
            
            //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.xrx.FinishState fs$370232 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $total$370271 = new long[1];
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $total$370271[(int)0]=total;
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $m$370272 = new long[1];
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $m$370272[(int)0]=m;
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final long[] $k1$370273 = new long[1];
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $k1$370273[(int)0]=k1;
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double[] $r$370274 = new double[1];
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                $r$370274[(int)0]=r;
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                try {{
                    {
                        
                        //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$970($total$370271, $m$370272, $k1$370273, productos, suma, $r$370274, (lab4.sumatoriaRara.$Closure$970.__3$1x10$lang$Double$2__4$1x10$lang$Double$2) null))));
                    }
                }}catch (java.lang.Throwable ct$370230) {
                    
                    //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370230)));
                    
                    //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370232)));
                 }}
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                total = ((long)$total$370271[(int)0]);
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                m = ((long)$m$370272[(int)0]);
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                k1 = ((long)$k1$370273[(int)0]);
                
                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                r = ((double)$r$370274[(int)0]);
                }
            }
        
        //#line 159 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        final double t$369896 = r;
        
        //#line 159 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        return t$369896;
        }
        
        
        //#line 162 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
        public static double sumaParalelisar5$O() {
            
            //#line 163 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            double r = ((double)(long)(((long)(0L))));
            
            //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            double q = ((double)(long)(((long)(0L))));
            
            //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            double p = ((double)(long)(((long)(1L))));
            
            //#line 166 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long total = 30L;
            
            //#line 168 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$369897 = total;
            
            //#line 168 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$369898 = ((double)(long)(((long)(1L))));
            
            //#line 168 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.core.Rail productos = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369897, x10.core.Double.$box(t$369898), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 169 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$369899 = total;
            
            //#line 169 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$369900 = ((double)(long)(((long)(0L))));
            
            //#line 169 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.core.Rail suma = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369899, x10.core.Double.$box(t$369900), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final long t$369903 = total;
            
            //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.core.fun.Fun_0_1 t$369904 = ((x10.core.fun.Fun_0_1)(new lab4.sumatoriaRara.$Closure$971()));
            
            //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final x10.core.Rail s = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, t$369903, ((x10.core.fun.Fun_0_1)(t$369904)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 177 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long k1 = 1L;
            
            //#line 178 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long k2 = 1L;
            
            //#line 179 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long j1 = 1L;
            
            //#line 180 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long i1 = 0L;
            
            //#line 181 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long contador = 1L;
            
            //#line 183 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long j2 = 1L;
            {
                
                //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.xrx.FinishState fs$370240 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $j1$370278 = new long[1];
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $j1$370278[(int)0]=j1;
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $j2$370279 = new long[1];
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $j2$370279[(int)0]=j2;
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $k2$370280 = new long[1];
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $k2$370280[(int)0]=k2;
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $k1$370281 = new long[1];
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $k1$370281[(int)0]=k1;
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $total$370282 = new long[1];
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $total$370282[(int)0]=total;
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        {
                            
                            //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            $k1$370281[(int)0]=1L;
                            
                            //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369906 = ((long)$k1$370281[(int)0]);
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369907 = ((long)$total$370282[(int)0]);
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369923 = ((t$369906) < (((long)(t$369907))));
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369923)) {
                                    
                                    //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$973($j1$370278, $j2$370279, $k2$370280, $k1$370281, $total$370282, suma, (lab4.sumatoriaRara.$Closure$973.__5$1x10$lang$Double$2) null))));
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370158 = ((long)$k1$370281[(int)0]);
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370159 = ((t$370158) + (((long)(1L))));
                                
                                //#line 185 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                $k1$370281[(int)0]=t$370159;
                            }
                        }
                    }}catch (java.lang.Throwable ct$370238) {
                        
                        //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370238)));
                        
                        //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370240)));
                     }}
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    j1 = ((long)$j1$370278[(int)0]);
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    j2 = ((long)$j2$370279[(int)0]);
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    k2 = ((long)$k2$370280[(int)0]);
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    k1 = ((long)$k1$370281[(int)0]);
                    
                    //#line 184 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    total = ((long)$total$370282[(int)0]);
                    }
                }
            {
                
                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.xrx.FinishState fs$370246 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $total$370283 = new long[1];
                    
                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $total$370283[(int)0]=total;
                    
                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        {
                            
                            //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$974($total$370283, suma, (lab4.sumatoriaRara.$Closure$974.__1$1x10$lang$Double$2) null))));
                        }
                    }}catch (java.lang.Throwable ct$370244) {
                        
                        //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370244)));
                        
                        //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370246)));
                     }}
                    
                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    total = ((long)$total$370283[(int)0]);
                    }
                }
            
            //#line 208 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            long m = 0L;
            {
                
                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.xrx.FinishState fs$370252 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $total$370284 = new long[1];
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $total$370284[(int)0]=total;
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $m$370285 = new long[1];
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $m$370285[(int)0]=m;
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final long[] $k1$370286 = new long[1];
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $k1$370286[(int)0]=k1;
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double[] $r$370287 = new double[1];
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    $r$370287[(int)0]=r;
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        {
                            
                            //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$975($total$370284, $m$370285, $k1$370286, productos, suma, $r$370287, (lab4.sumatoriaRara.$Closure$975.__3$1x10$lang$Double$2__4$1x10$lang$Double$2) null))));
                        }
                    }}catch (java.lang.Throwable ct$370250) {
                        
                        //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370250)));
                        
                        //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370252)));
                     }}
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    total = ((long)$total$370284[(int)0]);
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    m = ((long)$m$370285[(int)0]);
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    k1 = ((long)$k1$370286[(int)0]);
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    r = ((double)$r$370287[(int)0]);
                    }
                }
            
            //#line 220 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final double t$369964 = r;
            
            //#line 220 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            return t$369964;
            }
            
            
            //#line 223 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            public static long lolero__0$1x10$lang$Long$2$O(final x10.core.Rail<x10.core.Long> lol, final long i2) {
                
                //#line 231 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                return i2;
            }
            
            
            //#line 236 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
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
                    sumatoriaRara.main(args);
                }
            }
            
            // the original app-main method
            public static void main(final x10.core.Rail<java.lang.String> args) {
                
                //#line 238 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.io.Printer t$369966 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 238 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$369965 = lab4.sumatoriaRara.sumaSinParalelisar$O();
                
                //#line 238 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final java.lang.String t$369967 = (("respuesta sin paralelisar ") + ((x10.core.Double.$box(t$369965))));
                
                //#line 238 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                t$369966.println(((java.lang.Object)(t$369967)));
                
                //#line 239 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                double r1 = ((double)(long)(((long)(0L))));
                
                //#line 240 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                double r2 = ((double)(long)(((long)(0L))));
                
                //#line 241 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                long total = 30L;
                
                //#line 247 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                long i = 0L;
                
                //#line 249 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.core.fun.Fun_0_1 t$369968 = ((x10.core.fun.Fun_0_1)(new lab4.sumatoriaRara.$Closure$976()));
                
                //#line 249 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.core.Rail lol = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(10L)), ((x10.core.fun.Fun_0_1)(t$369968)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 250 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                long tt = 0L;
                
                //#line 251 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final double t$369969 = ((double)(long)(((long)(0L))));
                
                //#line 251 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.core.Rail tetera = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(10L)), x10.core.Double.$box(t$369969), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
                {
                    
                    //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    x10.xrx.Runtime.ensureNotInAtomic();
                    
                    //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final x10.xrx.FinishState fs$370258 = x10.xrx.Runtime.startFinish();
                    
                    //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        {
                            
                            //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            i = 0L;
                            
                            //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369971 = i;
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369979 = ((t$369971) < (((long)(10L))));
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369979)) {
                                    
                                    //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 254 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long i$370193 = i;
                                
                                //#line 255 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$977(i$370193, tetera, lol, (lab4.sumatoriaRara.$Closure$977.__1$1x10$lang$Double$2__2$1x10$lang$Long$2) null))));
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370202 = i;
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370203 = ((t$370202) + (((long)(1L))));
                                
                                //#line 253 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                i = t$370203;
                            }
                        }
                    }}catch (java.lang.Throwable ct$370256) {
                        
                        //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370256)));
                        
                        //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 252 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370258)));
                     }}
                    }
                
                //#line 262 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final x10.io.Printer t$369980 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 262 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                final java.lang.String t$369981 = (("suma ") + (tetera));
                
                //#line 262 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                t$369980.println(((java.lang.Object)(t$369981)));
                }
            
            
            //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final public lab4.sumatoriaRara lab4$sumatoriaRara$$this$lab4$sumatoriaRara() {
                
                //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                return lab4.sumatoriaRara.this;
            }
            
            
            //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            // creation method for java code (1-phase java constructor)
            public sumatoriaRara() {
                this((java.lang.System[]) null);
                lab4$sumatoriaRara$$init$S();
            }
            
            // constructor for non-virtual call
            final public lab4.sumatoriaRara lab4$sumatoriaRara$$init$S() {
                 {
                    
                    //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    
                    
                    //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    this.__fieldInitializers_lab4_sumatoriaRara();
                }
                return this;
            }
            
            
            
            //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
            final public void __fieldInitializers_lab4_sumatoriaRara() {
                
                //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                this.c1 = 1L;
                
                //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                this.c2 = 1L;
                
                //#line 3 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                this.total = 3000L;
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$965 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$965> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$965> make($Closure$965.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$965 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$965.class + " calling"); } 
                    $_obj.$i$370049$370260 = $deserializer.readObject();
                    $_obj.$q$370261 = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$965 $_obj = new lab4.sumatoriaRara.$Closure$965((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$i$370049$370260);
                    $serializer.write(this.$q$370261);
                    
                }
                
                // constructor just for allocation
                public $Closure$965(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        double k$370035 = ((double)(long)(((long)(1L))));
                        
                        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370036 = k$370035;
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370037 = ((long)this.$i$370049$370260[(int)0]);
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370038 = ((t$370037) - (((long)(1L))));
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370039 = ((double)(long)(((long)(t$370038))));
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final boolean t$370040 = ((t$370036) <= (((double)(t$370039))));
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            if (!(t$370040)) {
                                
                                //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                break;
                            }
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370024 = ((double)this.$q$370261[(int)0]);
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370025 = k$370035;
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370026 = ((long)this.$i$370049$370260[(int)0]);
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370027 = ((long)this.$i$370049$370260[(int)0]);
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370028 = ((t$370026) * (((long)(t$370027))));
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370029 = ((double)(long)(((long)(t$370028))));
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370030 = ((t$370025) / (((double)(t$370029))));
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370031 = ((t$370024) + (((double)(t$370030))));
                            
                            //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            this.$q$370261[(int)0]=t$370031;
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370032 = k$370035;
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370033 = ((t$370032) + (((double)(1.0))));
                            
                            //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            k$370035 = t$370033;
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $i$370049$370260;
                public double[] $q$370261;
                
                public $Closure$965(final long[] $i$370049$370260, final double[] $q$370261) {
                     {
                        this.$i$370049$370260 = $i$370049$370260;
                        this.$q$370261 = $q$370261;
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$966 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$966> $RTT = 
                    x10.rtt.StaticFunType.<$Closure$966> make($Closure$966.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                              });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$966 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$966.class + " calling"); } 
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$966 $_obj = new lab4.sumatoriaRara.$Closure$966((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure$966(final java.lang.System[] $dummy) {
                    
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
                    
                    //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369834 = ((double)(long)(((long)(i))));
                    
                    //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369835 = ((t$369834) * (((double)(1.0))));
                    
                    //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    return t$369835;
                }
                
                public $Closure$966() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$967 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$967> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$967> make($Closure$967.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$967 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$967.class + " calling"); } 
                    $_obj.$j1$370263 = $deserializer.readObject();
                    $_obj.$k1$370265 = $deserializer.readObject();
                    $_obj.$k2$370262 = $deserializer.readObject();
                    $_obj.$total$370264 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$967 $_obj = new lab4.sumatoriaRara.$Closure$967((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$j1$370263);
                    $serializer.write(this.$k1$370265);
                    $serializer.write(this.$k2$370262);
                    $serializer.write(this.$total$370264);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$967(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __3$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long t$370104 = ((long)this.$k2$370262[(int)0]);
                        
                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        this.$j1$370263[(int)0]=t$370104;
                        
                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370105 = ((long)this.$j1$370263[(int)0]);
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370106 = ((long)this.$total$370264[(int)0]);
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final boolean t$370107 = ((t$370105) < (((long)(t$370106))));
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            if (!(t$370107)) {
                                
                                //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                break;
                            }
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final x10.core.Rail a$370094 = ((x10.core.Rail)(this.suma));
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long i$370095 = ((long)this.$j1$370263[(int)0]);
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370096 = ((double[])a$370094.value)[(int)i$370095];
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370097 = ((long)this.$k1$370265[(int)0]);
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370098 = ((double)(long)(((long)(t$370097))));
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double t$370099 = ((t$370098) * (((double)(1.0))));
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double r$370100 = ((t$370096) + (((double)(t$370099))));
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            ((double[])a$370094.value)[(int)i$370095] = r$370100;
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370101 = ((long)this.$j1$370263[(int)0]);
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370102 = ((t$370101) + (((long)(1L))));
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            this.$j1$370263[(int)0]=t$370102;
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $k2$370262;
                public long[] $j1$370263;
                public long[] $total$370264;
                public x10.core.Rail<x10.core.Double> suma;
                public long[] $k1$370265;
                
                public $Closure$967(final long[] $k2$370262, final long[] $j1$370263, final long[] $total$370264, final x10.core.Rail<x10.core.Double> suma, final long[] $k1$370265, __3$1x10$lang$Double$2 $dummy) {
                     {
                        this.$k2$370262 = $k2$370262;
                        this.$j1$370263 = $j1$370263;
                        this.$total$370264 = $total$370264;
                        this.suma = ((x10.core.Rail)(suma));
                        this.$k1$370265 = $k1$370265;
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$968 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$968> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$968> make($Closure$968.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$968 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$968.class + " calling"); } 
                    $_obj.$j1$370269 = $deserializer.readObject();
                    $_obj.$k1$370266 = $deserializer.readObject();
                    $_obj.$k2$370268 = $deserializer.readObject();
                    $_obj.$total$370267 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$968 $_obj = new lab4.sumatoriaRara.$Closure$968((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$j1$370269);
                    $serializer.write(this.$k1$370266);
                    $serializer.write(this.$k2$370268);
                    $serializer.write(this.$total$370267);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$968(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __4$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        this.$k1$370266[(int)0]=1L;
                        
                        //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$369839 = ((long)this.$k1$370266[(int)0]);
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$369840 = ((long)this.$total$370267[(int)0]);
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final boolean t$369855 = ((t$369839) < (((long)(t$369840))));
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            if (!(t$369855)) {
                                
                                //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                break;
                            }
                            
                            //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370103 = ((long)this.$k1$370266[(int)0]);
                            
                            //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            this.$k2$370268[(int)0]=t$370103;
                            {
                                
                                //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                x10.xrx.Runtime.ensureNotInAtomic();
                                
                                //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final x10.xrx.FinishState fs$370214 = x10.xrx.Runtime.startFinish();
                                {
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    final long[] $k2$370262 = new long[1];
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    $k2$370262[(int)0]=((long)this.$k2$370268[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    final long[] $j1$370263 = new long[1];
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    $j1$370263[(int)0]=((long)this.$j1$370269[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    final long[] $total$370264 = new long[1];
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    $total$370264[(int)0]=((long)this.$total$370267[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    final long[] $k1$370265 = new long[1];
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    $k1$370265[(int)0]=((long)this.$k1$370266[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    try {{
                                        {
                                            
                                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$967($k2$370262, $j1$370263, $total$370264, ((x10.core.Rail)(this.suma)), $k1$370265, (lab4.sumatoriaRara.$Closure$967.__3$1x10$lang$Double$2) null))));
                                        }
                                    }}catch (java.lang.Throwable ct$370212) {
                                        
                                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$370212)));
                                        
                                        //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        throw new java.lang.RuntimeException();
                                    }finally {{
                                         
                                         //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$370214)));
                                     }}
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    this.$k2$370268[(int)0]=((long)$k2$370262[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    this.$j1$370269[(int)0]=((long)$j1$370263[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    this.$total$370267[(int)0]=((long)$total$370264[(int)0]);
                                    
                                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    this.$k1$370266[(int)0]=((long)$k1$370265[(int)0]);
                                    }
                                }
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370108 = ((long)this.$k1$370266[(int)0]);
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370109 = ((t$370108) + (((long)(1L))));
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            this.$k1$370266[(int)0]=t$370109;
                            }
                        }}catch (java.lang.Error __lowerer__var__0__) {
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            throw __lowerer__var__0__;
                        }catch (java.lang.Throwable __lowerer__var__1__) {
                            
                            //#line 132 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                        }
                    }
                
                public long[] $k1$370266;
                public long[] $total$370267;
                public long[] $k2$370268;
                public long[] $j1$370269;
                public x10.core.Rail<x10.core.Double> suma;
                
                public $Closure$968(final long[] $k1$370266, final long[] $total$370267, final long[] $k2$370268, final long[] $j1$370269, final x10.core.Rail<x10.core.Double> suma, __4$1x10$lang$Double$2 $dummy) {
                     {
                        this.$k1$370266 = $k1$370266;
                        this.$total$370267 = $total$370267;
                        this.$k2$370268 = $k2$370268;
                        this.$j1$370269 = $j1$370269;
                        this.suma = ((x10.core.Rail)(suma));
                    }
                }
                
                }
                
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$969 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$969> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$969> make($Closure$969.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$969 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$969.class + " calling"); } 
                    $_obj.$total$370270 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$969 $_obj = new lab4.sumatoriaRara.$Closure$969((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$total$370270);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$969(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        long j = 1L;
                        {
                            
                            //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$969$RPAREN$$suma$value$370288 = ((double[])this.suma.value);
                            
                            //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369858 = j;
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369857 = ((long)this.$total$370270[(int)0]);
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369859 = ((t$369857) - (((long)(1L))));
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369873 = ((t$369858) <= (((long)(t$369859))));
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369873)) {
                                    
                                    //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370110 = j;
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370111 = j;
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370112 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$969$RPAREN$$suma$value$370288[(int)t$370111]);
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370113 = j;
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370114 = ((double)(long)(((long)(t$370113))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370115 = ((t$370114) + (((double)(1.0))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370116 = j;
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370117 = ((double)(long)(((long)(t$370116))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370118 = ((t$370117) + (((double)(1.0))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370119 = ((t$370115) * (((double)(t$370118))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370120 = ((t$370112) / (((double)(t$370119))));
                                
                                //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$969$RPAREN$$suma$value$370288[(int)t$370110]=t$370120;
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370121 = j;
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370122 = ((t$370121) + (((long)(1L))));
                                
                                //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                j = t$370122;
                            }
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $total$370270;
                public x10.core.Rail<x10.core.Double> suma;
                
                public $Closure$969(final long[] $total$370270, final x10.core.Rail<x10.core.Double> suma, __1$1x10$lang$Double$2 $dummy) {
                     {
                        this.$total$370270 = $total$370270;
                        this.suma = ((x10.core.Rail)(suma));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$970 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$970> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$970> make($Closure$970.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$970 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$970.class + " calling"); } 
                    $_obj.$k1$370273 = $deserializer.readObject();
                    $_obj.$m$370272 = $deserializer.readObject();
                    $_obj.$r$370274 = $deserializer.readObject();
                    $_obj.$total$370271 = $deserializer.readObject();
                    $_obj.productos = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$970 $_obj = new lab4.sumatoriaRara.$Closure$970((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$k1$370273);
                    $serializer.write(this.$m$370272);
                    $serializer.write(this.$r$370274);
                    $serializer.write(this.$total$370271);
                    $serializer.write(this.productos);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$970(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __3$1x10$lang$Double$2__4$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        long j = 1L;
                        {
                            
                            //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$970$RPAREN$$suma$value$370289 = ((double[])this.suma.value);
                            
                            //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$970$RPAREN$$productos$value$370290 = ((double[])this.productos.value);
                            
                            //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369876 = j;
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369875 = ((long)this.$total$370271[(int)0]);
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369877 = ((t$369875) - (((long)(1L))));
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369895 = ((t$369876) < (((long)(t$369877))));
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369895)) {
                                    
                                    //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370136 = j;
                                
                                //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this.$m$370272[(int)0]=t$370136;
                                
                                //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                long k$370132 = ((long)this.$m$370272[(int)0]);
                                {
                                    
                                    //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    for (;
                                         true;
                                         ) {
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370133 = k$370132;
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370134 = ((long)this.$total$370271[(int)0]);
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final boolean t$370135 = ((t$370133) < (((long)(t$370134))));
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        if (!(t$370135)) {
                                            
                                            //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                            break;
                                        }
                                        
                                        //#line 152 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370123 = k$370132;
                                        
                                        //#line 152 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        this.$k1$370273[(int)0]=t$370123;
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final x10.core.Rail a$370124 = ((x10.core.Rail)(this.productos));
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long i$370125 = ((long)this.$k1$370273[(int)0]);
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double t$370126 = ((double[])a$370124.value)[(int)i$370125];
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370127 = ((long)this.$m$370272[(int)0]);
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double t$370128 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$970$RPAREN$$suma$value$370289[(int)t$370127]);
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double r$370129 = ((t$370126) * (((double)(t$370128))));
                                        
                                        //#line 153 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        ((double[])a$370124.value)[(int)i$370125] = r$370129;
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370130 = k$370132;
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370131 = ((t$370130) + (((long)(1L))));
                                        
                                        //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        k$370132 = t$370131;
                                    }
                                }
                                
                                //#line 156 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370137 = ((double)this.$r$370274[(int)0]);
                                
                                //#line 156 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370138 = j;
                                
                                //#line 156 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370139 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$970$RPAREN$$productos$value$370290[(int)t$370138]);
                                
                                //#line 156 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370140 = ((t$370137) + (((double)(t$370139))));
                                
                                //#line 156 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this.$r$370274[(int)0]=t$370140;
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370141 = j;
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370142 = ((t$370141) + (((long)(1L))));
                                
                                //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                j = t$370142;
                            }
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $total$370271;
                public long[] $m$370272;
                public long[] $k1$370273;
                public x10.core.Rail<x10.core.Double> productos;
                public x10.core.Rail<x10.core.Double> suma;
                public double[] $r$370274;
                
                public $Closure$970(final long[] $total$370271, final long[] $m$370272, final long[] $k1$370273, final x10.core.Rail<x10.core.Double> productos, final x10.core.Rail<x10.core.Double> suma, final double[] $r$370274, __3$1x10$lang$Double$2__4$1x10$lang$Double$2 $dummy) {
                     {
                        this.$total$370271 = $total$370271;
                        this.$m$370272 = $m$370272;
                        this.$k1$370273 = $k1$370273;
                        this.productos = ((x10.core.Rail)(productos));
                        this.suma = ((x10.core.Rail)(suma));
                        this.$r$370274 = $r$370274;
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$971 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$971> $RTT = 
                    x10.rtt.StaticFunType.<$Closure$971> make($Closure$971.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                              });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$971 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$971.class + " calling"); } 
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$971 $_obj = new lab4.sumatoriaRara.$Closure$971((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure$971(final java.lang.System[] $dummy) {
                    
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
                    
                    //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369901 = ((double)(long)(((long)(i))));
                    
                    //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    final double t$369902 = ((t$369901) * (((double)(1.0))));
                    
                    //#line 170 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    return t$369902;
                }
                
                public $Closure$971() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$972 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$972> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$972> make($Closure$972.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$972 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$972.class + " calling"); } 
                    $_obj.$j1$370275 = $deserializer.readObject();
                    $_obj.$j2$370276 = $deserializer.readObject();
                    $_obj.$k2$370277 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$972 $_obj = new lab4.sumatoriaRara.$Closure$972((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$j1$370275);
                    $serializer.write(this.$j2$370276);
                    $serializer.write(this.$k2$370277);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$972(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __2$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 191 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 192 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        try {{
                            
                            //#line 192 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            x10.xrx.Runtime.enterAtomic();
                            {
                                
                                //#line 192 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370143 = ((long)this.$j1$370275[(int)0]);
                                
                                //#line 192 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this.$j2$370276[(int)0]=t$370143;
                            }
                        }}finally {{
                              
                              //#line 192 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                              x10.xrx.Runtime.exitAtomic();
                          }}
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final x10.core.Rail a$370144 = ((x10.core.Rail)(this.suma));
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long i$370145 = ((long)this.$j2$370276[(int)0]);
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double t$370146 = ((double[])a$370144.value)[(int)i$370145];
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long t$370147 = ((long)this.$k2$370277[(int)0]);
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double t$370148 = ((double)(long)(((long)(t$370147))));
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double t$370149 = ((t$370148) * (((double)(1.0))));
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double r$370150 = ((t$370146) + (((double)(t$370149))));
                        
                        //#line 193 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        ((double[])a$370144.value)[(int)i$370145] = r$370150;
                        }}catch (java.lang.Error __lowerer__var__0__) {
                            
                            //#line 191 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            throw __lowerer__var__0__;
                        }catch (java.lang.Throwable __lowerer__var__1__) {
                            
                            //#line 191 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                        }
                    }
                
                public long[] $j1$370275;
                public long[] $j2$370276;
                public x10.core.Rail<x10.core.Double> suma;
                public long[] $k2$370277;
                
                public $Closure$972(final long[] $j1$370275, final long[] $j2$370276, final x10.core.Rail<x10.core.Double> suma, final long[] $k2$370277, __2$1x10$lang$Double$2 $dummy) {
                     {
                        this.$j1$370275 = $j1$370275;
                        this.$j2$370276 = $j2$370276;
                        this.suma = ((x10.core.Rail)(suma));
                        this.$k2$370277 = $k2$370277;
                    }
                }
                
                }
                
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$973 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$973> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$973> make($Closure$973.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$973 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$973.class + " calling"); } 
                    $_obj.$j1$370278 = $deserializer.readObject();
                    $_obj.$j2$370279 = $deserializer.readObject();
                    $_obj.$k1$370281 = $deserializer.readObject();
                    $_obj.$k2$370280 = $deserializer.readObject();
                    $_obj.$total$370282 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$973 $_obj = new lab4.sumatoriaRara.$Closure$973((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$j1$370278);
                    $serializer.write(this.$j2$370279);
                    $serializer.write(this.$k1$370281);
                    $serializer.write(this.$k2$370280);
                    $serializer.write(this.$total$370282);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$973(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __5$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    {
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long[] $j1$370275 = new long[1];
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        $j1$370275[(int)0]=((long)this.$j1$370278[(int)0]);
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long[] $j2$370276 = new long[1];
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        $j2$370276[(int)0]=((long)this.$j2$370279[(int)0]);
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long[] $k2$370277 = new long[1];
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        $k2$370277[(int)0]=((long)this.$k2$370280[(int)0]);
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        try {{
                            
                            //#line 188 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            try {{
                                
                                //#line 188 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                x10.xrx.Runtime.enterAtomic();
                                {
                                    
                                    //#line 188 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    final long t$370157 = ((long)this.$k1$370281[(int)0]);
                                    
                                    //#line 188 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    $k2$370277[(int)0]=t$370157;
                                }
                            }}finally {{
                                  
                                  //#line 188 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                  x10.xrx.Runtime.exitAtomic();
                              }}
                            
                            //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final long t$370153 = ((long)$k2$370277[(int)0]);
                            
                            //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            $j1$370275[(int)0]=t$370153;
                            
                            //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370154 = ((long)$j1$370275[(int)0]);
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370155 = ((long)this.$total$370282[(int)0]);
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$370156 = ((t$370154) < (((long)(t$370155))));
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$370156)) {
                                    
                                    //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 191 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new lab4.sumatoriaRara.$Closure$972($j1$370275, $j2$370276, ((x10.core.Rail)(this.suma)), $k2$370277, (lab4.sumatoriaRara.$Closure$972.__2$1x10$lang$Double$2) null))));
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370151 = ((long)$j1$370275[(int)0]);
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370152 = ((t$370151) + (((long)(1L))));
                                
                                //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                $j1$370275[(int)0]=t$370152;
                            }
                            }}catch (java.lang.Error __lowerer__var__0__) {
                                
                                //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                throw __lowerer__var__0__;
                            }catch (java.lang.Throwable __lowerer__var__1__) {
                                
                                //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                            }
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        this.$j1$370278[(int)0]=((long)$j1$370275[(int)0]);
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        this.$j2$370279[(int)0]=((long)$j2$370276[(int)0]);
                        
                        //#line 187 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        this.$k2$370280[(int)0]=((long)$k2$370277[(int)0]);
                        }
                    }
                
                public long[] $j1$370278;
                public long[] $j2$370279;
                public long[] $k2$370280;
                public long[] $k1$370281;
                public long[] $total$370282;
                public x10.core.Rail<x10.core.Double> suma;
                
                public $Closure$973(final long[] $j1$370278, final long[] $j2$370279, final long[] $k2$370280, final long[] $k1$370281, final long[] $total$370282, final x10.core.Rail<x10.core.Double> suma, __5$1x10$lang$Double$2 $dummy) {
                     {
                        this.$j1$370278 = $j1$370278;
                        this.$j2$370279 = $j2$370279;
                        this.$k2$370280 = $k2$370280;
                        this.$k1$370281 = $k1$370281;
                        this.$total$370282 = $total$370282;
                        this.suma = ((x10.core.Rail)(suma));
                    }
                }
                
                }
                
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$974 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$974> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$974> make($Closure$974.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$974 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$974.class + " calling"); } 
                    $_obj.$total$370283 = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$974 $_obj = new lab4.sumatoriaRara.$Closure$974((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$total$370283);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$974(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        long j = 1L;
                        {
                            
                            //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$974$RPAREN$$suma$value$370291 = ((double[])this.suma.value);
                            
                            //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369926 = j;
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369925 = ((long)this.$total$370283[(int)0]);
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369927 = ((t$369925) - (((long)(1L))));
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369941 = ((t$369926) <= (((long)(t$369927))));
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369941)) {
                                    
                                    //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370160 = j;
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370161 = j;
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370162 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$974$RPAREN$$suma$value$370291[(int)t$370161]);
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370163 = j;
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370164 = ((double)(long)(((long)(t$370163))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370165 = ((t$370164) + (((double)(1.0))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370166 = j;
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370167 = ((double)(long)(((long)(t$370166))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370168 = ((t$370167) + (((double)(1.0))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370169 = ((t$370165) * (((double)(t$370168))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370170 = ((t$370162) / (((double)(t$370169))));
                                
                                //#line 204 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$974$RPAREN$$suma$value$370291[(int)t$370160]=t$370170;
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370171 = j;
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370172 = ((t$370171) + (((long)(1L))));
                                
                                //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                j = t$370172;
                            }
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 203 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $total$370283;
                public x10.core.Rail<x10.core.Double> suma;
                
                public $Closure$974(final long[] $total$370283, final x10.core.Rail<x10.core.Double> suma, __1$1x10$lang$Double$2 $dummy) {
                     {
                        this.$total$370283 = $total$370283;
                        this.suma = ((x10.core.Rail)(suma));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$975 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$975> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$975> make($Closure$975.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$975 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$975.class + " calling"); } 
                    $_obj.$k1$370286 = $deserializer.readObject();
                    $_obj.$m$370285 = $deserializer.readObject();
                    $_obj.$r$370287 = $deserializer.readObject();
                    $_obj.$total$370284 = $deserializer.readObject();
                    $_obj.productos = $deserializer.readObject();
                    $_obj.suma = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$975 $_obj = new lab4.sumatoriaRara.$Closure$975((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.$k1$370286);
                    $serializer.write(this.$m$370285);
                    $serializer.write(this.$r$370287);
                    $serializer.write(this.$total$370284);
                    $serializer.write(this.productos);
                    $serializer.write(this.suma);
                    
                }
                
                // constructor just for allocation
                public $Closure$975(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __3$1x10$lang$Double$2__4$1x10$lang$Double$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        long j = 1L;
                        {
                            
                            //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$975$RPAREN$$suma$value$370292 = ((double[])this.suma.value);
                            
                            //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            final double[] this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$975$RPAREN$$productos$value$370293 = ((double[])this.productos.value);
                            
                            //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369944 = j;
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369943 = ((long)this.$total$370284[(int)0]);
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$369945 = ((t$369943) - (((long)(1L))));
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final boolean t$369963 = ((t$369944) < (((long)(t$369945))));
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                if (!(t$369963)) {
                                    
                                    //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    break;
                                }
                                
                                //#line 211 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370186 = j;
                                
                                //#line 211 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this.$m$370285[(int)0]=t$370186;
                                
                                //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                long k$370182 = ((long)this.$m$370285[(int)0]);
                                {
                                    
                                    //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                    for (;
                                         true;
                                         ) {
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370183 = k$370182;
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370184 = ((long)this.$total$370284[(int)0]);
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final boolean t$370185 = ((t$370183) < (((long)(t$370184))));
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        if (!(t$370185)) {
                                            
                                            //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                            break;
                                        }
                                        
                                        //#line 213 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370173 = k$370182;
                                        
                                        //#line 213 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        this.$k1$370286[(int)0]=t$370173;
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final x10.core.Rail a$370174 = ((x10.core.Rail)(this.productos));
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long i$370175 = ((long)this.$k1$370286[(int)0]);
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double t$370176 = ((double[])a$370174.value)[(int)i$370175];
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370177 = ((long)this.$m$370285[(int)0]);
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double t$370178 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$975$RPAREN$$suma$value$370292[(int)t$370177]);
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final double r$370179 = ((t$370176) * (((double)(t$370178))));
                                        
                                        //#line 214 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        ((double[])a$370174.value)[(int)i$370175] = r$370179;
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370180 = k$370182;
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        final long t$370181 = ((t$370180) + (((long)(1L))));
                                        
                                        //#line 212 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                        k$370182 = t$370181;
                                    }
                                }
                                
                                //#line 217 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370187 = ((double)this.$r$370287[(int)0]);
                                
                                //#line 217 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370188 = j;
                                
                                //#line 217 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370189 = ((double)this$LPAREN$$COLON$lab4$sumatoriaRara$$Closure$975$RPAREN$$productos$value$370293[(int)t$370188]);
                                
                                //#line 217 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final double t$370190 = ((t$370187) + (((double)(t$370189))));
                                
                                //#line 217 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                this.$r$370287[(int)0]=t$370190;
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370191 = j;
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                final long t$370192 = ((t$370191) + (((long)(1L))));
                                
                                //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                                j = t$370192;
                            }
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 210 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long[] $total$370284;
                public long[] $m$370285;
                public long[] $k1$370286;
                public x10.core.Rail<x10.core.Double> productos;
                public x10.core.Rail<x10.core.Double> suma;
                public double[] $r$370287;
                
                public $Closure$975(final long[] $total$370284, final long[] $m$370285, final long[] $k1$370286, final x10.core.Rail<x10.core.Double> productos, final x10.core.Rail<x10.core.Double> suma, final double[] $r$370287, __3$1x10$lang$Double$2__4$1x10$lang$Double$2 $dummy) {
                     {
                        this.$total$370284 = $total$370284;
                        this.$m$370285 = $m$370285;
                        this.$k1$370286 = $k1$370286;
                        this.productos = ((x10.core.Rail)(productos));
                        this.suma = ((x10.core.Rail)(suma));
                        this.$r$370287 = $r$370287;
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$976 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$976> $RTT = 
                    x10.rtt.StaticFunType.<$Closure$976> make($Closure$976.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                              });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$976 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$976.class + " calling"); } 
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$976 $_obj = new lab4.sumatoriaRara.$Closure$976((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure$976(final java.lang.System[] $dummy) {
                    
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
                    
                    //#line 249 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    return i;
                }
                
                public $Closure$976() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$977 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$977> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$977> make($Closure$977.class,
                                                                  new x10.rtt.Type[] {
                                                                      x10.core.fun.VoidFun_0_0.$RTT
                                                                  });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                private Object writeReplace() throws java.io.ObjectStreamException {
                    return new x10.serialization.SerializationProxy(this);
                }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(lab4.sumatoriaRara.$Closure$977 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$977.class + " calling"); } 
                    $_obj.i$370193 = $deserializer.readLong();
                    $_obj.lol = $deserializer.readObject();
                    $_obj.tetera = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    lab4.sumatoriaRara.$Closure$977 $_obj = new lab4.sumatoriaRara.$Closure$977((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.i$370193);
                    $serializer.write(this.lol);
                    $serializer.write(this.tetera);
                    
                }
                
                // constructor just for allocation
                public $Closure$977(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Double$2__2$1x10$lang$Long$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 255 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                    try {{
                        
                        //#line 256 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final x10.io.Printer t$370194 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                        
                        //#line 256 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final java.lang.String t$370195 = (("i1 ") + ((x10.core.Long.$box(this.i$370193))));
                        
                        //#line 256 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        t$370194.println(((java.lang.Object)(t$370195)));
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final x10.core.Rail a$370196 = ((x10.core.Rail)(this.tetera));
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long i$370197 = this.i$370193;
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double t$370198 = ((double[])a$370196.value)[(int)i$370197];
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final long t$370199 = lab4.sumatoriaRara.lolero__0$1x10$lang$Long$2$O(((x10.core.Rail)(this.lol)), (long)(this.i$370193));
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double t$370200 = ((double)(long)(((long)(t$370199))));
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        final double r$370201 = ((t$370198) + (((double)(t$370200))));
                        
                        //#line 257 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        ((double[])a$370196.value)[(int)i$370197] = r$370201;
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 255 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 255 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/lab4/sumatoriaRara.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public long i$370193;
                public x10.core.Rail<x10.core.Double> tetera;
                public x10.core.Rail<x10.core.Long> lol;
                
                public $Closure$977(final long i$370193, final x10.core.Rail<x10.core.Double> tetera, final x10.core.Rail<x10.core.Long> lol, __1$1x10$lang$Double$2__2$1x10$lang$Long$2 $dummy) {
                     {
                        this.i$370193 = i$370193;
                        this.tetera = ((x10.core.Rail)(tetera));
                        this.lol = ((x10.core.Rail)(lol));
                    }
                }
                
            }
            
            }
            
            