package ideals.entity.property.file;

import ideals.entity.User;
import ideals.entity.property.PropertyEntity;

public class FileUser extends PropertyEntity implements User {

    private String email;
    private String password;

    public FileUser() {
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
