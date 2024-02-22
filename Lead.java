
public class Lead {

	public static void main(String[] args) {
		String str="manish kumar yadav";
		char []ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=12;i--) {
			ch[i]=(char)(ch[i]-32);
		}
		System.out.println(ch);

	}

}
