// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {

		/**
		* Test case 1 for method {@link BomberClient#connectToSrv()}.
		* Test case 1 checks if the method {@link BomberClient#connectToSrv()} returns true if the server is running.
		*/
		@Test
		public void testConnectToSrv_1() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 2 for method {@link BomberClient#connectToSrv()}.
		* Test case 2 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_2() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6667);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 3 for method {@link BomberClient#connectToSrv()}.
		* Test case 3 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_3() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6668);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 4 for method {@link BomberClient#connectToSrv()}.
		* Test case 4 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_4() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6669);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 5 for method {@link BomberClient#connectToSrv()}.
		* Test case 5 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_5() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6670);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 6 for method {@link BomberClient#connectToSrv()}.
		* Test case 6 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_6() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6671);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 7 for method {@link BomberClient#connectToSrv()}.
		* Test case 7 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_7() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6672);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 8 for method {@link BomberClient#connectToSrv()}.
		* Test case 8 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_8() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6673);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 9 for method {@link BomberClient#connectToSrv()}.
		* Test case 9 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_9() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6674);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 10 for method {@link BomberClient#connectToSrv()}.
		* Test case 10 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		public void testConnectToSrv_10() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6675);
				assertFalse(client.connectToSrv());
		}
}</code></pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">BomberClient</span><span class="o">.</span><span class="n">getInstance</span><span class="p">()</span><span class="o">.</span><span class="n">connectToSrv</span><span class="p">()</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

<div class="prompt"></div>


<div class="output_subarea output_stream output_stdout output_text">
<pre>INFO:root:Establishing a connection 
INFO:root:connected to localhost
</pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">BomberClient</span><span class="o">.</span><span class="n">getInstance</span><span class="p">()</span><span class="o">.</span><span class="n">requestSessionList</span><span class="p">()</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

