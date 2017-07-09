package gangbuster;

import java.util.StringTokenizer;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		
		StringTokenizer st = new StringTokenizer(address1,",");
		while(st.hasMoreTokens())
		{ System.out.println(st.nextToken());}
		}
		{
		String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		
		StringTokenizer stt = new StringTokenizer(address2,",");
		while(stt.hasMoreTokens()) {
			System.out.println(stt.nextToken());
		}
		{String address3 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
			
		StringTokenizer sttt= new StringTokenizer(address3,",");
		while(sttt.hasMoreTokens()) {
			System.out.println(sttt.nextToken());
		}
		{String address4 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		
		StringTokenizer stttt= new StringTokenizer(address4,",");
		while(stttt.hasMoreTokens()) {
			System.out.println(stttt.nextToken());
		}
			
			
			
			
			
			
		}	
			
		}	
			
			
			
		}
		
	}

}
