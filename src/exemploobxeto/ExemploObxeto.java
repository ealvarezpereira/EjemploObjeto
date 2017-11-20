
package exemploobxeto;

public class ExemploObxeto {

    public static void main(String[] args) {
        
        //Instancio un objeto de tipo semáforo
        
        Semaforo unSemaforo = new Semaforo();
        unSemaforo.darCor("Verde");
        String resposta = unSemaforo.dimeCor();   
        System.out.println(resposta);
        
        Semaforo outroSemaforo = new Semaforo();
        outroSemaforo.darCor("Amarelo");
        String resposta2 = outroSemaforo.dimeCor();
        System.out.println(resposta2);
        
        
        //También se puede hacer así
        
        Semaforo dosSemaforo = new Semaforo();
        dosSemaforo.darCor("Vermello");
        System.out.println(dosSemaforo.dimeCor());
        
    }
    
}
