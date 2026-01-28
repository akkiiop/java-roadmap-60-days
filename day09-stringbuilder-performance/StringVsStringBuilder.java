package day9;

public class StringVsStringBuilder {
	public static void main(String[] args) {
		long start,end;
		
		//String
		String s="";
		start = System.currentTimeMillis();
		System.out.println(start);
		for(int i=0;i<=10000;i++) {
			s=s+i;
		}
		
		end=System.currentTimeMillis();
		System.out.println("String Time: " + (end - start) + " ms");
		System.out.println(end);
		
		// StringBuilder
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
		
	}
}
