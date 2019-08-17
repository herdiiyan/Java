package com.STI.bootcamp.TebakAngka;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
	
	public static void main(String[] args) {
		
		tebakAngka();
	
	}
	
	public static void tebakAngka() {
		int[] numbers = new int[1];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(10);
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Masukan Angka Tebakan");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == numbers[i]) {
				System.out.println("bener bro");
				break;
			}else{
				System.out.println("salah bro");
				continue;
			}
		}
	}
}
