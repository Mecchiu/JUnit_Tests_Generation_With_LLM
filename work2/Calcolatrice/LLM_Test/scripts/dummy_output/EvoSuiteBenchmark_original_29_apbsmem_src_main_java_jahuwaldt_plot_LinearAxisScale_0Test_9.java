package jahuwaldt.plot;

	/**
	 * Constructor.
	 */
    private class LinearAxisScale_0TestFields {
        double   data;
        AxisLimitData output;
    }
    
    /**
     * Default constructor.
     */
    public LinearAxisScale_0Test() {
    	LinearAxisScale _myTest = this;
		_myTest.output = new AxisLimitData(
		    	    -1.5,
		    	    1.5,
		    	    4);
    }
    
    /**
     * Test the default constructor with an arbitrary input parameter.
     */
    @Test
    public void test_LinearAxisScale_0_constructor_parameter() {
    	this.output = new AxisLimitData(-1.5, 1.5, 4);
        assertTrue(
	    		"[AxisScale] linearAxisScale: No bounds given, but default set to [-1.5, 1.5, 4].",
			        (_myTest.output!= null));
    }
    
    /**
     * Test the lower bound constructor
     */
    @Test
    public void test_LinearAxisScale_0_lowerBounds_constructor() {
    	LinearAxisScale _myTest = new LinearAxisScale(LinearAxisScale.LOWER_BOUND, null, 7, null);
    	assertEquals(7, _myTest.lowerBounds(), 1e-10);
    }
    
    /**
     * Test the upper bound constructor
     */
    @Test
    public void test_LinearAxisScale_0_upperBounds_constructor() {
    	LinearAxisScale _myTest = new LinearAxisScale(LinearAxisScale.UPPER_BOUND, null, 7, null);
    	assertEquals(7, _myTest.upperBounds(), 1e-10);
    }
    
    /**
     * Test the input constructor.
     */
    @Test
    public void test_LinearAxisScale_0_constructor() {
    	LinearAxisScale _myTest = new LinearAxisScale();
        assertTrue(
	    		"[AxisScale] linearAxisScale:  invalid null parameter (data, output) - " +
	    		      "cannot create as AxisLimitData instance for [linearAxisScale: null]",
			        (_myTest!= null));
    }
    
}
