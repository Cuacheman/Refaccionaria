package Interfaces;

import java.util.List;

import Models.Refaccionaria;

public interface IntMetodos {

public void guardar(Refaccionaria refaccionaria);
	
	public void editar(String nombre, Refaccionaria refaccionaria);
	
	public void eliminar(String nombre);
	
	public List<Refaccionaria> buscar(String nombre);

	public void comprar(float cantidad, String nombre);
	
	public void ganancias();
	
}
