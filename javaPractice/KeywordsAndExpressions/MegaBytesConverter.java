public class MegaBytesConverter{


	public static void printMegaAndKiloBytes(int kiloBytes){

		if(kiloBytes < 0){
			
			System.out.println("Invalid Value");
		}else {
			
			int mb = kiloBytes/1024;
			int remKB = kiloBytes%1024;
			
			System.out.println(kiloBytes +" KB = " +mb +" MB and " +remKB +" KB");
		}
	}


	public static void main(String[] args){

		printMegaAndKiloBytes(2500);
		printMegaAndKiloBytes(-1024);
		printMegaAndKiloBytes(5000);
	}

}
