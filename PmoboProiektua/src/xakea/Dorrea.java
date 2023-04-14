package xakea;

public class Dorrea extends Pieza {
	
    public Dorrea(boolean kolorea, int errenkada, int zutabea) {
        super(kolorea, errenkada, zutabea);
    }

    public int maximoaKalkulatu(int N1, int N2) 
    {
    	int maximoa =0;
    	
    	if (N1 > N2)
    	{
    		maximoa =N1;
    	}
    	else
    	{
    		maximoa=N2;
    	}
    	return maximoa;
    }
   
 public int minimoaKalkulatu(int N1, int N2) 
    {
    	int minimoa =0;
    	
    	if (N1 > N2)
    	{
    		minimoa =N2;
    	}
    	else
    	{
    		minimoa=N1;
    	}
    	return minimoa;
    }
  
 public boolean noraMugitzenDa(int N1,int N2) 
    {
	 //un metodo para ver en que direccion va la ficha 
    	boolean Nora= false;
    	
    	return Nora;
    }
    
    @Override
    public boolean mugituDaiteke(int zeinErrenkadara, int zeinZutabera) {
    	int lerro=0;
    	int zut=0;
    	boolean ahalDu = true;
    	
    	//un while para que vaya iterando y que salga cuando llegue a la columna 
    	//destino, a la errenkada destino o que encuentre una pieza en el camino
    	while (((zut != zeinErrenkadara) && (lerro != zeinZutabera)) || ahalDu==false) 
    	{
    		if (zeinErrenkadara == this.getErrenkada())
    		{
    			
    		}
    		else 
    		{
    			
    		}
    	}
    	return ahalDu;
    }
}
//no esta terminado, de hecho no se si funciona o si es asi