
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
    
    

    
    
    //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static void prueba1() {
        {
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91205 = x10.xrx.Runtime.startFinish();
            
            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            try {{
                {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$564())));
                    
                    //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final x10.io.Printer t$91065 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    t$91065.println(((java.lang.Object)("Hello from Starter!")));
                }
            }}catch (java.lang.Throwable ct$91203) {
                
                //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91203)));
                
                //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91205)));
             }}
            }
        }
    
    
    //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static double sumarRail__0$1x10$lang$Double$2$O(final x10.core.Rail<x10.core.Double> r, final long ini, final long fin) {
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final boolean t$91076 = ((long) ini) == ((long) fin);
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        if (t$91076) {
            
            //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91066 = ((double[])r.value)[(int)ini];
            
            //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91066;
        } else {
            
            //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final boolean t$91068 = ((ini) > (((long)(fin))));
            
            //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            if (t$91068) {
                
                //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91067 = ((double)(long)(((long)(0L))));
                
                //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91067;
            }
            
            //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r1 = ((double)(long)(((long)(0L))));
            
            //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r2 = ((double)(long)(((long)(0L))));
            
            //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91069 = ((ini) + (((long)(fin))));
            
            //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long centro = ((t$91069) / (((long)(2L))));
            {
                
                //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final x10.xrx.FinishState fs$91213 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r1$91265 = new double[1];
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r1$91265[(int)0]=r1;
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r2$91266 = new double[1];
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r2$91266[(int)0]=r2;
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    try {{
                        {
                            
                            //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$565(r, ini, centro, $r1$91265, (Hello.$Closure$565.__0$1x10$lang$Double$2) null))));
                            
                            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$566(centro, r, fin, $r2$91266, (Hello.$Closure$566.__1$1x10$lang$Double$2) null))));
                        }
                    }}catch (java.lang.Throwable ct$91211) {
                        
                        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91211)));
                        
                        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91213)));
                     }}
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r1 = ((double)$r1$91265[(int)0]);
                    
                    //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r2 = ((double)$r2$91266[(int)0]);
                    }
                }
            
            //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91073 = r1;
            
            //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91074 = r2;
            
            //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91075 = ((t$91073) + (((double)(t$91074))));
            
            //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91075;
            }
        }
    
    
    //#line 49 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static void prueba2() {
        
        //#line 50 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        long l = 0L;
        
        //#line 51 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long total = 5L;
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91077 = ((double)(long)(((long)(0L))));
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l2 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(total)), x10.core.Double.$box(t$91077), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$91080 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$567()));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l3 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(10000000L)), ((x10.core.fun.Fun_0_1)(t$91080)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 54 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        double c = ((double)(long)(((long)(0L))));
        {
            
            //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91219 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long[] $l$91267 = new long[1];
                
                //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                $l$91267[(int)0]=l;
                
                //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    {
                        
                        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        long i = 1L;
                        
                        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91082 = i;
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final boolean t$91088 = ((t$91082) < (((long)(total))));
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            if (!(t$91088)) {
                                
                                //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                                break;
                            }
                            
                            //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long i$91185 = i;
                            
                            //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$568($l$91267, i$91185, l2, (Hello.$Closure$568.__2$1x10$lang$Double$2) null))));
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91189 = i;
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91190 = ((t$91189) + (((long)(1L))));
                            
                            //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            i = t$91190;
                        }
                    }
                }}catch (java.lang.Throwable ct$91217) {
                    
                    //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91217)));
                    
                    //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91219)));
                 }}
                
                //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                l = ((long)$l$91267[(int)0]);
                }
            }
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.io.Printer t$91090 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long t$91089 = l;
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final java.lang.String t$91091 = (("l=") + ((x10.core.Long.$box(t$91089))));
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        t$91090.println(((java.lang.Object)(t$91091)));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.io.Printer t$91096 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long t$91092 = 4L;
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long t$91093 = 20L;
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91094 = ((double)(long)(((long)(t$91093))));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91095 = ((t$91094) / (((double)(2.0))));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final java.lang.String t$91097 = (("deveria ser l=") + ((x10.core.Double.$box(t$91095))));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        t$91096.println(((java.lang.Object)(t$91097)));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.io.Printer t$91098 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final java.lang.String t$91099 = (("l 2 =") + (l2));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        t$91098.println(((java.lang.Object)(t$91099)));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.io.Printer t$91102 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long t$91100 = 4L;
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91101 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(l2)), (long)(0L), (long)(t$91100));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final java.lang.String t$91103 = (("c =") + ((x10.core.Double.$box(t$91101))));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        t$91102.println(((java.lang.Object)(t$91103)));
        }
    
    
    //#line 74 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static double porJ__0$1x10$lang$Double$2$O(final x10.core.Rail<x10.core.Double> r, final long ini, final long fin) {
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final boolean t$91117 = ((long) ini) == ((long) fin);
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        if (t$91117) {
            
            //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91104 = ((double)(long)(((long)(0L))));
            
            //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91104;
        } else {
            
            //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final boolean t$91106 = ((ini) > (((long)(fin))));
            
            //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            if (t$91106) {
                
                //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91105 = ((double)(long)(((long)(0L))));
                
                //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91105;
            }
            
            //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91107 = ((ini) + (((long)(fin))));
            
            //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long p = ((t$91107) / (((long)(2L))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91108 = ((double[])r.value)[(int)p];
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91109 = ((double)(long)(((long)(1L))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91113 = ((t$91108) * (((double)(t$91109))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91110 = ((1L) + (((long)(p))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91111 = ((1L) + (((long)(p))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91112 = ((t$91110) * (((long)(t$91111))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91114 = ((double)(long)(((long)(t$91112))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91115 = ((t$91113) / (((double)(t$91114))));
            
            //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            ((double[])r.value)[(int)p] = t$91115;
            {
                
                //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final x10.xrx.FinishState fs$91227 = x10.xrx.Runtime.startFinish();
                
                //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    {
                        
                        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$569(r, ini, p, (Hello.$Closure$569.__0$1x10$lang$Double$2) null))));
                        
                        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$570(p, r, fin, (Hello.$Closure$570.__1$1x10$lang$Double$2) null))));
                    }
                }}catch (java.lang.Throwable ct$91225) {
                    
                    //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91225)));
                    
                    //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91227)));
                 }}
                }
            }
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91118 = ((double)(long)(((long)(0L))));
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        return t$91118;
        }
    
    
    //#line 95 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static double prodP__0$1x10$lang$Double$2$O(final x10.core.Rail<x10.core.Double> r, final long ini, final long fin) {
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final boolean t$91129 = ((long) ini) == ((long) fin);
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        if (t$91129) {
            
            //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91119 = ((double[])r.value)[(int)ini];
            
            //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91119;
        } else {
            
            //#line 100 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final boolean t$91121 = ((ini) > (((long)(fin))));
            
            //#line 100 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            if (t$91121) {
                
                //#line 102 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91120 = ((double)(long)(((long)(1L))));
                
                //#line 102 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91120;
            }
            
            //#line 105 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r1 = ((double)(long)(((long)(0L))));
            
            //#line 106 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r2 = ((double)(long)(((long)(0L))));
            
            //#line 107 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91122 = ((ini) + (((long)(fin))));
            
            //#line 107 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long centro = ((t$91122) / (((long)(2L))));
            {
                
                //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final x10.xrx.FinishState fs$91235 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r1$91268 = new double[1];
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r1$91268[(int)0]=r1;
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r2$91269 = new double[1];
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r2$91269[(int)0]=r2;
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    try {{
                        {
                            
                            //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$571(r, ini, centro, $r1$91268, (Hello.$Closure$571.__0$1x10$lang$Double$2) null))));
                            
                            //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$572(centro, r, fin, $r2$91269, (Hello.$Closure$572.__1$1x10$lang$Double$2) null))));
                        }
                    }}catch (java.lang.Throwable ct$91233) {
                        
                        //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91233)));
                        
                        //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91235)));
                     }}
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r1 = ((double)$r1$91268[(int)0]);
                    
                    //#line 109 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r2 = ((double)$r2$91269[(int)0]);
                    }
                }
            
            //#line 113 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91126 = r1;
            
            //#line 113 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91127 = r2;
            
            //#line 113 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91128 = ((t$91126) * (((double)(t$91127))));
            
            //#line 113 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91128;
            }
        }
    
    
    //#line 119 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static double sumarTodo__0$1x10$lang$Double$2$O(final x10.core.Rail<x10.core.Double> r, final long ini, final long fin) {
        
        //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final boolean t$91140 = ((long) ini) == ((long) fin);
        
        //#line 120 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        if (t$91140) {
            
            //#line 122 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91130 = ((double[])r.value)[(int)ini];
            
            //#line 122 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91130;
        } else {
            
            //#line 124 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final boolean t$91132 = ((ini) > (((long)(fin))));
            
            //#line 124 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            if (t$91132) {
                
                //#line 126 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91131 = ((double)(long)(((long)(0L))));
                
                //#line 126 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91131;
            }
            
            //#line 129 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r1 = ((double)(long)(((long)(0L))));
            
            //#line 130 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            double r2 = ((double)(long)(((long)(0L))));
            
            //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long t$91133 = ((ini) + (((long)(fin))));
            
            //#line 131 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final long centro = ((t$91133) / (((long)(2L))));
            {
                
                //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.ensureNotInAtomic();
                
                //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final x10.xrx.FinishState fs$91243 = x10.xrx.Runtime.startFinish();
                {
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r1$91270 = new double[1];
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r1$91270[(int)0]=r1;
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double[] $r2$91271 = new double[1];
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    $r2$91271[(int)0]=r2;
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    try {{
                        {
                            
                            //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$573(r, ini, centro, $r1$91270, (Hello.$Closure$573.__0$1x10$lang$Double$2) null))));
                            
                            //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$574(centro, r, fin, $r2$91271, (Hello.$Closure$574.__1$1x10$lang$Double$2) null))));
                        }
                    }}catch (java.lang.Throwable ct$91241) {
                        
                        //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91241)));
                        
                        //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91243)));
                     }}
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r1 = ((double)$r1$91270[(int)0]);
                    
                    //#line 133 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    r2 = ((double)$r2$91271[(int)0]);
                    }
                }
            
            //#line 137 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91137 = r1;
            
            //#line 137 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91138 = r2;
            
            //#line 137 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final double t$91139 = ((t$91137) + (((double)(t$91138))));
            
            //#line 137 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return t$91139;
            }
        }
    
    
    //#line 141 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
    public static void prueba3() {
        
        //#line 142 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        long l = 0L;
        
        //#line 143 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final long total = 3000L;
        
        //#line 144 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$91143 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$575()));
        
        //#line 144 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l2 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(total)), ((x10.core.fun.Fun_0_1)(t$91143)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 145 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91144 = ((double)(long)(((long)(0L))));
        
        //#line 145 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l3 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(total)), x10.core.Double.$box(t$91144), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.fun.Fun_0_1 t$91154 = ((x10.core.fun.Fun_0_1)(new Hello.$Closure$576()));
        
        //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l4 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(total)), ((x10.core.fun.Fun_0_1)(t$91154)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        {
            
            //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91249 = x10.xrx.Runtime.startFinish();
            
            //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            try {{
                {
                    
                    //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    long i = 0L;
                    
                    //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91156 = i;
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final boolean t$91160 = ((t$91156) < (((long)(total))));
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        if (!(t$91160)) {
                            
                            //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            break;
                        }
                        
                        //#line 149 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long i$91191 = i;
                        
                        //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$577(l2, i$91191, l3, (Hello.$Closure$577.__0$1x10$lang$Double$2__2$1x10$lang$Double$2) null))));
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91193 = i;
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91194 = ((t$91193) + (((long)(1L))));
                        
                        //#line 148 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        i = t$91194;
                    }
                }
            }}catch (java.lang.Throwable ct$91247) {
                
                //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91247)));
                
                //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 147 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91249)));
             }}
            }
        {
            
            //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91253 = x10.xrx.Runtime.startFinish();
            
            //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            try {{
                {
                    
                    //#line 158 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    Hello.porJ__0$1x10$lang$Double$2$O(((x10.core.Rail)(l3)), (long)(0L), (long)(total));
                }
            }}catch (java.lang.Throwable ct$91251) {
                
                //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91251)));
                
                //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 157 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91253)));
             }}
            }
        
        //#line 160 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        double su = ((double)(long)(((long)(0L))));
        
        //#line 161 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        double su2 = ((double)(long)(((long)(0L))));
        
        //#line 162 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        double su3 = ((double)(long)(((long)(0L))));
        
        //#line 163 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91161 = ((double)(long)(((long)(0L))));
        
        //#line 163 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.core.Rail l5 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Double>(x10.rtt.Types.DOUBLE, ((long)(total)), x10.core.Double.$box(t$91161), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        {
            
            //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91259 = x10.xrx.Runtime.startFinish();
            
            //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            try {{
                {
                    
                    //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    long i = 0L;
                    
                    //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91163 = i;
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final boolean t$91167 = ((t$91163) < (((long)(total))));
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        if (!(t$91167)) {
                            
                            //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            break;
                        }
                        
                        //#line 166 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long i$91195 = i;
                        
                        //#line 167 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$578(l3, i$91195, l5, (Hello.$Closure$578.__0$1x10$lang$Double$2__2$1x10$lang$Double$2) null))));
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91197 = i;
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long t$91198 = ((t$91197) + (((long)(1L))));
                        
                        //#line 165 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        i = t$91198;
                    }
                }
            }}catch (java.lang.Throwable ct$91257) {
                
                //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91257)));
                
                //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 164 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91259)));
             }}
            }
        {
            
            //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            final x10.xrx.FinishState fs$91263 = x10.xrx.Runtime.startFinish();
            
            //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            try {{
                {
                    
                    //#line 174 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91168 = 2999L;
                    
                    //#line 174 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91169 = Hello.sumarTodo__0$1x10$lang$Double$2$O(((x10.core.Rail)(l5)), (long)(1L), (long)(t$91168));
                    
                    //#line 174 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    su = t$91169;
                }
            }}catch (java.lang.Throwable ct$91261) {
                
                //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$91261)));
                
                //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 173 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$91263)));
             }}
            }
        
        //#line 180 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final x10.io.Printer t$91171 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 180 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final double t$91170 = su;
        
        //#line 180 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final java.lang.String t$91172 = (("su =") + ((x10.core.Double.$box(t$91170))));
        
        //#line 180 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        t$91171.println(((java.lang.Object)(t$91172)));
        }
        
        
        //#line 186 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        public static void prueba() {
            
        }
        
        
        //#line 189 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
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
        public static void main(final x10.core.Rail<java.lang.String> id$89964) {
            
            //#line 190 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            Hello.prueba3();
        }
        
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final public Hello Hello$$this$Hello() {
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
            return Hello.this;
        }
        
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        // creation method for java code (1-phase java constructor)
        public Hello() {
            this((java.lang.System[]) null);
            Hello$$init$S();
        }
        
        // constructor for non-virtual call
        final public Hello Hello$$init$S() {
             {
                
                //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                
                
                //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                this.__fieldInitializers_Hello();
            }
            return this;
        }
        
        
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
        final public void __fieldInitializers_Hello() {
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$563 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$563> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$563> make($Closure$563.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$563 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$563.class + " calling"); } 
                $_obj.i$91177 = $deserializer.readLong();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$563 $_obj = new Hello.$Closure$563((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.i$91177);
                
            }
            
            // constructor just for allocation
            public $Closure$563(final java.lang.System[] $dummy) {
                
            }
            
            
        
            
            public void $apply() {
                
                //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final x10.io.Printer t$91173 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final java.lang.String t$91174 = (("Hello from executing activity ") + ((x10.core.Long.$box(this.i$91177))));
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final java.lang.String t$91175 = ((t$91174) + ("!"));
                    
                    //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    t$91173.println(((java.lang.Object)(t$91175)));
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public long i$91177;
            
            public $Closure$563(final long i$91177) {
                 {
                    this.i$91177 = i$91177;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$564 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$564> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$564> make($Closure$564.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$564 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$564.class + " calling"); } 
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$564 $_obj = new Hello.$Closure$564((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                
            }
            
            // constructor just for allocation
            public $Closure$564(final java.lang.System[] $dummy) {
                
            }
            
            
        
            
            public void $apply() {
                
                //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final x10.core.Rail rail$91183 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L, 3L})));
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long size$91184 = ((x10.core.Rail<x10.core.Long>)rail$91183).size;
                    
                    //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    long idx$91180 = 0L;
                    {
                        
                        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        final long[] rail$91183$value$91272 = ((long[])rail$91183.value);
                        
                        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91181 = idx$91180;
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final boolean t$91182 = ((t$91181) < (((long)(size$91184))));
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            if (!(t$91182)) {
                                
                                //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                                break;
                            }
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91176 = idx$91180;
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long i$91177 = ((long)rail$91183$value$91272[(int)t$91176]);
                            
                            //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$563(i$91177))));
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91178 = idx$91180;
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            final long t$91179 = ((t$91178) + (((long)(1L))));
                            
                            //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                            idx$91180 = t$91179;
                        }
                    }
                    
                    //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    x10.lang.System.sleep$O((long)(3000L));
                    
                    //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final x10.io.Printer t$91064 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    t$91064.println(((java.lang.Object)("Hello from loop!")));
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public $Closure$564() {
                 {
                    
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$565 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$565> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$565> make($Closure$565.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$565 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$565.class + " calling"); } 
                $_obj.$r1$91265 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.ini = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$565 $_obj = new Hello.$Closure$565((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r1$91265);
                $serializer.write(this.centro);
                $serializer.write(this.ini);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$565(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91070 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(this.ini), (long)(this.centro));
                    
                    //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r1$91265[(int)0]=t$91070;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> r;
            public long ini;
            public long centro;
            public double[] $r1$91265;
            
            public $Closure$565(final x10.core.Rail<x10.core.Double> r, final long ini, final long centro, final double[] $r1$91265, __0$1x10$lang$Double$2 $dummy) {
                 {
                    this.r = ((x10.core.Rail)(r));
                    this.ini = ini;
                    this.centro = centro;
                    this.$r1$91265 = $r1$91265;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$566 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$566> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$566> make($Closure$566.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$566 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$566.class + " calling"); } 
                $_obj.$r2$91266 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.fin = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$566 $_obj = new Hello.$Closure$566((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r2$91266);
                $serializer.write(this.centro);
                $serializer.write(this.fin);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$566(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __1$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91071 = ((this.centro) + (((long)(1L))));
                    
                    //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91072 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(t$91071), (long)(this.fin));
                    
                    //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r2$91266[(int)0]=t$91072;
                }}catch (java.lang.Error __lowerer__var__2__) {
                    
                    //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__2__;
                }catch (java.lang.Throwable __lowerer__var__3__) {
                    
                    //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                }
            }
            
            public long centro;
            public x10.core.Rail<x10.core.Double> r;
            public long fin;
            public double[] $r2$91266;
            
            public $Closure$566(final long centro, final x10.core.Rail<x10.core.Double> r, final long fin, final double[] $r2$91266, __1$1x10$lang$Double$2 $dummy) {
                 {
                    this.centro = centro;
                    this.r = ((x10.core.Rail)(r));
                    this.fin = fin;
                    this.$r2$91266 = $r2$91266;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$567 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$567> $RTT = 
                x10.rtt.StaticFunType.<$Closure$567> make($Closure$567.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$567 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$567.class + " calling"); } 
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$567 $_obj = new Hello.$Closure$567((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                
            }
            
            // constructor just for allocation
            public $Closure$567(final java.lang.System[] $dummy) {
                
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
                
                //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91078 = ((double)(long)(((long)(i))));
                
                //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91079 = ((t$91078) * (((double)(1.0))));
                
                //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91079;
            }
            
            public $Closure$567() {
                 {
                    
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$568 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$568> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$568> make($Closure$568.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$568 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$568.class + " calling"); } 
                $_obj.$l$91267 = $deserializer.readObject();
                $_obj.i$91185 = $deserializer.readLong();
                $_obj.l2 = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$568 $_obj = new Hello.$Closure$568((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$l$91267);
                $serializer.write(this.i$91185);
                $serializer.write(this.l2);
                
            }
            
            // constructor just for allocation
            public $Closure$568(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __2$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91186 = ((long)this.$l$91267[(int)0]);
                    
                    //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91187 = ((this.i$91185) + (((long)(t$91186))));
                    
                    //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$l$91267[(int)0]=t$91187;
                    
                    //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91188 = ((double)(long)(((long)(this.i$91185))));
                    
                    //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    ((double[])this.l2.value)[(int)this.i$91185] = t$91188;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public long[] $l$91267;
            public long i$91185;
            public x10.core.Rail<x10.core.Double> l2;
            
            public $Closure$568(final long[] $l$91267, final long i$91185, final x10.core.Rail<x10.core.Double> l2, __2$1x10$lang$Double$2 $dummy) {
                 {
                    this.$l$91267 = $l$91267;
                    this.i$91185 = i$91185;
                    this.l2 = ((x10.core.Rail)(l2));
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$569 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$569> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$569> make($Closure$569.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$569 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$569.class + " calling"); } 
                $_obj.ini = $deserializer.readLong();
                $_obj.p = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$569 $_obj = new Hello.$Closure$569((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.ini);
                $serializer.write(this.p);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$569(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    Hello.porJ__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(this.ini), (long)(this.p));
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> r;
            public long ini;
            public long p;
            
            public $Closure$569(final x10.core.Rail<x10.core.Double> r, final long ini, final long p, __0$1x10$lang$Double$2 $dummy) {
                 {
                    this.r = ((x10.core.Rail)(r));
                    this.ini = ini;
                    this.p = p;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$570 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$570> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$570> make($Closure$570.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$570 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$570.class + " calling"); } 
                $_obj.fin = $deserializer.readLong();
                $_obj.p = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$570 $_obj = new Hello.$Closure$570((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.fin);
                $serializer.write(this.p);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$570(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __1$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91116 = ((this.p) + (((long)(1L))));
                    
                    //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    Hello.porJ__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(t$91116), (long)(this.fin));
                }}catch (java.lang.Error __lowerer__var__2__) {
                    
                    //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__2__;
                }catch (java.lang.Throwable __lowerer__var__3__) {
                    
                    //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                }
            }
            
            public long p;
            public x10.core.Rail<x10.core.Double> r;
            public long fin;
            
            public $Closure$570(final long p, final x10.core.Rail<x10.core.Double> r, final long fin, __1$1x10$lang$Double$2 $dummy) {
                 {
                    this.p = p;
                    this.r = ((x10.core.Rail)(r));
                    this.fin = fin;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$571 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$571> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$571> make($Closure$571.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$571 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$571.class + " calling"); } 
                $_obj.$r1$91268 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.ini = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$571 $_obj = new Hello.$Closure$571((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r1$91268);
                $serializer.write(this.centro);
                $serializer.write(this.ini);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$571(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91123 = Hello.prodP__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(this.ini), (long)(this.centro));
                    
                    //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r1$91268[(int)0]=t$91123;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 110 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> r;
            public long ini;
            public long centro;
            public double[] $r1$91268;
            
            public $Closure$571(final x10.core.Rail<x10.core.Double> r, final long ini, final long centro, final double[] $r1$91268, __0$1x10$lang$Double$2 $dummy) {
                 {
                    this.r = ((x10.core.Rail)(r));
                    this.ini = ini;
                    this.centro = centro;
                    this.$r1$91268 = $r1$91268;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$572 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$572> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$572> make($Closure$572.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$572 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$572.class + " calling"); } 
                $_obj.$r2$91269 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.fin = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$572 $_obj = new Hello.$Closure$572((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r2$91269);
                $serializer.write(this.centro);
                $serializer.write(this.fin);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$572(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __1$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91124 = ((this.centro) + (((long)(1L))));
                    
                    //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91125 = Hello.prodP__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(t$91124), (long)(this.fin));
                    
                    //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r2$91269[(int)0]=t$91125;
                }}catch (java.lang.Error __lowerer__var__2__) {
                    
                    //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__2__;
                }catch (java.lang.Throwable __lowerer__var__3__) {
                    
                    //#line 111 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                }
            }
            
            public long centro;
            public x10.core.Rail<x10.core.Double> r;
            public long fin;
            public double[] $r2$91269;
            
            public $Closure$572(final long centro, final x10.core.Rail<x10.core.Double> r, final long fin, final double[] $r2$91269, __1$1x10$lang$Double$2 $dummy) {
                 {
                    this.centro = centro;
                    this.r = ((x10.core.Rail)(r));
                    this.fin = fin;
                    this.$r2$91269 = $r2$91269;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$573 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$573> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$573> make($Closure$573.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$573 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$573.class + " calling"); } 
                $_obj.$r1$91270 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.ini = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$573 $_obj = new Hello.$Closure$573((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r1$91270);
                $serializer.write(this.centro);
                $serializer.write(this.ini);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$573(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91134 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(this.ini), (long)(this.centro));
                    
                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r1$91270[(int)0]=t$91134;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 134 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> r;
            public long ini;
            public long centro;
            public double[] $r1$91270;
            
            public $Closure$573(final x10.core.Rail<x10.core.Double> r, final long ini, final long centro, final double[] $r1$91270, __0$1x10$lang$Double$2 $dummy) {
                 {
                    this.r = ((x10.core.Rail)(r));
                    this.ini = ini;
                    this.centro = centro;
                    this.$r1$91270 = $r1$91270;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$574 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$574> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$574> make($Closure$574.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$574 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$574.class + " calling"); } 
                $_obj.$r2$91271 = $deserializer.readObject();
                $_obj.centro = $deserializer.readLong();
                $_obj.fin = $deserializer.readLong();
                $_obj.r = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$574 $_obj = new Hello.$Closure$574((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$r2$91271);
                $serializer.write(this.centro);
                $serializer.write(this.fin);
                $serializer.write(this.r);
                
            }
            
            // constructor just for allocation
            public $Closure$574(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __1$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final long t$91135 = ((this.centro) + (((long)(1L))));
                    
                    //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91136 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.r)), (long)(t$91135), (long)(this.fin));
                    
                    //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    this.$r2$91271[(int)0]=t$91136;
                }}catch (java.lang.Error __lowerer__var__2__) {
                    
                    //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__2__;
                }catch (java.lang.Throwable __lowerer__var__3__) {
                    
                    //#line 135 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                }
            }
            
            public long centro;
            public x10.core.Rail<x10.core.Double> r;
            public long fin;
            public double[] $r2$91271;
            
            public $Closure$574(final long centro, final x10.core.Rail<x10.core.Double> r, final long fin, final double[] $r2$91271, __1$1x10$lang$Double$2 $dummy) {
                 {
                    this.centro = centro;
                    this.r = ((x10.core.Rail)(r));
                    this.fin = fin;
                    this.$r2$91271 = $r2$91271;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$575 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$575> $RTT = 
                x10.rtt.StaticFunType.<$Closure$575> make($Closure$575.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$575 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$575.class + " calling"); } 
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$575 $_obj = new Hello.$Closure$575((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                
            }
            
            // constructor just for allocation
            public $Closure$575(final java.lang.System[] $dummy) {
                
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
                
                //#line 144 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91141 = ((double)(long)(((long)(i))));
                
                //#line 144 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91142 = ((t$91141) * (((double)(1.0))));
                
                //#line 144 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91142;
            }
            
            public $Closure$575() {
                 {
                    
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$576 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$576> $RTT = 
                x10.rtt.StaticFunType.<$Closure$576> make($Closure$576.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.DOUBLE)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$576 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$576.class + " calling"); } 
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$576 $_obj = new Hello.$Closure$576((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                
            }
            
            // constructor just for allocation
            public $Closure$576(final java.lang.System[] $dummy) {
                
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
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long t$91145 = ((i) + (((long)(1L))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long t$91146 = ((i) * (((long)(t$91145))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91147 = ((double)(long)(((long)(t$91146))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91151 = ((t$91147) / (((double)(2.0))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long t$91148 = ((i) + (((long)(1L))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long t$91149 = ((1L) + (((long)(i))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final long t$91150 = ((t$91148) * (((long)(t$91149))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91152 = ((double)(long)(((long)(t$91150))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                final double t$91153 = ((t$91151) / (((double)(t$91152))));
                
                //#line 146 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                return t$91153;
            }
            
            public $Closure$576() {
                 {
                    
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$577 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$577> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$577> make($Closure$577.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$577 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$577.class + " calling"); } 
                $_obj.i$91191 = $deserializer.readLong();
                $_obj.l2 = $deserializer.readObject();
                $_obj.l3 = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$577 $_obj = new Hello.$Closure$577((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.i$91191);
                $serializer.write(this.l2);
                $serializer.write(this.l3);
                
            }
            
            // constructor just for allocation
            public $Closure$577(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2__2$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91192 = Hello.sumarRail__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.l2)), (long)(0L), (long)(this.i$91191));
                    
                    //#line 151 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    ((double[])this.l3.value)[(int)this.i$91191] = t$91192;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 150 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> l2;
            public long i$91191;
            public x10.core.Rail<x10.core.Double> l3;
            
            public $Closure$577(final x10.core.Rail<x10.core.Double> l2, final long i$91191, final x10.core.Rail<x10.core.Double> l3, __0$1x10$lang$Double$2__2$1x10$lang$Double$2 $dummy) {
                 {
                    this.l2 = ((x10.core.Rail)(l2));
                    this.i$91191 = i$91191;
                    this.l3 = ((x10.core.Rail)(l3));
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$578 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$578> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$578> make($Closure$578.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            private Object writeReplace() throws java.io.ObjectStreamException {
                return new x10.serialization.SerializationProxy(this);
            }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$578 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$578.class + " calling"); } 
                $_obj.i$91195 = $deserializer.readLong();
                $_obj.l3 = $deserializer.readObject();
                $_obj.l5 = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                Hello.$Closure$578 $_obj = new Hello.$Closure$578((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.i$91195);
                $serializer.write(this.l3);
                $serializer.write(this.l5);
                
            }
            
            // constructor just for allocation
            public $Closure$578(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Double$2__2$1x10$lang$Double$2 {}
            
        
            
            public void $apply() {
                
                //#line 167 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                try {{
                    
                    //#line 168 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    final double t$91196 = Hello.prodP__0$1x10$lang$Double$2$O(((x10.core.Rail)(this.l3)), (long)(1L), (long)(this.i$91195));
                    
                    //#line 168 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    ((double[])this.l5.value)[(int)this.i$91195] = t$91196;
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 167 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 167 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/sumaRara2/src/Hello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Double> l3;
            public long i$91195;
            public x10.core.Rail<x10.core.Double> l5;
            
            public $Closure$578(final x10.core.Rail<x10.core.Double> l3, final long i$91195, final x10.core.Rail<x10.core.Double> l5, __0$1x10$lang$Double$2__2$1x10$lang$Double$2 $dummy) {
                 {
                    this.l3 = ((x10.core.Rail)(l3));
                    this.i$91195 = i$91195;
                    this.l5 = ((x10.core.Rail)(l5));
                }
            }
            
        }
        
        }
        
        