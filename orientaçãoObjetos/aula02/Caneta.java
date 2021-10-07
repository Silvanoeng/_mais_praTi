
/**
 * Classe para representar um objeto caneta e suas funcionalidades.
 * 
 * @author (Silvano) 
 * @version (1.0)
 */
public class Caneta
{
    //atributos
    private String cor;
    private double tamanhoDaPonta;
    private int nivelDeTinta;
    
    //construtor
    public Caneta(String cor, double tamanhoDaPonta, int nivelDeTinta){
        this.cor = cor;
        this.tamanhoDaPonta = tamanhoDaPonta;
        this.nivelDeTinta = nivelDeTinta;
    }
    
    //metodos
    public void escrever(String texto) {
        System.out.println(texto);
        this.nivelDeTinta-=2;
    }
    
    public void verificarNivelDeTinta (){
        System.out.println("A caneta esta com "+ this.nivelDeTinta + "%.");
    }
    
    public void recarregarTinta (){
        this.nivelDeTinta = 100;
        System.out.println("A caneta esta com "+ this.nivelDeTinta + "%.");
    }
    
}
