package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfaceServices.IClienteService;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente datos;
	
	@Override
	public List<Cliente> Lista() {
		return (List<Cliente>) datos.findAll();
	}

	@Override
	public int Insertar(Cliente objC) {
		int rpta = 0;
		Cliente c = datos.save(objC);
		if(!c.equals(null)) rpta = 1;
		return rpta;
	}

}
