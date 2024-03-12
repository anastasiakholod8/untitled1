public class two {
public static void main(String[] args) {


    int n = 251;
    int b;
    int k;
    int t;

    b = n / 100;
    k = (n / 10) % 10;
    t = n % 10;

    if (b > k && b > t) {
        System.out.println(b);
    } else if (k > b && k > t) {
        System.out.println(k);
    } else if (t > b && t > k) {
        System.out.println(t);
    } else {
        System.out.println();
     }
 }

}