package repetition.oop;

import java.util.Locale;

public final class UserProfile {

    private final long id;
    private final String login;

    public UserProfile(long id, String login) {
        if (id <= 0 || login == null || login.isBlank()) {
            throw new IllegalArgumentException("Ошибка в входных данных!");
        }
        this.id = id;
        this.login = login.trim().toLowerCase(Locale.ROOT);
    }
    public long getId() {
        return id;
    }

    public String getLogin(){
        return login;
    }
}
