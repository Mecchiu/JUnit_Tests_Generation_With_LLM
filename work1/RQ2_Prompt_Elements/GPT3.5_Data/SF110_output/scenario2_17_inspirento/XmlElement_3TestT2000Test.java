// Test case 1: Adding a sub element with valid name and data
@Test
public void testAddSubElement_validNameAndData() {
    XmlElement parent = new XmlElement("parent");
    XmlElement child = parent.addSubElement("child", "data");
    assertEquals("child", child.getName());
    assertEquals("data", child.getData());
    assertEquals(parent, child.getParent());
    assertTrue(parent.getSubElements().contains(child));
}

// Test case 2: Adding a sub element with null name
@Test
public void testAddSubElement_nullName() {
    XmlElement parent = new XmlElement("parent");
    assertThrows(IllegalArgumentException.class, () -> {
        parent.addSubElement(null, "data");
    });
}

// Test case 3: Adding a sub element with empty name
@Test
public void testAddSubElement_emptyName() {
    XmlElement parent = new XmlElement("parent");
    assertThrows(IllegalArgumentException.class, () -> {
        parent.addSubElement("", "data");
    });
}

// Test case 4: Adding a sub element with null data
@Test
public void testAddSubElement_nullData() {
    XmlElement parent = new XmlElement("parent");
    XmlElement child = parent.addSubElement("child", null);
    assertNull(child.getData());
}

// Test case 5: Adding a sub element with empty data
@Test
public void testAddSubElement_emptyData() {
    XmlElement parent = new XmlElement("parent");
    XmlElement child = parent.addSubElement("child", "");
    assertEquals("", child.getData());
}

// Test case 6: Adding a sub element with name containing invalid characters
@Test
public void testAddSubElement_invalidName() {
    XmlElement parent = new XmlElement("parent");
    assertThrows(IllegalArgumentException.class, () -> {
        parent.addSubElement("ch!ld", "data");
    });
}

// Test case 7: Adding a sub element with data containing invalid characters
@Test
public void testAddSubElement_invalidData() {
    XmlElement parent = new XmlElement("parent");
    XmlElement child = parent.addSubElement("child", "da\nta");
    assertEquals("da\nta", child.getData());
}

// Test case 8: Adding a sub element with name already existing in parent
@Test
public void testAddSubElement_duplicateName() {
    XmlElement parent = new XmlElement("parent");
    parent.addSubElement("child", "data1");
    assertThrows(IllegalArgumentException.class, () -> {
        parent.addSubElement("child", "data2");
    });
}

// Test case 9: Adding a sub element with name already existing in grandparent
@Test
public void testAddSubElement_duplicateNameInGrandparent() {
    XmlElement grandparent = new XmlElement("grandparent");
    grandparent.addSubElement("parent", "data1");
    XmlElement parent = grandparent.getSubElements().get(0);
    parent.addSubElement("child", "data2");
    assertThrows(IllegalArgumentException.class, () -> {
        parent.addSubElement("parent", "data3");
    });
}

// Test case 10: Adding a sub element to a null parent
@Test
public void testAddSubElement_nullParent() {
    XmlElement child = new XmlElement("child");
    assertThrows(IllegalArgumentException.class, () -> {
        child.addSubElement("grandchild", "data");
    });
}
}