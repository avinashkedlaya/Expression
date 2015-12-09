package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompositeValue implements IValue {

	List <IValue> fields=new ArrayList <IValue>();
	private Map <Type, Integer> checkFields=new HashMap<Type, Integer>();
	Type type;


	public boolean add(IValue value)
	{
		try {
			fields.add(value);
			Type t=value.getType();
			if(checkFields.containsKey(t))
			{
				int i=checkFields.get(t);
				i++;
				checkFields.put(t,i);
			}
			else
			{
				checkFields.put(t, 1);
			}


			return true;
		} catch (Exception e) {
			return false;
		}


	}
	public Map<Type,Integer> getDataTypeFrequency()
	{
		return checkFields;

	}
	@Override
	public Type getType() {
		Iterator<Type> i=Type.getAllTypes();
		Type temp;
		while(i.hasNext())
		{
			temp=i.next();
			if(temp instanceof CompositeType)
			{
				if(compareMap(checkFields,((CompositeType)temp).checkFieldList()))
				{
					System.out.println(Type.getTypeName(temp));
					return temp;
				}
			}
		}
		return null;
	}

	private boolean compareMap(Map <Type, Integer>  a,Map <Type, Integer>  b)
	{
		Type temp;
		if(a.size()!=b.size())
			return false;
		Iterator<Type> i=a.keySet().iterator();
		while(i.hasNext())
		{
			temp=i.next();
			if(b.containsKey(temp))
			{
				if(a.get(temp)!=b.get(temp))
				{
					return false;
				}
			}
			else 
				return false;
		}
		return true;
	}

}
