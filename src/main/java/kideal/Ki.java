package kideal;
import constantes.*;
import deltas.DGfRx;
import deltas.DHfRx;
public class Ki {

	private static double g;
	private static double grt;
	private static double k;
	
	public static double k1(double t) {
		g=DHfRx.dHfrx1()-(((DHfRx.dHfrx1()-DGfRx.dGfrx1())*t)/298.15)+CpR.CpR1(t)-(t*CpRT.CpRT1(t));
		grt=g/(t*C.r);
		k= Math.exp(-grt);
		//System.out.println("k" + k);
		return k;
	}
	public static double k2(double t) {
		g=DHfRx.dHfrx2()-(((DHfRx.dHfrx2()-DGfRx.dGfrx2())*t)/298.15)+CpR.CpR2(t)-(t*CpRT.CpRT2(t));
		grt = g/(t*C.r);
		k= Math.exp(-grt);
		//System.out.println("k" + k);
		return k;
	}
	public static double k3(double t) {
		g=DHfRx.dHfrx3()-(((DHfRx.dHfrx3()-DGfRx.dGfrx3())*t)/298.15)+CpR.CpR3(t)-(t*CpRT.CpRT3(t));
		grt = g/(t*C.r);
		k= Math.exp(-grt);
		//System.out.println("k" + k);
		return k;
	}
	public static double k4 (double t) {
		g=DHfRx.dHfrx4()-(((DHfRx.dHfrx4()-DGfRx.dGfrx4())*t)/298.15)+CpR.CpR4(t)-(t*CpRT.CpRT4(t));
		grt = g/(t*C.r);
		k= Math.exp(-grt);
		//System.out.println("k" + k);
		return k;
	}
}
