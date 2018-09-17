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
}
