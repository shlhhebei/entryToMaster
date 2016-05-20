package javaFoundation;

/**
 *java对数据类型转换有严格规定，数据从占用内存空间较小的类型转换为占用内存大的类型，做自动类型转换（隐式类型转换），反之则必须做强制类型转换（显式类型转换）
 */
public class TypeConvert{
	public static void main(String[] args){
		int intNum = 4;
		float floatNum = 9.5F;

		floatNum /= intNum;     //自动转型为float类型
		System.out.println(floatNum);  //2.375

		double doubleNumX = 4.88;
		double doubleNumY = 9.75;
		double doubleNumZ = doubleNumX+doubleNumY;
		int intNumI = (int) (doubleNumX+doubleNumY);   //强制转型为int类型
		System.out.println("doubleNumZ="+doubleNumZ+"\tintNumI="+intNumI);  //结果为：doubleNumZ=14.6299999999，intNumI=14 （强制转型可能发生数据丢失）

		char charNum = 'T';
		int intNumT = (int)charNum;    //char类型转换为int类型
		System.out.println(charNum);  //输出 T
		System.out.println(intNumT);  //输出 84
	}

}