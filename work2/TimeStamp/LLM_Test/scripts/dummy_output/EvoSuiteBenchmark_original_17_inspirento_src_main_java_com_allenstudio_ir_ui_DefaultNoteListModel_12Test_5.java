// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {
		private final static List<String> noteList1 = new LinkedList<String>();
		private final static Collection<AbstractNote> collection1 = new HashSet<AbstractNote>();

		private final static SimpleListModel<String> simpleListModel = new SimpleListModel<>();
		private final static SimpleListModel<AbstractNote> simpleListModel_1 = new SimpleListModel<>();
		private final static AbstractNote[] simpleArray1 = new AbstractNote[]{new Note()};
		private final static Integer[] simpleArrayWithPositions1 = new Integer[]{1, 3, 6};
		private final static AbstractNote[] simpleArrayWithPositionsWithIds1 = new AbstractNote[]{new Note(), new Note()};
		private final static AbstractNote[] simpleArrayWithPositionsWithAnchor = new AbstractNote[]{new Note()};
		private static AbstractNote[] simpleArrayWithoutAnchor1 = new AbstractNote[]{};
		private final static AbstractNote note = new Note();
		private final static AbstractNote[] empty_array = new AbstractNote[]{};
		private final static AbstractNote noteWithAnchor = new Note();
		private final static AbstractNote[] empty_array_2 = new AbstractNote[]{};

		private final static AbstractNote emptyNote = new Note();

		private final static Set<HashKey> set = new HashSet<HashKey>();
		private static final HashKey hk0 = new HashKey("h0");
		private static final HashKey hk4 = new HashKey("h4");
		private static final HashKey hk5 = new HashKey("h5");
		private static final HashKey hk6 = new HashKey("h6");
		private final static List<HashKey> keyList = new LinkedList<HashKey>();
		private static final AbstractNote[] array = new AbstractNote[]{};
		private static final AbstractNote[] array_2 = new AbstractNote[]{};
		private static final AbstractNote[] array_3 = new AbstractNote[]{};
		private static final AbstractNote[] array_4 = new AbstractNote[]{};

		static {
            keyList.add(hk0);
            keyList.add(hk1);
            keyList.add(hk2);
            keyList.add(hk3);
            keyList.add(hk4);
            keyList.add(hk5);
            keyList.add(hk6);
            keyList.add(hk7);
			
            keyList.add(hk8);
			keyList.add(hk9);
            keyList.add(hk10);
			keyList.add(hk11);
			
		}

		static {
			keyList.add(hk0);
			keyList.add(hk4);
			keyList.add(hk5);
			keyList.add(hk6);
			keyList.add(hk7);
			keyList.add(hk8);

			keyList.add(hk1);
			keyList.add(hk2);
			keyList.add(hk3);
			keyList.add(hk4);

			keyList.add(hk6);
			keyList.add(hk7);
			keyList.add(hk8);
			keyList.add(hk9);
			keyList.add(hk10);
			keyList.add(hk11);
			keyList.add(hk12);
			keyList.add(hk13);
			
			keyList.add(hk14);
			keyList.add(hk15);
			keyList.add(hk16);
			keyList.add(hk17);
			keyList.add(hk18);
			keyList.add(hk19);
			keyList.add(hk20);
			keyList.add(hk21);
			keyList.add(hk22);
			
			keyList.add(hk23);
			keyList.add(hk24);
			keyList.add(hk25);
			keyList.add(hk26);
			keyList.add(hk27);

			keyList.add(hk28);
			keyList.add(hk29);
			keyList.add(hk30);
			keyList.add(hk31);
		}

		static class SimpleKey {
			static final int i = 1;
			static final int j = 2;
			private final int i_j;
		}

		static class HashKey {
			private final String string_1;

			private final int i;
			private final int j;

			public HashKey(String string_1) {
				this.string_1 = string_1;
				this.i = Integer.valueOf(1);
				this.j = Integer.valueOf(2);
			}

			public int hashCode() {
				return i.hashCode() + j.hashCode();
			}

			public boolean equals(Object o) {
				return o instanceof HashKey && ((HashKey) o).i_j == j && String.valueOf(o)
						.equals(String.valueOf(string_1));
			}
		}

		private static class Note {
			private AbstractNote note_1;

			private static Note getNote1() {
				return new Note();
			}

			private static Note getNote2() {
				return new Note();
			}

			private static Note getNote3() {
				return new Note();
			}
		}

		public static void set(HashKey key, AbstractNote note) {
			set.add(key);
			simpleListModel.add(note);
			collection1.add(note);
		}

		public static void set(String noteStrings) {
			for (Iterator<HashKey> iterator = set.iterator(); iterator.hasNext();) {
				set.remove(iterator.next());
			}
			HashMap<String, AbstractNote> hashMap = new HashMap<String, AbstractNote>();
			for (String s : noteStrings.split(",")) {
				hashMap.put(s, new Note());
			}
			collection1.addAll(hashMap.values());
			simpleListModel_1.addAll(hashMap.values());
			set.addAll(keyList);
			List<AbstractNote> plainList = new LinkedList<AbstractNote>();
			for (Iterator<HashKey> iterator = keyList.iterator(); iterator.hasNext();) {
				AbstractNote n1 = getNote1(); 
				AbstractNote n2 = getNote2();
				AbstractNote n3 = hashMap.get(n1.string_1); 
				plainList.add(n1);
				plainList.add(n2);
				plainList.add(n3);
			}
			simpleArrayWithPositionsWithIds1.addAll(plainList);
}
}