package cuerpo;

import constantes.*;
import fugacidades.*;
import kideal.*;
import metnum.*;

public class test {

	public static void main(String[] args) {
		double ei1,ei2,ei3,ei4;	
		double er1,er2,er3,er4;
		double y1,y2,y3,y4,y5;
		double yr1,yr2,yr3,yr4,yr5;
		double fu1,fu2,fu3,fu4,fu5;
		double error;
		double tol=1e-10;
		final double fiI = 1.0;
		final double epio=0.0;
		final double epi1=0.99;
		//double t=COp.temp[5];
	
		for (int i=0; i<C.temp.length;i++) {
			ei1=0;
			ei2=0;
			ei3=0;
			ei4=0;
			
			System.out.println();
		System.out.println("Temperatura: " + C.temp[i]);
		System.out.println();
		//Resolviendo las composiciones yi ideales es decir fugacidad =1 
		ei1= Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fiI, fiI, fiI, fiI, fiI,epio, epi1,epio, epio)[0];
		ei2= Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fiI, fiI, fiI, fiI, fiI, epio, epi1,epio, epio)[1];
		ei3= Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fiI, fiI, fiI, fiI, fiI, epio, epi1,epio, epio)[2];
		ei4= Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fiI, fiI, fiI, fiI, fiI, epio, epi1,epio, epio)[3];
		
		y1=comp(ei1, ei2, ei3, ei4)[0];
		y2=comp(ei1, ei2, ei3, ei4)[1];
		y3=comp(ei1, ei2, ei3, ei4)[2];
		y4=comp(ei1, ei2, ei3, ei4)[3];
		y5=comp(ei1, ei2, ei3, ei4)[4];
		System.out.println("Composiciones ideales son:");
		System.out.printf("%.6f %n", y1);
		System.out.printf("%.6f %n", y2);
		System.out.printf("%.6f %n", y3);
		System.out.printf("%.6f %n", y4);
		System.out.printf("%.6f %n", y5);
		do {
			
		fu1=fu.fu1( C.temp[i], y1, y2, y3, y4, y5);
		fu2=fu.fu2( C.temp[i], y1, y2, y3, y4, y5);
		fu3=fu.fu3( C.temp[i], y1, y2, y3, y4, y5);
		fu4=fu.fu4( C.temp[i], y1, y2, y3, y4, y5);
		fu5=fu.fu5( C.temp[i], y1, y2, y3, y4, y5);
		
		er1=Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]),
				fu1, fu2, fu3, fu4, fu5,ei1, ei2, ei3, ei4)[0];
		er2=Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]),
				fu1, fu2, fu3, fu4, fu5,ei1, ei2, ei3, ei4)[1];
		er3=Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fu1, fu2, fu3, fu4, fu5,ei1, ei2, ei3, ei4)[2];
		er4=Epsilon.epsilon(Ki.k1(C.temp[i]), Ki.k2(C.temp[i]), Ki.k3(C.temp[i]), Ki.k4(C.temp[i]), 
				fu1, fu2, fu3, fu4, fu5,ei1, ei2, ei3, ei4)[3];
		yr1= y1;
		yr2= y2;
		yr3= y3;
		yr4= y4;
		yr5= y5;
		
		y1=comp(er1, er2, er3, er4)[0];
		y2=comp(er1, er2, er3, er4)[1];
		y3=comp(er1, er2, er3, er4)[2];
		y4=comp(er1, er2, er3, er4)[3];
		y5=comp(er1, er2, er3, er4)[4];
		
		error= Math.abs(((yr1-y1)/yr1))+Math.abs(((yr2-y2)/yr2))+ Math.abs(((yr3-y3)/yr3))+
				Math.abs(((yr4-y4)/yr4))+Math.abs(((yr5-y5)/yr5));
		}
		while (tol<error);
		System.out.println("Las composiciones son:");
		System.out.println();
		System.out.printf("%f\t",y1);
		System.out.println();
		System.out.printf("%f\t",y2);
		System.out.println();
		System.out.printf("%f\t",y3);
		System.out.println();
		System.out.printf("%f\t",y4);
		System.out.println();
		System.out.printf("%f\t",y5);
		System.out.println();
		System.out.println("Z" +Z.Zm(C.temp[i], y1, y2, y3, y4, y5));
		
	
		
	}
}
	public static double[] comp(double e1,double e2, double e3, double e4) {
		double [] yis= new double [5];
		yis[0]=1-e1-e2-e3-e4;
		yis[1]= e1;
		yis[2]=e2;
		yis[3]=e3;
		yis[4]=e4;
		
		return yis;
	}
}
