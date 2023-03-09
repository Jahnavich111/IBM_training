package p1;

public class Loop {
	public static void main(String[] args) {
	int a[]= {10,20,25,35,60};
	int sum=0;
	int evnsum=0;
	for (int i=0;i<a.length;i++) {
	sum=sum+a[i];
	//System.out.println(sum);
	if(a[i]%2==0) {
		evnsum=evnsum+a[i];		
	}
	};
	System.out.println(sum);
	System.out.println(evnsum);
	int fact=1;
	int n=5;
	for (int j=1;j<=n;j++) {
		fact=fact*j;
		System.out.println(fact);
	}
	}
}

