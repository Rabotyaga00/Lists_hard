import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
public class UserManager<T extends User> {
    List<T> users =new ArrayList<>();
    public void addUser(T user){
        users.add(user);
    }
    public void saveToFile(String dogovornyak){
        try(FileOutputStream fis = new FileOutputStream("dogovornyak.txt")){
            for (T user : users){
                String data = user.toString() + "\n";
                fis.write(data.getBytes(StandardCharsets.UTF_8));
            }
            System.out.println("Norm");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void loadToFile(String dogovornyak){
        try(FileInputStream fis = new FileInputStream("dogovornyak.txt")){
            int content;
            while ((content = fis.read())!=-1){
                System.out.print((char)content);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
