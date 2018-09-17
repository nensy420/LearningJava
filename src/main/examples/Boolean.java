package main.examples;

public  class Boolean {
    public static boolean dividesSelf(int n) {
        int tmp = n;
        if (n % 10 == 0) return false;
        while (n != 0) {
            if (tmp % (n % 10) != 0) return false;
            n /= 10;
        }
        return true;
    }

    public static boolean hasOne(int n) {

        while(n%10!=0||n==10)
        {

            if(n%10 == 1)
                return true;
            else
                n/=10;
        }
        return false;

    }
    public static  String[] wordsFront(String[] words, int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = words[i];
        }
        System.out.println(array);
        return array;
    }

}
