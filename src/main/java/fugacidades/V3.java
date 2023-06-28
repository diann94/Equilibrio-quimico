package fugacidades;

public class V3 {
	private static  double aafm;
	private static double bm;
	private static double [] aafji = new double [5];
	
	public static double aafm (double t, double y1, double y2, double y3, double y4, double y5) {
		aafm=Math.pow(((y1*Math.pow(V2.aaf1(t),0.5))+(y2*Math.pow(V2.aaf2(t),0.5))+(y3*Math.pow(V2.aaf3(t),0.5))+
				(y4*Math.pow(V2.aaf4(t),0.5))+(y5*Math.pow(V2.aaf5(t),0.5))),2);
		//System.out.println(aafm);
		return aafm;
	}
	public static double bm (double y1, double y2, double y3, double y4, double y5) {
		bm=(y1*V1.b1())+(y2*V1.b2())+(y3*V1.b3())+(y4*V1.b4())+(y5*V1.b5());
		//System.out.println(bm);
		return bm;
	}
	
	public static  double [] aafji1(double t) {
		aafji[0]=Math.pow((V2.aaf1(t)*V2.aaf1(t)),0.5);
		aafji[1]=Math.pow((V2.aaf1(t)*V2.aaf2(t)),0.5);
		aafji[2]=Math.pow((V2.aaf1(t)*V2.aaf3(t)),0.5);
		aafji[3]=Math.pow((V2.aaf1(t)*V2.aaf4(t)),0.5);
		aafji[4]=Math.pow((V2.aaf1(t)*V2.aaf5(t)),0.5);
		//System.out.println(aafji[0] + " "+ aafji[1] + " "+aafji[2] + " "+aafji[3] + " "+ aafji[4] + " ");
		return aafji;
	}
	public static  double [] aafji2(double t) {
		aafji[0]=Math.pow((V2.aaf2(t)*V2.aaf1(t)),0.5);
		aafji[1]=Math.pow((V2.aaf2(t)*V2.aaf2(t)),0.5);
		aafji[2]=Math.pow((V2.aaf2(t)*V2.aaf3(t)),0.5);
		aafji[3]=Math.pow((V2.aaf2(t)*V2.aaf4(t)),0.5);
		aafji[4]=Math.pow((V2.aaf2(t)*V2.aaf5(t)),0.5);
		//System.out.println(aafji[0] + " "+ aafji[1] + " "+aafji[2] + " "+aafji[3] + " "+ aafji[4] + " ");
		return aafji;
	}
	public static  double [] aafji3(double t) {
		aafji[0]=Math.pow((V2.aaf3(t)*V2.aaf1(t)),0.5);
		aafji[1]=Math.pow((V2.aaf3(t)*V2.aaf2(t)),0.5);
		aafji[2]=Math.pow((V2.aaf3(t)*V2.aaf3(t)),0.5);
		aafji[3]=Math.pow((V2.aaf3(t)*V2.aaf4(t)),0.5);
		aafji[4]=Math.pow((V2.aaf3(t)*V2.aaf5(t)),0.5);
		//System.out.println(aafji[0] + " "+ aafji[1] + " "+aafji[2] + " "+aafji[3] + " "+ aafji[4] + " ");
		return aafji;
	}
	public static  double [] aafji4(double t) {
		aafji[0]=Math.pow((V2.aaf4(t)*V2.aaf1(t)),0.5);
		aafji[1]=Math.pow((V2.aaf4(t)*V2.aaf2(t)),0.5);
		aafji[2]=Math.pow((V2.aaf4(t)*V2.aaf3(t)),0.5);
		aafji[3]=Math.pow((V2.aaf4(t)*V2.aaf4(t)),0.5);
		aafji[4]=Math.pow((V2.aaf4(t)*V2.aaf5(t)),0.5);
		//System.out.println(aafji[0] + " "+ aafji[1] + " "+aafji[2] + " "+aafji[3] + " "+ aafji[4] + " ");
		return aafji;
	}
	public static  double [] aafji5(double t) {
		aafji[0]=Math.pow((V2.aaf5(t)*V2.aaf1(t)),0.5);
		aafji[1]=Math.pow((V2.aaf5(t)*V2.aaf2(t)),0.5);
		aafji[2]=Math.pow((V2.aaf5(t)*V2.aaf3(t)),0.5);
		aafji[3]=Math.pow((V2.aaf5(t)*V2.aaf4(t)),0.5);
		aafji[4]=Math.pow((V2.aaf5(t)*V2.aaf5(t)),0.5);
		//System.out.println(aafji[0] + " "+ aafji[1] + " "+aafji[2] + " "+aafji[3] + " "+ aafji[4] + " ");
		return aafji;
	}
}
