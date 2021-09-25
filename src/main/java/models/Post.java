package models;

import java.text.ParseException;
import java.util.ArrayList;

public class Post {
   private String content;
   private String username;
   private static ArrayList<Post> instances = new ArrayList<>();

   public Post(String content, String username) throws ParseException {
       this.content = content;
       this.username = username;
       instances.add(this);
   }

   public String getContent() {
       return content;
    }

    public String getUsername() {
       return username;
    }

    public static ArrayList<Post> getAll(){
       return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
}
