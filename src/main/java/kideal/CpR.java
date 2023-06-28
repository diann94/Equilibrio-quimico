package kideal;

import deltas.DCpRx;

public class CpR {
	private static double delCpRdt1;
	public static double CpR1 (double t) {
		delCpRdt1 =(DCpRx.drcpx1()[0]*(t-298.15)) +
				((DCpRx.drcpx1()[1]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx1()[2]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx1()[3]/4)*((Math.pow(t,4))-(Math.pow(298.15,4)))) +
				((DCpRx.drcpx1()[4]/5)*((Math.pow(t,5))-(Math.pow(298.15,5))));
		//System.out.println(delCpRdt1);
		return delCpRdt1;
	}
	
	public static double CpR2 (double t) {
		delCpRdt1 =(DCpRx.drcpx2()[0]*(t-298.15)) +
				((DCpRx.drcpx2()[1]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx2()[2]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx2()[3]/4)*((Math.pow(t,4))-(Math.pow(298.15,4)))) +
				((DCpRx.drcpx2()[4]/5)*((Math.pow(t,5))-(Math.pow(298.15,5))));
		//System.out.println(delCpRdt1);
		return delCpRdt1;
	}
	
	public static double CpR3 (double t) {
		delCpRdt1 =(DCpRx.drcpx3()[0]*(t-298.15)) +
				((DCpRx.drcpx3()[1]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx3()[2]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx3()[3]/4)*((Math.pow(t,4))-(Math.pow(298.15,4)))) +
				((DCpRx.drcpx3()[4]/5)*((Math.pow(t,5))-(Math.pow(298.15,5))));
		//System.out.println(delCpRdt1);
		return delCpRdt1;
	}
	
	public static double CpR4 (double t) {
		delCpRdt1 =(DCpRx.drcpx4()[0]*(t-298.15)) +
				((DCpRx.drcpx4()[1]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx4()[2]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx4()[3]/4)*((Math.pow(t,4))-(Math.pow(298.15,4)))) +
				((DCpRx.drcpx4()[4]/5)*((Math.pow(t,5))-(Math.pow(298.15,5))));
		//System.out.println(delCpRdt1);
		return delCpRdt1;
	}

}
