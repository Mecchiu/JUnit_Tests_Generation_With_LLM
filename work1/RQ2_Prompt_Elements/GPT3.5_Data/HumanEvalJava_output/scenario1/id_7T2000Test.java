I can help you write the test cases for the `FilterBySubstring` class. Here's an example of how you can write a test case:

```
@Test
void testFilterBySubstring() {
    List<Object> strings = new ArrayList<>();
    strings.add("apple");
    strings.add("banana");
    strings.add("orange");
    strings.add("grape");
    strings.add("kiwi");
    String substring = "an";
    List<Object> expected = new ArrayList<>();
    expected.add("banana");
    expected.add("orange");
    List<Object> actual = FilterBySubstring.filterBySubstring(strings, substring);
    assertEquals(expected, actual);
}
```

This test case creates a list of strings and a substring to filter by. It then creates an expected result list that contains the strings "banana" and "orange", which are the only strings in the original list that contain the substring "an". Finally, it calls the `filterBySubstring` method and compares the expected and actual results using the `assertEquals` method. 

You can write similar test cases for other scenarios, such as when the list is empty, when the substring is not found in any of the strings, or when the list contains non-string objects.