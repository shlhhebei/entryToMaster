package javaProcessControl;

import java.util.Scanner;

/**
 * 复合语句：块语句，以整个块区为单位的语句，由开括号‘{’开始，闭括号‘}’结束
 */
public class Conpound {
    public static void main(String[] args) {
        int x = 1;  //全局变量，整个方法体内都可以用
        /**复合语句*/
        {
            int y = 2; //复合语句内的局部变量，作用域是该复合语句内部
            /*嵌套复合语句*/
            {
               boolean b = x<y;         //嵌套复合语句内的变量，作用域是该嵌套复合语句内部
                System.out.println(b);
            }
            /*又一个嵌套复合语句*/
            {
                boolean b =x>y;       //该变量与上一个嵌套复合语句内的变量同名，同类型，由于这两个嵌套复合语句作用域不产生干涉，也可以这样定义变量
                System.out.println(b);
            }
            System.out.println(y);
        }

        /** 条件语句*/
        /* 当语句序列只有一条语句时，大括号{}可以省略，但不建议，不符合代码规范，降低了代码可读性*/
        if (x == 1)
            System.out.println(x);
        /* if ，，else ，，语句*/
        if (x != 1){
            System.out.println("不会 输出此语句");
        }else {
            System.out.println(x);
        }
        /* if,,else if多分支结构*/
        //即else后再紧跟一个if，，else语句，可以有很多个

        /** swith选择语句 为新员工分配部门*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.next();
        System.out.println("输入所使用的计算机语言");
        String language = scanner.next();

        switch (language.hashCode()){
            case 3254818:                                                  //java的哈希码
            case 2301506:                                                  //Java的哈希码
            case 2269730:                                                  //JAVA的哈希码
                System.out.println("员工"+name+"被分配到JAVA程序开发部门");
                break;
            case 3104:                                                     //c#的哈希码
            case 2112:                                                     //C#的哈希码
                System.out.println("员工"+name+"被分配到C#项目维护组");
                break;
            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("员工"+name+"被分配到Asp.net程序测试部门");
                break;
            default:
                System.out.println("不需要"+language+"语言开发的人员");
        }

    }
}
