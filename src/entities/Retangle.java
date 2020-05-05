package entities;

public class Retangle {
	public double width;
	public double height;
	
		public double area() {
			/*BASE * ALTURA */
			return this.height * this.width;
		}
		
		/*PERIMETRO 2(BASE + ALTURA)*/
		public double perimeter() {
			return 2 * (this.width + this.height);
		}		
		
		/*DIAGONAL X² = B² + A² */
		
		public double diagonal() {
			
		 
			return   Math.sqrt(this.width * this.width + this.height * this.height);
			
		}
		
		
		
		/*IMPRIMIR TO STRING*/
		public String toString() {
			return "AREA = "
				  + String.format("%.2f", area())
			      + "\n"
			      + "PERIMETER = "
			      + String.format("%.2f", perimeter())
			      + "\n"
			      + "DIAGONAL = "
		          + String.format("%.2f", diagonal());
			      
			
		}
}
