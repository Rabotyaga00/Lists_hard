public class Main extends  UserManager {
    public static void main(String[] args){
        UserManager<User> userManager= new UserManager<>();
        User user1 = new User(1,"qwerty","@qweerty");
        User user2 = new User(2,"qwerty2","@qweerty2");
        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.saveToFile("dogovornyak.txt");
        System.out.println("Users from file: ");
        userManager.loadToFile("dogovornyak.txt");
    }
}
