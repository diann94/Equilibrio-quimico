package kideal;


import deltas.DCpRx;

public class CpRT {
private static double delCpRdtT;
	
	public static double CpRT1 (double t) {
		delCpRdtT = (DCpRx.drcpx1()[0]*((Math.log(t)-(Math.log(298.15)))))+
				(DCpRx.drcpx1()[1]*(t-298.15)) +
				((DCpRx.drcpx1()[2]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx1()[3]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx1()[4]/4)*((Math.pow(t,4))-(Math.pow(298.15,4))));
		//System.out.println(delCpRdtT);
		return delCpRdtT;
	}
	
	public static double CpRT2 (double t) {
		delCpRdtT =(DCpRx.drcpx2()[0]*((Math.log(t)-(Math.log(298.15)))))+
				(DCpRx.drcpx2()[1]*(t-298.15)) +
				((DCpRx.drcpx2()[2]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx2()[3]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx2()[4]/4)*((Math.pow(t,4))-(Math.pow(298.15,4))));
		//System.out.println(delCpRdtT);
		return delCpRdtT;
	}
	
	public static double CpRT3 (double t) {
		delCpRdtT =(DCpRx.drcpx3()[0]*((Math.log(t)-(Math.log(298.15)))))+
				(DCpRx.drcpx3()[1]*(t-298.15)) +
				((DCpRx.drcpx3()[2]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx3()[3]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx3()[4]/4)*((Math.pow(t,4))-(Math.pow(298.15,4))));
		//System.out.println(delCpRdtT);
		return delCpRdtT;
	}
	
	public static double CpRT4 (double t) {
		delCpRdtT =(DCpRx.drcpx4()[0]*((Math.log(t)-(Math.log(298.15)))))+
				(DCpRx.drcpx4()[1]*(t-298.15)) +
				((DCpRx.drcpx4()[2]/2)*((Math.pow(t,2))-(Math.pow(298.15,2)))) +
				((DCpRx.drcpx4()[3]/3)*((Math.pow(t,3))-(Math.pow(298.15,3)))) +
				((DCpRx.drcpx4()[4]/4)*((Math.pow(t,4))-(Math.pow(298.15,4))));
		//System.out.println(delCpRdtT);
		return delCpRdtT;
	}


}
