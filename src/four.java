public class four {
    public static void main(String[] args) {
        String direction ="yes";
        switch (direction) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println();
        }
    }
}
