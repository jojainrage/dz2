public class Main {
    public static void main(String[] args) {
        System.out.println(goOutside(12, 2));
        System.out.println(goOutside(42, -18));
        System.out.println(goOutside(24, 29));
        System.out.println(goOutside(10, -6));
        System.out.println(goOutside(32, 4));
    }
    public static String goOutside(int age, int temp){
        if(age < 20 && (temp > 0 && temp < 28)){
            return "Можно идти гулять";
        }else if((age > 20 && age <45 ) && (temp > -20 && temp < 30)){
            return "Можно идти гулять";
        }else if(age > 45 && (temp >= -10 && temp < 25)){
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома";
        }
    }
}