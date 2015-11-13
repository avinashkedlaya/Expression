package expression;

public class BooleanType extends TypeValue {
	

	private static BooleanType getInstance=null;
	private BooleanType()
	{
		getInstance=new BooleanType();
	}
	public static String getType() {
		return BOOLEAN;
	}
	public static BooleanType getInstance() {
		
		return getInstance;
	}

}
