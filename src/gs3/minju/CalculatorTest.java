package gs3.minju;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); //Parents
		c1.number(1,2);
		c1.sum();
		c1.avg();
		
		System.out.println("-----------");
		
		Calculator2 c2=new Calculator2(); //interface app
		c2.number(2,4);
		c2.sum();
		c2.avg();
		
		System.out.println("-----------");		
        
		Substract s = new Substract(); //inheritance
        s.number(10, 20);
        s.sum();      
        s.avg();
        s.substract();
		
        System.out.println("-----------");
        
        s.number(1, 2, 3); //overloading app
        s.sum();       
        s.avg();         
        s.substract();

	}
}