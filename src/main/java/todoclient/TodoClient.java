package todoclient;

public class TodoClient {

    private final long id;
    private final String name;

    public TodoClient(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
