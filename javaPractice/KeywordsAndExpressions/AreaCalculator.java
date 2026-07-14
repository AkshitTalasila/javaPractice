public class AreaCalculator{

	public static double area(int radius){
	
		if(radius < 0){
			
			return -1;
		}else{

			return (Math.PI * (radius * radius));
		}
	}


	public static double area(int x , int y){
		
		 if((x < 0)||(y < 0)){

                        return -1;
                }else{

                        return (x*y);
                }
        

	}


	public static void main(String[] args){

		System.out.println(area(4));
		System.out.println(area(4,5));
		System.out.println(area(4,6));
		System.out.println(area(4,2));
	}



}
