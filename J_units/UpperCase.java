
public class UpperCase {
	public String upperCase(String[] a) {
		String max="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
			}
		}
		return max.toUpperCase();
	}

}
