
package corsa;

/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    
    private Pista pista;
    private String vincitore = "";
    
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        Atleta c1 = new Atleta("Cane1",this.pista.icoCane1,this);                                       
        Atleta c2 = new Atleta("Cane2",this.pista.icoCane2,this);
        Atleta c3 = new Atleta("Cane3",this.pista.icoCane3,this);
        Atleta c4 = new Atleta("Cane4",this.pista.icoCane4,this);
        Atleta c5 = new Atleta("Cane5",this.pista.icoCane5,this);
        
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        
       
        this.pista.statoGara.setText("Gara iniziata");
        try{
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
           
        }
        catch(Exception e){
            
        }
        this.pista.statoGara.setText("Gara Terminata, Il vincitore e' "+this.getVincitore());
    }
    
    synchronized public void hoFinito(String nomeAtleta){
        if(this.vincitore==""){
            this.vincitore = nomeAtleta;
        }
    }
    
    public String getVincitore(){
        return this.vincitore;
    }
}
