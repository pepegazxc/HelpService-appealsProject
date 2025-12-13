package help.commands

data class HelpCommands(
    var type: HelpCommandType,
    var description: String = "",
    var command: String = ""
)