package deltas;
import constantes.*;
public class DHfRx {
	private static double delHfrx1;
	private static double delHfrx2;
	private static double delHfrx3;
	private static double delHfrx4;
	
	public static double dHfrx1() {
		delHfrx1= C.HF2MP - C.HFNC6;	
		//System.out.println(delHfrx1);
		return delHfrx1;
	}
	
	public static double dHfrx2() {
		delHfrx2= C.HF3MP - C.HFNC6;
		//System.out.println(delHfrx2);
		return delHfrx2;
	}
	
	public static double dHfrx3() {
		delHfrx3= C.HF22DMB - C.HFNC6;
		//System.out.println(delHfrx3);
		return delHfrx3;	
	}
	
	public static double dHfrx4() {
		delHfrx4= C.HF23DMB - C.HFNC6;	
		//System.out.println(delHfrx4);
		return delHfrx4;
	}

}
