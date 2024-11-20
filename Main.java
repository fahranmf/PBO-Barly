import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Contoh Data
        User user = new User("fahran", "12345", "fahran@gmail.com");
        Song song1 = new Song("Song A", "Artist A", "2022-01-01", "La la la", "Album A", "Pop", 180);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Barly Music App!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.login(username, password)) {
            System.out.println("Login successful!");
            boolean running = true;

            while (running) {
                System.out.println("\nMenu:");
                System.out.println("1. Play Song");
                System.out.println("2. Stop Song");
                System.out.println("3. Add to Playlist");
                System.out.println("4. Next Song");
                System.out.println("5. Previous Song");
                System.out.println("6. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        song1.play();
                        break;
                    case 2:
                        song1.stop();
                        break;
                    case 3:
                        song1.addToPlaylist();
                        break;
                    case 4:
                        song1.next();
                        break;
                    case 5:
                        song1.prev();
                        break;
                    case 6:
                        user.logout();
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Login failed. Please try again.");
        }

        scanner.close();
    }
}
