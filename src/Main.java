import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      /*  1. Элестетиниз сиз магазинге келдиниз. Ал магазинде коп сизге окшогон адамдар
        бар,  жана  магазинде  алкоголдук  суусундуктарды  сатып  алууга  коюлган  чектоо
        бар( адамдын жашы ).
        2.    Сиздин атыныз жана жашыныз     бар. Жана алган коп продуктыларыныз бар.
        3.  Продуктун аты, баасы жана алкогольбу же алкоголь эмесби билдирип турчу
        белгиси бар( boolean isAlcohol).
        4. Кассир сиздин продуктарынызды текшерсин егер арасында алкоголдук ичимдик
        болсо, анда жашынызды текшерип эгер жашыныз магазинде коюлган жашка туура
        келбесе  сизди  атынызды  айтып  сиз  бул  продукту  сатып  ала  албайсыз  анткени
        биздин  магазиндин  коюлган  жашка  жашыныз  туура  келбейт  экен  деп  айтсын
        болбосо продуктун аттарын жана баасын айтсын.*/
        Product product = new Product("Pepsi",20d,true);
        Product product1 = new Product("Apple",130d,true);
        Product product2 = new Product("Jack Daniel's",260d,false);
        Product [] products = {product,product1,product2};
        Basket basket = new Basket(products);
        Person person = new Person("Tom",(byte) 19,basket);
        System.out.println(person.toString());
        person.checkAge(products);



    }
}