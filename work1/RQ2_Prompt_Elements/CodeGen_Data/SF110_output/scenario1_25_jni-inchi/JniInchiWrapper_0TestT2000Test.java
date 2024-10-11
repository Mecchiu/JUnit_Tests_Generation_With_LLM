// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {
public final static int NUM_OF_ATOMS = 3;
		public final static int NUM_OF_BONDS = 4;
		public final static int NUM_OF_PARITIES = 6;

		protected JniInchiWrapper getWrapper() {
			JniInchiWrapper wrapper = new JniInchiWrapper();
			wrapper.setNumberOfAtoms(NUM_OF_ATOMS);
			wrapper.setNumberOfBonds(NUM_OF_BONDS);
			wrapper.setNumberOfParity(NUM_OF_PARITIES);
			wrapper.setCASNumberOfElements(NUM_OF_ATOMS);
			wrapper.setCASNumberOfBondsYard(NUM_OF_BONDS);
			wrapper.setCASNumberOfParityYard(NUM_OF_PARITIES);
			wrapper.setTimeUnit(TimeUnit.SECONDS);
			return wrapper;
		}

		class JniInchiWrapper {
			public NativeCodeException getInchiKeyFromINCHI(final String inchi) throws JniInchiException {
				JniInchiWrapper_0.LOG_ON = true;
				StringTokenizer tokenizer = new StringTokenizer(inchi, " ");
				tokenizer.nextToken(); // clear tokenizer, it will be used again as an id
				// as the tokenizer isn't used (it's used with the JNI wrapper above)
				boolean useJNI = true;
				// Set the JC to use jni
				NativeCodeException err = null;
				if ((useJNI =!tokenizer.hasMoreTokens()) && (tokenizer.nextToken().equals("jni"))) {
					err = JniInchiWrapper_0.JNI_INCHI_KEY_BASIC_LOAD_ERROR;
				}
				tokenizer.nextToken();
				int natoms = null;
				try {
					natoms = Integer.parseInt(tokenizer.nextToken());
				} catch (Throwable ex) {
					err = JniInchiWrapper_0.JNI_INCHI_BASIC_LOAD_ERROR;
					addTestCases(err);
					addTestCases(tokenizer);
				}
				if ((err!= null) && (tokenizer.hasMoreTokens())) {
					err = null;
					if ((tryToUseJNI | (tryToUseJNI && (err!= null)))) {
						throw(err);
					}
				}
				if ((err == null) && (tryToUseJNI) && (tokenizer.hasMoreTokens())) {
					err = JniInchiWrapper_0.JNI_INCHI_UNKNOWN_OPTION_ERROR;
				}
				if ((useJNI || err) && (tryToUseJNI || (err!= null))) {
					throw(JniInchiWrapper_0.JNI_INCHI_UNKNOWN_OPTION_ERROR, err);
				}
				if (err == null) {
					if ((tryToUseJNI) && (tokenizer.hasMoreTokens())) {
						err = JniInchiWrapper_0.unableToLoadInchiData(tokenizer);
					}
					if ((err == null) && (tokenizer.hasMoreTokens())) {
						err = JniInchiWrapper_0.unableToReadINCHIVersion(tokenizer);
					}
				}
				if ((err!= null) && (err!= null)) {
					JniInchiWrapper_0.LOG_ON = false;
					throw(err);
				}
				return(err);
			}

			public native boolean jni_load_inchi(NativeLibraryLoader nativeLoader);
			public native boolean jni_read_inchi(List<String> inchi_elements, int numOfAtoms, int numOfBonds, int numOfParity, long cas_numberOfElements, long cas_numberOfBondsYard, long cas_numberOfParityYard);
			public native String jni_retrieve_inchiKey();
			public native String jni_get_inchi_key_from_inchi(String jni_inchi);

			protected void addTestCases(NativeCodeException err) throws JniInchiException {
				if (!err.getMessage().endsWith("Error") || tryToUseJNI) {
					for (int i = 0; i < NUM_OF_ATOMS; i++) {
						for (int j = 0; j < NUM_OF_BONDS; j++) {
							for (int k = 0; k < NUM_OF_PARITIES; k++) {
								NativeCodeException gbErr = null;
								try {
									assertNotNull(
										JniInchiWrapper_0.UNEXPECTED_INCHI_KEY_GENERATE_ERROR);
									System.out.println(
											"Attempting to generate random InChI key for atom "
												+ Integer.toString(i)
												+ " bond "
												+ Integer.toString(j)
												+ " parity "
												+ Integer.toString(k)
												+ " in the case we're calling: "
												+ (tryToUseJNI)
												? ""
												: "not"
											);
									assertNotNull("Not initialized!?", jni_retrieve_inchi_key());
									JniInchiWrapper_0
										.generateInchiKey(i, j, k, jni_retrieve_inchi_key());
									String s = JniInchiWrapper_0.unableToRetrieveInchiKey();
									assertNotNull(s + " should not be null", s);
									Byte[] byte_data = s.getBytes();
									byte[][] byte_data_split = JniInchiWrapper_0.getByteArraysFromINCHIVersion(nativeLoader