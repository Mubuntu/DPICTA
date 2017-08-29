package edu.ap.patrickfrison;


import java.util.Random;

/**
 * @author Patrick
 * genereren van een array dat doormits een sorting algoritme 
 * wordt gesorteerd. hier wordt strategy pattern toegepast (merk op ik heb 
 * enkel bubblesort uitgewerkt). 
 */
public class Program {
	public static void main(String[] args) {
		Random r = new Random();
		int[] normaleArray = new int[1000];
		for (int i = 0; i < normaleArray.length; i++) {
			normaleArray[i] = r.nextInt(1000);
		}
		for (int i = 0; i < normaleArray.length; i++) {
			System.out.println(normaleArray[i]);
		}

		Sorter bubbleSort = new Sorter(normaleArray);
		bubbleSort.SorteerMetAlgoritme();
		bubbleSort.PrintSortedList();
	}
}
