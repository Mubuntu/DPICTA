package edu.ap.patrickfrison;

import java.awt.List;
import java.util.ArrayList;

public class Sorter {

	private int[] aList;
	private Sorteerder sorteerAlgoritme;

	public Sorteerder getSorteerder() {
		return sorteerAlgoritme;
	}

	public void setSorteerder(Sorteerder sorteerder) {
		this.sorteerAlgoritme = sorteerder;
	}

	public Sorter(int[] aList) {
		// TODO Auto-generated method stub
		this.sorteerAlgoritme = new SorteerBubble();
		this.aList = aList;
	}
	
	public void SorteerMetAlgoritme() {
		this.sorteerAlgoritme.Sorteer(aList);
	}

	public void PrintSortedList() {
		this.sorteerAlgoritme.printArray(aList);
	}
}
