package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
   private String content;
   private static ArrayList<Post> instances = new ArrayList<>();

   public Post(String content) throws ParseException {
       this.content = content;
       instances.add(this);
   }

   public String getContent() {
       return content;
    }

    public static ArrayList<Post> getAll(){
       return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
}
