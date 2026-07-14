public class PaintJob{

	public static int getBucketCount(double  width, double height, double areaPerBucket, int extraBuckets){

		if((width<=0) || (height<=0) || (areaPerBucket<=0) || (extraBuckets<0)){

			return -1;
		}else{

			double wallArea = width*height;
			double currentArea = areaPerBucket * extraBuckets;
			if((wallArea-currentArea)<=0){

				return 0;
			}else{

				int rem = (int)Math.ceil((wallArea-currentArea)/areaPerBucket);
				return rem;
			}
		}
	}



	public static int getBucketCount(double width, double height, double areaPerBucket){


		if((width<=0) || (height<=0) || (areaPerBucket<=0)){
			
			return -1;
		}else{


			int rem = (int)Math.ceil((width*height)/areaPerBucket);
                        return rem;
		}
	}

	 public static int getBucketCount(double area, double areaPerBucket){


                if((area<=0) || (areaPerBucket<=0)){

                        return -1;
                }else{


                        int rem = (int)Math.ceil((area)/areaPerBucket);
                        return rem;
                }
        }



	public static void main(String[] args){


		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4,2.1,1.5));
		System.out.println(getBucketCount(3.4,1.5));
	}



}
