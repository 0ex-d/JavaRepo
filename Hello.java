//
// Hello.java
//
public class Hello {
    public static void main(String[] args) throws InterruptedException {
    	class sayIt {
    		String a = "Hello";
    		public String print(){
    			return a;
    		}
    	}
    	sayIt h = new sayIt();
        System.out.println(h.print());
    }
}