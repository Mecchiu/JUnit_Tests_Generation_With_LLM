// _GetEngine_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngine_1Test {
		
    int _getType();
    
    java.lang.String _getTypeString() {
        return "";
    }

    org.apache.axis.types.Type _getTypeType() {
        return org.apache.axis.types.BuiltinType.TYPE_INVALID;
    }

    @Test
    public void testGetType_1() throws Exception {
        java.lang.Integer _getType = _getType();
        _getTypeString();
        _getTypeType();
        assertTrue("_getType should be an int", _getType == java.lang.Integer.class);
        assertTrue("_getType should be an org.apache.axis.types.builtin.BuiltinType", _getType == org.apache.axis.types.BuiltinType.BOOLEAN);
//      assertTrue("_getType should be a java.lang.String", _getType == org.apache.axis.types.BuiltinType.STRING);
      
        java.lang.Boolean _getTypeBoolean = new java.lang.Boolean(false);        
        _getTypeBooleanString();
        org.apache.axis.types.BuiltinType _getTypeTypeBoolean = org.apache.axis.types.BuiltinType.BOOLEAN;        
        _getTypeType(new org.apache.axis.types.AnnotationRef(org.apache.axis.AnnotationType.BOOLEAN), org.apache.axis.types.BuiltinType.BOOLEAN);
        assertTrue("_getType should be an org.apache.axis.types.builtin.Boolean", new Boolean(false).equals(new Boolean(_getTypeBoolean)));    
    }

    @Test
    public void testGetType_2() throws Exception {
        java.util.HashMap<java.lang.String, java.lang.Integer> _typeHMap = new java.util.HashMap<java.lang.String, java.lang.Integer>();
        _typeHMap.put("boolean", new Integer(false));
        _getType(new org.apache.axis.types.AnnotationRef(org.apache.axis.AnnotationType.BOOLEAN), new com.mygrid.types.mygrid.Boolean());
//    assertTrue("_getType should be an java.lang.String", _typeHMap.containsKey(org.apache.axis.types.AnnotationType.BOOLEAN._type));
        assertTrue("_getType should be an java.lang.String", _typeHMap.containsKey(new com.mygrid.types.mygrid.Boolean(_getTypeBoolean).getType()));
    }

    protected void _getType(java.lang.Object _type, java.lang.Object _typeBoolean) throws Exception {
        assertTrue("_getTypeString should return '" + org.apache.axis.types.builtin.Base64Binary.convertToString(_getType) + "'", _type.equals(new java.lang.String(_getType)));
        assertTrue("_getTypeType should be 'java.lang.boolean', but is: '" + org.apache.axis.types.ref.TypeFactory.getType(new org.apache.axis.types.AnnotationRef(org.apache.axis.AnnotationType.BOOLEAN))[0] + "', which is java.lang.String!", _type.equals(org.apache.axis.types.ref.TypeFactory.getType(new org.apache.axis.types.AnnotationRef(org.apache.axis.AnnotationType.BOOLEAN)))));
    }

    @Test
    public void testGetType_3() throws Exception {
        
        new org.apache.axis.types.BuiltinType(org.apache.axis.types.BuiltinType.BOOLEAN).toString();
    }



    protected boolean _getTypeBooleanString() throws Exception {
        return true;
    }

    protected String _getTypeString() throws Exception {
        return "";
    }
}