package expression;


import java.util.HashMap;
import java.util.Map;

public class CompositeType extends Type{

	public Map <String, Type> fields=new HashMap<String, Type>();
	public void addCompositeFields(String fieldsName,Type t){
		fields.put(fieldsName, t);
		
	}
}
