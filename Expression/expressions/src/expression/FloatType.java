package expression;

public class FloatType extends TypeValue {
	

	

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
