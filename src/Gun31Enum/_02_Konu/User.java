package Gun31Enum._02_Konu;

public class User {
    String username;
    Role role;
    Status statu;

    public static void UserSil(User user){
        if (user.role==Role.ADMIN){
            System.out.println("Admin silinemez");
        }else {
            System.out.println("user Silindi");
        }
    }




    public User(String username, Role role, Status statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
