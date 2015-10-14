
public class project {
	public static void main(String[] args) {
		classes.fillReqCS();
		classes.fillElecCS();
		for(int i = 0; i < classes.reqCS.length; i++){
			System.out.println(classes.reqCS[i]);
		}
		for(int i = 0; i < classes.elecCS.length; i++){
			System.out.println(classes.elecCS[i]);
		}
	}
}
