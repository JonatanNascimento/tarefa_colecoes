package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---- 1a Parte ----");
		System.out.println("Digites os nomes separados por virgula:");
		String names = sc.nextLine();
		String[] freeNames = names.split(", ");

		List<People> list = new ArrayList<>();
		People people;

		for (String name : freeNames) {
			people = new People(name);
			list.add(people);
		}

		System.out.println();
		System.out.println("**** Nomes ordenados ****");
		Collections.sort(list);
		for (People p : list) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println("---- 2a Parte ----");
		System.out.println("Digites os nomes e generos separados por hífen:");
		names = sc.nextLine();
		freeNames = names.split(", ");

		List<People> mans = new ArrayList<>();
		List<People> women = new ArrayList<>();

		for (String s : freeNames) {
			String[] parts = s.split(" - ");
			String name = parts[0];
			char gender = parts[1].charAt(0);
			people = new People(name, gender);
			if (gender == 'M') {
				mans.add(people);
			} else {
				women.add(people);
			}
		}

		System.out.println();
		System.out.println("--- HOMENS ---");
		Collections.sort(mans);
		for (People p : mans) {
			System.out.println(p.getName() + " " + p.getGender());
		}

		System.out.println();
		System.out.println("--- MULHERES ---");
		Collections.sort(women);
		for (People p : women) {
			System.out.println(p.getName() + " " + p.getGender());
		}

		sc.close();
	}

}
