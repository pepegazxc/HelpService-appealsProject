package help.controller;

import help.commands.HelpCommandType;
import help.commands.HelpCommands;
import help.commands.HelpCommandsStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/commands")
public class HelpController {

    private final HelpCommandsStore store;

    public HelpController(HelpCommandsStore store) {
        this.store = store;
    }

    @GetMapping("/info")
    public HelpCommands info() {
        return store.getInfo(HelpCommandType.INFO);
    }
}
