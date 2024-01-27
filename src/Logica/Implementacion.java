package Logica;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IntMetodos;
import Models.Refaccionaria;

public class Implementacion implements IntMetodos {

	List<Refaccionaria> listaRefacciones = new ArrayList<Refaccionaria>();

	@Override
	public void guardar(Refaccionaria refaccionaria) {
		// TODO Auto-generated method stub

		boolean st = false;

		for (Refaccionaria r : listaRefacciones) {

			if (r.getTipo_Refaccion().equals(refaccionaria.getTipo_Refaccion())) {

				st = true;
			}
		}

		if (st == true) {
			System.out.println("Ya existe");

		} else {

			listaRefacciones.add(refaccionaria);
			System.out.println("Agregado");

		}

	}

	@Override
	public void editar(String nombre, Refaccionaria refaccionaria) {
		// TODO Auto-generated method stub

		for (int i = 0; i < listaRefacciones.size(); i++) {

			if (listaRefacciones.get(i).getTipo_Refaccion().equals(nombre)) {

				listaRefacciones.set(i, refaccionaria);
				System.out.println("Se edito Corectamente");

			}

		}

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub

		boolean st = false;

		for (int i = 0; i < listaRefacciones.size(); i++) {

			if (listaRefacciones.get(i).getTipo_Refaccion().equals(nombre)) {
				st = true;
				listaRefacciones.remove(i);
				System.out.println("Registro Eliminado");
			}

		}

	}

	@Override
	public List<Refaccionaria> buscar(String nombre) {
		// TODO Auto-generated method stub
		boolean sta = false;
		List<Refaccionaria> listRefa = new ArrayList<Refaccionaria>();

		for (Refaccionaria re : listaRefacciones) {

			if (nombre.equals(re.getTipo_Refaccion())) {

				sta = true;
				listRefa.add(re);
				System.out.println("Se encontro la refaccion: " + re);

			}

		}

		if (sta != true) {
			System.out.println("Registro no encontrado");
		}

		return listRefa;
	}

	@Override
	public void comprar(float cantidad, String nombre) {
		// TODO Auto-generated method stub

		float totalS;
		for (Refaccionaria recf : listaRefacciones) {

			if (nombre.equals(recf.getTipo_Refaccion())) {

				totalS = cantidad * recf.getPrecio_Refaccion();
				System.out.println("Total a pagar: " + totalS);
			}

		}

	}

	@Override
	public void ganancias() {
		// TODO Auto-generated method stub

		float totalG;
		for (Refaccionaria recf : listaRefacciones) {

			totalG = recf.getPrecio_Refaccion() - recf.getPrecio_Compra();
			System.out.println("Las ganancias son " + totalG);
		}

	}

	public void IndiceNombre() {

		System.out.println("Productos existentes");

		for (int i = 0; i < listaRefacciones.size(); i++) {

			System.out.println(listaRefacciones.get(i).getTipo_Refaccion());

		}
	}

}
