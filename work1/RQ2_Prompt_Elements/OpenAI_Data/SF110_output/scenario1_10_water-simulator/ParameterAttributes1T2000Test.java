// ParameterAttributesTest.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributesTest {

		private static final Logger log = Logger.getLogger(ParameterAttributesTest.class);
		
		/**
		* Test case 1 for {@link ParameterAttributes#valueFor(float)} method.
		*/
		@Test
		void testValueFor1() {
				log.info("Test case 1 for valueFor method");
				ParameterAttributes instance = new ParameterAttributes();
				instance.demandCurveFunction = new DemandCurveFunction();
				instance.demandCurveFunction.a = new Float(1.0);
				instance.demandCurveFunction.b = new Float(1.0);
				instance.demandCurveFunction.c = new Float(1.0);
				instance.demandCurveFunction.d = new Float(1.0);
				instance.demandCurveFunction.e = new Float(1.0);
				instance.demandCurveFunction.f = new Float(1.0);
				instance.demandCurveFunction.g = new Float(1.0);
				instance.demandCurveFunction.h = new Float(1.0);
				instance.demandCurveFunction.i = new Float(1.0);
				instance.demandCurveFunction.j = new Float(1.0);
				instance.demandCurveFunction.k = new Float(1.0);
				instance.demandCurveFunction.l = new Float(1.0);
				instance.demandCurveFunction.m = new Float(1.0);
				instance.demandCurveFunction.n = new Float(1.0);
				instance.demandCurveFunction.o = new Float(1.0);
				instance.demandCurveFunction.p = new Float(1.0);
				instance.demandCurveFunction.q = new Float(1.0);
				instance.demandCurveFunction.r = new Float(1.0);
				instance.demandCurveFunction.s = new Float(1.0);
				instance.demandCurveFunction.t = new Float(1.0);
				instance.demandCurveFunction.u = new Float(1.0);
				instance.demandCurveFunction.v = new Float(1.0);
				instance.demandCurveFunction.w = new Float(1.0);
				instance.demandCurveFunction.x = new Float(1.0);
				instance.demandCurveFunction.y = new Float(1.0);
				instance.demandCurveFunction.z = new Float(1.0);
				instance.demandCurveFunction.aa = new Float(1.0);
				instance.demandCurveFunction.bb = new Float(1.0);
				instance.demandCurveFunction.cc = new Float(1.0);
				instance.demandCurveFunction.dd = new Float(1.0);
				instance.demandCurveFunction.ee = new Float(1.0);
				instance.demandCurveFunction.ff = new Float(1.0);
				instance.demandCurveFunction.gg = new Float(1.0);
				instance.demandCurveFunction.hh = new Float(1.0);
				instance.demandCurveFunction.ii = new Float(1.0);
				instance.demandCurveFunction.jj = new Float(1.0);
				instance.demandCurveFunction.kk = new Float(1.0);
				instance.demandCurveFunction.ll = new Float(1.0);
				instance.demandCurveFunction.mm = new Float(1.0);
				instance.demandCurveFunction.nn = new Float(1.0);
				instance.demandCurveFunction.oo = new Float(1.0);
				instance.demandCurveFunction.pp = new Float(1.0);
				instance.demandCurveFunction.qq = new Float(1.0);
				instance.demandCurveFunction.rr = new Float(1.0);
				instance.demandCurveFunction.ss = new Float(1.0);
				instance.demandCurveFunction.tt = new Float(1.0);
				instance.demandCurveFunction.uu = new Float(1.0);
				instance.demandCurveFunction.vv = new Float(1.0);
				instance.demandCurveFunction.ww = new Float(1.0);
				instance.demandCurveFunction.xx = new Float(1.0);
				instance.demandCurveFunction.yy = new Float(1.0);
				instance.demandCurveFunction.zz = new Float(1.0);
				instance.demandCurveFunction.aaa = new Float(1.0);
				instance.demandCurveFunction.bbb = new Float(1.0);
				instance.demandCurveFunction.ccc = new Float(1.0);
				instance.demandCurveFunction.ddd = new Float(1.0);
				instance.demandCurveFunction.eee = new Float(1.0);
				instance.demandCurveFunction.fff = new Float(1.0);
				instance.demandCurveFunction.ggg = new Float(1.0);
				instance.demandCurveFunction.hhh = new Float(1.0);
				instance.demandCurveFunction.iii = new Float(1.0);
				instance.demandCurveFunction.jjj = new Float(1.0);
				instance.demandCurveFunction.kkk = new Float(1.0);
				instance.demandCurveFunction.lll = new Float(1.0);
				instance.demandCurveFunction.mmm = new Float(1.0);
				instance.demandCurveFunction.nnn = new Float(1.0);
				instance.demandCurveFunction.ooo = new Float(1.0);
				instance.demandCurveFunction.ppp = new Float(1.0);
				instance.demandCurveFunction.qqq = new Float(1.0);
				instance.demandCurveFunction.rrr = new Float(1.0);
				instance.demandCurveFunction.sss = new Float(1.0);
				instance.demandCurveFunction.ttt = new Float(1.0);
				instance.demandCurveFunction.uuu = new Float(1.0);
				instance.demandCurveFunction.vvv = new Float(1.0);
				instance.demandCurveFunction.www = new Float(1.0);
				instance.demandCurveFunction.xxx = new Float(1.0);
				instance.demandCurveFunction.yyy = new Float(1.0);
				instance.demandCurveFunction.zzz = new Float(1.0);
				instance.demandCurveFunction.aaaa = new Float(1.0);
				instance.demandCurveFunction.bbbb = new Float(1.0);
				instance.demandCurveFunction.cccc = new Float(1.0);
				instance.demandCurveFunction.dddd = new Float(1.0);
				instance.demandCurveFunction.eeee = new Float(1.0);
				instance.demandCurveFunction.ffff = new Float(1.0);
				instance.demandCurveFunction.gggg = new Float(1.0);
				instance.demandCurveFunction.hhhh = new Float(1.0);
				instance.demandCurveFunction.iiii = new Float(1.0);
				instance.demandCurveFunction.jjjj = new Float(1.0);
				instance.demand