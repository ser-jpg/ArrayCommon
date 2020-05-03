package methods;

//Use the following class, create two variables to find out how many customers have
//been created and how many books have been sold.

public class AmazonBookStore {

    static int Comics = 120, SciFiNovels = 100, Biography = 130;

    int totalBooks=Comics+SciFiNovels+Biography;
    int sellBooks=0;

    int buyComics(int buyC){

        Comics=Comics-buyC;
        sellBooks=sellBooks+Comics;

        return sellBooks;


    }
    int buySciFi(int buyS){

        SciFiNovels=SciFiNovels-buyS;
        sellBooks=sellBooks+SciFiNovels;
        return SciFiNovels;

    }
    int buyBiography(int buyB){
        Biography=Biography-buyB;

         return Biography;

    }

    public static void main(String[] args) {
        AmazonBookStore customer1 = new AmazonBookStore(),
                customer2 = new AmazonBookStore(),
                customer3 = new AmazonBookStore();


          customer1.buyComics(10);
          customer2.buySciFi(10);
          customer3.buyBiography(10);



    }
}
