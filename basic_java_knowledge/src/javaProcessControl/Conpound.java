package javaProcessControl;

import java.util.Scanner;

/**
 * ������䣺����䣬����������Ϊ��λ����䣬�ɿ����š�{����ʼ�������š�}������
 */
public class Conpound {
    public static void main(String[] args) {
        int x = 1;  //ȫ�ֱ����������������ڶ�������
        /**�������*/
        {
            int y = 2; //��������ڵľֲ��������������Ǹø�������ڲ�
            /*Ƕ�׸������*/
            {
               boolean b = x<y;         //Ƕ�׸�������ڵı������������Ǹ�Ƕ�׸�������ڲ�
                System.out.println(b);
            }
            /*��һ��Ƕ�׸������*/
            {
                boolean b =x>y;       //�ñ�������һ��Ƕ�׸�������ڵı���ͬ����ͬ���ͣ�����������Ƕ�׸�����������򲻲������棬Ҳ���������������
                System.out.println(b);
            }
            System.out.println(y);
        }

        /** �������*/
        /* ���������ֻ��һ�����ʱ��������{}����ʡ�ԣ��������飬�����ϴ���淶�������˴���ɶ���*/
        if (x == 1)
            System.out.println(x);
        /* if ����else �������*/
        if (x != 1){
            System.out.println("���� ��������");
        }else {
            System.out.println(x);
        }
        /* if,,else if���֧�ṹ*/
        //��else���ٽ���һ��if����else��䣬�����кܶ��

        /** swithѡ����� Ϊ��Ա�����䲿��*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������");
        String name = scanner.next();
        System.out.println("������ʹ�õļ��������");
        String language = scanner.next();

        switch (language.hashCode()){
            case 3254818:                                                  //java�Ĺ�ϣ��
            case 2301506:                                                  //Java�Ĺ�ϣ��
            case 2269730:                                                  //JAVA�Ĺ�ϣ��
                System.out.println("Ա��"+name+"�����䵽JAVA���򿪷�����");
                break;
            case 3104:                                                     //c#�Ĺ�ϣ��
            case 2112:                                                     //C#�Ĺ�ϣ��
                System.out.println("Ա��"+name+"�����䵽C#��Ŀά����");
                break;
            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("Ա��"+name+"�����䵽Asp.net������Բ���");
                break;
            default:
                System.out.println("����Ҫ"+language+"���Կ�������Ա");
        }

    }
}
