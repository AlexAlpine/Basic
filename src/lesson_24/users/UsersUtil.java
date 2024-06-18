package lesson_24.users;


public class UsersUtil {

    public static boolean isUserAdmin(User user) {
        return user.getRole() == Role.ADMIN;
    }

    public static void setModerAccess(User user, User admin) {
        if (admin.getRole() == Role.ADMIN) {
            user.setRole(Role.MODERATOR);
        }
    }

    public static void setUsualAccess(User user, User admin) {
        if (admin.getRole() == Role.ADMIN) {
            user.setRole(Role.USER);
        }
    }
}