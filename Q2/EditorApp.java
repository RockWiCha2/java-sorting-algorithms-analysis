import java.util.Scanner;

public class EditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter commands (TYPE <text>, DELETE <n>, DELETEWORD, UNDO, REDO, SHOW, EXIT):");

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("EXIT")) break;

            if (line.toUpperCase().startsWith("TYPE ")) {
                String text = line.substring(5);
                editor.type(text);
            } else if (line.toUpperCase().startsWith("DELETE ")) {
                try {
                    int num = Integer.parseInt(line.substring(7).trim());
                    editor.delete(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid DELETE command. Use: DELETE <number>");
                }
            } else if (line.equalsIgnoreCase("DELETEWORD")) {
                editor.deleteWord();
            } else if (line.equalsIgnoreCase("UNDO")) {
                editor.undo();
            } else if (line.equalsIgnoreCase("REDO")) {
                editor.redo();
            } else if (line.equalsIgnoreCase("SHOW")) {
                System.out.println("Current content: " + editor.getContent());
            } else {
                System.out.println("Unrecognized command.");
            }
        }

        scanner.close();
        System.out.println("Session ended.");
    }
}
