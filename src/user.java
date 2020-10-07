import lombok.Data;

@Data
public class user {
    private String id;
    private String username;

  public void test(){
    System.out.println("aaa");
}

    public user(String id, String username) {
        System.out.println("有参构造器");
        this.id = id;
        this.username = username;
    }
}
