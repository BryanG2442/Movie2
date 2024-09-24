public class Movie {
    static String userName = "Ba";
    static String password = "b@2";
    static String birthday = "12/2/31";
    static boolean adOptIn = false;
    static int age = 78;

    //test

    public static void main(String[] args){
        System.out.println("User name: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Birthday :" + birthday);
        System.out.println("Ad opt-in: " + adOptIn);
        System.out.println("Age: " + age);

    }
    public static void makePopcorn(){
        for (int i = 0; i < 10; i++){
            System.out.println("POP");
        }
    }
}
