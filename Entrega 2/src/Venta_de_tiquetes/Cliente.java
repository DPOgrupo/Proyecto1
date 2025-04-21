package Venta_de_tiquetes;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

	
	
	private String login; 
	private String nombre;
	private String contrasena; 
	private List<Tiquete> tiquetesDeCliente;
	private int dinero;
	private int edad;
	private boolean restSalud;

	
	
	public Cliente(String nombre, String login, String contrasena, int dinero, int edad) {
        this.nombre = nombre; 
		this.login = login;
		this.contrasena = contrasena; 
        this.tiquetesDeCliente= new ArrayList<Tiquete>();
        this.dinero = dinero; 
        this.restSalud = false; 
        this.edad = edad;
    }
	
	public Cliente(String nombre, String login, String contrasena, int dinero, int edad, boolean rest) {
        this.nombre = nombre; 
		this.login = login;
		this.contrasena = contrasena; 
        this.tiquetesDeCliente= new ArrayList<Tiquete>();
        this.dinero = dinero; 
        this.restSalud = rest; 
        this.edad = edad;
    }
	
	public int getDinero() {
		return this.dinero;
	}
	
	public void setDinero(int dinero) {
		this.dinero = dinero; 
	}
	
	public void addTiquete(Tiquete tic) {
		this.tiquetesDeCliente.add(tic);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Tiquete> getTiquetes(){
		return this.tiquetesDeCliente;
	}

	
	public String getContrasena() {
		return this.contrasena;
	}
	public boolean isRestSalud() {
		return this.restSalud;
	}



	public String getLogin() {
		return login;
	}



	public int getEdad() {
		return edad;
	}
	
}

