package p1;

public class Strprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java program";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
		String r="";
		for(int j=str.length()-1;j>=0;j--) {
			r=r+str.charAt(j);
			System.out.println(r);
		}
		
	}

}
