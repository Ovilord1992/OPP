import Table_1.Contry;
import Table_1.Drobe;
import Table_1.Human;
import Table_1.SIty;
import Table_3.Area;
import Table_3.MaxMin;
import Table_5.Task_1.Avto;
import Table_5.Task_1.Chaynik;
import Table_5.Task_1.Ustroustvo;
import Table_5.Task_2.MusikInstrument;
import Table_5.Task_2.Skripka;
import Table_5.Task_3.President;
import Table_5.Task_3.Security;
import Table_5.Task_3.Worker;
import Table_5.Task_4.Crug;
import Table_5.Task_4.Figura;
import Table_5.Task_4.Pramoug;
import Table_5.Task_4.Trapec;
import Table_6.Task_1.Array;

import java.util.Arrays;
//TODO 1 list 100%

public class Main {
    public static void main(String[] args) {
        Contry contry = new Contry();
        Drobe drobe = new Drobe();
        Human human = new Human();
        SIty sIty = new SIty();

        contry.setNameCities("Vitebsk", "Minsk");
        System.out.println(Arrays.toString(contry.getNameCities()));

        System.out.println(Human.getCount());

        Area.romb(3,10);
        Area.treangle(10,5);
        System.out.println(Area.getCount());

        System.out.println(MaxMin.factorial(5));

        Ustroustvo chaynik = new Chaynik("shshshs", "chaynir", "ruchka, nosik");
        System.out.println(chaynik.getDesc());
        Ustroustvo avto = new Avto("rrrr", "lada", "kolesa, rul");
        System.out.println(avto.getDesc() + " " + avto.getSound());

        MusikInstrument skripka = new Skripka("pilick-pilick", "skripka", "4 struni, cmichek + skolioz", "hz");
        System.out.println(skripka.getHistory());

        Worker president = new President();
        Worker seck = new Security();
        president.print();
        seck.print();

        Figura[] figuras = {new Crug(10), new Pramoug(10 , 10), new Trapec(10, 5)};
        for (Figura k: figuras) {
            System.out.println(k.calc());
        }

        Array arrays = new Array();
        arrays.setAr(1,2,3,4,6);
        arrays.print();
        arrays.print("info");

        System.out.println(arrays.avg());
        arrays.sortDesc();


    }
}
