// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {

	@Test
    public void test1_1_1_1(){
		
		final DefaultNoteListModelModel model =  new DefaultNoteListModel(this);
		
		final ArrayList<AbstractNote> list = new ArrayList<>();
        model.addCollectionEventListener( new NoteListDataListener() {
				
			@Override
			public void noteAdded( NoteListDataEvent e ) {
				notifyAddElement( 1, new AbstractNote() {
					@Override
					public boolean equals( Object other ) {
						return false;
					}
					
					@Override
					public char getChar() {
						return 'A';
					}
					
					@Override
					public long getCount() {
						return 0;
					}

					@Override
					public float getFloat() {
						return 0;
					}
					
					@Override
					public int getInt() {
						return 0;
					}
					
					@Override
					public char getNoteChar() {
						return 'A';
					}
					
					@Override
					public int getNoteIndex() {
						return 0;
					}
					
					@Override
					public int getNoteLength() {
						return 0;
					}
					
					@Override
					public Set<?> getNotes() {
						return Collections.singleton( (Set) Collections
									.singleton( "A") );
					}
					
					@Override
					public boolean getShowNoteIndex() {
						return false;
					}
					
					@Override
					public boolean isDirty() {
						return false;
					}
					
					@Override
					public Collection<?> getElements() {
						return list;
					}
						
				});
			}
			
		    @Override
		    public void noteChanged( NoteListDataEvent e ) {
				notifyDataChanged( 0, 1 );
		    }

		    @Override
		    public void noteRemoved( NoteListDataEvent e ) {
				notifyRemoveElement( -1, new AbstractNote() {
					@Override
					public boolean equals( Object other ) {
						return false;
					}

					@Override
					public char getChar() {
						return 'B';
					}

					@Override
					public long getCount() {
						return 0;
					}

					@Override
					public float getFloat() {
						return 0;
					}
					
					@Override
					public int getInt() {
						return 0;
					}
					
					@Override
					public char getNoteChar() {
						return 'B';
					}
					
					@Override
					public int getNoteIndex() {
						return 0;
					}
					
					@Override
					public int getNoteLength() {
						return 0;
					}

					@Override
					public Set<?> getNotes() {
						return Collections.singleton( (Set) Collections
									.singleton("B") );
					}
					@Override
					public boolean getShowNoteIndex() {
						return false;
					}
					@Override
					public boolean isDirty() {
						return false;
					}
					@Override
					public Collection<?> getElements() {
						notifyAddElement( 1, new AbstractNote() {
							@Override
							public boolean equals( Object other ) {
								return false;
							}

							@Override
							public char getChar() {
								return 'A';
							}

							@Override
							public long getCount() {
								return 0;
							}

							@Override
							public float getFloat() {
								return 0;
							}
							
							@Override
							public int getInt() {
								return 0;
							}
							
							@Override
							public char getNoteChar() {
								return 'A';
							}
							
							@Override
							public int getNoteIndex() {
								return 0;
							}
							
							@Override
							public int getNoteLength() {
								return 0;
							}

							@Override
							public Set<?> getNotes() {
								return Collections.singleton( (Set) Collections
										.singleton("A") );
							}
							@Override
							public boolean getShowNoteIndex() {
								return false;
							}
							@Override
							public boolean isDirty() {
								return false;
							}
							@Override
							public Collection<?> getElements() {
								return this;
							}
							
						});
						notifyRemoveElement( -1, new AbstractNote() {
							@Override
							public boolean equals( Object other ) {
								return false;
							}

							@Override
							public char getChar() {
								return 'B';
							}

							@Override
							public long getCount() {
								return 0;
							}

							@Override
							public float getFloat() {
								return 0;
							}
							
							@Override
							public int getInt() {
								return 0;
							}

							@Override
							public char getNoteChar() {
								return 'B';
							}

							@Override
							public int getNoteIndex() {
								return 0;
							}

							@Override
							public int getNoteLength() {
								return 0;
							}

							@Override
							public Set<?> getNotes() {
								return null;
							}

							@Override
							public boolean getShowNoteIndex() {
								return true;
							}

							@Override
							public boolean isDirty() {
								return true;
							}

							@Override
							public Collection<?> getElements() {
								return null;
							}
						});
					}
				});
				list.add( 1 );
			}

			@Override
			public void notifyAddElement( int index, AbstractNote elem ) {
				list.add( index, elem );
			}

			@Override
			public void notifyRemoveElement( int index, AbstractNote elem ) {
				list.remove( index );
			}

			@Override
			public void notifyDataChanged( int oldIndex, int newIndex ) {
				list.set( newIndex, new AbstractNote() {

					@Override
					public boolean equals( Object other ) {
						return false;
					}

					@Override
					public char getChar() {
						return 'C';
					}

					@Override
					public long getCount() {
						return 0;
					}
					@Override
					public float getFloat() {
						return 0;
					}
					@Override
					public int getInt() {
						return 0;
					}
					@Override
					public char getNoteChar() {
						return 'C';
					}

				} );
				notifyRemoveElement( oldIndex, elem );
			}
		