package triangle;

public class triangle {
	public String str = null;
	public String compare(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a){
			if(a==b&&a==c&&b==c)
				str = "equilateral";
			else if(a==b||a==c||b==c)
				str = "isosceles";
			else
				str = "scalene";
		}
		else
			str="not a triangle";
		return str;
			
	}
}
