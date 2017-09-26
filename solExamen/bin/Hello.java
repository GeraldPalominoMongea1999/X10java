
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
    
    

    
    
    //#line 14 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    /**
     * primero leer , encrptar escribir y desencriptar
     */
    public static long ascii$O(final char c) {
        
        //#line 15 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s = "abcdefghijklmn\361opqrstuvwxyz ";
        
        //#line 16 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s1 = "ABCDEFGHIJKLMN\321OPQRSTUVWXYZ";
        
        //#line 17 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String sn = "0123456789";
        
        //#line 18 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836833 = (s).indexOf(((char)(c)));
        
        //#line 18 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n = ((long)(((int)(t$1836833))));
        
        //#line 19 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836834 = (s1).indexOf(((char)(c)));
        
        //#line 19 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n1 = ((long)(((int)(t$1836834))));
        
        //#line 20 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836835 = (sn).indexOf(((char)(c)));
        
        //#line 20 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long nn = ((long)(((int)(t$1836835))));
        
        //#line 21 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836836 = n;
        
        //#line 21 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836853 = ((long) t$1836836) != ((long) -1L);
        
        //#line 21 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836853) {
            
            //#line 22 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836837 = n;
            
            //#line 22 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            return t$1836837;
        } else {
            
            //#line 23 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836838 = n1;
            
            //#line 23 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836852 = ((long) t$1836838) != ((long) -1L);
            
            //#line 23 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836852) {
                
                //#line 24 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836840 = n1;
                
                //#line 24 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836839 = (s).length();
                
                //#line 24 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836841 = ((long)(((int)(t$1836839))));
                
                //#line 24 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836842 = ((t$1836840) + (((long)(t$1836841))));
                
                //#line 24 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836842;
            } else {
                
                //#line 25 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836843 = nn;
                
                //#line 25 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1836851 = ((long) t$1836843) != ((long) -1L);
                
                //#line 25 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (t$1836851) {
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836845 = nn;
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final int t$1836844 = (s).length();
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836846 = ((long)(((int)(t$1836844))));
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836848 = ((t$1836845) + (((long)(t$1836846))));
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final int t$1836847 = (s1).length();
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836849 = ((long)(((int)(t$1836847))));
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836850 = ((t$1836848) + (((long)(t$1836849))));
                    
                    //#line 26 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    return t$1836850;
                }
            }
        }
        
        //#line 28 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836854 = (s).length();
        
        //#line 28 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836855 = ((long)(((int)(t$1836854))));
        
        //#line 28 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836856 = ((t$1836855) - (((long)(1L))));
        
        //#line 28 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return t$1836856;
    }
    
    
    //#line 30 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static char toChar$O(final long n) {
        
        //#line 31 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s = "abcdefghijklmn\361opqrstuvwxyz ";
        
        //#line 32 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s1 = "ABCDEFGHIJKLMN\321OPQRSTUVWXYZ";
        
        //#line 33 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String sn = "0123456789";
        
        //#line 34 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n1 = n;
        
        //#line 35 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836857 = (s).length();
        
        //#line 35 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836858 = ((long)(((int)(t$1836857))));
        
        //#line 35 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836884 = ((n) >= (((long)(t$1836858))));
        
        //#line 35 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836884) {
            
            //#line 36 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836860 = n1;
            
            //#line 36 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836859 = (s).length();
            
            //#line 36 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836861 = ((long)(((int)(t$1836859))));
            
            //#line 36 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836862 = ((t$1836860) - (((long)(t$1836861))));
            
            //#line 36 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            n1 = t$1836862;
            
            //#line 40 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836864 = n1;
            
            //#line 40 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836863 = (s1).length();
            
            //#line 40 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836865 = ((long)(((int)(t$1836863))));
            
            //#line 40 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836880 = ((t$1836864) >= (((long)(t$1836865))));
            
            //#line 40 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836880) {
                
                //#line 41 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836867 = n1;
                
                //#line 41 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836866 = (s1).length();
                
                //#line 41 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836868 = ((long)(((int)(t$1836866))));
                
                //#line 41 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836869 = ((t$1836867) - (((long)(t$1836868))));
                
                //#line 41 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                n1 = t$1836869;
                
                //#line 42 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836871 = n1;
                
                //#line 42 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836870 = (sn).length();
                
                //#line 42 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836872 = ((long)(((int)(t$1836870))));
                
                //#line 42 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1836876 = ((t$1836871) > (((long)(t$1836872))));
                
                //#line 42 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (t$1836876) {
                    
                    //#line 43 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    return ' ';
                } else {
                    
                    //#line 45 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final long t$1836873 = n1;
                    
                    //#line 45 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final int t$1836874 = ((int)(long)(((long)(t$1836873))));
                    
                    //#line 45 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    final char t$1836875 = (sn).charAt(((int)(t$1836874)));
                    
                    //#line 45 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    return t$1836875;
                }
            } else {
                
                //#line 48 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836877 = n1;
                
                //#line 48 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836878 = ((int)(long)(((long)(t$1836877))));
                
                //#line 48 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836879 = (s1).charAt(((int)(t$1836878)));
                
                //#line 48 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836879;
            }
        } else {
            
            //#line 51 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836881 = n1;
            
            //#line 51 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836882 = ((int)(long)(((long)(t$1836881))));
            
            //#line 51 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1836883 = (s).charAt(((int)(t$1836882)));
            
            //#line 51 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            return t$1836883;
        }
    }
    
    
    //#line 55 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static char encriChar$O(final char c) {
        
        //#line 56 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s = "abcdefghijklmn\361opqrstuvwxyz ";
        
        //#line 57 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s1 = "ABCDEFGHIJKLMN\321OPQRSTUVWXYZ";
        
        //#line 58 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String sn = "0123456789";
        
        //#line 59 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n = Hello.ascii$O((char)(c));
        
        //#line 60 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n1 = Hello.ascii$O((char)(c));
        
        //#line 61 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836886 = n;
        
        //#line 61 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836885 = (s).length();
        
        //#line 61 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836887 = ((long)(((int)(t$1836885))));
        
        //#line 61 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836902 = ((t$1836886) < (((long)(t$1836887))));
        
        //#line 61 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836902) {
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836888 = n;
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836890 = ((t$1836888) + (((long)(3L))));
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836889 = (s).length();
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836891 = ((long)(((int)(t$1836889))));
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836901 = ((t$1836890) < (((long)(t$1836891))));
            
            //#line 62 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836901) {
                
                //#line 63 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836892 = n1;
                
                //#line 63 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836893 = ((t$1836892) + (((long)(3L))));
                
                //#line 63 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836894 = Hello.toChar$O((long)(t$1836893));
                
                //#line 63 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836894;
            } else {
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836895 = n1;
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836897 = ((t$1836895) + (((long)(3L))));
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836896 = (s).length();
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836898 = ((long)(((int)(t$1836896))));
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836899 = ((t$1836897) - (((long)(t$1836898))));
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836900 = Hello.toChar$O((long)(t$1836899));
                
                //#line 65 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836900;
            }
        }
        
        //#line 68 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836904 = n;
        
        //#line 68 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836903 = (s).length();
        
        //#line 68 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836905 = ((long)(((int)(t$1836903))));
        
        //#line 68 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836906 = ((t$1836904) - (((long)(t$1836905))));
        
        //#line 68 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        n = t$1836906;
        
        //#line 69 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836908 = n;
        
        //#line 69 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836907 = (s1).length();
        
        //#line 69 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836909 = ((long)(((int)(t$1836907))));
        
        //#line 69 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836924 = ((t$1836908) < (((long)(t$1836909))));
        
        //#line 69 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836924) {
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836910 = n;
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836912 = ((t$1836910) + (((long)(3L))));
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836911 = (s1).length();
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836913 = ((long)(((int)(t$1836911))));
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836923 = ((t$1836912) < (((long)(t$1836913))));
            
            //#line 70 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836923) {
                
                //#line 71 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836914 = n1;
                
                //#line 71 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836915 = ((t$1836914) + (((long)(3L))));
                
                //#line 71 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836916 = Hello.toChar$O((long)(t$1836915));
                
                //#line 71 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836916;
            } else {
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836917 = n1;
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836919 = ((t$1836917) + (((long)(3L))));
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836918 = (s1).length();
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836920 = ((long)(((int)(t$1836918))));
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836921 = ((t$1836919) - (((long)(t$1836920))));
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836922 = Hello.toChar$O((long)(t$1836921));
                
                //#line 73 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836922;
            }
        }
        
        //#line 76 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836926 = n;
        
        //#line 76 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836925 = (s1).length();
        
        //#line 76 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836927 = ((long)(((int)(t$1836925))));
        
        //#line 76 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836928 = ((t$1836926) - (((long)(t$1836927))));
        
        //#line 76 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        n = t$1836928;
        
        //#line 77 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836930 = n;
        
        //#line 77 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836929 = (sn).length();
        
        //#line 77 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836931 = ((long)(((int)(t$1836929))));
        
        //#line 77 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836946 = ((t$1836930) < (((long)(t$1836931))));
        
        //#line 77 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836946) {
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836932 = n;
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836934 = ((t$1836932) + (((long)(3L))));
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1836933 = (sn).length();
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836935 = ((long)(((int)(t$1836933))));
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836945 = ((t$1836934) < (((long)(t$1836935))));
            
            //#line 78 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836945) {
                
                //#line 79 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836936 = n1;
                
                //#line 79 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836937 = ((t$1836936) + (((long)(3L))));
                
                //#line 79 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836938 = Hello.toChar$O((long)(t$1836937));
                
                //#line 79 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836938;
            } else {
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836939 = n1;
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836941 = ((t$1836939) + (((long)(3L))));
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836940 = (sn).length();
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836942 = ((long)(((int)(t$1836940))));
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836943 = ((t$1836941) - (((long)(t$1836942))));
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836944 = Hello.toChar$O((long)(t$1836943));
                
                //#line 81 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836944;
            }
        }
        
        //#line 85 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return c;
    }
    
    
    //#line 87 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static char desencriChar$O(final char c) {
        
        //#line 88 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s = "abcdefghijklmn\361opqrstuvwxyz ";
        
        //#line 89 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s1 = "ABCDEFGHIJKLMN\321OPQRSTUVWXYZ";
        
        //#line 90 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String sn = "0123456789";
        
        //#line 91 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n = Hello.ascii$O((char)(c));
        
        //#line 92 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long n1 = Hello.ascii$O((char)(c));
        
        //#line 93 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836948 = n;
        
        //#line 93 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836947 = (s).length();
        
        //#line 93 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836949 = ((long)(((int)(t$1836947))));
        
        //#line 93 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836962 = ((t$1836948) < (((long)(t$1836949))));
        
        //#line 93 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836962) {
            
            //#line 94 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836950 = n;
            
            //#line 94 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836951 = ((t$1836950) - (((long)(3L))));
            
            //#line 94 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836961 = ((t$1836951) >= (((long)(0L))));
            
            //#line 94 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836961) {
                
                //#line 95 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836952 = n1;
                
                //#line 95 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836953 = ((t$1836952) - (((long)(3L))));
                
                //#line 95 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836954 = Hello.toChar$O((long)(t$1836953));
                
                //#line 95 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836954;
            } else {
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836955 = n1;
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836957 = ((t$1836955) - (((long)(3L))));
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836956 = (s).length();
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836958 = ((long)(((int)(t$1836956))));
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836959 = ((t$1836957) + (((long)(t$1836958))));
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836960 = Hello.toChar$O((long)(t$1836959));
                
                //#line 97 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836960;
            }
        }
        
        //#line 100 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836964 = n;
        
        //#line 100 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836963 = (s).length();
        
        //#line 100 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836965 = ((long)(((int)(t$1836963))));
        
        //#line 100 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836966 = ((t$1836964) - (((long)(t$1836965))));
        
        //#line 100 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        n = t$1836966;
        
        //#line 102 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836968 = n;
        
        //#line 102 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836967 = (s1).length();
        
        //#line 102 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836969 = ((long)(((int)(t$1836967))));
        
        //#line 102 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1836982 = ((t$1836968) < (((long)(t$1836969))));
        
        //#line 102 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1836982) {
            
            //#line 103 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836970 = n;
            
            //#line 103 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836971 = ((t$1836970) - (((long)(3L))));
            
            //#line 103 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1836981 = ((t$1836971) >= (((long)(0L))));
            
            //#line 103 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1836981) {
                
                //#line 104 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836972 = n1;
                
                //#line 104 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836973 = ((t$1836972) - (((long)(3L))));
                
                //#line 104 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836974 = Hello.toChar$O((long)(t$1836973));
                
                //#line 104 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836974;
            } else {
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836975 = n1;
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836977 = ((t$1836975) - (((long)(3L))));
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836976 = (s1).length();
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836978 = ((long)(((int)(t$1836976))));
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836979 = ((t$1836977) + (((long)(t$1836978))));
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836980 = Hello.toChar$O((long)(t$1836979));
                
                //#line 106 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836980;
            }
        }
        
        //#line 109 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836984 = n;
        
        //#line 109 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836983 = (s1).length();
        
        //#line 109 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836985 = ((long)(((int)(t$1836983))));
        
        //#line 109 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836986 = ((t$1836984) - (((long)(t$1836985))));
        
        //#line 109 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        n = t$1836986;
        
        //#line 111 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836988 = n;
        
        //#line 111 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1836987 = (sn).length();
        
        //#line 111 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1836989 = ((long)(((int)(t$1836987))));
        
        //#line 111 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final boolean t$1837002 = ((t$1836988) < (((long)(t$1836989))));
        
        //#line 111 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        if (t$1837002) {
            
            //#line 112 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836990 = n;
            
            //#line 112 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final long t$1836991 = ((t$1836990) - (((long)(3L))));
            
            //#line 112 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1837001 = ((t$1836991) >= (((long)(0L))));
            
            //#line 112 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (t$1837001) {
                
                //#line 113 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836992 = n1;
                
                //#line 113 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836993 = ((t$1836992) - (((long)(3L))));
                
                //#line 113 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1836994 = Hello.toChar$O((long)(t$1836993));
                
                //#line 113 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1836994;
            } else {
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836995 = n1;
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836997 = ((t$1836995) - (((long)(3L))));
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1836996 = (sn).length();
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836998 = ((long)(((int)(t$1836996))));
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1836999 = ((t$1836997) + (((long)(t$1836998))));
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1837000 = Hello.toChar$O((long)(t$1836999));
                
                //#line 115 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                return t$1837000;
            }
        }
        
        //#line 119 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return c;
    }
    
    
    //#line 121 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static java.lang.String encriptar(final java.lang.String s) {
        
        //#line 122 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        java.lang.String pal = "";
        
        //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        int i$1837123 = ((int)(long)(((long)(0L))));
        
        //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837124 = i$1837123;
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837125 = (s).length();
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1837126 = ((t$1837124) < (((int)(t$1837125))));
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (!(t$1837126)) {
                
                //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                break;
            }
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837116 = ((java.lang.String)(pal));
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837117 = i$1837123;
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837118 = (s).charAt(((int)(t$1837117)));
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837119 = Hello.encriChar$O((char)(t$1837118));
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837120 = ((t$1837116) + ((x10.core.Char.$box(t$1837119))));
            
            //#line 124 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            pal = ((java.lang.String)(t$1837120));
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837121 = i$1837123;
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837122 = ((t$1837121) + (((int)(1))));
            
            //#line 123 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            i$1837123 = t$1837122;
        }
        
        //#line 126 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837014 = ((java.lang.String)(pal));
        
        //#line 126 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return t$1837014;
    }
    
    
    //#line 128 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static java.lang.String desencriptar(final java.lang.String s) {
        
        //#line 129 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        java.lang.String pal = "";
        
        //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        int i$1837134 = ((int)(long)(((long)(0L))));
        
        //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837135 = i$1837134;
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837136 = (s).length();
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1837137 = ((t$1837135) < (((int)(t$1837136))));
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (!(t$1837137)) {
                
                //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                break;
            }
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837127 = ((java.lang.String)(pal));
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837128 = i$1837134;
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837129 = (s).charAt(((int)(t$1837128)));
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837130 = Hello.desencriChar$O((char)(t$1837129));
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837131 = ((t$1837127) + ((x10.core.Char.$box(t$1837130))));
            
            //#line 131 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            pal = ((java.lang.String)(t$1837131));
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837132 = i$1837134;
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837133 = ((t$1837132) + (((int)(1))));
            
            //#line 130 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            i$1837134 = t$1837133;
        }
        
        //#line 133 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837026 = ((java.lang.String)(pal));
        
        //#line 133 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return t$1837026;
    }
    
    
    //#line 135 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static void impln(final java.lang.String s) {
        
        //#line 136 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.Printer t$1837027 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 136 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        t$1837027.println(((java.lang.Object)(s)));
    }
    
    
    //#line 138 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static void imp(final java.lang.String s) {
        
        //#line 139 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.Printer t$1837028 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 139 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        t$1837028.print(((java.lang.String)(s)));
    }
    
    
    //#line 141 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static void impRail__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> ra, final long total) {
        
        //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long i = 1L;
        {
            
            //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra$value$1837204 = ((java.lang.String[])ra.value);
            
            //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837030 = i;
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837035 = ((t$1837030) < (((long)(total))));
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837035)) {
                    
                    //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 143 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837138 = i;
                
                //#line 143 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837139 = ((java.lang.String)ra$value$1837204[(int)t$1837138]);
                
                //#line 143 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                Hello.impln(((java.lang.String)(t$1837139)));
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837140 = i;
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837141 = ((t$1837140) + (((long)(1L))));
                
                //#line 142 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                i = t$1837141;
            }
        }
    }
    
    
    //#line 146 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static x10.core.Rail leer(final x10.io.File f, final long total) {
        
        //#line 147 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail ra = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(total)), ((java.lang.String)("")), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 148 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.ReaderIterator lines = f.lines();
        
        //#line 149 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long cont = 1L;
        {
            
            //#line 150 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra$value$1837205 = ((java.lang.String[])ra.value);
            
            //#line 150 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            while (true) {
                
                //#line 150 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837040 = ((x10.io.ReaderIterator<java.lang.String>)lines).hasNext$O();
                
                //#line 150 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837040)) {
                    
                    //#line 150 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 151 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837142 = cont;
                
                //#line 151 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837143 = ((x10.io.ReaderIterator<java.lang.String>)lines).next$G();
                
                //#line 151 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                ra$value$1837205[(int)t$1837142]=t$1837143;
                
                //#line 152 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837144 = cont;
                
                //#line 152 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837145 = ((t$1837144) + (((long)(1L))));
                
                //#line 152 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                cont = t$1837145;
            }
        }
        
        //#line 154 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837041 = cont;
        
        //#line 154 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837042 = (((x10.core.Long.$box(t$1837041))) + (""));
        
        //#line 154 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        ((java.lang.String[])ra.value)[(int)0L] = t$1837042;
        
        //#line 155 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return ra;
    }
    
    
    //#line 157 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static void escribir__1$1x10$lang$String$2(final java.lang.String ubi, final x10.core.Rail<java.lang.String> ra, final long total) {
        
        //#line 158 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.File f = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(ubi)))));
        
        //#line 159 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.Printer escritor = f.printer();
        
        //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long j$1837150 = 1L;
        {
            
            //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra$value$1837206 = ((java.lang.String[])ra.value);
            
            //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837151 = j$1837150;
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837152 = ((t$1837151) < (((long)(total))));
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837152)) {
                    
                    //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 161 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837146 = j$1837150;
                
                //#line 161 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837147 = ((java.lang.String)ra$value$1837206[(int)t$1837146]);
                
                //#line 161 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                escritor.println(((java.lang.Object)(t$1837147)));
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837148 = j$1837150;
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837149 = ((t$1837148) + (((long)(1L))));
                
                //#line 160 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                j$1837150 = t$1837149;
            }
        }
        
        //#line 163 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        escritor.flush();
    }
    
    
    //#line 165 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static x10.core.Rail encripRail__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> ra, final long total) {
        
        //#line 166 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837050 = ((total) + (((long)(1L))));
        
        //#line 166 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail ra2 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$1837050)));
        
        //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long i$1837159 = 1L;
        {
            
            //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra$value$1837207 = ((java.lang.String[])ra.value);
            
            //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra2$value$1837208 = ((java.lang.String[])ra2.value);
            
            //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837160 = i$1837159;
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837161 = ((t$1837160) < (((long)(total))));
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837161)) {
                    
                    //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 168 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837153 = i$1837159;
                
                //#line 168 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837154 = i$1837159;
                
                //#line 168 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837155 = ((java.lang.String)ra$value$1837207[(int)t$1837154]);
                
                //#line 168 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837156 = Hello.encriptar(((java.lang.String)(t$1837155)));
                
                //#line 168 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                ra2$value$1837208[(int)t$1837153]=t$1837156;
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837157 = i$1837159;
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837158 = ((t$1837157) + (((long)(1L))));
                
                //#line 167 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                i$1837159 = t$1837158;
            }
        }
        
        //#line 170 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return ra2;
    }
    
    
    //#line 172 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static x10.core.Rail desencripRail__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> ra, final long total) {
        
        //#line 173 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837060 = ((total) + (((long)(1L))));
        
        //#line 173 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail ra2 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$1837060)));
        
        //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long i$1837168 = 1L;
        {
            
            //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra$value$1837209 = ((java.lang.String[])ra.value);
            
            //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra2$value$1837210 = ((java.lang.String[])ra2.value);
            
            //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837169 = i$1837168;
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837170 = ((t$1837169) < (((long)(total))));
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837170)) {
                    
                    //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 175 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837162 = i$1837168;
                
                //#line 175 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837163 = i$1837168;
                
                //#line 175 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837164 = ((java.lang.String)ra$value$1837209[(int)t$1837163]);
                
                //#line 175 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837165 = Hello.desencriptar(((java.lang.String)(t$1837164)));
                
                //#line 175 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                ra2$value$1837210[(int)t$1837162]=t$1837165;
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837166 = i$1837168;
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837167 = ((t$1837166) + (((long)(1L))));
                
                //#line 174 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                i$1837168 = t$1837167;
            }
        }
        
        //#line 177 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return ra2;
    }
    
    
    //#line 179 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    public static void probarEncri() {
        
        //#line 180 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String raiz = ((java.lang.String)("//home//gerald//x10//proyectos//X10git//X10java//solExamen"));
        
        //#line 181 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String s = "abcdefghijklmn\361opqrstuvwxyz ABCDEFGHIJKLMN\321OPQRSTUVWXYZ0123456789";
        
        //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        int i$1837196 = ((int)(long)(((long)(0L))));
        
        //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837197 = i$1837196;
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837198 = (s).length();
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final boolean t$1837199 = ((t$1837197) < (((int)(t$1837198))));
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            if (!(t$1837199)) {
                
                //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                break;
            }
            
            //#line 183 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837171 = i$1837196;
            
            //#line 183 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            char c$1837172 = (s).charAt(((int)(t$1837171)));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837173 = c$1837172;
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837174 = (((x10.core.Char.$box(t$1837173))) + (" encri "));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837175 = c$1837172;
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837176 = Hello.encriChar$O((char)(t$1837175));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837177 = ((t$1837174) + ((x10.core.Char.$box(t$1837176))));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837178 = ((t$1837177) + (" desencri "));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837179 = c$1837172;
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837180 = Hello.encriChar$O((char)(t$1837179));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final char t$1837181 = Hello.desencriChar$O((char)(t$1837180));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String t$1837182 = ((t$1837178) + ((x10.core.Char.$box(t$1837181))));
            
            //#line 185 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            Hello.impln(((java.lang.String)(t$1837182)));
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837183 = i$1837196;
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final int t$1837184 = ((t$1837183) + (((int)(1))));
            
            //#line 182 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            i$1837196 = t$1837184;
        }
        
        //#line 188 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837087 = Hello.encriptar(((java.lang.String)(" 0123456789")));
        
        //#line 188 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.impln(((java.lang.String)(t$1837087)));
        
        //#line 189 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837088 = Hello.encriptar(((java.lang.String)(" a A z YXZ 0123456789")));
        
        //#line 189 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837089 = Hello.desencriptar(((java.lang.String)(t$1837088)));
        
        //#line 189 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.impln(((java.lang.String)(t$1837089)));
        
        //#line 190 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String se = Hello.encriptar(((java.lang.String)(s)));
        
        //#line 191 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1837090 = (s).length();
        
        //#line 191 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837091 = ((long)(((int)(t$1837090))));
        
        //#line 191 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837092 = ((t$1837091) + (((long)(1L))));
        
        //#line 191 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail ra2 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$1837092)));
        
        //#line 192 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        long cont = 1L;
        
        //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        int i$1837200 = ((int)(long)(((long)(0L))));
        {
            
            //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            final java.lang.String[] ra2$value$1837211 = ((java.lang.String[])ra2.value);
            
            //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837201 = i$1837200;
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837202 = (s).length();
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final boolean t$1837203 = ((t$1837201) < (((int)(t$1837202))));
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                if (!(t$1837203)) {
                    
                    //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                    break;
                }
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837185 = cont;
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837186 = i$1837200;
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1837187 = (s).charAt(((int)(t$1837186)));
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837188 = (((x10.core.Char.$box(t$1837187))) + (" "));
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837189 = i$1837200;
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final char t$1837190 = (se).charAt(((int)(t$1837189)));
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final java.lang.String t$1837191 = ((t$1837188) + ((x10.core.Char.$box(t$1837190))));
                
                //#line 194 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                ra2$value$1837211[(int)t$1837185]=t$1837191;
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837192 = i$1837200;
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final int t$1837193 = ((t$1837192) + (((int)(1))));
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                i$1837200 = t$1837193;
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837194 = cont;
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                final long t$1837195 = ((t$1837194) + (((long)(1L))));
                
                //#line 193 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
                cont = t$1837195;
            }
        }
        
        //#line 197 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837109 = "//home//gerald//x10//proyectos//X10git//X10java//solExamen//salida0.txt";
        
        //#line 197 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final int t$1837108 = (s).length();
        
        //#line 197 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long t$1837110 = ((long)(((int)(t$1837108))));
        
        //#line 197 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.escribir__1$1x10$lang$String$2(((java.lang.String)(t$1837109)), ((x10.core.Rail)(ra2)), (long)(t$1837110));
    }
    
    
    //#line 199 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
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
    public static void main(final x10.core.Rail<java.lang.String> id$1834135) {
        
        //#line 200 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.probarEncri();
        
        //#line 201 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String raiz = ((java.lang.String)("//home//gerald//x10//proyectos//X10git//X10java//solExamen"));
        
        //#line 202 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837111 = "//home//gerald//x10//proyectos//X10git//X10java//solExamen//original.txt";
        
        //#line 202 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.File orig = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$1837111)));
        
        //#line 203 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long max = 200L;
        
        //#line 204 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail ra = Hello.leer(((x10.io.File)(orig)), (long)(max));
        
        //#line 205 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837112 = ((java.lang.String[])ra.value)[(int)0L];
        
        //#line 205 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final long total = java.lang.Long.parseLong(t$1837112);
        
        //#line 207 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail raen = Hello.encripRail__0$1x10$lang$String$2(((x10.core.Rail)(ra)), (long)(total));
        
        //#line 209 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail rade = Hello.desencripRail__0$1x10$lang$String$2(((x10.core.Rail)(raen)), (long)(total));
        
        //#line 211 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837113 = "//home//gerald//x10//proyectos//X10git//X10java//solExamen//salida.txt";
        
        //#line 211 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.escribir__1$1x10$lang$String$2(((java.lang.String)(t$1837113)), ((x10.core.Rail)(raen)), (long)(total));
        
        //#line 212 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837114 = "//home//gerald//x10//proyectos//X10git//X10java//solExamen//salida.txt";
        
        //#line 212 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.io.File sal = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$1837114)));
        
        //#line 213 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail rasa = Hello.leer(((x10.io.File)(sal)), (long)(max));
        
        //#line 214 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final x10.core.Rail rasade = Hello.desencripRail__0$1x10$lang$String$2(((x10.core.Rail)(rasa)), (long)(total));
        
        //#line 215 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.impRail__0$1x10$lang$String$2(((x10.core.Rail)(rasade)), (long)(total));
        
        //#line 216 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        final java.lang.String t$1837115 = "//home//gerald//x10//proyectos//X10git//X10java//solExamen//salida2.txt";
        
        //#line 216 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        Hello.escribir__1$1x10$lang$String$2(((java.lang.String)(t$1837115)), ((x10.core.Rail)(rasade)), (long)(total));
    }
    
    
    //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            
            
            //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 9 "/home/gerald/x10/proyectos/X10git/X10java/solExamen/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
}

