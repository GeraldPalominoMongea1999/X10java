
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
    
    

    
    
    //#line 7 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
    public static void ordenar__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> Lista) {
        
        //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        long i = 2L;
        {
            
            //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            final java.lang.String[] Lista$value$5226 = ((java.lang.String[])Lista.value);
            
            //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5129 = i;
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5130 = ((x10.core.Rail<java.lang.String>)Lista).size;
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final boolean t$5155 = ((t$5129) <= (((long)(t$5130))));
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                if (!(t$5155)) {
                    
                    //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    break;
                }
                
                //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                long j$5192 = 0L;
                {
                    
                    //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5193 = j$5192;
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5194 = ((x10.core.Rail<java.lang.String>)Lista).size;
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5195 = i;
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5196 = ((t$5194) - (((long)(t$5195))));
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final boolean t$5197 = ((t$5193) <= (((long)(t$5196))));
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        if (!(t$5197)) {
                            
                            //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            break;
                        }
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5175 = j$5192;
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final java.lang.String t$5176 = ((java.lang.String)Lista$value$5226[(int)t$5175]);
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5177 = j$5192;
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5178 = ((t$5177) + (((long)(1L))));
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final java.lang.String t$5179 = ((java.lang.String)Lista$value$5226[(int)t$5178]);
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final boolean t$5180 = ((t$5176).compareTo(t$5179) > 0);
                        
                        //#line 10 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        if (t$5180) {
                            
                            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5181 = j$5192;
                            
                            //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            java.lang.String temp$5182 = ((java.lang.String)Lista$value$5226[(int)t$5181]);
                            
                            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5183 = j$5192;
                            
                            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5184 = j$5192;
                            
                            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5185 = ((t$5184) + (((long)(1L))));
                            
                            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final java.lang.String t$5186 = ((java.lang.String)Lista$value$5226[(int)t$5185]);
                            
                            //#line 12 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            Lista$value$5226[(int)t$5183]=t$5186;
                            
                            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5187 = j$5192;
                            
                            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final long t$5188 = ((t$5187) + (((long)(1L))));
                            
                            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            final java.lang.String t$5189 = ((java.lang.String)(temp$5182));
                            
                            //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                            Lista$value$5226[(int)t$5188]=t$5189;
                        }
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5190 = j$5192;
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        final long t$5191 = ((t$5190) + (((long)(1L))));
                        
                        //#line 9 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                        j$5192 = t$5191;
                    }
                }
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5198 = i;
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5199 = ((t$5198) + (((long)(1L))));
                
                //#line 8 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                i = t$5199;
            }
        }
    }
    
    
    //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
    public static void imprimir__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> Lista) {
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.core.Rail rail$5208 = ((x10.core.Rail)(Lista));
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final long size$5209 = ((x10.core.Rail<java.lang.String>)rail$5208).size;
        
        //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        long idx$5205 = 0L;
        {
            
            //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            final java.lang.String[] rail$5208$value$5227 = ((java.lang.String[])rail$5208.value);
            
            //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5206 = idx$5205;
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final boolean t$5207 = ((t$5206) < (((long)(size$5209))));
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                if (!(t$5207)) {
                    
                    //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    break;
                }
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5201 = idx$5205;
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final java.lang.String x$5202 = ((java.lang.String)(((java.lang.String)rail$5208$value$5227[(int)t$5201])));
                
                //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final x10.io.Printer t$5200 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                t$5200.println(((java.lang.Object)(x$5202)));
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5203 = idx$5205;
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5204 = ((t$5203) + (((long)(1L))));
                
                //#line 19 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                idx$5205 = t$5204;
            }
        }
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.Printer t$5163 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        t$5163.println();
    }
    
    
    //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
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
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 25 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.core.Rail Lista1 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(8L)))));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.core.Rail Lista2 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(8L)))));
        
        //#line 27 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.core.Rail Lista1Ord = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(8L)))));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.core.Rail Lista2Ord = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(8L)))));
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.File entrada1 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("C:\\Users\\GERALD\\Desktop\\Lista1.txt")))));
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        long i = 0L;
        
        //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.ReaderIterator lines1 = entrada1.lines();
        {
            
            //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            final java.lang.String[] Lista1$value$5228 = ((java.lang.String[])Lista1.value);
            
            //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            while (true) {
                
                //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final boolean t$5168 = ((x10.io.ReaderIterator<java.lang.String>)lines1).hasNext$O();
                
                //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                if (!(t$5168)) {
                    
                    //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    break;
                }
                
                //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5210 = i;
                
                //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final java.lang.String t$5211 = ((x10.io.ReaderIterator<java.lang.String>)lines1).next$G();
                
                //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                Lista1$value$5228[(int)t$5210]=t$5211;
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5212 = i;
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5213 = ((t$5212) + (((long)(1L))));
                
                //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                i = t$5213;
            }
        }
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.File entrada2 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("C:\\Users\\GERALD\\Desktop\\Lista2.txt")))));
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        i = 0L;
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.ReaderIterator lines2 = entrada2.lines();
        {
            
            //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            final java.lang.String[] Lista2$value$5229 = ((java.lang.String[])Lista2.value);
            
            //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            while (true) {
                
                //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final boolean t$5173 = ((x10.io.ReaderIterator<java.lang.String>)lines2).hasNext$O();
                
                //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                if (!(t$5173)) {
                    
                    //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    break;
                }
                
                //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5214 = i;
                
                //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final java.lang.String t$5215 = ((x10.io.ReaderIterator<java.lang.String>)lines2).next$G();
                
                //#line 40 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                Lista2$value$5229[(int)t$5214]=t$5215;
                
                //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5216 = i;
                
                //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                final long t$5217 = ((t$5216) + (((long)(1L))));
                
                //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                i = t$5217;
            }
        }
        {
            
            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            final x10.xrx.FinishState fs$5224 = x10.xrx.Runtime.startFinish();
            
            //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            try {{
                {
                    
                    //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$6(Lista1, (Hello.$Closure$6.__0$1x10$lang$String$2) null))));
                    
                    //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$7(Lista2, (Hello.$Closure$7.__0$1x10$lang$String$2) null))));
                }
            }}catch (java.lang.Throwable ct$5222) {
                
                //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$5222)));
                
                //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$5224)));
             }}
            }
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$String$2(((x10.core.Rail)(Lista1)));
        
        //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        Hello.imprimir__0$1x10$lang$String$2(((x10.core.Rail)(Lista2)));
        
        //#line 49 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        final x10.io.Printer t$5174 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 49 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        t$5174.print(((java.lang.String)("Fin del programa")));
        }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$6 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$6> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$6> make($Closure$6.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$6 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$6.class + " calling"); } 
            $_obj.Lista1 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$6 $_obj = new Hello.$Closure$6((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.Lista1);
            
        }
        
        // constructor just for allocation
        public $Closure$6(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            try {{
                
                //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                Hello.ordenar__0$1x10$lang$String$2(((x10.core.Rail)(this.Lista1)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail<java.lang.String> Lista1;
        
        public $Closure$6(final x10.core.Rail<java.lang.String> Lista1, __0$1x10$lang$String$2 $dummy) {
             {
                this.Lista1 = ((x10.core.Rail)(Lista1));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$7 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$7> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$7> make($Closure$7.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$7 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$7.class + " calling"); } 
            $_obj.Lista2 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$7 $_obj = new Hello.$Closure$7((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.Lista2);
            
        }
        
        // constructor just for allocation
        public $Closure$7(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
            try {{
                
                //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                Hello.ordenar__0$1x10$lang$String$2(((x10.core.Rail)(this.Lista2)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab4/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.Rail<java.lang.String> Lista2;
        
        public $Closure$7(final x10.core.Rail<java.lang.String> Lista2, __0$1x10$lang$String$2 $dummy) {
             {
                this.Lista2 = ((x10.core.Rail)(Lista2));
            }
        }
        
    }
    
    }
    
    