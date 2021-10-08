

public class Monitor
{
    //Atributos
    private boolean ligado;
    private int resolucao;
    private String modelo;
    
    //construtor
    public Monitor(int resolucao, String modelo){
        this.ligado = false;
        this.resolucao = resolucao;
        this.modelo = modelo;
    }
    
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Inicializando o monitor...");
        }
        else {
            System.out.println("O monitor já está ligado.");
        }
    }
    
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O monitor está sendo desligado...");
        }
    }
    
    public void ajustarResolucao(int resolucao) {
        if (resolucao != 1024 && resolucao != 1280 && resolucao != 1600) {
            System.out.println("Esse valor de resolução não é valido.");
        }
        else {
            this.resolucao = resolucao;
        }
    }
    
    public void informacoesDoMonitor() {
        if (this.ligado) {
            System.out.println("A resolução é de: " + this.resolucao);
            System.out.println("É um modelo: " +this.modelo);
        }
    }
}
