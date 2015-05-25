package edu.nankai.adapter.testpeg;

import edu.nankai.adapter.impl.PegAdapter;
import edu.nankai.adapter.impl.RoundPeg;
import edu.nankai.adapter.impl.SquarePeg;
import edu.nankai.adapter.inter.IRoundPeg;
import edu.nankai.adapter.inter.ISquarePeg;

public class testPegs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquarePeg squarePeg=new SquarePeg();
		RoundPeg roundPeg = new RoundPeg();
		
		squarePeg.insert("Inserting square peg....");
		
		ISquarePeg roundToSquare = new PegAdapter(roundPeg);
		roundToSquare.insert("Inserting round peg....");
		
		roundPeg.insertIntoHole("Inserting round peg....");
		IRoundPeg squareToRound = new PegAdapter(squarePeg);
		
		squareToRound.insertIntoHole("Insert square peg....");

	}

}
