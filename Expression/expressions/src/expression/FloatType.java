package expression;

public class FloatType extends Type {
	

	

	private static FloatType getInstance=null;
	private FloatType()
	{
		getInstance=new FloatType();
	}
	public static String getType() {
		return FLOAT;
	}
	public static FloatType getInstance() {
		
		return getInstance;
	}
}
