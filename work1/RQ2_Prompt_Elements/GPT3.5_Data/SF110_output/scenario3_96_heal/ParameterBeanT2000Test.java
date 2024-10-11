@Test
void testSizeReturnsZeroWhenNoParameters() {
    ParameterBean parameterBean = new ParameterBean();
    assertEquals(0, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenOneParameter() {
    ParameterBean parameterBean = new ParameterBean();
    parameterBean.addParameter("param1", "value1");
    assertEquals(1, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenMultipleParameters() {
    ParameterBean parameterBean = new ParameterBean();
    parameterBean.addParameter("param1", "value1");
    parameterBean.addParameter("param2", "value2");
    parameterBean.addParameter("param3", "value3");
    assertEquals(3, parameterBean.size());
}

@Test
void testSizeReturnsZeroWhenNullParameterMap() {
    ParameterBean parameterBean = new ParameterBean();
    parameterBean.setParameterMap(null);
    assertEquals(0, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapNotNull() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", "value1");
    parameterMap.put("param2", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(2, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapContainsNullValues() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", null);
    parameterMap.put("param2", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(1, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapContainsEmptyValues() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", "");
    parameterMap.put("param2", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(1, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapContainsWhitespaceValues() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", "   ");
    parameterMap.put("param2", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(1, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapContainsDuplicateKeys() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", "value1");
    parameterMap.put("param1", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(1, parameterBean.size());
}

@Test
void testSizeReturnsCorrectSizeWhenParameterMapContainsCaseInsensitiveDuplicateKeys() {
    ParameterBean parameterBean = new ParameterBean();
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("param1", "value1");
    parameterMap.put("PARAM1", "value2");
    parameterBean.setParameterMap(parameterMap);
    assertEquals(1, parameterBean.size());
}
}