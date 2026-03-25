package string;

public class ShortestPathDistance {

	public static float ShortestDist(String route) {
		int shortDist = 0;
		int x=0,y=0;
		for(int i = 0;i<route.length();i++) {
			if(route.charAt(i) == 'W') {
				x--;
			}else if(route.charAt(i) == 'E') {
				x++;
			}else if(route.charAt(i) == 'N') {
				y++;
			}else if(route.charAt(i) == 'S') {
				y--;
			}
		}
		return (float) Math.sqrt(Math.pow(x-0, 2) + Math.pow(y-0, 2));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String route = "WNEENESENNN";
		float shortestDistance = ShortestDist(route);
		System.out.println("Shortest Path to rach the Destination : "+shortestDistance);
	}

}
