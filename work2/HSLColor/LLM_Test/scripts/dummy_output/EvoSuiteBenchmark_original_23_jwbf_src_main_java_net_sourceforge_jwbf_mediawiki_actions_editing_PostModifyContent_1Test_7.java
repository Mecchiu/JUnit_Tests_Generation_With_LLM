package net.sourceforge.jwbf.mediawiki.actions.editing;
private final MediaWiki mediaWiki;

		/**
		 * @param a a
		 * @param b a
		 * @return true if one or both sets are <code>null</code> or the intersection of sets is empty.
		 */
		private static boolean isIntersectionEmpty(Set<?> a, Set<?> b) {
				assertEquals(1, a.size());
				assertEquals(1, b.size());

				try {
					Set<Object> intersection = new HashSet<>(a);
					intersection.retainAll(b);
				} catch (ClassCastException e) {
					return false;
				}
				return true;
		}
}

/**
* Test case of {@link PostModifyContent#isIntersectionEmpty(Set, Set)}.
* The tests are checking the output of
* {@link PostModifyContent#isIntersectionEmpty(Set, Set)}
* for the intersection set
* between the two sets.
*/
public class PostModifyContent_1Test_1Test {
	/** Test case description: isIntersectionEmpty(Set, Set) */
	@Test
	public void testIsIntersectionEmptySet1() throws ProcessException, ActionException {
		final MediaWiki mediaWiki = new MediaWiki(this, "isIntersectionEmpty", MW1_09, SupportedBy.USER_WRITE);
		final PostModifyContent postModifyContent = new PostModifyContent(mediaWiki);
		new Post().setContentAccessable(new ContentAccessable() {
			public boolean isAccessible() {
				return false;
			}
		});
		final Hashtable<Object, Object> parameters = new Hashtable<>();
		parameters.put(Post.PARAM_UPDATE_VERSION, new Object());
		try {
			String result = postModifyContent.isIntersectionEmpty(new HashSet<Object>(1, 2, 3), new HashSet<Object>(1, 2, 3));
			// log.debug("isIntersectionEmpty  0: {}", result);

			assertTrue(result.trim().toLowerCase().contains("disallow "));
		} catch (CheckedProcessException | ActionException | VersionException | ProcessException | JwbfException e) {
			fail("Error occurred " + e.getMessage());
		}
	}

	/** Test case description: isIntersectionEmpty(Set, Set) */
	@Test
	public void testIsIntersectionEmptySet2() throws ProcessException, ActionException {
		final MediaWiki mediaWiki = new MediaWiki(this, "isIntersectionEmpty", MW1_10, SupportedBy.USER_WRITE);
		final PostModifyContent postModifyContent = new PostModifyContent(mediaWiki);
		new Post().setContentAccessable(new ContentAccessable() {
			public boolean isAccessible() {
				return false;
			}
		});
		final Hashtable<Object, Object> parameters = new Hashtable<>();
		parameters.put(Post.PARAM_UPDATE_VERSION,