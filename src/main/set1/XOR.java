package main.set1;

public class XOR {
	
	private static final int MAX_SLICE_SIZE = 8;
	
	private static String hexSlices(String slice1, String slice2) {
		if (slice1.length() > MAX_SLICE_SIZE || slice2.length() > MAX_SLICE_SIZE) {
			throw new IllegalArgumentException("Hex slices must be of max length " + MAX_SLICE_SIZE + ".");
		}
		
		int decimal1 = Integer.parseInt(slice1, 16);
		int decimal2 = Integer.parseInt(slice2, 16);
		int product = decimal1 ^ decimal2;
		String productStr = Integer.toHexString(product);

		return Str.padZeros(productStr, slice1.length());
	}
	
	public static String hexStrings(String hex1, String hex2) {
		if (hex1.length() != hex2.length()) {
			throw new IllegalArgumentException("Hex strings must be of equal length.");
		}
		
		StringBuilder sb = new StringBuilder();
		for (int sliceStart = 0; sliceStart < hex1.length(); sliceStart += MAX_SLICE_SIZE) {
			int sliceSize = Math.min(hex1.length()-sliceStart, MAX_SLICE_SIZE);
			String slice1 = hex1.substring(sliceStart, sliceStart+sliceSize);
			String slice2 = hex2.substring(sliceStart, sliceStart+sliceSize);
			String product = hexSlices(slice1, slice2);
			sb.append(product);
		}
		return sb.toString();
	}

}
