package main.set1;

public class Base64 {
	
	public static char fromOrdinal(int ord) {
		if (ord >= 0 && ord <= 25) {
			return (char)(ord + 'A');
		} else if (ord <= 51) {
			return (char)(ord - 26 + 'a');
		} else if (ord <= 61) {
			return (char)(ord - 52 + '0');
		} else if (ord == 62) {
			return '+';
		} else if (ord == 63) {
			return '/';
		} else {
			throw new IllegalArgumentException("Ordinal must be in range [0,63].");
		}
	}
	
	private static int getGroup1Ordinal(int decimal) {
        return (decimal & 0x00FC0000) >> 18;
	}
	
	private static int getGroup2Ordinal(int decimal) {
        return (decimal & 0x0003F000) >> 12;
	}
	
	private static int getGroup3Ordinal(int decimal) {
        return (decimal & 0x00000FC0) >> 6;
	}
	
	private static int getGroup4Ordinal(int decimal) {
        return decimal & 0x0000003F;
	}
	
	private static String fromHexSliceSize6(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        String b64 = "";

        b64 += fromOrdinal(getGroup1Ordinal(decimal));
        b64 += fromOrdinal(getGroup2Ordinal(decimal));
        b64 += fromOrdinal(getGroup3Ordinal(decimal));
        b64 += fromOrdinal(getGroup4Ordinal(decimal));

        return b64;
	}
	
	private static String fromHexSliceSize4(String hex) {
        int decimal = Integer.parseInt(hex, 16) << 2;
        String b64 = "";
        
        b64 += fromOrdinal(getGroup2Ordinal(decimal));
        b64 += fromOrdinal(getGroup3Ordinal(decimal));
        b64 += fromOrdinal(getGroup4Ordinal(decimal));
        b64 += "=";
        
        return b64;
	}
	
	private static String fromHexSliceSize2(String hex) {
        int decimal = Integer.parseInt(hex, 16) << 4;
        String b64 = "";
        
        b64 += fromOrdinal(getGroup3Ordinal(decimal));
        b64 += fromOrdinal(getGroup4Ordinal(decimal));
        b64 += "==";
        
        return b64;
	}
	
	private static String fromHexSlice(String hex) {
		int sliceSize = hex.length();
		if (sliceSize == 2) {
			return fromHexSliceSize2(hex);
		}
		if (sliceSize == 4) {
			return fromHexSliceSize4(hex);
		}
		if (sliceSize == 6) {
			return fromHexSliceSize6(hex);
		}
        throw new IllegalArgumentException("Hex slice must be of length 2, 4, or 6.");
	}
	
	public static String fromHexString(String hex) {
		if (hex.length() % 2 != 0) {
			throw new IllegalArgumentException("Hex string must be of even length.");
		}

		StringBuilder sb = new StringBuilder();
		for (int sliceStart = 0; sliceStart < hex.length(); sliceStart += 6) {
			int sliceSize = Math.min(hex.length()-sliceStart, 6);
			String slice = hex.substring(sliceStart, sliceStart+sliceSize);
            String b64Slice = fromHexSlice(slice);
            sb.append(b64Slice);
		}
		return sb.toString();
	}

}
