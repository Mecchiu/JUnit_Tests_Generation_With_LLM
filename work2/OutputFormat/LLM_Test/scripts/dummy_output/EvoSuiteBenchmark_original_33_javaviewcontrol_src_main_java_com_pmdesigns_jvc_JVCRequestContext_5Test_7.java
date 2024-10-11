package com.pmdesigns.jvc;

	/**
	 * @author mike dooley
	 */
	public static class HttpCrazyServletTest extends JVCRequestContext {

		private String myString;
		private String myArray[];
		private Hashtable myHashtable;
		private Long myLongArray;
		private String myFilename;
		
		/**
		 * @return a {@link String} for every element in the parameter list
		 */
		public String getName() { return this.myString; }
		public void setName(String x) { this.myString = x; }
		public String[] getArray() { return this.myArray; }
		public void setArray(String[] x) { this.myArray = x; }
		public Hashtable getHashtable() { return this.myHashtable; }
		public void setHashtable(Hashtable<String, String> x) { this.myHashtable = x; }
		
		/**
		 * @return a long for every element in the parameter list
		 */
		public Long[] getLongArray() { return this.myLongArray; }
		public void setLongArray(Long[] x) { this.myLongArray = x; }
		public String getFilename() { return this.myFilename; }
		public void setFilename(String x) { this.myFilename = x; }
	}
	
	/**
	 * {@link HttpCrazyServletTest}
	 */
	public static class JVCRequestContext_5TestServlet extends HttpCrazyServletTest {
		
		public JVCRequestContext_5TestServlet(ServletRequest request, ServletResponse response, ServletConfig config) {

			super (request, response, config);
		}
		
		/**
		 * {@inheritDoc}
		 */
		protected void getCookie(String name, HttpServletRequest request)  throws Exception 
		{
			assertEquals("Name should match", this.getName(), name);
			assertNull("Value should be null", request.getCookies().get(name));
		}

		@Override
		protected void setCookie(String name, String str2) 
		{
			super.setCookie(name, str2);
			ArrayList<Cookie> cookies = new ArrayList<Cookie>(2);
			Cookie c = new Cookie(name, str2);
			c.setPath("/");
			cookies.add(c);
			request.getCookies().addAll(cookies);
		}

		@Override
		protected String[] getArray()
		{
			try {
				String s = request.getRequestURL().toString();
				s = s.substring(0,s.indexOf("?"));
				return s.split("&");
			} catch (Exception e) { return new String[0]; }
		}

		@Override
		protected void setArray(String[] x)
		{ 
			super.setArray(x); 
		}

		@Override
		protected Hashtable getHashtable()
		{
			try {
				String s = request.getRequestURL().toString();
				s = s.substring(0,s.indexOf("?"));
				return s.split("&");
			} catch (Exception e) { return new Hashtable(); }
		}

		@Override
		protected void setHashtable(Hashtable<String, String> x)
		{   
			super.setHashtable(x);
		}

		@Override
		protected Long[] getLongArray() { return super.getLongArray(); }

		public HttpCrazyServletTest testServlet(ServletRequest request, ServletResponse response, ServletConfig config) {
			request.setAttribute("myArg", "Hello World");
			getCookie();
			HttpServletRequest req = (HttpServletRequest)request;
			getValue("myString", ("Hello World"));
			setValue("myArray", new String[] {"This","is","a","test","string"});
			setValue("myHashtable", new Hashtable<String,String>());
			setValue("myLongArray", new Long[] {4,5,6,7});
			setValue("myFilename", "/some/path");
			return this;
		}
		
		public HttpCrazyServletTest testServletWithParams(ServletRequest request, ServletResponse response, ServletConfig config) {
			
			getCookie("myStringVar", request);
}
}