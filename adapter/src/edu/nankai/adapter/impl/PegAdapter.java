package edu.nankai.adapter.impl;

import edu.nankai.adapter.inter.IRoundPeg;
import edu.nankai.adapter.inter.ISquarePeg;

public class PegAdapter implements ISquarePeg, IRoundPeg {
	
	private SquarePeg squarePeg;
	private RoundPeg roundPeg;

	public PegAdapter(SquarePeg peg){this.squarePeg=peg;}
	public PegAdapter(RoundPeg peg){this.roundPeg=peg;}
	
	@Override
	public void insertIntoHole(String msg) {
		// TODO Auto-generated method stub
		squarePeg.insert(msg);

	}

	@Override
	public void insert(String str) {
		// TODO Auto-generated method stub
		roundPeg.insertIntoHole(str);

	}

}
