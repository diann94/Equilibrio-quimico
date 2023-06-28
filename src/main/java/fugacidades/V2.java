package fugacidades;
import constantes.*;

public class V2 {
	private static double m;
	private static double af;
	private static double aaf;
	
	public static double m1() {
		m=0.37464+(1.54226*C.pcNC6[0])-(0.26992*(Math.pow(C.pcNC6[0],2)));
		//System.out.println(m);
		return m;
	}
	public static double m2() {
		m=0.37464+(1.54226*C.pc2MP[0])-(0.26992*(Math.pow(C.pc2MP[0],2)));
		//System.out.println(m);
		return m;
	}
	public static double m3() {
		m=0.37464+(1.54226*C.pc3MP[0])-(0.26992*(Math.pow(C.pc3MP[0],2)));
		//System.out.println(m);
		return m;
	}
	public static double m4() {
		m=0.37464+(1.54226*C.pc22DMB[0])-(0.26992*(Math.pow(C.pc22DMB[0],2)));
		//System.out.println(m);
		return m;
	}
	public static double m5() {
		m=0.37464+(1.54226*C.pc23DMB[0])-(0.26992*(Math.pow(C.pc23DMB[0],2)));
		//System.out.println(m);
		return m;
	}
	public static double af1(double t) {
		af=Math.pow((1+(m1()*(1-(Math.pow(V1.trNC6(t),0.5))))),2);
	//	System.out.println(af);
		return af;				
	}
	public static double af2(double t) {
		af=Math.pow((1+(m2()*(1-(Math.pow(V1.tr2MP(t),0.5))))),2);
	//	System.out.println(af);
		return af;				
	}
	public static double af3(double t) {
		af=Math.pow((1+(m3()*(1-(Math.pow(V1.tr3MP(t),0.5))))),2);
		//System.out.println(af);
		return af;				
	}
	public static double af4(double t) {
		af=Math.pow((1+(m4()*(1-(Math.pow(V1.tr22DMB(t),0.5))))),2);
	//	System.out.println(af);
		return af;				
	}
	public static double af5(double t) {
		af=Math.pow((1+(m5()*(1-(Math.pow(V1.tr23DMB(t),0.5))))),2);
		//System.out.println(af);
		return af;				
	}
	public static double aaf1(double t) {
		aaf=af1(t)*V1.a1();
		//System.out.println(aaf);
		return aaf;
	}
	public static double aaf2(double t) {
		aaf=af2(t)*V1.a2();
		//System.out.println(aaf);
		return aaf;
	}
	public static double aaf3(double t) {
		aaf=af3(t)*V1.a3();
		//System.out.println(aaf);
		return aaf;
	}
	public static double aaf4(double t) {
		aaf=af4(t)*V1.a4();
		//System.out.println(aaf);
		return aaf;
	}
	public static double aaf5(double t) {
		aaf=af5(t)*V1.a5();
		//System.out.println(aaf);
		return aaf;
	}

}
