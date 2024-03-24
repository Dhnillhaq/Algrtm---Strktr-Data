public class CarsMain {
    public static void main(String[] args) {
        
        Cars[] car = new Cars[8];
        car[0] = new Cars("BMW",  "M2 Coupe", 2016, 6816, 728);
        car[1] = new Cars("Ford",  "Fiesta ST", 2014, 3921, 575);
        car[2] = new Cars("Nissan",  "370Z", 2009, 4360, 657);
        car[3] = new Cars("Subaru",  "BRZ", 2014, 4058, 609);
        car[4] = new Cars("Subaru",  "Impreza WRX STI", 2013, 6255, 703);
        car[5] = new Cars("Toyota",  "AE86Trueno", 1986, 3700, 553);
        car[6] = new Cars("Toyota",  "86/GT86", 2014, 4180, 609);
        car[7] = new Cars("Volswagen",  "GolfGTI", 2014, 4180, 631);

        int index = car[0].highestSpeed(car, 0, 7);
        int idx = car[0].lowestSpeed(car, 0, 7);
        car[0].tampil("Mobil dengan kecepatan tertinggi adalah :\nmerk\t\t: ", car, index);
        car[0].tampil("Mobil dengan kecepatan terendah adalah :\nmerk\t\t: ", car, idx);
        
        System.out.println("Rata rata power mesin Mobil keren ini adalaaahh :" + car[0].topPower(car) + " bensin");
        System.out.println("TopSpeed tertinggi dimenangkan oleh :" + car[0].highestSpeed(car, 0, 7) + " Km/jam");
        System.out.println("TopSpeed terendah dimenangkan oleh :" + car[0].lowestSpeed(car, 0, 7) + " Km/jam");

    }    
}
