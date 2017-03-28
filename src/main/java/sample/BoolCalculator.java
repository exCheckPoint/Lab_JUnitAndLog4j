package sample;

public class BoolCalculator {

    public static boolean f0(Boolean x, Boolean y){
        return false;
    }
    public static boolean f1(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return false;//01
        }
        else{
            if (!y) return false;//10
            else  return true;//11
        }

    }
    public static boolean f2(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return false;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }
    public static boolean f3(Boolean x, Boolean y){
        return x;
    }
    public static boolean f4(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return true;//01
        }
        else{
            if (!y) return false;//10
            else  return false;//11
        }

    }
    public static boolean f5(Boolean x, Boolean y){
        return y;
    }
    public static boolean f6(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return true;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }
    public static boolean f7(Boolean x, Boolean y){
        if(x!=null) return (x||y);
        else return (y||x);
    }
    public static boolean f8(Boolean x, Boolean y){
        if(x!=null) return (!(x||y));
        else return (!(y||x));

    }
    public static boolean f9(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return false;//01
        }
        else{
            if (!y) return false;//10
            else  return true;//11
        }

    }
    public static boolean f10(Boolean x, Boolean y){
        return !y;
    }
    public static boolean f11(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return false;//01
        }
        else{
            if (!y) return true;//10
            else  return true;//11
        }

    }
    public static boolean f12(Boolean x, Boolean y){
        return !x;
    }
    public static boolean f13(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return true;//01
        }
        else{
            if (!y) return false;//10
            else  return true;//11
        }

    }
    public static boolean f14(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return true;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }
    public static boolean f15(Boolean x, Boolean y){
        return true;
    }
}