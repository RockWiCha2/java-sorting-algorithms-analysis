public class EditAction {
    public enum ActionType { TYPE, DELETE }

    private ActionType actionType;
    private String text;

    public EditAction(ActionType actionType, String text) {
        this.actionType = actionType;
        this.text = text;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public String getText() {
        return text;
    }
}
