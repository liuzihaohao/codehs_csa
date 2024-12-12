public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       
       Coins coin=new Coins(3,2,1,4);
       coin.bankValue();
       coin.addQuarter();
       coin.addQuarter();
       coin.addDime();
       coin.addPenny();
       coin.addPenny();
       coin.addPenny();
       coin.bankCount();
       coin.bankValue();
    }
}

// 1.67-1.04=0.63 6