package fugacidades;
import constantes.*;

public class Z {
	private static double Az;
	private static double Bz;
	private static double Cz;
	private static double zi;
	private static double fz;
	private static double fdz;
	private static double error;
	private static double tol=1e-8;
	private static double zm;
	
	public static double B(double t,double y1, double y2, double y3, double y4, double y5) {
		Bz=(V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t);
		return Bz;
	}
	
	public static double Zm(double t,double y1, double y2, double y3, double y4, double y5) {
		Az=((V3.aafm(t, y1, y2, y3, y4, y5))*C.presionkpa)/((Math.pow(C.r, 2))*(Math.pow(t, 2)));
		Bz=(V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t);
		Cz= - ((Az*Bz) - (Math.pow(Bz, 2))- (Math.pow(Bz, 3)));
		zm= 1.0;
		do {
		fz= Math.pow(zm, 3) -((1-Bz)*Math.pow(zm, 2)) +((Az-(3*Math.pow(Bz, 2))-(2*Bz))*zm) +Cz;
		fdz=(3*Math.pow(zm, y2))-(2*(1-Bz)*zm)+(Az-(3*Math.pow(Bz, 2))-(2*Bz));
		zi=zm;
		zm=zm-(fz/fdz);
		//System.out.println("fz: " +fz );
		//System.out.println("fdz: " +fdz );
		//System.out.println("zm" + zm);
		
		error=(zi-zm)/zi;
		}
		while(tol<error);
		//System.out.println("zm;  " + zm);
		
		
		return zm ;
	}

}
