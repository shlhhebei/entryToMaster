package javaFoundation;

import java.util.Scanner;

/**
 * 运算符
 */
public class Operator {
    public static void main(String[] args) {
        /**
         * 根据 按位异或运算符 的运算法则 不使用第三变量实现两变量互换（整数类型）
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("变量A的值");
        long A = scanner.nextLong(); //输入3
        System.out.println("变量B的值");
        long B = scanner.nextLong(); //输入4
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换，不需要第三变量");
        /** ^ :按位异或运算符，双目运算符，位运算符。  运算规则：当两个操作数的二进制表示相同（同为0或1）时，结果为0，否则为1。结果精度跟随精度高的操作数*/
        A = A^B; //A=(0011)2^(0100)2=(0111)2
        B = B^A; //B=(0100)2^(0111)2=(0011)2
        A = A^B; //A=(0111)2^(0011)2=(0100)2
        System.out.println("A="+A+"\tB="+B);

        /**
         * 利用三目运算符，判断一个数字的奇偶性
         * 三目运算符： var = boolean ？ val1（boolean=true 时）: val2（boolean=false 时);  相当于一个if。。else语句
         * ”%“：取模运算符，算术运算符，求取余数，无余数则结果为0
         * ”= =“：比较运算符，判断运算符两遍的值是否相等，用于基本数据类型的比较，比较对象类型的值时是判断两个对象的 内存地址 是否相等
         *          判断对象的值是否相等用equals（）方法，
         * ”=“：赋值运算符，将符号右方操作数所含的值 赋值给左方的操作数。dataType var = val;
         */
        String check = (A%2 == 0)?"A是偶数":"A是奇数";
        System.out.println(check);
        System.out.println("==========================================================================");

        /**
         * "&&","&":逻辑与，逻辑运算符。当符号两遍的表达式都为true时，结果才为true。”&&“为短路运算符
         * ”||“，”|“ ：逻辑或，符号两遍的表达式，有一个为true，结果为true。 ”||“为短路运算符
         * ”！“：逻辑非，一元运算符，逻辑运算符，真为假，假为真
         * ”！=“：不等于，比较运算符 两遍的值不相等，结果为true
         */
        int j = 0;
        int n = 0;
        for (int i = 0; i < 10; i++) {
            if (i%2 != 0 && j++ !=0){   //短路运算符，当通过左端的表达式能推断出整个表达式的结果时，称为短路，不再运行符号右边的表达式
                System.out.println("j="+j);
            }if (i%2 == 0 & n++ != 0){
                System.out.println("n="+n);//n=3 j=2 n=5 j=3 n=7 j=4 n=9 j=5
            }
        }
    }
}
