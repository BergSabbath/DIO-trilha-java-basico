public class SmartTv {

    boolean ligada = false;

    int volume = 25;    
    int canal = 1;
        
    public void ligar(){
       ligada = true;
    }
    
    public void delisgar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }











}

