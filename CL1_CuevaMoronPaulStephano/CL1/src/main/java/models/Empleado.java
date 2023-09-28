package models;

import jakarta.persistence.*;

@Entity 
@Table(name="empleado")
public class Empleado {
	
	@Id
	@Column(name="idEmpleado")
	private int idEmpleado;
	
	@Basic
	@Column(name="Apellidos")
	private String Apellidos;
	
	@Basic
	@Column(name="Nombres")
	private String Nombres;
	
	@Basic
	@Column(name="Edad")
	private int Edad;
	
	@Basic
	@Column(name="Sexo")
	private String Sexo;
	
	@Basic
	@Column(name="Salario")
	private double  Salario;
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
				+ Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}

	
	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}


	public Empleado() {
	}

	
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
