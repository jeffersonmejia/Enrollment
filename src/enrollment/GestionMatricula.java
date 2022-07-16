package enrollment;

import java.util.Scanner;

/**
 * @author Jefferson Mejia
 */
public class GestionMatricula {

	public static void main(String[] args) {
		int year;
		int kinda;
		float enrollment = 0;
		float appraisal;
		String plate;
		String type = "";
		String color;

		final int MAX_VEHICLES = 5;
		final int DISCOUNT_CAR = 5;
		final int DISCOUNT_TRUCK = 8;
		final int DISCOUNT_VAN = 12;

		Vehicle[] vehicle = new Vehicle[MAX_VEHICLES];
		Scanner in = new Scanner(System.in);

		//GET DATA IN FIVE TIMES
		for (int i = 0; i < vehicle.length; i++) {

			//INSTANCE OBJECT
			System.out.println("Ingresa los datos solicitados");
			System.out.print("-> Ingresar la placa: ");
			plate = in.next();

			System.out.print("-> Ingresar el año de fabricación: ");
			year = in.nextInt();

			System.out.println("-> Ingresar el tipo de vehiculo");
			System.out.println("\t1. Auto");
			System.out.println("\t2. Camioneta");
			System.out.println("\t3. Camion");
			System.out.print("\tSelecciona una opción: ");
			kinda = in.nextInt();

			System.out.print("-> Ingresar el color: ");
			color = in.next();

			System.out.print("-> Ingresar el avaluo: ");
			appraisal = in.nextInt();

			//REPEAT UNTIL GET IN VALUE GREATER THAN 100
			while (appraisal < 100) {
				System.out.println("\t**********************************");
				System.out.println("\tEl valor debe ser mínimo de 100");
				System.out.println("\t**********************************");
				System.out.print("-> Ingresar la avaluo: ");
				appraisal = in.nextInt();
			}

			//CALCULATE APPRAISAL PARING FROM THE KINDE VEHICLE
			switch (kinda) {
				case 1: {
					enrollment = (DISCOUNT_CAR * appraisal) / 100;
					type = "auto";
					break;
				}
				case 2: {
					enrollment = (DISCOUNT_TRUCK * appraisal) / 100;
					type = "camion";
					break;
				}

				case 3: {
					enrollment = (DISCOUNT_VAN * appraisal) / 100;
					type = "camioneta";
					break;
				}
			}

			//SHOW DATA
			System.out.println(
				"-----------------------------------------------------------");
			System.out.println("Placa: " + plate);
			System.out.println("Año de fabricación: " + year);
			System.out.println("Tipo de vehiculo: " + type);
			System.out.println("Color: " + color);
			System.out.println("Avaluo: $" + appraisal);
			System.out.println("Matrícula: $" + enrollment);
			//COUNT USER REGISTERED
			if (i == 0) {
				i += 1;
				System.out.println("Registrados: " + i);
			} else {
				System.out.println("Registrados: " + i);
			}
			vehicle[i] = new Vehicle(plate, year, type, color, appraisal);
			System.out.println("-----------------------------------------------------------");
			System.out.println("\n");

		}

	}

}
