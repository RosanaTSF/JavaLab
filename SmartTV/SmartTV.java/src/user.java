public class user {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        smartTv.increase();
        smartTv.decrease();
        smartTv.decrease();
        smartTv.decrease();

        System.out.println("Channel current :" + smartTv.channel);
        smartTv.changeChannel(7);
        System.out.println("Channel current :" + smartTv.channel);

        System.out.println("TV turn on ?" + smartTv.on);
        System.out.println("Volume current ?" + smartTv.volume);

        smartTv.on ();
        System.out.println("New Status -> TV turn on ?" + smartTv.on);
        


    }
    
}
