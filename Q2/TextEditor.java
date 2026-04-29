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
        if (content.length() + text.length() > MAX_LENGTH) {
            System.out.println("Max length exceeded.");
            return;
        }

        content.append(text);
        undoStack.push(new EditAction(EditAction.ActionType.TYPE, text));
        redoStack = new Stack<>();
    }

    public void delete(int numChars) {
        if (numChars <= 0 || content.length() == 0) return;

        int count = Math.min(numChars, content.length());
        String textRemoved = content.substring(content.length() - count);

        content.delete(content.length() - count, content.length());

        undoStack.push(new EditAction(EditAction.ActionType.DELETE, textRemoved));
        redoStack = new Stack<>();
    }

    public void deleteWord() {
        if (content.length() == 0) return;

        int idx = content.length() - 1;

        while (idx >= 0 && content.charAt(idx) == ' ') idx--; // skip spaces

        int endIdx = idx + 1;

        while (idx >= 0 && content.charAt(idx) != ' ') idx--; // find word

        int startIdx = idx + 1;

        String wordRemoved = content.substring(startIdx, endIdx);
        content.delete(startIdx, endIdx);

        undoStack.push(new EditAction(EditAction.ActionType.DELETE, wordRemoved));
        redoStack = new Stack<>();
    }

    public void undo() {
        if (undoStack.isEmpty()) return;

        EditAction action = undoStack.pop();

        if (action.getActionType() == EditAction.ActionType.TYPE) {
            int n = action.getText().length();
            content.delete(content.length() - n, content.length());
        } else {
            content.append(action.getText());
        }

        redoStack.push(action);
    }

    public void redo() {
        if (redoStack.isEmpty()) return;

        EditAction action = redoStack.pop();

        if (action.getActionType() == EditAction.ActionType.TYPE) {
            content.append(action.getText());
        } else {
            int n = action.getText().length();
            content.delete(content.length() - n, content.length());
        }

        undoStack.push(action);
    }

    public String getContent() {
        return content.toString();
    }
}