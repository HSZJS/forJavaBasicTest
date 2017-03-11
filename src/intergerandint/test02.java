package intergerandint;

public class test02 {
	   public static void main(String[] args) {
	        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

	        System.out.println(f1 == f2);
	        System.out.println(f3 == f4);
	    }
	   /*如果不明就里很容易认为两个输出要么都是true要么都是false。
	    * 首先需要注意的是f1、f2、f3、f4四个变量都是Integer对象引用，所以下面的==运算比较的不是值而是引用。
	    * 装箱的本质是什么呢？
	    * 当我们给一个Integer对象赋一个int值的时候，会调用Integer类的静态方法valueOf，
	    * 如果看看valueOf的源代码就知道发生了什么。
	    * */
	   /**
	     * Cache to support the object identity semantics of autoboxing for values between
	     * -128 and 127 (inclusive) as required by JLS.
	     *
	     * The cache is initialized on first usage.  The size of the cache
	     * may be controlled by the {@code -XX:AutoBoxCacheMax=<size>} option.
	     * During VM initialization, java.lang.Integer.IntegerCache.high property
	     * may be set and saved in the private system properties in the
	     * sun.misc.VM class.
	     */
}
