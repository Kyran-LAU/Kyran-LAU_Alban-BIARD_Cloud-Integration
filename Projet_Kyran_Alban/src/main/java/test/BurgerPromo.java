package test;

public class BurgerPromo {
    public MyBurger myPromo(MyBurger MyBurger){

        MyBurger.toString();
        MyBurger burger= new MyBurger();
        burger.setName(MyBurger.getName());
        burger.setPrice(MyBurger.getPrice());
        burger.setQuantity(MyBurger.getQuantity());

        if(MyBurger.getQuantity() == 1)
        {
            return burger;
        }
        else if(MyBurger.getQuantity() == 2){
            burger.setPromotion(10);
            double priceReduc = MyBurger.getPrice()*0.90;
            burger.setPrice(priceReduc);
        }
        else if(MyBurger.getQuantity() == 3){
            burger.setPromotion(15);
            double priceReduc = MyBurger.getPrice()*0.85;
            burger.setPrice(priceReduc);
        }
        else{
            burger.setPromotion(20);
            double priceReduc = MyBurger.getPrice()*0.80;
            burger.setPrice(priceReduc);
        }

        return burger;
    }
}
