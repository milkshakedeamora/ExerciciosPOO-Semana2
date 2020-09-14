import java.lang.Math; 
public class CalculadoraCientifica{
    
    
    	public double raiz(int numero) {
            return Math.sqrt(numero);
        }
        public double raiz(double numero) {
        	return Math.sqrt(numero);
        }
        public double raiz(String palavra) {
            double numero = Double.parseDouble(palavra);
            return Math.sqrt(numero);
        }
        public double potencia(byte a, byte b) {
            return Math.pow(a,b);
        }
        public double potencia(String s1, String s2) {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            return Math.pow(a,b);
        }
        public double potencia(int a, double b) {
        	return Math.pow(a,b);
        }
        
    
}