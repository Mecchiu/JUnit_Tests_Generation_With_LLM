package nu.staldal.xtree;
public static class Element_5Test_1_1Elements {
			public Node lookUpChild = null;

			public String getAttributeValue(int childIndex) throws IndexOutOfBoundsException;
		}

		public static class Element_5Test_1_1 {
			public String getAttributeValue(int childIndex);

			public String getAttributeValue(int childIndex, boolean children);
		}

		public static class Element_5Test_1_1Elements implements Element {
			public Node lookUpChild = null;
			public Attributes getAttributes = new AttributesImpl();
	

			public String getAttributeValue(int index) throws IndexOutOfBoundsException;
			public String getAttributeValue(int index, boolean children) throws IndexOutOfBoundsException;
			public String getAttributeValue(int index, boolean children, String childrenValue);
}