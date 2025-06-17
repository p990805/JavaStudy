package lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        UserV2 user = (UserV2) o;
        return id.equals(user.id);
    }
}
