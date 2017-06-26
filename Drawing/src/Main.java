
public class Main {
	
	public static void main(String x[]){
		
		Circle c = new Circle();
		doDrawing(c);
		
		Line L = new Line();
		doDrawing(L);		
		
		Square Sq = new Square();
		doDrawing(Sq);
	}

	public static void doDrawing(Draw x) {
		
		x.Drawing();
	}

}
