package proyecto;
import java.util.*;

enum MP{
	CREDITO,
	DEBITO,
	EFECTIVO
	
	
}
public class ventas {
	
	private String codigo;
	private Vendedor vendedor;
	private Cliente cliente;
	private Carro carro;
	private Date localDate;
	private MP metodoP= MP.CREDITO;
	
	
	


	



	public ventas(Vendedor vendedor, Cliente cliente, Carro carro, Date localDate, MP metodoP) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.carro = carro;
		this.localDate = localDate;
		this.metodoP = metodoP;
	}



	public String getCodigo() {
		return codigo;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		cliente = cliente;
	}


	public Date getLocalDate() {
		return localDate;
	}


	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}
	
	

	
	
	public MP getMetodoP() {
		return metodoP;
	}



	public void setMetodoP(MP metodoP) {
		this.metodoP = metodoP;
	}



	public double calcularVenta() throws Eventas {
		
		double precio=carro.getPrecio();
		
		if (carro instanceof Automovil) {
			
			precio*=0.9;
			
		}else if (carro instanceof Campero) {
			precio*=0.92;
		}else if (carro instanceof Deportivo ) {
			precio*=0.97;
			
		}else {
			
			throw new Eventas("No hay carro registrado");
			
		}
		
		if (metodoP.ordinal()==2) {
			precio*=0.97;
		}
	
			
		
		
		
		return precio;
	}
	
	
	
	
	

}
