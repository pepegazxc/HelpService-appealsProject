package help.commands.service;

import help.commands.dto.commands.HelpCommandType;
import help.commands.dto.commands.HelpCommands;
import help.commands.dto.request.UserRequest;
import help.commands.dto.response.CommandsResponse;
import help.commands.store.InfoCommands;
import help.commands.store.UserCommands;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<CommandsResponse> handle(UserRequest dto){
        if (dto.getCommand() == null) return info.getInfo();
        if (dto.getCommand().equals("user -commands")) return user.userCommands();
        throw new IllegalArgumentException("Unknown command");
    }
}
