package Day_06;

public class Text {
public static void main(String[] args) {
	Run run = new Run();
	
	for (int i = 0; i <5; i++) {	
		 new Thread(run,(i+1)+"Ñ¡ÊÖ").start();;
		
	}
}
}
