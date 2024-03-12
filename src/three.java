public class three {
    public static void main(String[] args) {

        int floor=6;
        int myfloor=1;

        if (floor>myfloor && floor <=9){
            if (floor==2){
                System.out.println("Ви піднялися на 3 поверх");
                floor =3;
            }
            System.out.println("Ви піднялися на" + (floor - myfloor) + "поверх");

        }else if (floor==2){
            System.out.println("Спустилися на  1 поверх");
            floor=1;

            System.out.println("Ви спустилися на" + (floor - myfloor) + "поверх");
        }else{
            System.out.println("Такий поверх не існує");
        }
    }
}