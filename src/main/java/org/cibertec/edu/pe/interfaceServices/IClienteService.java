package org.cibertec.edu.pe.interfaceServices;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;

public interface IClienteService {
	public List<Cliente> Lista();
	public int Insertar(Cliente objC);
}
