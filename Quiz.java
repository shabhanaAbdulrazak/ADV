import java.util.Scanner;

public class Quiz {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("----------------------Your Quiz is Started-----------------------");
		System.out.println("Choose The Correct Answer");
		System.out.println("1.What is the Answer for 80*100 ?");
		System.out.println("A.80 \n"+"B.800\n"+"C.8000\n"+"D.80000");
		String s1=sc.nextLine();
		if(s1.equalsIgnoreCase("C")) {
			count+=1;
		}
		System.out.println("2.Who is the Prime Minister of India ?");
		System.out.println("A.Narendhra Modi\n"+"B .AbdulKalam\n"+"C.M.K.Stalin\n"+"D.ManMohanSingh");
		String s2=sc.nextLine();
		if(s2.equalsIgnoreCase("A")) {
			count+=1;
		}
		System.out.println("3.How many colors in Rainbow ?");
		System.out.println("A.4\n"+"B.7\n"+"C.6\n"+"D.9");
		String s3=sc.nextLine();
		if(s3.equalsIgnoreCase("B")) {
			count+=1;
		}
		System.out.println("4.Where is TajMahal located ?");
		System.out.println("A.Agrah\n"+"B.Chennai\n"+"C.Mumbai\n"+"D.Kashmir");
		String s4=sc.nextLine();
		if(s4.equalsIgnoreCase("A")) {
			count+=1;
		}
		System.out.println("Are active volcanoes in the United States ?");
		System.out.println("A.Yes\n"+"B.No");
		String s5=sc.nextLine();
		if(s5.equalsIgnoreCase("A")) {
			count+=1;
		}
		System.out.println("Congrats....! You Complete The Quiz");
		System.out.println("Your Score is : "+count);
		sc.close();
	}
}
