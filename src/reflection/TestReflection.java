package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Stack;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method[] methods = Stack.class.getMethods();

	/*	for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
*/
		Class ctObj=Test.class;
		Constructor[] constructors=ctObj.getDeclaredConstructors();
		System.out.println("getting instance");
		for(Constructor c:constructors){
			c.setAccessible(true);
			
			Test obj=(Test)c.newInstance();
			obj.testName();
		}
	}
}
