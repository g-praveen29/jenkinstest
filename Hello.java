public class Hello {
    public static void main(String[] args) {
        String name = null;

        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello, " + name);
    }
}
