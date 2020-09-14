public class Teste{
    public static void main(String[] args) {        
    
      Impressora a = new Impressora();
      //Unico Float
      a.Exibir(5.6f);
      //Dois Float
      a.Exibir(3.5f,6.7f);
      //Um Float e uma String
      a.Exibir(4.5f, "Cereja");
      //Uma String e um Float
      a.Exibir("Goiaba", 7.7f);
      //Três Strings
      a.Exibir("Tangerina", "Bergamonta", "Mexirica");
      //Dois ints e uma String
      a.Exibir(5,4,"Laranja");

    }
}
