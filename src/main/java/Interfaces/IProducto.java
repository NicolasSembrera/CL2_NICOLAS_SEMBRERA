package Interfaces;

import java.util.List;
import model.TblProductocl2;

public interface IProducto {

	public List<TblProductocl2> ListarProductos();
	public void RegistrarProducto(TblProductocl2 producto);
}
