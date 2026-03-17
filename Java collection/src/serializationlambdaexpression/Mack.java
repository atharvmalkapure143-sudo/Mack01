package serializationlambdaexpression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

interface MyInterface{
	void hello(String name);
}

class MyImpl implements MyInterface{
	
	public void hello(String name) {
		System.out.println("Hello"+name);
	}
}




public class Mack {
	
	private static void serialize(Serializable obj,
			String outputPath) throws IOException{
		
		File outputFile= new File(outputPath);
		if(!outputFile.exists()) {
			outputFile.createNewFile();
		}
		try (ObjectOutputStream outputStream
				=new ObjectOutputStream(new FileOutputStream(outputFile))) {
			outputStream.writeObject(obj);
		}
	}
	private static Object deserialize(String inputPath) throws IOException,
	ClassNotFoundException
	{
		
		File inputFile= new File(inputPath);
		
		try (ObjectInputStream inputStream
				=new ObjectInputStream(new FileInputStream(inputFile))) {
			return inputStream.readObject();
		}
	}
	
	private static void serilizeAndDeserializeFunction() throws Exception{
		
		Function<Integer, String>fn=(Function<Integer, String>&Serializable)(n)
				-> "Hello"+n;
			System.out.println("Run orignal function::"+ fn.apply(10));	
			
			String path="./serialized-fn";
			
			
			serialize((Serializable)fn,path);
			System.out.println("Serialized function to"+path);
				Function<Integer, String>deserializedFn=
					(Function<Integer, String>)deserialize(path);
				System.out.println("Deserialized function from"+path);
				System.out.println("run Deserialized function "+deserializedFn.apply(11));
		
	}
	
	private static  void serializeAndDeserializeClass()throws Exception{
		String path="./serialized-class";
		serialize(MyImpl.class, path);
		System.out.println("Serialized class to"+path);
		
		Class<?>myImpl1Class=(Class<?>)deserialize(path);
		
		MyInterface instance=(MyInterface)myImpl1Class.newInstance();
		instance.hello("java");
	}

	public static void main(String[] args) throws Exception {
		serilizeAndDeserializeFunction();
		serializeAndDeserializeClass();

	}

}
