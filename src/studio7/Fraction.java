package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}


	public Fraction sum(Fraction f)
	{
		int sumOfNumerator = this.numerator*f.denominator + f.numerator * this.denominator;
		int sumOfDenominator = this.denominator * f.denominator;
		Fraction R = new Fraction (sumOfNumerator,sumOfDenominator); 
		return R;  
	}
	
	
	public Fraction multiply (Fraction frac)
	{
		int productOfNumerator = this.numerator * frac.numerator;
		int productOfDenominator = this.denominator * frac.denominator;
		Fraction R = new Fraction (productOfNumerator,productOfDenominator); 
		return R;  
	}
	
	public Fraction simplify()
	{
		
		int num = this.numerator;
		
		while(((this.numerator % num) != 0) && (this.denominator % num != 0) )
		{
			num--;
		}
		
		int simplifyNum = this.numerator/num;
		int simplifyDen = this.denominator/num;
		Fraction M = new Fraction (simplifyNum, simplifyDen); 
		return M;
		
	}
	
	
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,3); 
		Fraction f3 = new Fraction(5,35); 
		
//		System.out.println(f1.sum(f2));
//		System.out.println(f1.multiply(f2));
		
		System.out.println(f3.simplify());
		
	}

	public String toString() {
		
		return this.numerator + "/" + this.denominator;
	}
	
	
	

}
