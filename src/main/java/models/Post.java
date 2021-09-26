package models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Post {
   private String content;
   private String username;
   private static ArrayList<Post> instances = new ArrayList<>();
   private Date createdAt;

   public Post(String content, String username) throws ParseException {
       this.content = content;
       this.username = username;
       this.createdAt = new Date();
       instances.add(this);
   }

   public String getContent() {
       return content;
    }

    public String getUsername() {
       return username;
    }

    public Date getCreatedAt() {
       return createdAt;
    }

    public static ArrayList<Post> getAll(){
       return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
}
