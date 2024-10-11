package org.fixsuite.message.info;
/**
		* Class under test
		*/
		final class DictionaryInfo_4Test_1 implements DictionaryInfo {
		        MessageInfo message;
	            /**
	        */
	        DictionaryInfo_4Test_1(MessageInfo message) {
	            this.message = message;
			}
			@Override
			public String getVersion() { return version; }
			@Override
			public List<MessageInfo> getMessages() { return message; }
			@Override
		}


	    @Test
		public void test1(){
				DictionaryInfo dic = new DictionaryInfo(12);

				// add a version with a ',' or ':'
		}