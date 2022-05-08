package com.gl.lab.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SkyScraper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building ");
		int noOfFloors = scanner.nextInt();// 5
		List<Integer> floors = new ArrayList<>();
		for (int i = 1; i <= noOfFloors; i++) {
			System.out.println("enter the floor size given on day : " + i);
			floors.add(scanner.nextInt());// 45123

		}
		int day = 1;
		int nextlargerFloorPerDay = noOfFloors;
		List<Integer> unassembledFloors = new ArrayList<>();
		for(int floor : floors) {
			
			if( floor >= nextlargerFloorPerDay) {
				// print floor and day
				// check floors  lager than current  floor in unassembledFloors
				// prepare larger floors array
				List<Integer> floorsAssembledPerDay = new ArrayList<>();
				List<Integer> floorsNotAssembledPerDay = new ArrayList<>();
				for(int unassembledFloor : unassembledFloors) {
					if(unassembledFloor < floor && unassembledFloor > (noOfFloors-day)) {
						floorsAssembledPerDay.add(unassembledFloor);
						nextlargerFloorPerDay--;
					} else {
						floorsNotAssembledPerDay.add(unassembledFloor);
					}
				}
				floorsAssembledPerDay.add(floor);//45
				
				// print floors with day
				System.out.println("Day: " + day);
				  Collections.sort(floorsAssembledPerDay, Collections.reverseOrder());
				System.out.println(floorsAssembledPerDay.toString());
				// Assign remaining floorsNotAssembledPerDay to unassembledFloors
				unassembledFloors =  floorsNotAssembledPerDay; 
				day++;
				nextlargerFloorPerDay--;
			} else {
				// 
				unassembledFloors.add(floor);//5
				//print only day no floor
				System.out.println("Day: " + day);
				System.out.println();
				day++;
				//nextlargerFloorPerDay--;
				
			}
			
		}
			
		scanner.close();

	}

}
