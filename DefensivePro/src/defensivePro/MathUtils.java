package defensivePro;
//****************************************************************
//MathUtils.java
//
//Provides static mathematical utility functions.
//
//****************************************************************
public class MathUtils {
	public static int factorial (int n){
		if(n < 0) throw new IllegalArgumentException("Negative is not allowed") ;
		if(n > 16) throw new IllegalArgumentException("Argument over 16 not allowed") ;
		int fac = 1;	
		
		for (int i=n; i>0; i--)
			fac *= i; 
		return fac;
	}
}