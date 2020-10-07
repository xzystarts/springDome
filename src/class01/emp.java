package class01;

import lombok.Data;

@Data
public class emp {

    private String name;
    private String sex;
    private dept dept1;

    public void add(){
        System.out.println(dept1);
    }
}
