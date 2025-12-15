package help.controller;

import help.commands.HelpCommandType;
import help.commands.HelpCommands;
import help.commands.dto.UserRequest;
import help.commands.service.CommandService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class HelpController {

    private final CommandService service;

    public HelpController(CommandService service) {
        this.service = service;
    }

    @PostMapping("/commands/info")
    public Map<HelpCommandType,HelpCommands> info(@RequestBody UserRequest dto) {
        return service.handle(dto);
    }
}
