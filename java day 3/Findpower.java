public class Findpower {
    public static void main(String[] args) {
        double base=2;
        int power=4;
        double box=1;
        if(power==0)

        {
            System.out.println(box);
        }   
        if(power<0){
            base=1/base;
            power=-(power);

        }
        while(power!=0){
            box=box*base;
            power--;
        }
        System.out.println(box);
        
    }
}

    

