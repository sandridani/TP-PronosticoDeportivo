package tpdamian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class equipo {
	
	String id;
	String equipo;
	String descripcion;
	
	public equipo() {
		super();
	}

	public equipo(String id, String equipo, String descripcion) {
		super();
		this.id = id;
		this.equipo = equipo;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	
	
	
	
	

}
