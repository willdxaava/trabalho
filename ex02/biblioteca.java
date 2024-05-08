public class biblioteca {
  
    String title;
    String nm;
    int year;

    biblioteca(String titulo, String nome, int ano){
        title = titulo;
        nm = nome;
        year = ano;
    }

    public void exibirInfo(){
        System.out.println("\nTítulo: " + title);
        System.out.println("Autor: " + nm);
        System.out.println("Ano de Publicação: " + year);
    }
}
