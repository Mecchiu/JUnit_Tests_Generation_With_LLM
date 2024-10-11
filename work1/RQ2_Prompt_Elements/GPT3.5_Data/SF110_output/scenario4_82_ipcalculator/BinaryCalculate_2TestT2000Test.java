// Here's an example implementation of the BinaryCalculate class and its test class:

// BinaryCalculate.java
package ipac;

import java.math.BigInteger;

public class BinaryCalculate {

    private static final int MAX_PREFIX = 128;

    private boolean isIPv4 = false;
    private boolean isIPv6 = false;
    private String currentIP = "";
    private String fullReassembler = "";
    private String delimiter = "";
    private int lengthOfToken = 0;
    private String ipRangeAddress = "";
    private String usableRange = "";
    private int semiCol = 0;
    private String prefix = "";
    private BigInteger totalIPAddresses;

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
        return getStartIP() + " - " + ipRangeAddress;
    }

    /**
     * Adds delimiters back into a given IP address
     *
     * @param binaryIP binary IP address with no delimiters
     * @return binary IP address with delimiters
     */
    private String getBinaryIP(String binaryIP) {
        StringBuilder sb = new StringBuilder(binaryIP);
        for (int i = delimiter.length(); i < binaryIP.length(); i += lengthOfToken + delimiter.length()) {
            sb.insert(i, delimiter);
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
        int prefixLength = binaryIP.length() - binaryIP.lastIndexOf('1') - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prefixLength; i++) {
            sb.append('1');
        }
        for (int i = prefixLength; i < MAX_PREFIX; i++) {
            sb.append('0');
        }
        return convert(getBinaryIP(sb.toString()));
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
        String binarySubnet = convertToBinary(subnet);
        String binaryNoOfIPAddresses = convertToBinary(noOfIPAddresses);
        int prefixLength = binaryNoOfIPAddresses.length() - binaryNoOfIPAddresses.lastIndexOf('1') - 1;
        if (prefixLength > MAX_PREFIX) {
            throw new IllegalArgumentException("Number of IP addresses exceeds the IP addressing bounds.");
        }
        prefix = "/" + prefixLength;
        totalIPAddresses = new BigInteger(binaryNoOfIPAddresses, 2);
        String netmask = getNetmask(binaryNoOfIPAddresses);
        String binaryStartIP = addBinary(binarySubnet, "1");
        String binaryEndIP = addBinary(binarySubnet, subBinary(binaryNoOfIPAddresses, "1"));
        String startIP = convert(getBinaryIP(binaryStartIP));
        String endIP = convert(getBinaryIP(binaryEndIP));
        ipRangeAddress = endIP;
        if (!startIP.equals(endIP)) {
            ipRangeAddress = startIP + " - " + endIP;
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
        calculate(IP, IPPrefix);
        String[] results = new String[noPrefix];
        BigInteger totalIPs = new BigInteger(convertToBinary(endPrefix), 2);
        BigInteger IPsPerSubnet = totalIPs.divide(totalIPAddresses);
        String binaryIPsPerSubnet = IPsPerSubnet.toString(2);
        int prefixLength = binaryIPsPerSubnet.length() - binaryIPsPerSubnet.lastIndexOf('1') - 1;
        if (prefixLength > MAX_PREFIX) {
            throw new IllegalArgumentException("Number of IP addresses exceeds the IP addressing bounds.");
        }
        String subnetMask = getNetmask(binaryIPsPerSubnet);
        String binarySubnet = convertToBinary(getStartIP());
        for (int i = 0; i < noPrefix; i++) {
            String binarySubnetStartIP = addBinary(binarySubnet, "1");
            String binarySubnetEndIP = addBinary(binarySubnet, subBinary(binaryIPsPerSubnet, "1"));
            String subnetStartIP = convert(getBinaryIP(binarySubnetStartIP));
            String subnetEndIP = convert(getBinaryIP(binarySubnetEndIP));
            results[i] = subnetStartIP + prefix + " - " + subnetEndIP + prefix;
            binarySubnet = addBinary(binarySubnetEndIP, "1");
        }
        Output.printResults(results);
    }

    /**
     * Determines whether an IP Address provided in binary form is an IPv4 or an IPv6 by the length of the binary string.
     *
     * @param size1 Length of binary string
     */
    private void checkIPType(int size1) {
        if (size1 == 32) {
            isIPv4 = true;
        } else if (size1 == 128) {
            isIPv6 = true;
        } else {
            throw new IllegalArgumentException("Invalid IP address.");
        }
    }

    /**
     * Reconstructs the dotted-decimal or hexadecimal IP address with separators from a given binary IP Address.
     * The reconstructed IP address is stored as a global declared variable, <code>currentIP</code>.
     *
     * @param binaryIP An binary IP Address to be converted back into dotted-decimal or hexadecimal format
     */
    private String convert(String binaryIP) {
        StringBuilder sb = new StringBuilder();
        if (isIPv4) {
            for (int i = 0; i < binaryIP.length(); i += 8) {
                sb.append(Integer.parseInt(binaryIP.substring(i, i + 8), 2));
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
        } else if (isIPv6) {
            for (int i = 0; i < binaryIP.length(); i += 16) {
                sb.append(Integer.toHexString(Integer.parseInt(binaryIP.substring(i, i + 16), 2)));
                sb.append(":");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        currentIP = sb.toString();
        return currentIP;
    }

    /**
     * Converts an given IPv4 or IPv6 address into binary format.
     *
     * @param IP An IP Address to be converted back into binary format
     * @return Binary representation of given IP Address.
     */
    private String convertToBinary(String IP) {
        StringBuilder sb = new StringBuilder();
        if (IP.contains(".")) {
            isIPv4 = true;
            delimiter = ".";
            lengthOfToken = 8;
            String[] tokens = IP.split("\\.");
           