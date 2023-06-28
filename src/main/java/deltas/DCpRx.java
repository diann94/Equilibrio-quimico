package deltas;

import constantes.*; 

public class DCpRx {
	private static double  deltrx1[] = new double [5]; 
	private static  double deltrx2 []= new double [5];
	private static double deltrx3[] = new double [5];
	private static  double deltrx4[] =new double [5];
	 
	 // los coeficientes estequimetricos de cada ecuacion se detallan 
	 
	 
	 //para nc6 -1 para 2mp 1
	public static double [] drcpx1 () { // son miembros de la clase
	for (int i=0;  i<5;  i++) {
		deltrx1[i]=C.cons2MP[i] -C.consNC6[i];

		//System.out.println(deltrx1[i]);
	}
	return deltrx1;
	}
	
	//para nc6 -1 para 3mp 1
	public static double [] drcpx2 () {
	for (int i=0;  i<5;  i++) {
		deltrx2[i]=C.cons3MP[i] -C.consNC6[i];
		//System.out.println(deltrx2[i]);
	}
	return deltrx2;
	}
	
	//para nc6 -1 para 22DMB  1
	public static double[] drcpx3() {
	for (int i=0;  i<5;  i++) {
		deltrx3[i]=C.cons22DMB[i] -C.consNC6[i];
		//System.out.println(deltrx3[i]);
	}
	return deltrx3;
	}
	
	//para nc6 -1 para 23DMB  1
	public static double [] drcpx4() {
	for (int i=0;  i<5;  i++) {
		deltrx4[i]=C.cons23DMB[i] -C.consNC6[i];
	}
	return deltrx4;
	}
	

}
