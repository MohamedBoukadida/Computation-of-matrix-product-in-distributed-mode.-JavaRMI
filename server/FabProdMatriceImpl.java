import java.rmi.*;
import java.rmi.server.*;
public class FabProdMatriceImpl extends UnicastRemoteObject implements FabProdMatriceInterface{

	public FabProdMatriceImpl()throws RemoteException {}; 
	public ProdMatriceInterface newProdMatrice() throws RemoteException {       
				return new ProdMatrice();}
		
}

