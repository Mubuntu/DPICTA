package edu.ap.patrickfrison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SorteerBubble implements Sorteerder {

	@Override
	public void printArray(int[] list) {
				// TODO afdrukken van array
		System.out.println(" BubbleSort: ");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	@Override
	public int[] Sorteer(int[] list) {
		// TODO Auto-generated method stub
		int comparisons = 0, swaps = 0;
		boolean hasSwap = true;

		int len = list.length - 1;
		for (int i = 0; i < list.length; i++) {
			hasSwap = false;
			for (int j = 0, swapping, endIndex = len - i; j < endIndex; j++) {
				comparisons++;
				if (list[j] > list[j + 1]) {
					//correct temporary integer aanwijzen
					swapping = list[j];
					list[j] =list[j + 1];
					list[j+1]= swapping;
					swaps++;
					hasSwap = true;
				}
			}
			if(!hasSwap){
				break;
			}
		}
		System.out.println("Swaps: " + swaps);System.out.println("comparisons: " + comparisons);
		return list;
	}

}
