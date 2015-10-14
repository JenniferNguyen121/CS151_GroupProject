// this class contians various arrys
// each array corespods to a different major
public class classes {
	static String[] reqCS;
	static String[] elecCS;

	public static String[] fillReqCS() {
		String str = "46A,46B,47,146,147,149,151,152,154,160,116B,123B,153,158B,161,167B";
		reqCS = str.split(",");
		return reqCS;
	}

	public static String[] fillElecCS() {
		String str = "49C,49J,72,108,116A,116B,120A,120I,122,123A,123B,130,134,143C,143M,144,153"
				+ ",155,156,157A,157B,158A,158B,159,161,166,167A,167B,167C,172A,172B,173,174"
				+ ",175,85A,85B,85C,185A,185B,185C,96,196,180,180H,190,190I";
		elecCS = str.split(",");
		return elecCS;
	}
	public boolean check(){
		return false;
	}
}
