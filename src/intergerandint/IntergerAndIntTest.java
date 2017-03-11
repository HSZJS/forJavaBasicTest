package intergerandint;

public class IntergerAndIntTest {
	public static void main(String[] args){
		  /*java 是一种非常纯洁的语言，但是为了方便还是引入了基本类型
	        *但是为了能够将这些基本对象当成对象操作，java为每一个基本类型进行了包装操作
	        * int的类型就是integer
	        * 从java5开始就引入了自动封箱和拆箱机制，使得二者可以互换
	        * Java 为每个原始类型提供了包装类型：
	        * - 原始类型: boolean，char，byte，short，int，long，float，double
	        * - 包装类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double
	        * */
	        Integer a = new Integer(3);
	        Integer b = 3;                  // 将3自动装箱成Integer类型 
	        int c = 3;
	        System.out.println(a == b);     // false 两个引用没有引用同一对象
	        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
	}

}
