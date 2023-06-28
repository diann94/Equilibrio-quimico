package fugacidades;

import constantes.*;

public class V1 {
	private static double tr;
	private static double a;
	private static double b;

	public static double trNC6(double t) {
		tr = t / C.pcNC6[1];
		//System.out.println(tr);
		return tr;
	}

	public static double tr2MP(double t) {
		tr = t / C.pc2MP[1];
		//System.out.println(tr);
		return tr;
	}

	public static double tr3MP(double t) {
		tr = t / C.pc3MP[1];
		//System.out.println(tr);
		return tr;
	}

	public static double tr22DMB(double t) {
		tr = t / C.pc22DMB[1];
		//System.out.println(tr);
		return tr;
	}

	public static double tr23DMB(double t) {
		tr = t / C.pc23DMB[1];
		//System.out.println(tr);
		return tr;
	}

	public static double a1() {
		a=0.45724*(((Math.pow(C.r,2))*(Math.pow(C.pcNC6[1],2)))/C.pcNC6[2]);
		//System.out.println(a);
		return a;
	}
	public static double a2() {
		a=0.45724*(((Math.pow(C.r,2))*(Math.pow(C.pc2MP[1],2)))/C.pc2MP[2]);
		//System.out.println(a);
		return a;
	}
	public static double a3() {
		a=0.45724*(((Math.pow(C.r,2))*(Math.pow(C.pc3MP[1],2)))/C.pc3MP[2]);
		//System.out.println(a);
		return a;
	}
	public static double a4() {
		a=0.45724*(((Math.pow(C.r,2))*(Math.pow(C.pc22DMB[1],2)))/C.pc22DMB[2]);
		//System.out.println(a);
		return a;
	}
	public static double a5() {
		a=0.45724*(((Math.pow(C.r,2))*(Math.pow(C.pc23DMB[1],2)))/C.pc23DMB[2]);
		//System.out.println(a);
		return a;
	}
	public static double b1() {
		b=0.0778*(((C.r)*C.pcNC6[1])/C.pcNC6[2]);
		//System.out.println(b);
		return b;
	}
	public static double b2() {
		b=0.0778*(((C.r)*C.pc2MP[1])/C.pc2MP[2]);
		//System.out.println(b);
		return b;
	}
	public static double b3() {
		b=0.0778*(((C.r)*C.pc3MP[1])/C.pc3MP[2]);
		//System.out.println(b);
		return b;
	}
	public static double b4() {
		b=0.0778*(((C.r)*C.pc22DMB[1])/C.pc22DMB[2]);
		//System.out.println(b);
		return b;
	}
	public static double b5() {
		b=0.0778*(((C.r)*C.pc23DMB[1])/C.pc23DMB[2]);
		//System.out.println(b);
		return b;
	}
}


