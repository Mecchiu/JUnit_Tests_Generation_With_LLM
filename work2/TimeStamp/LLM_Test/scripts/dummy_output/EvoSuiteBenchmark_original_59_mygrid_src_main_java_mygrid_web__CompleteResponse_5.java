package mygrid.web;


public final class _CompleteResponseTest
{

    private final boolean completeResult; // field completed
    private final _CompleteResponse response; // field response
    
    public _CompleteResponseTest(boolean completeResult, _CompleteResponse response) {
        this.completeResult = completeResult;
        this.response = response;
    }


    @Test
    public void test(){
       
	 assertNotNull(response);
	 assertEquals(completeResult, response.getCompleteResult());
	 assertNotNull(response.get__id() );
    }
}