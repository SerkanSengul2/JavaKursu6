package Gun31Enum._02_Konu;

public class Program {
    public static void main(String[] args) {
        User user1=new User("Serkan",Role.ADMIN,Status.AKTIF);
        User user2=new User("Kerem",Role.PERSONEL,Status.PASIF);
        User user3=new User("BUrak",Role.MUDUR,Status.PASIF);

        User.UserSil(user1);
        User.UserSil(user2);
        User.UserSil(user3);

    }
}
