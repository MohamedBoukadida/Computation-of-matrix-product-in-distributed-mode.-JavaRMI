import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;
public class ProdMatrice extends UnicastRemoteObject implements ProdMatriceInterface 
{
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProdMatrice() throws RemoteException
       {
	    super();
       }
	      
	   
	public double[][] PM(double[][] MA,double[][] MB,int ldeb,int lfin,int cdeb,int cfin) throws RemoteException, Exception
       {

		 int compt1,compt2;
		 double[][] mat1 = new double[lfin-ldeb+1][cfin-cdeb+1];
		 double[][] mat2 = new double[lfin-ldeb+1][cfin-cdeb+1];
		    	    
		 compt1=0;
 	    
			for(int i=ldeb;i<=lfin;i++){
				compt2=0;
	            for(int j=cdeb;j<=cfin;j++){
	            	
	                mat1[compt1][compt2] = MA[i][j];
	                compt2=compt2+1;
	                
	                }
	            compt1=compt1+1;
	 
	            }       	    
		
            
            System.out.println("Sous Matrice loula");
            for (int row = 0; row <mat1.length; row++) {
                for (int col = 0; col <mat1[row].length; col++) {
                   System.out.print(mat1[row][col] + " ");
                }
               System.out.println();
            }
            
            
            
            
            compt1=0;
     	    
			for(int i=ldeb;i<=lfin;i++){
				compt2=0;
	            for(int j=cdeb;j<=cfin;j++){
	            	
	                mat2[compt1][compt2] = MB[i][j];
	                compt2=compt2+1;
	                
	                }
	            compt1=compt1+1;
	 
	            }  
    		
                
                System.out.println("Sous Matrice thenya");
                for (int row = 0; row <mat2.length; row++) {
                    for (int col = 0; col <mat2[row].length; col++) {
                       System.out.print(mat2[row][col] + " ");
                    }
                   System.out.println();
                }
		
		
		
	            // Déclaration-construction de la matrice résultat
	            double[][] prod = 
	              new double[mat1.length][mat2[0].length];
	            for (int row = 0; row < mat1.length; row++) {
	                for (int col = 0; col < mat2[0].length; col++) {
	                    prod[row][col] = 0.0;
	                    for (int i = 0; i < mat2.length; i++) {
	                        prod[row][col] += mat1[row][i] * 
	                          mat2[i][col];
	                    }
	                }
	            }
 
	        
	            
		return prod;}


	

	
	
	}
	