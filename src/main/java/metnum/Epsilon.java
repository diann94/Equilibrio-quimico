package metnum;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Epsilon {
	//private static double [] va = {0.0,0.0,0.0,0.0};

	
	//private static double error;
	
	// fu son loc coeficientes de fugacidad por cada componente 
	public static double []  inversa (double k1,double k2,double k3,double k4, double fu1, double fu2,double fu3, double fu4,
								double fu5,double e1, double e2, double e3, double e4) {
		double[] ve=new double [4];
		double  jac [][] = new double [4][4];
		double [] vs = new double [4];
		double aux=0;
		
		
		
		ve [0] = -(((e1*fu2)/((1-e1-e2-e3-e4)*fu1))-k1);
		ve [1] = -(((e2*fu3)/((1-e1-e2-e3-e4)*fu1))-k2);
		ve [2] = -(((e3*fu4)/((1-e1-e2-e3-e4)*fu1))-k3);
		ve [3] = -(((e4*fu5)/((1-e1-e2-e3-e4)*fu1))-k4);
		
		jac[0][0]= ((1-e2-e3-e4)/(Math.pow((1-e1-e2-e3-e4),2)))*(fu2/fu1);
		jac[0][1]= ((e1/(Math.pow((1-e1-e2-e3-e4),2))))*(fu2/fu1);
		jac[0][2]= ((e1/(Math.pow((1-e1-e2-e3-e4),2))))*(fu2/fu1);
		jac[0][3]= ((e1/(Math.pow((1-e1-e2-e3-e4),2))))*(fu2/fu1);
		jac[1][0]= ((e2/(Math.pow((1-e1-e2-e3-e4),2))))*(fu3/fu1);
		jac[1][1]= ((1-e1-e3-e4)/(Math.pow((1-e1-e2-e3-e4),2)))*(fu3/fu1);
		jac[1][2]= ((e2/(Math.pow((1-e1-e2-e3-e4),2))))*(fu3/fu1);
		jac[1][3]= ((e2/(Math.pow((1-e1-e2-e3-e4),2))))*(fu3/fu1);
		jac[2][0]= ((e3/(Math.pow((1-e1-e2-e3-e4),2))))*(fu4/fu1);
		jac[2][1]= ((e3/(Math.pow((1-e1-e2-e3-e4),2))))*(fu4/fu1);
		jac[2][2]= ((1-e1-e2-e4)/(Math.pow((1-e1-e2-e3-e4),2)))*(fu4/fu1);
		jac[2][3]= ((e3/(Math.pow((1-e1-e2-e3-e4),2))))*(fu4/fu1);
		jac[3][0]= ((e4/(Math.pow((1-e1-e2-e3-e4),2))))*(fu5/fu1);
		jac[3][1]= ((e4/(Math.pow((1-e1-e2-e3-e4),2))))*(fu5/fu1);
		jac[3][2]= ((e4/(Math.pow((1-e1-e2-e3-e4),2))))*(fu5/fu1);
		jac[3][3]= ((1-e1-e2-e3)/(Math.pow((1-e1-e2-e3-e4),2)))*(fu5/fu1);


		double [][] inversa=MatrixUtils.inverse(new  Array2DRowRealMatrix(jac)).getData();
		
		for (int i=0; i<inversa.length; i++) {
			for (int j= 0; j<inversa.length; j++) {
				aux=inversa[i][j]*ve[j];
				vs[i]=vs[i]+aux;
				}	
		}
		return vs;
		
	}
	public static double []epsilon (double k1,double k2,double k3,double k4, double fu1, double fu2,double fu3, double fu4,
			double fu5,double e1, double e2, double e3, double e4){
		double error;
		final double tol=1e-12;
		double vh[]= new double [4];
		double epsilon[] = new double [4];
		do {
		
		vh[0]=inversa(k1, k2, k3, k4, fu1, fu2, fu3, fu4, fu5, e1, e2, e3, e4)[0];
		vh[1]=inversa(k1, k2, k3, k4, fu1, fu2, fu3, fu4, fu5, e1, e2, e3, e4)[1];
		vh[2]=inversa(k1, k2, k3, k4, fu1, fu2, fu3, fu4, fu5, e1, e2, e3, e4)[2];
		vh[3]=inversa(k1, k2, k3, k4, fu1, fu2, fu3, fu4, fu5, e1, e2, e3, e4)[3];
		
		e1=e1+vh[0];
		e2=e2+vh[1];
		e3=e3+vh[2];
		e4=e4+vh[3];
		
		
		
		error=Math.abs(vh[0]+vh[1]+vh[2]+vh[3]);
		}
		while(tol<error);
	
	epsilon[0]=e1;
	epsilon[1]=e2;
	epsilon[2]=e3;
	epsilon[3]=e4;
	
	

	return epsilon;		
}

}
//Para sacar la inversa 
		// double[][] inversa = MatrixUtils.inverse(new Array2DRowRealMatrix(b)).getData();
//esto es para instancear los metodos y pasar a otros argumentos 
		//double deltrx1 =DeltasCpRx.drcpx1()[0] +5;
		//1) retorna el valor del meto ,2 ) estoy especificando el valor 
		//System.out.println(deltrx1);
