// Test case 1: Test with valid namespaceURI and localName
	@Test
	void testLookupAttribute_valid() {
		Element element = new Element();
		element.addAttribute("http://www.example.com", "attr1", "value1");
		element.addAttribute("", "attr2", "value2");
		element.addAttribute("http://www.example.com", "attr3", "value3");
		
		int index = element.lookupAttribute("http://www.example.com", "attr1");
		assertEquals(0, index);
		
		index = element.lookupAttribute("", "attr2");
		assertEquals(1, index);
		
		index = element.lookupAttribute("http://www.example.com", "attr3");
		assertEquals(2, index);
	}
	
	// Test case 2: Test with invalid namespaceURI and valid localName
	@Test
	void testLookupAttribute_invalidNamespaceURI() {
		Element element = new Element();
		element.addAttribute("http://www.example.com", "attr1", "value1");
		element.addAttribute("", "attr2", "value2");
		element.addAttribute("http://www.example.com", "attr3", "value3");
		
		int index = element.lookupAttribute("http://www.invalid.com", "attr1");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", "attr2");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", "attr3");
		assertEquals(-1, index);
	}
	
	// Test case 3: Test with valid namespaceURI and invalid localName
	@Test
	void testLookupAttribute_invalidLocalName() {
		Element element = new Element();
		element.addAttribute("http://www.example.com", "attr1", "value1");
		element.addAttribute("", "attr2", "value2");
		element.addAttribute("http://www.example.com", "attr3", "value3");
		
		int index = element.lookupAttribute("http://www.example.com", "invalid");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("", "invalid");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", "invalid");
		assertEquals(-1, index);
	}
	
	// Test case 4: Test with empty namespaceURI and valid localName
	@Test
	void testLookupAttribute_emptyNamespaceURI() {
		Element element = new Element();
		element.addAttribute("", "attr1", "value1");
		element.addAttribute("", "attr2", "value2");
		element.addAttribute("", "attr3", "value3");
		
		int index = element.lookupAttribute("", "attr1");
		assertEquals(0, index);
		
		index = element.lookupAttribute("", "attr2");
		assertEquals(1, index);
		
		index = element.lookupAttribute("", "attr3");
		assertEquals(2, index);
	}
	
	// Test case 5: Test with valid namespaceURI and empty localName
	@Test
	void testLookupAttribute_emptyLocalName() {
		Element element = new Element();
		element.addAttribute("http://www.example.com", "", "value1");
		element.addAttribute("http://www.example.com", "", "value2");
		element.addAttribute("http://www.example.com", "", "value3");
		
		int index = element.lookupAttribute("http://www.example.com", "");
		assertEquals(0, index);
		
		index = element.lookupAttribute("", "");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", "");
		assertEquals(-1, index);
	}
	
	// Test case 6: Test with empty namespaceURI and empty localName
	@Test
	void testLookupAttribute_emptyNamespaceURIAndLocalName() {
		Element element = new Element();
		element.addAttribute("", "", "value1");
		element.addAttribute("", "", "value2");
		element.addAttribute("", "", "value3");
		
		int index = element.lookupAttribute("", "");
		assertEquals(0, index);
		
		index = element.lookupAttribute("http://www.example.com", "");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("", "attr1");
		assertEquals(-1, index);
	}
	
	// Test case 7: Test with null namespaceURI and valid localName
	@Test
	void testLookupAttribute_nullNamespaceURI() {
		Element element = new Element();
		element.addAttribute(null, "attr1", "value1");
		element.addAttribute(null, "attr2", "value2");
		element.addAttribute(null, "attr3", "value3");
		
		int index = element.lookupAttribute(null, "attr1");
		assertEquals(0, index);
		
		index = element.lookupAttribute(null, "attr2");
		assertEquals(1, index);
		
		index = element.lookupAttribute(null, "attr3");
		assertEquals(2, index);
	}
	
	// Test case 8: Test with valid namespaceURI and null localName
	@Test
	void testLookupAttribute_nullLocalName() {
		Element element = new Element();
		element.addAttribute("http://www.example.com", null, "value1");
		element.addAttribute("http://www.example.com", null, "value2");
		element.addAttribute("http://www.example.com", null, "value3");
		
		int index = element.lookupAttribute("http://www.example.com", null);
		assertEquals(0, index);
		
		index = element.lookupAttribute("", null);
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", null);
		assertEquals(-1, index);
	}
	
	// Test case 9: Test with null namespaceURI and null localName
	@Test
	void testLookupAttribute_nullNamespaceURIAndLocalName() {
		Element element = new Element();
		element.addAttribute(null, null, "value1");
		element.addAttribute(null, null, "value2");
		element.addAttribute(null, null, "value3");
		
		int index = element.lookupAttribute(null, null);
		assertEquals(0, index);
		
		index = element.lookupAttribute("http://www.example.com", null);
		assertEquals(-1, index);
		
		index = element.lookupAttribute(null, "attr1");
		assertEquals(-1, index);
	}
	
	// Test case 10: Test with no attributes
	@Test
	void testLookupAttribute_noAttributes() {
		Element element = new Element();
		
		int index = element.lookupAttribute("http://www.example.com", "attr1");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("", "attr2");
		assertEquals(-1, index);
		
		index = element.lookupAttribute("http://www.invalid.com", "attr3");
		assertEquals(-1, index);
	}
}