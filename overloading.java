public class overloading {


        // It demonstrates overloaded methods.
        public static void main(String[] args) {
            display(5);
            display("Hello");

        }
        // This method displays an integer number to the console.
        public static void display(int number) {
            System.out.println("The number is: " + number);
        }


        // This method displays a string message to the console.
        public static void display(String message) {
            System.out.println("The message is: " + message);
        }
    }


