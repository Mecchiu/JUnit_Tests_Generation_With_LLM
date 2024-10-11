// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
		
	/**
	 * Test method of {@link net.kencochrane.a4j.A4j#BlendedSearch(String, String)}.
	*/
	@Test
	public void testBlendedSearch() {
		final I_Type p1Type = DAO.TypeDAO.getInstance().create();
		final I_Type p2Type = DAO.TypeDAO.getInstance().create();

		final I_Type p1Base = DAO.TypeDAO.getInstance().create();
		final CartType cart1 = DAO.CartDAO.getInstance().create();
		final SearchType search = DAO.SearchDAO.getInstance().create();

		final I_Type p1Type1 = DAO.TypeDAO.getInstance().create();
		final I_Type p1Type2 = DAO.TypeDAO.getInstance().create();
		final I_Type p1Type3 = DAO.TypeDAO.getInstance().create();
		final IProductTypeListType p1Parent = DAO.IProductTypeDAO.getInstance().create();
		final IProductTypeListType p1Child = DAO.IProductTypeDAO.getInstance().create();


		final I_Type p2Type1 = DAO.TypeDAO.getInstance().create();
		final I_Type p2Type2 = DAO.TypeDAO.getInstance().create();
		final I_Type p2Type3 = DAO.TypeDAO.getInstance().create();
		final I_Type p2Type4 = DAO.TypeDAO.getInstance().create();
		final I_Type p2Type5 = DAO.TypeDAO.getInstance().create();
		final IProductTypeListType p2Parent = DAO.IProductTypeDAO.getInstance().create();
		final IProductTypeListType p2Child = DAO.IProductTypeDAO.getInstance().create();

		final BlendedSearch searchTerm = DAO.BlendedSearchDAO.getInstance().create(1, "Test");


		DAO.ProductDAO.registerTypes(p1Type)
		       .registerTypes(p2Type)
		       .registerTypes(p1Type1, p1Type2, p1Type3, p1Type4, p1Type5)
		       .registerTypes(p2Type1, p2Type2, p2Type3, p2Type4, p2Type5)
		       .registerTypes(p1Parent)
		       .registerTypes(p1Child)
		       .registerTypes(p2Parent)
		       .registerTypes(p2Child)
		       .find(searchTerm);

		assertEquals(30, p1Type.getId()-p1Base.getId());
		assertEquals(3, p1Type1.getId()-p1Base.getId());
		assertEquals(1, p1Type2.getId()-p1Base.getId());
		assertEquals(2, p1Type3.getId()-p1Base.getId());
		assertEquals(3, p1Type4.getId()-p1Base.getId());
		assertEquals(4, p1Type5.getId()-p1Base.getId());
		assertEquals(5, p1Type1.getPk()-p1Base.getPk());
		assertEquals(5, p1Type2.getPk()-p1Base.getPk());
		assertEquals(5, p1Type3.getPk()-p1Base.getPk());
		assertEquals(5, p1Type4.getPk()-p1Base.getPk());
		assertEquals(5, p1Type5.getPk()-p1Base.getPk());
		assertEquals(6, p1Child.getId()-p1Base.getPk());
		assertEquals(4, p1Parent.getId()-p1Child.getPk());
		assertEquals(5, p1Child.getPk()-p1Child.getSearchKey().getPk());

		final I_Type c1Type = DAO.TypeDAO.getInstance().findById(p1Type1.getId());
		final I_Type c2Type1 = DAO.TypeDAO.getInstance().findById(p1Type2.getId());
		final I_Type c3Type2 = DAO.TypeDAO.getInstance().findById(p1Type3.getId());
		final I_Type c4Type3 = DAO.TypeDAO.getInstance().findById(p1Type4.getId());
		final I_Type c5Type4 = DAO.TypeDAO.getInstance().findById(p1Type5.getId());
		final I_Type c6Type4 = DAO.TypeDAO.getInstance().findById(p1Type5.getId());
	}
}