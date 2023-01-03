public class SmartTV {
    boolean on=false;
    int channel =1;
    int volume =13;

public void changeChannel (int newChannel){
    channel = newChannel;
}
    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void increase(){
        volume++;
        System.out.println("Increasing the volume to: " + volume);

        }


        public void decrease(){
            volume--;
            System.out.println("Turning down the volume to: " + volume);
        }
    

    public void on(){
        on=true;
    }
    
    public void offline(){
        on=false;
    }
}
