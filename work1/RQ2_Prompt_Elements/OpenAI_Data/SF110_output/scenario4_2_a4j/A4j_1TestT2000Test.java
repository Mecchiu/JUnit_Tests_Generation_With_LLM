// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {

	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>searchTerm: "java"</li>
	* <li>productLine: "books"</li>
	* <li>type: "lite"</li>
	* <li>page: "1"</li>
	* </ul>
	* The expected result is a {@link ProductInfo} object with the following properties:
	* <ul>
	* <li>totalResults: "1"</li>
	* <li>totalPages: "1"</li>
	* <li>currentPage: "1"</li>
	* <li>product: {@link Product} object with the following properties:
	* <ul>
	* <li>asin: "0596002815"</li>
	* <li>productName: "Java & XML, 2nd Edition"</li>
	* <li>catalog: "Book"</li>
	* <li>authors: {@link Author} object with the following properties:
	* <ul>
	* <li>author: "Brett McLaughlin"</li>
	* </ul>
	* </li>
	* <li>manufacturer: "O'Reilly Media"</li>
	* <li>listPrice: "39.95"</li>
	* <li>ourPrice: "27.97"</li>
	* <li>usedPrice: "21.99"</li>
	* <li>availability: "Usually ships in 24 hours"</li>
	* <li>imageUrlSmall: "http://images.amazon.com/images/P/0596002815.01.THUMBZZZ.jpg"</li>
	* <li>imageUrlMedium: "http://images.amazon.com/images/P/0596002815.01.MZZZZZZZ.jpg"</li>
	* <li>imageUrlLarge: "http://images.amazon.com/images/P/0596002815.01.LZZZZZZZ.jpg"</li>
	* <li>editorialReviews: {@link EditorialReview} object with the following properties:
	* <ul>
	* <li>source: "Amazon.com"</li>
	* <li>content: "Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such as XSLT, SOAP, and JSP tag libraries. The book is a valuable resource for any Java programmer who wants to learn how to use XML effectively.
	*
	* Java and XML, 2nd Edition is a hands-on guide to the best and most practical ways to use XML with Java. It is a new edition of the best-selling book by Brett McLaughlin, and has been thoroughly updated to cover the latest APIs, tools, and techniques. It starts with the basics of XML and progresses through to advanced topics such