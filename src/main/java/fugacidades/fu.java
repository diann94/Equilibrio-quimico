package fugacidades;
import constantes.*;

public class fu {
	private static double i;
	private static double j;
	private static double k;
	private static double l;
	private static double m;
	private static double n;
	private static double w;
	private static double lnfu;
	private static double fu;
	

	
	public static double fu1(double t,double y1, double y2, double y3, double y4, double y5) {
		i=(V1.b1()/V3.bm(y1, y2, y3, y4, y5))*(-1 +(Z.Zm(t, y1, y2, y3, y4, y5)));
		j= Math.log((Z.Zm(t, y1, y2, y3, y4, y5))-((V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t)));
		k=V3.aafm(t, y1, y2, y3, y4, y5)/(2*Math.pow(2, 0.5)*V3.bm(y1, y2, y3, y4, y5)*C.r*t);
		l=V1.b1()/V3.bm(y1, y2, y3, y4, y5);
		m=2/V3.aafm(t, y1, y2, y3, y4, y5);
		n=(y1*V3.aafji1(t)[0])+(y2*V3.aafji1(t)[1])+(y3*V3.aafji1(t)[2])+(y4*V3.aafji1(t)[3])+(y5*V3.aafji1(t)[4]);
		w=Math.log((Z.Zm(t, y1, y2, y3, y4, y5)+((Math.pow(2,0.5)+1)*Z.B(t, y1, y2, y3, y4, y5)))/(Z.Zm(t, y1, y2, y3, y4, y5)-((Math.pow(2,0.5)-1)*Z.B(t, y1, y2, y3, y4, y5))));
		lnfu=i-j+(k*(l-(m*n))*w);
		fu=Math.exp(lnfu);
		//System.out.println(fu);
		return fu;
	}
	public static double fu2(double t,double y1, double y2, double y3, double y4, double y5) {
		i=(V1.b2()/V3.bm(y1, y2, y3, y4, y5))*(-1 +(Z.Zm(t, y1, y2, y3, y4, y5)));
		j= Math.log((Z.Zm(t, y1, y2, y3, y4, y5))-((V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t)));
		k=V3.aafm(t, y1, y2, y3, y4, y5)/(2*Math.pow(2, 0.5)*V3.bm(y1, y2, y3, y4, y5)*C.r*t);
		l=V1.b2()/V3.bm(y1, y2, y3, y4, y5);
		m=2/V3.aafm(t, y1, y2, y3, y4, y5);
		n=(y1*V3.aafji2(t)[0])+(y2*V3.aafji2(t)[1])+(y3*V3.aafji2(t)[2])+(y4*V3.aafji2(t)[3])+(y5*V3.aafji2(t)[4]);
		w=Math.log((Z.Zm(t, y1, y2, y3, y4, y5)+((Math.pow(2,0.5)+1)*Z.B(t, y1, y2, y3, y4, y5)))/(Z.Zm(t, y1, y2, y3, y4, y5)-((Math.pow(2,0.5)-1)*Z.B(t, y1, y2, y3, y4, y5))));
		lnfu=i-j+(k*(l-(m*n))*w);
		fu=Math.exp(lnfu);
		//System.out.println(fu);
		return fu;
	}
	public static double fu3(double t,double y1, double y2, double y3, double y4, double y5) {
		i=(V1.b3()/V3.bm(y1, y2, y3, y4, y5))*(-1 +(Z.Zm(t, y1, y2, y3, y4, y5)));
		j= Math.log((Z.Zm(t, y1, y2, y3, y4, y5))-((V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t)));
		k=V3.aafm(t, y1, y2, y3, y4, y5)/(2*Math.pow(2, 0.5)*V3.bm(y1, y2, y3, y4, y5)*C.r*t);
		l=V1.b3()/V3.bm(y1, y2, y3, y4, y5);
		m=2/V3.aafm(t, y1, y2, y3, y4, y5);
		n=(y1*V3.aafji3(t)[0])+(y2*V3.aafji3(t)[1])+(y3*V3.aafji3(t)[2])+(y4*V3.aafji3(t)[3])+(y5*V3.aafji3(t)[4]);
		w=Math.log((Z.Zm(t, y1, y2, y3, y4, y5)+((Math.pow(2,0.5)+1)*Z.B(t, y1, y2, y3, y4, y5)))/(Z.Zm(t, y1, y2, y3, y4, y5)-((Math.pow(2,0.5)-1)*Z.B(t, y1, y2, y3, y4, y5))));
		lnfu=i-j+(k*(l-(m*n))*w);
		fu=Math.exp(lnfu);
		//System.out.println(fu);
		return fu;
	}
	public static double fu4(double t,double y1, double y2, double y3, double y4, double y5) {
		i=(V1.b4()/V3.bm(y1, y2, y3, y4, y5))*(-1 +(Z.Zm(t, y1, y2, y3, y4, y5)));
		j= Math.log((Z.Zm(t, y1, y2, y3, y4, y5))-((V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t)));
		k=V3.aafm(t, y1, y2, y3, y4, y5)/(2*Math.pow(2, 0.5)*V3.bm(y1, y2, y3, y4, y5)*C.r*t);
		l=V1.b4()/V3.bm(y1, y2, y3, y4, y5);
		m=2/V3.aafm(t, y1, y2, y3, y4, y5);
		n=(y1*V3.aafji4(t)[0])+(y2*V3.aafji4(t)[1])+(y3*V3.aafji4(t)[2])+(y4*V3.aafji4(t)[3])+(y5*V3.aafji4(t)[4]);
		w=Math.log((Z.Zm(t, y1, y2, y3, y4, y5)+((Math.pow(2,0.5)+1)*Z.B(t, y1, y2, y3, y4, y5)))/(Z.Zm(t, y1, y2, y3, y4, y5)-((Math.pow(2,0.5)-1)*Z.B(t, y1, y2, y3, y4, y5))));
		lnfu=i-j+(k*(l-(m*n))*w);
		fu=Math.exp(lnfu);
		//System.out.println(fu);
		return fu;
	}
	public static double fu5(double t,double y1, double y2, double y3, double y4, double y5) {
		i=(V1.b5()/V3.bm(y1, y2, y3, y4, y5))*(-1 +(Z.Zm(t, y1, y2, y3, y4, y5)));
		j= Math.log((Z.Zm(t, y1, y2, y3, y4, y5))-((V3.bm(y1, y2, y3, y4, y5)*C.presionkpa)/(C.r*t)));
		k=V3.aafm(t, y1, y2, y3, y4, y5)/(2*Math.pow(2, 0.5)*V3.bm(y1, y2, y3, y4, y5)*C.r*t);
		l=V1.b5()/V3.bm(y1, y2, y3, y4, y5);
		m=2/V3.aafm(t, y1, y2, y3, y4, y5);
		n=(y1*V3.aafji5(t)[0])+(y2*V3.aafji5(t)[1])+(y3*V3.aafji5(t)[2])+(y4*V3.aafji5(t)[3])+(y5*V3.aafji5(t)[4]);
		w=Math.log((Z.Zm(t, y1, y2, y3, y4, y5)+((Math.pow(2,0.5)+1)*Z.B(t, y1, y2, y3, y4, y5)))/(Z.Zm(t, y1, y2, y3, y4, y5)-((Math.pow(2,0.5)-1)*Z.B(t, y1, y2, y3, y4, y5))));
		lnfu=i-j+(k*(l-(m*n))*w);
		fu=Math.exp(lnfu);
		//System.out.println(fu);
		return fu;
	}
}
