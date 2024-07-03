package interfaces;

import java.util.List;


import model.TblProductocl3;

public interface IProductocl3 {
	
	// Methodes
	public void RegistrarProductoCL3 (TblProductocl3 producto);
	public void ActualizarProductoCL3 (TblProductocl3 producto);
	public void EliminarProductoCL3 (TblProductocl3 producto);
	public TblProductocl3 BuscarProductoCL3 (TblProductocl3 producto);
	public List<TblProductocl3> ListPrductoscl3();

}
