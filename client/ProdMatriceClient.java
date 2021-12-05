import java.rmi.*;
import java.util.Scanner;
import java.rmi.registry.*;
public class ProdMatriceClient {
	public ProdMatriceClient (String [] args) {

	
	//************************Saisie de la 1ere matrice********************************//
		
	    System.out.print("Saisir le nombre de lignes dans la matrice: ");
	    Scanner sc = new Scanner(System.in);
	    int m1 = sc.nextInt();
	    
	    System.out.print("Saisir le nombre de colonnes dans la matrice: ");
	    int n1 = sc.nextInt();
	    
	    double[][] a = new double[m1][n1];
	    for (int i = 0; i < m1; i++) {
	      for (int j = 0; j < n1; j++) {
	        System.out.print(String.format("Entrez a[%d][%d] : ", i, j));
	        a[i][j] = sc.nextInt();
	      }
	    }
	    for (int i = 0; i < a.length; i++) {
	      for (int j = 0; j < a[0].length; j++) {
	        System.out.print(a[i][j] + "\t");
	      }
	      System.out.println();
	    }
	    
	  //************************Saisie de la 2ere matrice********************************//
	    
	    System.out.print("Saisir le nombre de lignes dans la matrice: ");
	    Scanner sc1 = new Scanner(System.in);
	    int m2 = sc1.nextInt();
	    
	    System.out.print("Saisir le nombre de colonnes dans la matrice: ");
	    int n2 = sc1.nextInt();
	    
	    
	    double[][] b = new double[m2][n2];
	    for (int i = 0; i < m2; i++) {
	      for (int j = 0; j < n2; j++) {
	        System.out.print(String.format("Entrez b[%d][%d] : ", i, j));
	        b[i][j] = sc1.nextInt();
	      }
	    }
	    for (int i = 0; i < b.length; i++) {
	      for (int j = 0; j < b[0].length; j++) {
	        System.out.print(b[i][j] + "\t");
	      }
	      System.out.println();
	    }
    
    
	    
 //************************1ere sous-matrice********************************// 
	    
    System.out.print("Saisir la ligne de début de la multiplication : ");
    int ldeb1 = sc1.nextInt();
    
    System.out.print("Saisir la ligne de fin de la multiplication : ");
    int lfin1 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de début de la multiplication : ");
    int cdeb1 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de fin de la multiplication : ");
    int cfin1 = sc1.nextInt();
    
  //************************2ere sous-matrice********************************// 
    
    System.out.print("Saisir la ligne de début de la multiplication : ");
    int ldeb2 = sc1.nextInt();
    
    System.out.print("Saisir la ligne de fin de la multiplication : ");
    int lfin2 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de début de la multiplication : ");
    int cdeb2 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de fin de la multiplication : ");
    int cfin2 = sc1.nextInt(); 
    
  //************************3ere sous-matrice********************************// 
    
    System.out.print("Saisir la ligne de début de la multiplication : ");
    int ldeb3 = sc1.nextInt();
    
    System.out.print("Saisir la ligne de fin de la multiplication : ");
    int lfin3 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de début de la multiplication : ");
    int cdeb3 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de fin de la multiplication : ");
    int cfin3 = sc1.nextInt(); 
    
  //************************4ere sous-matrice********************************// 
    
    System.out.print("Saisir la ligne de début de la multiplication : ");
    int ldeb4 = sc1.nextInt();
    
    System.out.print("Saisir la ligne de fin de la multiplication : ");
    int lfin4 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de début de la multiplication : ");
    int cdeb4 = sc1.nextInt();
    
    System.out.print("Saisir la colonne de fin de la multiplication : ");
    int cfin4 = sc1.nextInt(); 
    
    
    
    try{
  	  if(System.getSecurityManager() == null) 
  		System.setSecurityManager(new RMISecurityManager());
            Registry reg = LocateRegistry.getRegistry("localhost",1099); 
            FabProdMatriceInterface fabrique = (FabProdMatriceInterface) reg.lookup("Fabrique");
            ProdMatriceInterface ProdMatriceObj1;
            ProdMatriceObj1= (ProdMatriceInterface)fabrique.newProdMatrice();
            ProdMatriceInterface ProdMatriceObj2; 
            ProdMatriceObj2= (ProdMatriceInterface)fabrique.newProdMatrice();
            ProdMatriceInterface ProdMatriceObj3;
          	ProdMatriceObj3= (ProdMatriceInterface)fabrique.newProdMatrice();
          	ProdMatriceInterface ProdMatriceObj4;
          	ProdMatriceObj4= (ProdMatriceInterface)fabrique.newProdMatrice();
            double[][] result1 = ProdMatriceObj1.PM(a,b,ldeb1,lfin1,cdeb1,cfin1);
          	System.out.println("L'inverse de  est "+result1+"\n");
          	double[][] result2 = ProdMatriceObj2.PM(a,b,ldeb2,lfin2,cdeb2,cfin2);
          	System.out.println("L'inverse de  est "+result2+"\n");
          	double[][] result3 = ProdMatriceObj3.PM(a,b,ldeb3,lfin3,cdeb3,cfin3);
          	System.out.println("L'inverse de  est "+result3+"\n");
          	double[][] result4 = ProdMatriceObj4.PM(a,b,ldeb4,lfin4,cdeb4,cfin4);
          	System.out.println("L'inverse de  est "+result4+"\n");
          	
          	
          	
          	
          	 System.out.println("Resultat 1");
             for (int row = 0; row <result1.length; row++) {
                 for (int col = 0; col <result1[row].length; col++) {
                    System.out.print(result1[row][col] + " ");
                 }
                System.out.println();
             }
             
             System.out.println("Resultat 2");
             for (int row = 0; row <result2.length; row++) {
                 for (int col = 0; col <result2[row].length; col++) {
                    System.out.print(result2[row][col] + " ");
                 }
                System.out.println();
             }
             
             System.out.println("Resultat 3");
             for (int row = 0; row <result3.length; row++) {
                 for (int col = 0; col <result3[row].length; col++) {
                    System.out.print(result3[row][col] + " ");
                 }
                System.out.println();
             }
             
             System.out.println("Resultat 4");
             for (int row = 0; row <result4.length; row++) {
                 for (int col = 0; col <result4[row].length; col++) {
                    System.out.print(result4[row][col] + " ");
                 }
                System.out.println();
             }
             
             
             
             
             
           
             
             
             
             
             
          	
          	
     }    
     catch (Exception e) {
	  System.out.println ("Erreur d'acces a l'objet distant.");
	  System.out.println (e.toString());
          }
}
}

