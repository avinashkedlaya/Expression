package expression;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompositeType extends Type{

	public Map <String, Type> fields=new HashMap<String, Type>();
	private List<IValue> tempList=new ArrayList<IValue>(); 
	private Map <Type, Integer> checkFields=new HashMap<Type, Integer>();
	public void addCompositeFields(String fieldsName,Type t){
		fields.put(fieldsName, t);
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


	}
	public static String getType() {
		return COMPOSITE;
	}

	public boolean typecheck(CompositeValue v){
		Map <Type, Integer> checkVFields=v.getDataTypeFrequency();
		/*if(checkVFields.size()!=checkFields.size())
			return false;
		
		Iterator<Type> i=checkVFields.keySet().iterator();
		Type temp;
		while(i.hasNext())
		{
			temp=i.next();
			if()
		}*/

		if(compareMap(checkVFields,checkFields))
		{
			return true;
		}
		return false;
	}
	
	public Map<Type, Integer> checkFieldList()
	{
		return checkFields;
		
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
