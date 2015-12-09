package expression;

import java.awt.Composite;
import java.util.Iterator;

public class testtesttype {
	public static void main(String args[])
	{
		CompositeType t=new CompositeType();
		CompositeType t1=new CompositeType();
		CompositeType t2=new CompositeType();
		IntegerType i=IntegerType.getInstance();
		
		
		t.addCompositeFields("day", IntegerType.getInstance());
		t.addCompositeFields("month",FloatType.getInstance());
		t.addCompositeFields("year", IntegerType.getInstance());
		
		t2.addCompositeFields("month",BooleanType.getInstance());
		t2.addCompositeFields("year", IntegerType.getInstance());
		
		
		
		t.addCompositeFields("test", t2);
		
		
		Type.addType("Typecheck",t2);
		
		Type.addType("STARTDATE", t);
		
		t1.addCompositeFields("day", IntegerType.getInstance());
		t1.addCompositeFields("month",IntegerType.getInstance());
		t1.addCompositeFields("year", IntegerType.getInstance());
		
		Type.addType("ENDDATE", t1);
		
		IValue i1=new IntValue(21);
		IValue i2=new FloatValue((float) 3.0);
		IValue i3=new IntValue(2015);
		
		
		CompositeValue v=new CompositeValue();
		v.add(i1);
		v.add(i2);
		v.add(i3);
		
		CompositeValue v1=new CompositeValue();
		
		IValue j1=new IntValue(03);
		IValue j2=new BoolValue(true);
		
		v1.add(j1);
		v1.add(j2);
		v.add(v1);
		IntValue k1=new IntValue(10);
		FloatValue k2=new FloatValue((float) 10);
		
		System.out.println(v.getType());
		System.out.println(t.typecheck(v));
		System.out.println(k1.getType());
		System.out.println(i.typecheck(k1));
		System.out.println(i.typecheck(k2));
	}
}
