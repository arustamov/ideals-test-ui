package ideals.entities.file;

import com.fasterxml.jackson.core.type.TypeReference;
import ideals.entities.Users;
import ideals.entity.property.file.FileUser;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FileUsers extends FileEntities<FileUser> implements Users<FileUser> {

    public FileUsers() {
        super("users.json", new TypeReference<List<FileUser>>(){});
    }
}
