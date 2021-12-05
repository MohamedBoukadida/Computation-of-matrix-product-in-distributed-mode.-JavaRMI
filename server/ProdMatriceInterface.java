import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ProdMatriceInterface extends Remote 
{
	double[][] PM(double[][] a,double[][] b,int ldeb,int lfin,int cdeb,int cfin) throws RemoteException, Exception;
	
}

