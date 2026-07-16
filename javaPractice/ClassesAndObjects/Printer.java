public class Printer{

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex){

		if(tonerLevel <0){
			
			this.tonerLevel =-1;
		}else if(tonerLevel>100){
		
			this.tonerLevel = -1;
		}else{
		
			this.tonerLevel = tonerLevel;
		}

		this.duplex = duplex;
	}

	public int addToner(int tonerAmount){

		if((this.tonerLevel + tonerAmount)>100){
	
			return -1;	
		}else if((this.tonerLevel + tonerAmount)<0){

			return -1;
		}else{
		
			return this.tonerLevel+tonerAmount;
		}
	}


	public int printPages(int pagesToBePrinted){
	
		int pagesPrinted =0;	
		if(duplex == true){
			
			pagesPrinted = (pagesToBePrinted/2)+(pagesToBePrinted%2);
		}else {
			
			pagesPrinted =  pagesToBePrinted;
		}
		
		this.pagesPrinted += pagesPrinted;
		return pagesPrinted;	
	}

	public int getPagesPrinted(){

		return this.pagesPrinted;
	}
}
