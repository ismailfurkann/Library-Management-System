class User {
    private String name;
    private int userId;

    //Constructor
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", User ID: " + userId;
    }
}