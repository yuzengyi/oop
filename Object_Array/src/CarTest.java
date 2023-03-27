import java.util.Scanner;

public class CarTest {
    //Car c = new Car();
    public static void main(String[] args) {
        //array
        Car[] arr = new Car[3];
        //nextint()  nextdouble()  next() nextline
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            //brand
            System.out.println("input brand:");
            String brand = sc.next();
            c.setBrand(brand);
            //price
            System.out.println("input price:");
            int price = sc.nextInt();
            c.setPrice(price);
            //color
            System.out.println("input color");
            String color = sc.next();
            c.setColor(color);

            //car -> arr
            arr[i] = c;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
            sum = sum +arr[i].getPrice();
        }
        double avg = sum*1.0/arr.length;
        System.out.println(avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            if (c.getPrice()<avg) {
                count = count+1;
                System.out.println(c.getBrand()+","+c.getPrice()+","+c.getColor());
            }
        }
    }
}
