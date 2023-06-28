package deltas;
import constantes.*;
public class DGfRx {
	private static double delGfrx1;
	private static double delGfrx2;
	private static double delGfrx3;
	private static double delGfrx4;
	
	public static double dGfrx1() {
		delGfrx1= C.GF2MP - C.GFNC6;	
		//System.out.println(delGfrx1);
		return delGfrx1;
	}
	
	public static double dGfrx2() {
		delGfrx2= C.GF3MP -C.GFNC6;
		//System.out.println(delGfrx2);
		return delGfrx2;
	}
	
	public static double dGfrx3() {
		delGfrx3= C.GF22DMB - C.GFNC6;
		//System.out.println(delGfrx3);
		return delGfrx3;	
	}
	
	public static double dGfrx4() {
		delGfrx4= C.GF23DMB - C.GFNC6;	
		//System.out.println(delGfrx4);
		return delGfrx4;
	}

}
