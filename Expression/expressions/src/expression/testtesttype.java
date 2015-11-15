package expression;

public class testtesttype {
	public static void main(String args[])
	{
		CompositeType t=new CompositeType();
		t.addCompositeFields("day", IntegerType.getInstance());
		t.addCompositeFields("month",IntegerType.getInstance());
		t.addCompositeFields("year", IntegerType.getInstance());
		Type.addType("STARTDATE", t);
		t.addCompositeFields("day", IntegerType.getInstance());
		t.addCompositeFields("month",IntegerType.getInstance());
		t.addCompositeFields("year", IntegerType.getInstance());
		Type.addType("ENDDATE", t);
	
		System.out.println(Type.hasType("STARTDAT"));

		
		
		
	}
}
