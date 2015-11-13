package expression;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TypeValue {

	protected static final String BOOLEAN = "boolean";
	protected static final String INT = "int";
	protected static final String FLOAT = "float";
	protected static final String COMPOSITE = "struct";
	private static TypeValue mType = new TypeValue();
	private static Map<String, TypeValue> mTypes = new HashMap<String, TypeValue>();
	static{
		mTypes.put("INT", IntegerType.getInstance());
		mTypes.put("FLOAT", FloatType.getInstance());
		mTypes.put("BOOLEAN", BooleanType.getInstance());
	}
	protected TypeValue() {

	}

	public static void addType(String typeName, TypeValue newType) {

		mTypes.put(typeName, newType);
	}

	public static boolean hasType(String name) {

		return mTypes.containsKey(name);
	}

	public static TypeValue getInstance() {

		return mType;
	}
	

}
