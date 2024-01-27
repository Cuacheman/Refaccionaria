package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Refaccionaria;
import Logica.Implementacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_Refaccionaria;
		String ubicacion;
		String tipo_Refaccion;
		float precio_Refaccion;
		int cantidad;
		float precio_Compra;
		float ganacias;

		int menuP, menuE;

		Scanner lec = null;

		Refaccionaria re = null;
		List<Refaccionaria> list = new ArrayList<Refaccionaria>();

		Implementacion imp = new Implementacion();

		do {

			System.out.println("Bienvenido Menu Principal");
			System.out.println("Elige la opcion que desees");
			System.out.println("1.-Guardar");
			System.out.println("2.-Buscar");
			System.out.println("3.-Editar");
			System.out.println("4.-Eliminar");
			System.out.println("5.-Comprar");
			System.out.println("6.-Ganancias");
			System.out.println("7.-Salir");
			lec = new Scanner(System.in);
			menuP = lec.nextInt();

			switch (menuP) {
			case 1:

				System.out.println("Ingrese el nombre de la refaccionaria");
				lec = new Scanner(System.in);
				nombre_Refaccionaria = lec.nextLine();

				System.out.println("Ingrese la ubicacion de la refaccionaria");
				lec = new Scanner(System.in);
				ubicacion = lec.nextLine();

				System.out.println("Ingrese el tipo de refaccion");
				lec = new Scanner(System.in);
				tipo_Refaccion = lec.nextLine();

				System.out.println("Ingrese el precio de la refaccion");
				lec = new Scanner(System.in);
				precio_Refaccion = lec.nextFloat();

				System.out.println("Ingrese el precio de compra de la refaccion");
				lec = new Scanner(System.in);
				precio_Compra = lec.nextFloat();

				System.out.println("Ingrese la cantidad de la refaccion");
				lec = new Scanner(System.in);
				cantidad = lec.nextInt();

				re = new Refaccionaria(nombre_Refaccionaria, ubicacion, tipo_Refaccion, precio_Refaccion, cantidad,
						precio_Compra);
				
				imp.guardar(re);
				break;

			case 2:

				System.out.println("Ingresa el nombre de la refaccion");
				lec = new Scanner(System.in);
				tipo_Refaccion = lec.nextLine();

				imp.buscar(tipo_Refaccion);
				
				break;

			case 3:

				imp.IndiceNombre();
				
				System.out.println("Ingresa el nombre de la refaccion a editar");
				lec = new Scanner(System.in);
				nombre_Refaccionaria = lec.nextLine();
				
				
				do {

					System.out.println("Opciones a elegir");
					System.out.println("1.Precio Compra");
					System.out.println("2.Precio Venta");
					System.out.println("3. Stock");
					System.out.println("4. Salir");
					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:

						System.out.println("Agrega el nuevo Precio Compra");
						lec = new Scanner(System.in);
						precio_Compra = lec.nextFloat();
						
						re.setPrecio_Compra(precio_Compra);
						imp.editar(nombre_Refaccionaria, re);
						
						break;

					case 2:

						System.out.println("Agrega el nuevo precio de Venta");
						lec = new Scanner(System.in);
						precio_Refaccion = lec.nextFloat();
						
						re.setPrecio_Refaccion(precio_Refaccion);
						imp.editar(nombre_Refaccionaria, re);
						
						break;
					case 3:

						System.out.println("Agrega el nuevo Stock");
						lec = new Scanner(System.in);
						cantidad = lec.nextInt();
						
						re.setCantidad(cantidad);
						imp.editar(nombre_Refaccionaria, re);
						
						break;
					case 4:

						
						
						break;

					default:
						break;
					}

				} while (menuE < 4);

				break;
			case 4:

				imp.IndiceNombre();
				
				System.out.println("Ingresa el producto a eliminar");
				lec = new Scanner(System.in);
				tipo_Refaccion = lec.nextLine();
				
				imp.eliminar(tipo_Refaccion);

				break;
			case 5:

				float total,canti;

				imp.IndiceNombre();
				
				System.out.println("Ingrese el producto a comprar");
				lec = new Scanner(System.in);
				tipo_Refaccion = lec.nextLine();
				
				
				System.out.println("Ingrese la cantidad a comprar");
				lec = new Scanner(System.in);
				canti = lec.nextFloat();
				
				imp.comprar(canti, tipo_Refaccion);
				
				//total = re.getPrecio_Refaccion() * canti;
				
				
				break;
			case 6:

				imp.ganancias();
				
				break;
			case 7:

				System.out.println("Hasta pronto");

				break;

			default:
				break;
			}

		} while (menuP < 7);
		
	}

}
