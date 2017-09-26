
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
    
    

    
    
    //#line 11 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
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
    public static void main(final x10.core.Rail<java.lang.String> id$0) {
        
        //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1606 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 13 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1606.println(((java.lang.Object)("Funciones de cadena y caracteres")));
        
        //#line 14 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        java.lang.String palabra1 =  null;
        
        //#line 15 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        java.lang.String palabra2 =  null;
        
        //#line 16 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        java.lang.String semana =  null;
        
        //#line 17 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        java.lang.String numeroS = "456";
        
        //#line 18 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        double numero = ((double)(long)(((long)(123L))));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1612 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1609 = numero;
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1607 = ((java.lang.String)(numeroS));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final long t$1608 = x10.util.StringUtil.parseLong$O(((java.lang.String)(t$1607)));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1610 = ((double)(long)(((long)(t$1608))));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1611 = ((t$1609) + (((double)(t$1610))));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1613 = (("parseLong: ") + ((x10.core.Double.$box(t$1611))));
        
        //#line 20 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1612.println(((java.lang.Object)(t$1613)));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1618 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1615 = numero;
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1614 = ((java.lang.String)(numeroS));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1616 = java.lang.Double.parseDouble(t$1614);
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1617 = ((t$1615) + (((double)(t$1616))));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1619 = (("parse: ") + ((x10.core.Double.$box(t$1617))));
        
        //#line 21 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1618.println(((java.lang.Object)(t$1619)));
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final double t$1620 = numero;
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1621 = java.lang.Double.toString(t$1620);
        
        //#line 22 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        palabra1 = ((java.lang.String)(t$1621));
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1624 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1622 = ((java.lang.String)(palabra1));
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.core.Rail t$1623 = x10.runtime.impl.java.ArrayUtils.<x10.core.Char>makeRailFromJavaArray(x10.rtt.Types.CHAR, (t$1622).toCharArray(), false);
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1625 = (("chars: ") + (t$1623));
        
        //#line 23 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1624.println(((java.lang.Object)(t$1625)));
        
        //#line 24 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        palabra1 = ((java.lang.String)("Felzz Navidad"));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1628 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1626 = ((java.lang.String)(palabra1));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1627 = (t$1626).charAt(((int)(6)));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1629 = (("charAT: ") + ((x10.core.Char.$box(t$1627))));
        
        //#line 26 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1628.println(((java.lang.Object)(t$1629)));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1632 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1630 = ((java.lang.String)(palabra1));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1631 = (t$1630).charAt(((int)(6)));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1633 = (("operator: ") + ((x10.core.Char.$box(t$1631))));
        
        //#line 28 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1632.println(((java.lang.Object)(t$1633)));
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1634 = ((java.lang.String)(palabra1));
        
        //#line 29 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.core.Rail palachar = x10.runtime.impl.java.ArrayUtils.<x10.core.Char>makeRailFromJavaArray(x10.rtt.Types.CHAR, (t$1634).toCharArray(), false);
        
        //#line 30 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        ((char[])palachar.value)[(int)3L] = 'i';
        
        //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1635 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1636 = (("chars: ") + (palachar));
        
        //#line 31 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1635.println(((java.lang.Object)(t$1636)));
        
        //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1637 = ((java.lang.String)(new java.lang.String((palachar).getCharArray())));
        
        //#line 32 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        palabra1 = ((java.lang.String)(t$1637));
        
        //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1638 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1639 = ((java.lang.String)(palabra1));
        
        //#line 33 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1638.println(((java.lang.Object)(t$1639)));
        
        //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1640 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 34 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1640.println(((java.lang.Object)("compareTo:")));
        
        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1642 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1641 = ("manzana").compareTo("mandarina");
        
        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1643 = (("Mayor: ") + ((x10.core.Int.$box(t$1641))));
        
        //#line 35 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1642.println(((java.lang.Object)(t$1643)));
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1645 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1644 = ("hola").compareTo("hola");
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1646 = (("Igual: ") + ((x10.core.Int.$box(t$1644))));
        
        //#line 36 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1645.println(((java.lang.Object)(t$1646)));
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1648 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1647 = ("hoLa").compareTo("hola");
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1649 = (("Menor: ") + ((x10.core.Int.$box(t$1647))));
        
        //#line 37 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1648.println(((java.lang.Object)(t$1649)));
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1651 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1650 = ("hoLa").compareToIgnoreCase("hola");
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1652 = (("compareToIgnoreCase:") + ((x10.core.Int.$box(t$1650))));
        
        //#line 38 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1651.println(((java.lang.Object)(t$1652)));
        
        //#line 39 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        semana = ((java.lang.String)("domingo lunes martEs mi\351rcoles juevEs viernes s\341bado"));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1653 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1654 = ((java.lang.String)(semana));
        
        //#line 41 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1653.println(((java.lang.Object)(t$1654)));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1657 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1655 = ((java.lang.String)(semana));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1656 = (t$1655).startsWith("domi");
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1658 = (("startsWith: ") + ((x10.core.Boolean.$box(t$1656))));
        
        //#line 42 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1657.println(((java.lang.Object)(t$1658)));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1661 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1659 = ((java.lang.String)(semana));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1660 = (t$1659).startsWith("lunes");
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1662 = (("startsWith: ") + ((x10.core.Boolean.$box(t$1660))));
        
        //#line 43 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1661.println(((java.lang.Object)(t$1662)));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1665 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1663 = ((java.lang.String)(semana));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1664 = (t$1663).endsWith("s\341bado");
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1666 = (("endsWith: ") + ((x10.core.Boolean.$box(t$1664))));
        
        //#line 44 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1665.println(((java.lang.Object)(t$1666)));
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1669 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1667 = ((java.lang.String)(semana));
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1668 = (t$1667).endsWith("lunes");
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1670 = (("endsWith: ") + ((x10.core.Boolean.$box(t$1668))));
        
        //#line 45 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1669.println(((java.lang.Object)(t$1670)));
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1672 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1671 = ("hola").equals("Hola");
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1673 = (("equals: ") + ((x10.core.Boolean.$box(t$1671))));
        
        //#line 47 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1672.println(((java.lang.Object)(t$1673)));
        
        //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1675 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1674 = ("hola").equalsIgnoreCase("Hola");
        
        //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1676 = (("equalsIgnoreCase: ") + ((x10.core.Boolean.$box(t$1674))));
        
        //#line 48 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1675.println(((java.lang.Object)(t$1676)));
        
        //#line 50 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1677 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 50 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1678 = ((java.lang.String)(semana));
        
        //#line 50 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1677.println(((java.lang.Object)(t$1678)));
        
        //#line 51 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1679 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 51 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1679.println(((java.lang.Object)("indexOf y lastIndexOf")));
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1681 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1680 = ((java.lang.String)(semana));
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1682 = (t$1680).indexOf("Es");
        
        //#line 52 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1681.println(x10.core.Int.$box(t$1682));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1684 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1683 = ((java.lang.String)(semana));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1685 = (t$1683).indexOf("Es", ((int)(19)));
        
        //#line 53 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1684.println(x10.core.Int.$box(t$1685));
        
        //#line 54 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1687 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 54 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1686 = ((java.lang.String)(semana));
        
        //#line 54 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1688 = (t$1686).lastIndexOf("Es");
        
        //#line 54 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1687.println(x10.core.Int.$box(t$1688));
        
        //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1690 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1689 = ((java.lang.String)(semana));
        
        //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1691 = (t$1689).lastIndexOf("Es", ((int)(34)));
        
        //#line 55 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1690.println(x10.core.Int.$box(t$1691));
        
        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1692 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1693 = ((java.lang.String)(palabra1));
        
        //#line 56 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1692.println(((java.lang.Object)(t$1693)));
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1696 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1694 = ((java.lang.String)(palabra1));
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1695 = (t$1694).length();
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1697 = (("length: ") + ((x10.core.Int.$box(t$1695))));
        
        //#line 57 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1696.println(((java.lang.Object)(t$1697)));
        
        //#line 58 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1698 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 58 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1698.println(((java.lang.Object)("Operadores +, <, <=, >, >= :")));
        
        //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1699 = ((java.lang.String)(palabra1));
        
        //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1700 = ((t$1699) + (" y A\321O Nuevo 2016"));
        
        //#line 59 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        palabra2 = ((java.lang.String)(t$1700));
        
        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1701 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1702 = ((java.lang.String)(palabra2));
        
        //#line 60 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1701.println(((java.lang.Object)(t$1702)));
        
        //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1705 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1703 = ((java.lang.String)(palabra2));
        
        //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1704 = ((t$1703) + (" 2017"));
        
        //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1706 = (("operator+: ") + (t$1704));
        
        //#line 61 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1705.println(((java.lang.Object)(t$1706)));
        
        //#line 62 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1707 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 62 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1708 = (("manzana").compareTo("mandarina") >= 0);
        
        //#line 62 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1707.println(x10.core.Boolean.$box(t$1708));
        
        //#line 63 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1709 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 63 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1710 = (("manZana").compareTo("mandarina") >= 0);
        
        //#line 63 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1709.println(x10.core.Boolean.$box(t$1710));
        
        //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1711 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1712 = (("manzana").compareTo("mandarina") >= 0);
        
        //#line 64 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1711.println(x10.core.Boolean.$box(t$1712));
        
        //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1713 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1714 = (("manZana").compareTo("mandarina") >= 0);
        
        //#line 65 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1713.println(x10.core.Boolean.$box(t$1714));
        
        //#line 66 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1715 = ((java.lang.String)(palabra2));
        
        //#line 66 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.core.Rail cadena = x10.lang.StringHelper.split(" ", t$1715);
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1716 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1717 = (("split: ") + (cadena));
        
        //#line 67 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1716.println(((java.lang.Object)(t$1717)));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1718 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1719 = ((java.lang.String)(palabra2));
        
        //#line 68 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1718.println(((java.lang.Object)(t$1719)));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1722 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1720 = ((java.lang.String)(palabra1));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1721 = (t$1720).substring(((int)(3)));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1723 = (("substring: ") + (t$1721));
        
        //#line 69 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1722.println(((java.lang.Object)(t$1723)));
        
        //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1726 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1724 = ((java.lang.String)(palabra1));
        
        //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1725 = (t$1724).substring(((int)(3)), ((int)(8)));
        
        //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1727 = (("substring: ") + (t$1725));
        
        //#line 70 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1726.println(((java.lang.Object)(t$1727)));
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1730 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1728 = ((java.lang.String)(palabra2));
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1729 = (t$1728).toLowerCase();
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1731 = (("toLowerCase: ") + (t$1729));
        
        //#line 71 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1730.println(((java.lang.Object)(t$1731)));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1734 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1732 = ((java.lang.String)(palabra2));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1733 = (t$1732).toUpperCase();
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1735 = (("toUpperCase: ") + (t$1733));
        
        //#line 72 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1734.println(((java.lang.Object)(t$1735)));
        
        //#line 73 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        java.lang.String texto = " hola como estas ";
        
        //#line 74 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1736 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 74 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1737 = ((java.lang.String)(texto));
        
        //#line 74 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1736.println(((java.lang.Object)(t$1737)));
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1739 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1738 = ((java.lang.String)(texto));
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1740 = (t$1738).length();
        
        //#line 75 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1739.println(x10.core.Int.$box(t$1740));
        
        //#line 76 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1741 = ((java.lang.String)(texto));
        
        //#line 76 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1742 = (t$1741).trim();
        
        //#line 76 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        texto = ((java.lang.String)(t$1742));
        
        //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1744 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1743 = ((java.lang.String)(texto));
        
        //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1745 = (("trim: ") + (t$1743));
        
        //#line 77 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1744.println(((java.lang.Object)(t$1745)));
        
        //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1747 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1746 = ((java.lang.String)(texto));
        
        //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1748 = (t$1746).length();
        
        //#line 78 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1747.println(x10.core.Int.$box(t$1748));
        
        //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1749 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 79 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1749.println(((java.lang.Object)("-------------------")));
        
        //#line 80 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1751 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 80 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1750 = ((char) (((int)(65))));
        
        //#line 80 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1752 = (("chr: ") + ((x10.core.Char.$box(t$1750))));
        
        //#line 80 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1751.println(((java.lang.Object)(t$1752)));
        
        //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1754 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final int t$1753 = ((int) ('A'));
        
        //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1755 = (("ord: ") + ((x10.core.Int.$box(t$1753))));
        
        //#line 81 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1754.println(((java.lang.Object)(t$1755)));
        
        //#line 83 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1756 = ((java.lang.String)(texto));
        
        //#line 83 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.core.Rail railbit = x10.runtime.impl.java.ArrayUtils.<x10.core.Byte>makeRailFromJavaArray(x10.rtt.Types.BYTE, (t$1756).getBytes(), false);
        
        //#line 84 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1757 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 84 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1758 = (("bytes: ") + (railbit));
        
        //#line 84 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1757.println(((java.lang.Object)(t$1758)));
        
        //#line 85 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        char letra = 'z';
        
        //#line 86 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        char digito = '7';
        
        //#line 87 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        char espacio = ' ';
        
        //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1761 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1759 = letra;
        
        //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1760 = java.lang.Character.isDigit(t$1759);
        
        //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1762 = (("IsDigit: ") + ((x10.core.Boolean.$box(t$1760))));
        
        //#line 88 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1761.println(((java.lang.Object)(t$1762)));
        
        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1765 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1763 = letra;
        
        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1764 = java.lang.Character.isLetter(t$1763);
        
        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1766 = (("isLetter: ") + ((x10.core.Boolean.$box(t$1764))));
        
        //#line 89 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1765.println(((java.lang.Object)(t$1766)));
        
        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1769 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1767 = espacio;
        
        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1768 = java.lang.Character.isLetterOrDigit(t$1767);
        
        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1770 = (("isLetterOrDigit: ") + ((x10.core.Boolean.$box(t$1768))));
        
        //#line 90 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1769.println(((java.lang.Object)(t$1770)));
        
        //#line 91 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1773 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 91 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1771 = espacio;
        
        //#line 91 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1772 = java.lang.Character.isSpaceChar(t$1771);
        
        //#line 91 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1774 = (("isSpaceChar: ") + ((x10.core.Boolean.$box(t$1772))));
        
        //#line 91 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1773.println(((java.lang.Object)(t$1774)));
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1777 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1775 = letra;
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1776 = java.lang.Character.isLowerCase(t$1775);
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1778 = (("isLowerCase: ") + ((x10.core.Boolean.$box(t$1776))));
        
        //#line 93 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1777.println(((java.lang.Object)(t$1778)));
        
        //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1781 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1779 = letra;
        
        //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final boolean t$1780 = java.lang.Character.isUpperCase(t$1779);
        
        //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1782 = (("isUpperCase: ") + ((x10.core.Boolean.$box(t$1780))));
        
        //#line 94 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1781.println(((java.lang.Object)(t$1782)));
        
        //#line 95 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1783 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 95 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1783.println(((java.lang.Object)("Operadores +, -, <, <=, >, >= :")));
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1786 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1784 = letra;
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1785 = ((char) ((((char)(t$1784))) - (((int)(1)))));
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1787 = (("Operador -: ") + ((x10.core.Char.$box(t$1785))));
        
        //#line 96 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1786.println(((java.lang.Object)(t$1787)));
        
        //#line 97 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1790 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 97 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1788 = letra;
        
        //#line 97 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1789 = ((char) ((((char)(t$1788))) + (((int)(1)))));
        
        //#line 97 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1791 = (("Operador +: ") + ((x10.core.Char.$box(t$1789))));
        
        //#line 97 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1790.println(((java.lang.Object)(t$1791)));
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1794 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1792 = letra;
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1793 = ((char) ((((char)(t$1792))) - (((int)(1)))));
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1795 = (("Operador -: ") + ((x10.core.Char.$box(t$1793))));
        
        //#line 98 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1794.println(((java.lang.Object)(t$1795)));
        
        //#line 99 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final x10.io.Printer t$1798 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 99 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1796 = letra;
        
        //#line 99 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final char t$1797 = ((char) ((((char)(t$1796))) + (((int)(1)))));
        
        //#line 99 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        final java.lang.String t$1799 = (("Operador +: ") + ((x10.core.Char.$box(t$1797))));
        
        //#line 99 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        t$1798.println(((java.lang.Object)(t$1799)));
    }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
            
            
            //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 6 "C:/Users/GERALD/Desktop/distribuido/x10dt/workspace/lab3/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
}

