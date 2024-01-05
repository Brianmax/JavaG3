public class FlujoControl {
    public static void main(String[] args) {
        boolean check = true;
        boolean check2 = false;

        int i = 17;
        int j = 14;
        System.out.println(i>j);
        System.out.println(i<j);

        // operador >=
        System.out.println( i >= j);

        // operador ==

        System.out.println(i==j);

        // operdor !=

        System.out.println(i!=j);

        if(i>j){ // true o un false
            System.out.println("El numero i es mayo que j");
        }
        else{
            System.out.println("El numero i no es mayor que j");
        }
    }
}
