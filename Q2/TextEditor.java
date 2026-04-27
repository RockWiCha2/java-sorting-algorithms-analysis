public class TextEditor {

    private Stack<EditAction> undoStack;
    private Stack<EditAction> redoStack;
    private StringBuilder content;
    private final int MAX_LENGTH = 1000;

    public TextEditor() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        content = new StringBuilder();
    }

    public void type(String text) {
        // TODO: Append text, push EditAction to undoStack, clear redoStack
    }

    public void delete(int numChars) {
        // TODO: Delete from content, push EditAction to undoStack, clear redoStack
    }

    public void deleteWord() {
        // TODO: Implement this to delete the last typed word.
    }

    public void undo() {
        // TODO: Handle undo based on action type
    }

    public void redo() {
        // TODO: Handle redo based on action type
    }

    public String getContent() {
        return content.toString();
    }
}
