
public class Triangle {

	public Triangle(){

	}
	public String typeof(int side_a,int side_b,int side_c) {
		int total_a= side_a*side_b*side_c;
		
		String result= null;
		if(total_a>0 ){
			if(side_a == side_b && side_b == side_c){
				result= "Equilateral";
			}
			else if(side_a == side_b || side_b == side_c || side_a == side_c){
				result= "Isosceles";
			}
			else {
				result= "Scalene";
			}
		}else{
			result= "Invalid";
		}
		return result;	
	}

}
