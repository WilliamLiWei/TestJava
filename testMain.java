import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import TestJava.*;

public class testMain {

	public static void main(final String[] args) {
        // Auto-generated method stub
        System.out.println("Begin");
        String tempStr = "";
        for (int i = 0; i < 10; i++) {
            tempStr += i;
        }
        System.out.println(tempStr);
        // 两维数组
        final char[][] cArr = { { 'a', 'b' }, { 'c', 'd' } };
        for (final char[] cs : cArr) {
            for (final char c : cs) {
				System.out.print(c);
			}
		}
        System.out.println("\nEnd;");
        
        		// 构造一个hashmap对象
		HashMap<String, String> map1 = new HashMap<>();
		
		// 往hashmap中添加数据，如果key重复，则会覆盖
		map1.put("1", "白百合");
		map1.put("1", "马蓉");
		
		// 继续添加
		map1.put("2", "王宝强");
		map1.put("3", "黄渤");
		map1.put("4", "靳东");
		map1.put("5", null);
		
		
		// 获取map中的数据
		String a = map1.get("2");
		System.out.println(a);

		// HelloProxy helloProxy = new HelloProxy();
		// helloProxy.sayHello();
		
		// 执行动态代理
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloInterface hello = new Hello();
        
        InvocationHandler handler = new ProxyHandler(hello);

        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);

        proxyHello.sayHello();
	}	
}
