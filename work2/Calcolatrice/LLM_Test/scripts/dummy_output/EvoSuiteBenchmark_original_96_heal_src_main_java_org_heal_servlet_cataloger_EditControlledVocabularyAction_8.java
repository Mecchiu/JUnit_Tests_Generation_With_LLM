// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains one unit test case for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
		
	@Test
	protected void delete() throws ServletException{
		Action.delete(getRequest(),getResponse(),new HashSet<>());		
	}
	
	@Test
	protected void edit() throws ServletException{
		boolean result = Action.edit(getRequest(),new HashSet<>(new HashSet<TaxonBean>(new HashSet<TaxonPathBean>(new HashSet<CompleteMetadataBean>()))))!= null;
		assertTrue(result);
	}
	
	@Test
	protected void deleteAll() throws ServletException{
		boolean result = Action.deleteAll(getRequest(),getResponse());		
		assertTrue(result);
	}

	protected HttpServletRequest getRequest() {
		return new HttpServletRequest() {
			@Override
			public String getHeaderField(String string) {
				return null;
			}
		};
	}
	
	protected HttpServlet getResponse() {
		return new HttpServletResponse() {
			@Override
			public String getHeaderField(String string) {
				if(string.equals("text/html")){
					return null;
				}
				return null;
			}
			@Override
			public void include(String string) throws ServletException{
			}
			@Override
			public void sendError(int paramInt) throws IOException{
			}

			@Override
			public void setCharacterCharset(String string) throws UnsupportedEncodingException{
			}
			@Override
			public void setDateHeader(String string, long time) throws ServletException{
			}
			@Override
			public void setHeader(String string, String string2) throws ServletException{
			}
			@Override
			public void setIntHeader(String string, int int2) throws ServletException{
			}

			@Override
			public int getContentLength() throws IOException{
				return 0;
			}
			@Override
			public String getContentType() throws IOException{
				return null;
			}
			@Override
			public String getHeader(String string) {
				return null;
			}
			@Override
			public Iterator<String> getHeaderNames() {
				return new HashSet<>(new HashSet<String>()).iterator();
			}
			@Override
			public Iterator<String> iterator(){
				return new HashSet<>(new HashSet<String>()).iterator();
			}
		};
	}

}
/*

class SetControlledVocabularyPathActionTest extends ActionTest{

    SetControlledVocabularyPathAction(){
        super(new ControlledVocabularyPathActions() {
            @Override
            public void deleteIndividual() throws Exception{
                delete(getRequest(),getResponse());
            }

            @Override
            public void setIndividual() throws Exception{
                set(getRequest(),getResponse());
            }

            @Override
            public void updateIndividual() throws Exception{
                update(getRequest(),getResponse());
            }

            @Override
            public void deleteIndividualAll() throws Exception{
                deleteAll(getRequest(),getResponse());
            }

            @Override
            public void setIndividualAll() throws Exception{
                setAll(getRequest(),getResponse());
            }

            @Override
            public void editIndividual() throws Exception{
                edit(getRequest(),getResponse());
            }

            @Override
            public void editIndividual_IndividualPath() throws Exception {
                edit(getRequest(),getResponse());
            }
        });
    }
}