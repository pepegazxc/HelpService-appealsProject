package help.commands.service;

import help.commands.HelpCommandType;
import help.commands.HelpCommands;
import help.commands.dto.User;
import help.commands.store.InfoCommands;
import help.commands.store.UserCommands;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommandService {

    private final InfoCommands info;
    private final UserCommands user;

    public CommandService(InfoCommands info, UserCommands user) {
        this.info = info;
        this.user = user;
    }

    public Map<HelpCommandType,HelpCommands> handle(User dto){
        if (dto.getCommand() == null) return info.getInfo();
        if (dto.getCommand().equals("/userCommands")) return user.getAll();
        throw new IllegalArgumentException("Unknown command");
    }
}
