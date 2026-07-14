public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal){
	
		if((bigCount<0) || (smallCount<0) || (goal<0)){
			return false;
		}else if(((Math.min(bigCount, goal/5) * 5) > goal)&&(smallCount ==0)){
			return false;
		}else if((Math.min(bigCount, goal/5)*5)+(smallCount) >= goal){
			return true;
		}else if((Math.min(bigCount, goal/5)*5)+(smallCount) <= goal){
			return false;
		}else{
			return false;
		}
	}


	public static void main(String[] args){

		System.out.println(canPack(5,4,24));

	}
}
