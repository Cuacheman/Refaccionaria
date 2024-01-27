package Models;

public class Refaccionaria {

	String nombre_Refaccionaria; 
	 String ubicacion; 
	 String tipo_Refaccion; 
	 float precio_Refaccion; 
	 int cantidad;
	 float precio_Compra;
	public Refaccionaria() {
	}
	public Refaccionaria(String nombre_Refaccionaria, String ubicacion, String tipo_Refaccion, float precio_Refaccion,
			int cantidad, float precio_Compra) {
		this.nombre_Refaccionaria = nombre_Refaccionaria;
		this.ubicacion = ubicacion;
		this.tipo_Refaccion = tipo_Refaccion;
		this.precio_Refaccion = precio_Refaccion;
		this.cantidad = cantidad;
		this.precio_Compra = precio_Compra;
	}
	@Override
	public String toString() {
		return "Refaccionaria [nombre_Refaccionaria=" + nombre_Refaccionaria + ", ubicacion=" + ubicacion
				+ ", tipo_Refaccion=" + tipo_Refaccion + ", precio_Refaccion=" + precio_Refaccion + ", cantidad="
				+ cantidad + ", precio_Compra=" + precio_Compra + "]";
	}
	public String getNombre_Refaccionaria() {
		return nombre_Refaccionaria;
	}
	public void setNombre_Refaccionaria(String nombre_Refaccionaria) {
		this.nombre_Refaccionaria = nombre_Refaccionaria;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTipo_Refaccion() {
		return tipo_Refaccion;
	}
	public void setTipo_Refaccion(String tipo_Refaccion) {
		this.tipo_Refaccion = tipo_Refaccion;
	}
	public float getPrecio_Refaccion() {
		return precio_Refaccion;
	}
	public void setPrecio_Refaccion(float precio_Refaccion) {
		this.precio_Refaccion = precio_Refaccion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio_Compra() {
		return precio_Compra;
	}
	public void setPrecio_Compra(float precio_Compra) {
		this.precio_Compra = precio_Compra;
	}
	
}
