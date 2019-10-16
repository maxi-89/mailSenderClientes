package enviarMails;



public class Cliente implements Comparable <Cliente>{
	
	private String idNombre;
	private String email;
	private Integer celular;
	
//constructor con parametros nombre, email, celular
	public Cliente(String idNombre, String email, Integer celular) {
		this.idNombre=idNombre;
		this.setEmail(email);
		this.celular=celular;
			
	}
	
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idNombre == null) ? 0 : idNombre.hashCode());
		return result;
	}

//metodo equals por defecto

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idNombre == null) {
			if (other.idNombre != null)
				return false;
		} else if (!idNombre.equals(other.idNombre))
			return false;
		return true;
	}

//metodo tostring 
	@Override
	public String toString() {
		return idNombre + email  +celular ;
	}

//metodo compareto
	@Override
	public int compareTo(Cliente otroCliente) {
		
		return this.idNombre.toLowerCase().compareTo(otroCliente.idNombre.toLowerCase());
	}
	
	
}
