// ClientHttpRequest_2Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains ten unit test cases for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {

	/**
	* Test case for {@link ClientHttpRequest#post(Object[])} method.
	* Test case for <a href="https://github.com/browsersoft/ClientHttpRequest/issues/2">issue 2</a>.
	* @throws IOException
	*/
	@Test
	void testPost_2() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/test/test.jsp");
		request.setParameter("param1", "value1");
		request.setParameter("param2", "value2");
		request.setParameter("param3", "value3");
		request.setParameter("param4", "value4");
		request.setParameter("param5", "value5");
		request.setParameter("param6", "value6");
		request.setParameter("param7", "value7");
		request.setParameter("param8", "value8");
		request.setParameter("param9", "value9");
		request.setParameter("param10", "value10");
		request.setParameter("param11", "value11");
		request.setParameter("param12", "value12");
		request.setParameter("param13", "value13");
		request.setParameter("param14", "value14");
		request.setParameter("param15", "value15");
		request.setParameter("param16", "value16");
		request.setParameter("param17", "value17");
		request.setParameter("param18", "value18");
		request.setParameter("param19", "value19");
		request.setParameter("param20", "value20");
		request.setParameter("param21", "value21");
		request.setParameter("param22", "value22");
		request.setParameter("param23", "value23");
		request.setParameter("param24", "value24");
		request.setParameter("param25", "value25");
		request.setParameter("param26", "value26");
		request.setParameter("param27", "value27");
		request.setParameter("param28", "value28");
		request.setParameter("param29", "value29");
		request.setParameter("param30", "value30");
		request.setParameter("param31", "value31");
		request.setParameter("param32", "value32");
		request.setParameter("param33", "value33");
		request.setParameter("param34", "value34");
		request.setParameter("param35", "value35");
		request.setParameter("param36", "value36");
		request.setParameter("param37", "value37");
		request.setParameter("param38", "value38");
		request.setParameter("param39", "value39");
		request.setParameter("param40", "value40");
		request.setParameter("param41", "value41");
		request.setParameter("param42", "value42");
		request.setParameter("param43", "value43");
		request.setParameter("param44", "value44");
		request.setParameter("param45", "value45");
		request.setParameter("param46", "value46");
		request.setParameter("param47", "value47");
		request.setParameter("param48", "value48");
		request.setParameter("param49", "value49");
		request.setParameter("param50", "value50");
		request.setParameter("param51", "value51");
		request.setParameter("param52", "value52");
		request.setParameter("param53", "value53");
		request.setParameter("param54", "value54");
		request.setParameter("param55", "value55");
		request.setParameter("param56", "value56");
		request.setParameter("param57", "value57");
		request.setParameter("param58", "value58");
		request.setParameter("param59", "value59");
		request.setParameter("param60", "value60");
		request.setParameter("param61", "value61");
		request.setParameter("param62", "value62");
		request.setParameter("param63", "value63");
		request.setParameter("param64", "value64");
		request.setParameter("param65", "value65");
		request.setParameter("param66", "value66");
		request.setParameter("param67", "value67");
		request.setParameter("param68", "value68");
		request.setParameter("param69", "value69");
		request.setParameter("param70", "value70");
		request.setParameter("param71", "value71");
		request.setParameter("param72", "value72");
		request.setParameter("param73", "value73");
		request.setParameter("param74", "value74");
		request.setParameter("param75", "value75");
		request.setParameter("param76", "value76");
		request.setParameter("param77", "value77");
		request.setParameter("param78", "value78");
		request.setParameter("param79", "value79");
		request.setParameter("param80", "value80");
		request.setParameter("param81", "value81");
		request.setParameter("param82", "value82");
		request.setParameter("param83", "value83");
		request.setParameter("param84", "value84");
		request.setParameter("param85", "value85");
		request.setParameter("param86", "value86");
		request.setParameter("param87", "value87");
		request.setParameter("param88", "value88");
		request.setParameter("param89", "value89");
		request.setParameter("param90", "value90");
		request.setParameter("param91", "value91");
		request.setParameter("param92", "value92");
		request.setParameter("param93", "value93");
		request.setParameter("param94", "value94");
		request.setParameter("param95", "value95");
		request.setParameter("param96", "value96");
		request.setParameter("param97", "value97");
		request.setParameter("param98", "value98");
		request.setParameter("param99", "value99");
		request.setParameter("param100", "value100");
		request.setParameter("param101", "value101");
		request.setParameter("param102", "value102");
		request.setParameter("param103", "value103");
		request.setParameter("param104", "value104");
		request.setParameter("param105", "value105");
		request.setParameter("param106", "value106");
		request.setParameter("param107", "value107");
		request.setParameter("param108", "value108");
		request.setParameter("param109", "value109");
		request.setParameter("param110", "value110");
		request.setParameter("param111", "value111");
		request.setParameter("param112", "value112");
		request.setParameter("param113", "value113");
		request.setParameter("param114", "value114");
		request.setParameter("param115", "value115");
		request.setParameter("param116", "value116");
		request.setParameter("param117", "value117");
		request.setParameter("param118", "value118");
		request.setParameter("param119", "value119");
		request.setParameter("param120", "value120");
		request.setParameter("param121", "value121");
		request.setParameter("param122", "value122");
		request.setParameter("param123", "value123");
		request.setParameter("param124", "value124");
		request.setParameter("param125", "value125");
		request.setParameter("param126", "value