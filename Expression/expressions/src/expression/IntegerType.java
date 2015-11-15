package expression;

public class IntegerType extends Type {
	

	private static IntegerType getInstance=null;
	private IntegerType()
	{
		getInstance=new IntegerType();
	}
	public static String getType() {
		return INT;
	}
	public static IntegerType getInstance() {
		
		return getInstance;
	}
	
	
	

}
