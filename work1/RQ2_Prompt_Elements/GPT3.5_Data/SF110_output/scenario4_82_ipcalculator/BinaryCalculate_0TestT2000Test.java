// BinaryCalculate.java
package ipac;

import java.math.BigInteger;

public class BinaryCalculate {

    private boolean isIPv4 = false;
    private boolean isIPv6 = false;
    private String currentIP = "";
    private String fullReassembler = "";
    private String DELIMITER = "";
    private int lengthOfToken = 0;
    private String IPRangeAddress = "";
    private String usableRange = "";
    private int semiCol = 0;
    private String prefix = "";
    private BigInteger totalIPAddresses;
    private int MAXPREFIX = 0;

    /**
     * Calculates the sum of two binary numbers.
     *
     * @param num1 The starting binary number
     * @param num2 The binary number to be added to the starting binary
     * @return The sum of two binary numbers.
     */
    public String addBinary(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1, 2);
        BigInteger b2 = new BigInteger(num2, 2);
        BigInteger sum = b1.add(b2);
        return sum.toString(2);
    }

    /**
     * Subtracts two binary numbers.
     *
     * @param num1 The starting binary number
     * @param num2 The binary number to be subtracted from the starting binary
     * @return The difference of two binary numbers.
     */
    public String subBinary(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1, 2);
        BigInteger b2 = new BigInteger(num2, 2);
        BigInteger diff = b1.subtract(b2);
        return diff.toString(2);
    }

    /**
     * Calculates the IP Range from the provided IP address and number of IP addresses.
     * The results are stored into an <code>string</code> to be returned to the method that called it.
     *
     * @param IP The starting IP address (subnet) in binary
     * @param IPPrefix Number of IP addresses in binary
     * @return Results string
     */
    public String IPCalculate(String IP, String IPPrefix) {
        calculate(IP, IPPrefix);
        return getStartIP() + " - " + IPRangeAddress;
    }

    /**
     * Adds delimiters back into a given IP address
     *
     * @param binaryIP binary IP address with no delimiters
     * @return binary IP address with delimiters
     */
    private String getBinaryIP(String binaryIP) {
        StringBuilder sb = new StringBuilder(binaryIP);
        for (int i = lengthOfToken; i < sb.length(); i += lengthOfToken + 1) {
            sb.insert(i, DELIMITER);
        }
        return sb.toString();
    }

    /**
     * Gets the netmask from a binary representation of number of IP addresses
     *
     * @param binaryIP binary representation of number of IP addresses
     * @return netmask of <code>binaryIP</code>
     */
    private String getNetmask(String binaryIP) {
        BigInteger b = new BigInteger(binaryIP, 2);
        int prefixLength = b.bitLength();
        return new BigInteger("FFFFFFFF", 16).shiftRight(32 - prefixLength).toString(16);
    }

    /**
     * Calculates the IP Range from the provided IP address and number of IP addresses.
     * The results are stored as declared global variables for many other methods to manipulate or use.
     * <br>This method also detects if the provided of number of IP addresses to be calculate exceeds past these IP addresses:
     * 255.255.255.255 and FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF, as further IP addresses exceeds the IP addressing bounds.
     * <br>This method also calculates the prefix size needed to accommodate all the IP Addresses to be listed and stores it as a global variable for use in other methods.
     *
     * @param subnet The starting IP address (subnet)
     * @param noOfIPAddresses Number of IP addresses
     */
    private void calculate(String subnet, String noOfIPAddresses) {
        int size1 = subnet.length();
        checkIPType(size1);
        BigInteger b1 = new BigInteger(subnet, 2);
        BigInteger b2 = new BigInteger(noOfIPAddresses, 2);
        totalIPAddresses = b2.add(BigInteger.ONE);
        BigInteger b3 = b1.add(totalIPAddresses).subtract(BigInteger.ONE);
        String endIP = b3.toString(2);
        if (isIPv4) {
            endIP = String.format("%32s", endIP).replace(' ', '0');
            IPRangeAddress = convert(getBinaryIP(subnet)) + " - " + convert(getBinaryIP(endIP));
            usableRange = convert(getBinaryIP(subBinary(endIP, "00000001"))) + " - " + convert(getBinaryIP(subBinary(subnet, "00000001")));
            semiCol = 3;
            prefix = getNetmask(noOfIPAddresses);
            MAXPREFIX = 32;
        } else if (isIPv6) {
            endIP = String.format("%128s", endIP).replace(' ', '0');
            IPRangeAddress = convert(getBinaryIP(subnet)) + " - " + convert(getBinaryIP(endIP));
            usableRange = convert(getBinaryIP(subBinary(endIP, "00000000000000000000000000000001"))) + " - " + convert(getBinaryIP(subBinary(subnet, "00000000000000000000000000000001")));
            semiCol = 7;
            prefix = getNetmask(noOfIPAddresses);
            MAXPREFIX = 128;
        }
    }

    /**
     * Calculates the IP Range from the provided IP address and number of IP addresses from the smaller prefix.
     * The results are stored into an array to be printed using <code><b>Output.java</b></code>.
     *
     * @param IP The starting IP address (subnet)
     * @param IPPrefix Number of IP addresses for smaller prefix
     * @param noPrefix Number of smaller prefixes within the total prefix
     * @param endPrefix Prefix of total number of IP Addresses
     */
    public void prefixInPrefixCalculate(String IP, String IPPrefix, int noPrefix, String endPrefix) {
        BigInteger b1 = new BigInteger(IP, 2);
        BigInteger b2 = new BigInteger(IPPrefix, 2);
        BigInteger b3 = b1.add(b2).subtract(BigInteger.ONE);
        String endIP = b3.toString(2);
        if (isIPv4) {
            endIP = String.format("%32s", endIP).replace(' ', '0');
            String startIP = convert(getBinaryIP(IP));
            String endIPStr = convert(getBinaryIP(endIP));
            String[] startIPArr = startIP.split("\\.");
            String[] endIPArr = endIPStr.split("\\.");
            int[] startIPIntArr = new int[4];
            int[] endIPIntArr = new int[4];
            for (int i = 0; i < 4; i++) {
                startIPIntArr[i] = Integer.parseInt(startIPArr[i]);
                endIPIntArr[i] = Integer.parseInt(endIPArr[i]);
            }
            int[] prefixArr = new int[4];
            int[] prefixSizeArr = new int[4];
            int prefixSize = Integer.parseInt(endPrefix);
            int prefixSizeLeft = prefixSize;
            int i = 0;
            while (prefixSizeLeft > 0) {
                if (prefixSizeLeft >= 8) {
                    prefixArr[i] = 255;
                    prefixSizeArr[i] = 8;
                    prefixSizeLeft -= 8;
                } else {
                    prefixArr[i] = 256 - (int) Math.pow(2, 8 - prefixSizeLeft);
                    prefixSizeArr[i] = prefixSizeLeft;
                    prefixSizeLeft = 0;
                }
                i++;
            }
            String[][] resultArr = new String[noPrefix][2];
            for (int j = 0; j < noPrefix; j++) {
                int[] startIPIntArrCopy = startIPIntArr.clone();
                int[] endIPIntArrCopy = endIPIntArr.clone();
                int[] prefixArrCopy = prefixArr.clone();
                int[] prefixSizeArrCopy = prefixSizeArr.clone();
                int prefixSizeLeftCopy = prefixSize;
                int k = 0;
                while (prefixSizeLeftCopy > 0) {
                    if (prefixSizeLeftCopy >= 8) {
                        prefixArrCopy[k] = startIPIntArrCopy[k];
                        prefixSizeArrCopy[k] = 8;
                        prefixSizeLeftCopy -= 8;
                    } else {
                        int mask = 256 - (int) Math.pow(2, 8 - prefixSizeLeftCopy);
                        prefixArrCopy[k] = startIPIntArrCopy[k] & mask;
                        prefixSizeArrCopy[k] = prefixSizeLeftCopy;
                        prefixSizeLeftCopy = 0;
                    }
                    k++;
                }
                String prefixStr = prefixArrCopy[0] + "." + prefixArrCopy[1] + "." + prefixArrCopy[2] + "." + prefixArrCopy[3];
                String startIPStr = startIPIntArrCopy[0] + "." + startIPIntArrCopy[1] + "." + startIPIntArrCopy[2] + "." + startIPIntArrCopy[3];
                String endIPStr2 = endIPIntArrCopy[0] +