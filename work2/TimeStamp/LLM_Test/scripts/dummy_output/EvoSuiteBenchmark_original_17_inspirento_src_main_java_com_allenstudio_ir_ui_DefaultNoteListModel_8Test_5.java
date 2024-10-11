package com.allenstudio.ir.ui;

/**
 * A default NoteListModel with single note.
 */
private static final class SimpleListener implements NoteListModel.NoteListListener {

/**
 * A private accessor for this private variable.
 *
 * @return a private accessor for this private variable
 */
    private final AbstractNote getNote(){
        return new SimpleNote("DefaultNoteListModel_8Test");
    }

    /**
     * Default methods of NoteListModel.
     */
    private final void onListDataChange(int id, Object oldValue, Object newValue){}
	private final void checkData(AbstractNote n){
        assertEquals("SimpleNote.class",n.getClass());
	}
	private final void checkData(int id, Object n){
        checkData(new Object[]{n});
	}
	/**
	 * Adds a new note.
	 */
	final public void onListDataChange(final NoteListDataEvent event) {
//			Check
            final int id = event.getProperty("id");
            final Object oldValue = event.getProperty("oldValue");
            final Object newValue = event.getProperty("newValue");

            final Boolean b = event.isDataChange();
            assertNotNull(b);
            if (b){
//					Check
            	assertFalse(id == 0 && oldValue == null && newValue == null);
            }
    }
}

/**
 * Test case for {@link DefaultNoteListModel#get(int)}.
 *
 * @warning it won't work if the list has more than one note, like a collection of
 *            <code>SimpleNote</code> objects which are not compatible.
 */
public final class DefaultNoteListModel_8Test_1 {
	/**
	 * Simple listener for the DefaultNoteListModel.
	 */
	private final SimpleListener test = new SimpleListener();

	/**
	 * Test method for
	 * {@link DefaultNoteListModel#get(int)}.
	 */
	@Test
    public void testGet() {

//		No idea what, I believe.
    }

	@Test
    public void testListener() {

//		We have a NoteListDataListener, which we can use to invoke the
//		default methods of the listener.
        test.onListDataChange(new NoteListDataEvent(0));
	}

	/**
	 * Test case for {@link DefaultNoteListModel#getElementAt(int)}.
	 */
	@Test
    public void testGetAt() {

        // create a new SimpleNote object with the same id.
		final AbstractNote test1 = test.getNote();

        // create another SimpleNote object.
		final SimpleNote test2 = new SimpleNote("DefaultNoteListModel_8Test_2");


        // invoke the getElementAt method on both SimpleNote objects
//			Check
        assertEquals("DefaultNoteListModel_8Test_2", test2.getElementAt(0));

        // add the SimpleNote object back to the model.
        test.add(test1);

        // invoke the getElementAt method on SimpleNote object.
//			Check
        assertEquals("DefaultNoteListModel_8Test_2", test2.getElementAt(0));
    }
}