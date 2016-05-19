package javaFoundation;

/**
 * 基础数据类型
 */
public class BasicDataType {
    /**
     * 布尔类型：又称逻辑类型，值为true和false，分别表示布尔逻辑中的”真“和”假“
     */
    boolean bl =true;
    /**
     * char类型:字符类型，用来储存单个字符，并用单引号括起来（有且只有一个字符，多了就是字符串了，要用双引号括起来）
     */
    static char c = 'a'; //分配2个字节内存空间
    static char x = 97; //由于字符a在unicode表中的排序位置是97，所以上句也可以写成 char c = 97
    static char xi = '\\';//转义字符，把'\'赋值给char 转义字符是一种特殊的字符
    static char w ='\u2605';//unicode码，是个五角星
    /**
     * 整数类型：用来储存整数数值，即没有小数部分的数值，可以是正数、负数或 零
     */
    static byte b = 123; //byte型，内存空间8位（一个字节），取值范围：-128~127，注意溢出
    static short s = 12345; //短整型，内存空间16位（两个字节），取值范围：-32768~32767  注意溢出
    static int i = 1234567890;   //整型， 内存空间32位（四个字节），取值范围：-2147483648~2147483647
    static long l = 1234567890L;  //长整型，内存空间64位（八个字节），取值范围：-9223372036854775808~9223372036854775807  定义时数值后加‘L’
    /**
     *浮点类型：用来储存浮点型数值，有小数部分的数值  分 单精度浮点类型float 双精度浮点类型double
     */
    static float f = 3.14f; // 32位（四个字节）  1.4E-45~3.4028235-E38             赋值时必须在末尾添加 f 或 F
    static double d = 3.14;  //64位（八个字节）  4.9E-324~1.7976931348623157E-308  浮点型默认类型
    public static void main(String[] args) {
        /** 四种不同类型的整数类型相加，结果取long类型，自动转型*/
        System.out.println(b+s+i+l);
        /** 结果为6.280000104904175 一个16位的double类型的数（float是8位的），自动转型 */
        System.out.println(f+d);
        /** 结果为 97  a a 97    char类型可以转型为整数类型，值是该字符在unicode表中的排序位置 */
        System.out.println((int)c+" "+c+" "+x+" "+(int)x);
        /* 零到九这几个自然数的unicode码是 48到57 */
        char o = '0';
        System.out.println("自然数0的unicode码是："+(int)o);
        System.out.println(w+" "+xi+" "+(int)xi);
        char uc ='\u00FA';
        System.out.println(uc);
    }


}
