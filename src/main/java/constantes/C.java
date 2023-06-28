package constantes;

public class C {
	// los cp tienen unidades de J/mol K  o tambien puede ser kJ/kmol K
		// 1 a 2 b 3 c 4 d 5 e 
		public static final double consNC6 [] = {25.924, 0.41927, -0.000012491,	-1.592E-07,	5.8784E-11};
		public static  final double cons2MP [] = {-7.197, 0.60097,	-0.00034094, 9.521E-08,	-1.0297E-11};
		public static final double cons3MP [] = {-7.123,0.58327, -0.00030338, 6.802E-08, -3.9778E-12};
		public static final double cons22DMB [] = {-1.477, 0.55644,	-0.00024802, 4.143E-08,	2.4035E-13};
		public static final double cons23DMB  []= {-25.999,0.68344,-0.00048517,2.126E-07,-4.3837E-11};
		// entalpias de formacion unidades de kJ/kmol
		public static final double HFNC6= -166900;
		public static final double HF2MP= -174600;
		public static final double HF3MP= -172000;
		public static final double HF22DMB= -184000;
		public static final double HF23DMB =-175900;
		//energia de gibbs de formacion kJ/kmol
		public static final double GFNC6 = 200;
		public static final double GF2MP = -5100;
		public static final double GF3MP =-3200;
		public static final double GF22DMB =-7800;
		public static final double GF23DMB =-2000;
		// 1 factor acentrico 2 Tc en K 3 presion critica en kPa
		public static final double pcNC6 [] = {0.305,507.43,3012};
		public static final double pc2MP [] = {0.278,497.5,3010};
		public static final double pc3MP[] = {0.274,504.43,3124};
		public static final double pc22DMB[]= {0.234,488.78,3081};
		public static final double pc23DMB[] = {0.248,499.98,3127};
		//Unidades de r kJ/kmol K 
		public static final double  r = 8.314;
		
		public static  final double[] temp = { 373.15, 423.15, 473.15, 523.15, 573.15};
		// la presion esta en bar
		public static  final  double presion =36.415259	;
				
		public static final double presionkpa=3713.323;
		private C () {
			
		}


}
