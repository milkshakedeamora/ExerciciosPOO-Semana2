public class Teste{
    public static void main(String[] args) {
        CalculadoraCientifica a = new CalculadoraCientifica();
        System.out.println(a.raiz(5));
        System.out.println(a.raiz(5.4));
        System.out.println(a.raiz("25"));
        System.out.println(a.potencia(56,34));
        System.out.println(a.potencia("4","2"));
        System.out.println(a.potencia(5,2.4));

    }
}