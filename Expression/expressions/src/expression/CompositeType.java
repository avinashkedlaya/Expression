package expression;


import java.util.HashMap;
import java.util.Map;

public class CompositeType extends TypeValue{

	public Map <String, TypeValue> fields=new HashMap<String, TypeValue>();
	public void addCompositeFields(String fieldsName,TypeValue t){
		fields.put(fieldsName, t);
		
	}
}
