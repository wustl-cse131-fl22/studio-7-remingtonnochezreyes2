package studio7;

public class Dice {
      private int numOfSides; 
      public Dice(int numOfSides) {
    	  this.numOfSides=numOfSides;
		// TODO Auto-generated constructor stub
	}
	//n=number of sides 
	public int diceThrow ()
      {
    	  return (int)(Math.random()*(this.numOfSides)+1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dice d1= new Dice (7);
			System.out.println(d1.diceThrow());
	}

}
