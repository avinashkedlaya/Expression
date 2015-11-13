package expression;

public class testtesttype {
	public static void main(String args[])
	{
		CompositeType t=new CompositeType();
		t.addCompositeFields("day", IntegerType.getInstance());
		t.addCompositeFields("month",IntegerType.getInstance());
		t.addCompositeFields("year", IntegerType.getInstance());
		TypeValue.addType("STARTDATE", t);
		t.addCompositeFields("day", IntegerType.getInstance());
		t.addCompositeFields("month",IntegerType.getInstance());
		t.addCompositeFields("year", IntegerType.getInstance());
		TypeValue.addType("ENDDATE", t);
	
		TypeValue type=TypeValue.getInstance();

		
		
		
	}
}
