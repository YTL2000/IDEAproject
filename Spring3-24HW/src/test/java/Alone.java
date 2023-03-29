/**
 * @version 1.0
 * @auther YTL
 * @className Alone
 * since 1.0
 */
class Role {
    private Role(){};//私有的构造方法
    private static Role role=null;//私有对象

    public static  void getRole(){//公共的静态方法
        if (role==null){
            role=new Role();
        }
        System.out.println("这是getRole");
    }

}
public class Alone {
    public static void main(String[] args) {
        Role.getRole();
    }
}
