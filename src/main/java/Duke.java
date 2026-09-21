public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = parseCommandType(input);
        return "Duke heard: " + input;
    }

    /**
     * Returns the type of command the input represents.
     */
    public String getCommandType() {
        return commandType;
    }

    private String parseCommandType(String input) {
        String keyword = input.trim().split(" ")[0];
        switch (keyword) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "UnknownCommand";
        }
    }
}
