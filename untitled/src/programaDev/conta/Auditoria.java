package programaDev.conta;

public interface Auditoria {
    default void audita(){
        System.out.println("Realizando auditoria.");
    }
}
