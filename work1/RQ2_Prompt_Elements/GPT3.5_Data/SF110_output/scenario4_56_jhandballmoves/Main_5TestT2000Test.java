// Test case 1: Test if deepCopy returns a new object
@Test
void testDeepCopyReturnsNewObject() throws Exception {
    Object obj = new Object();
    Object copy = Main.deepCopy(obj);
    assertNotSame(obj, copy);
}

// Test case 2: Test if deepCopy returns an object of the same class
@Test
void testDeepCopyReturnsObjectOfSameClass() throws Exception {
    String str = "Hello World";
    Object copy = Main.deepCopy(str);
    assertEquals(str.getClass(), copy.getClass());
}

// Test case 3: Test if deepCopy returns an object with the same fields
@Test
void testDeepCopyReturnsObjectWithSameFields() throws Exception {
    MyClass obj = new MyClass("John", 25);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertEquals(obj.getName(), copy.getName());
    assertEquals(obj.getAge(), copy.getAge());
}

// Test case 4: Test if deepCopy returns a deep copy of an object with nested objects
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithNestedObjects() throws Exception {
    MyClass obj = new MyClass("John", 25);
    MyClass nestedObj = new MyClass("Jane", 30);
    obj.setNestedObj(nestedObj);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertNotSame(obj.getNestedObj(), copy.getNestedObj());
    assertEquals(obj.getNestedObj().getName(), copy.getNestedObj().getName());
    assertEquals(obj.getNestedObj().getAge(), copy.getNestedObj().getAge());
}

// Test case 5: Test if deepCopy returns a deep copy of an object with arrays
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithArrays() throws Exception {
    int[] arr = {1, 2, 3};
    MyClass obj = new MyClass("John", 25);
    obj.setArray(arr);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertNotSame(obj.getArray(), copy.getArray());
    assertArrayEquals(obj.getArray(), copy.getArray());
}

// Test case 6: Test if deepCopy returns a deep copy of an object with collections
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithCollections() throws Exception {
    List<String> list = new ArrayList<>();
    list.add("John");
    list.add("Jane");
    MyClass obj = new MyClass("John", 25);
    obj.setList(list);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertNotSame(obj.getList(), copy.getList());
    assertEquals(obj.getList(), copy.getList());
}

// Test case 7: Test if deepCopy returns a deep copy of an object with maps
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithMaps() throws Exception {
    Map<String, Integer> map = new HashMap<>();
    map.put("John", 25);
    map.put("Jane", 30);
    MyClass obj = new MyClass("John", 25);
    obj.setMap(map);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertNotSame(obj.getMap(), copy.getMap());
    assertEquals(obj.getMap(), copy.getMap());
}

// Test case 8: Test if deepCopy returns a deep copy of an object with null fields
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithNullFields() throws Exception {
    MyClass obj = new MyClass("John", 25);
    MyClass copy = (MyClass) Main.deepCopy(obj);
    assertNull(copy.getNestedObj());
    assertNull(copy.getArray());
    assertNull(copy.getList());
    assertNull(copy.getMap());
}

// Test case 9: Test if deepCopy throws an exception for non-serializable objects
@Test
void testDeepCopyThrowsExceptionForNonSerializableObjects() {
    assertThrows(Exception.class, () -> {
        JFrame frame = new JFrame();
        Main.deepCopy(frame);
    });
}

// Test case 10: Test if deepCopy returns a deep copy of an object with circular references
@Test
void testDeepCopyReturnsDeepCopyOfObjectWithCircularReferences() throws Exception {
    MyClass obj1 = new MyClass("John", 25);
    MyClass obj2 = new MyClass("Jane", 30);
    obj1.setNestedObj(obj2);
    obj2.setNestedObj(obj1);
    MyClass copy = (MyClass) Main.deepCopy(obj1);
    assertNotSame(obj1, copy);
    assertNotSame(obj2, copy.getNestedObj());
    assertSame(copy, copy.getNestedObj().getNestedObj());
}

// Helper class for testing deepCopy method
class MyClass implements Serializable {
    private String name;
    private int age;
    private MyClass nestedObj;
    private int[] array;
    private List<String> list;
    private Map<String, Integer> map;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MyClass getNestedObj() {
        return nestedObj;
    }

    public void setNestedObj(MyClass nestedObj) {
        this.nestedObj = nestedObj;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}