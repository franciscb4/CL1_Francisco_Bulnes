package org.cibertec.edu.pe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	private int idCliente;
	private String nombre;
	private String apellido;
	private String correo;
	private String fechanacimiento;
	private String dni;
	private int idCategoria;
	
	public Cliente() {
	}

	public Cliente(int idCliente, String nombre, String apellido, String correo, String fechanacimiento, String dni,
			int idCategoria) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		this.idCategoria = idCategoria;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
}
