package help.commands.dto.response;
import java.util.List;

public record CommandsResponse(List<CommandsResponseItem> commands) {
}
