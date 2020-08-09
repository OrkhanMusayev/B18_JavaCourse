package Ramil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> gg = new ArrayList<>(Arrays.asList("aaa", "bbb"));
        ArrayList<String> vd = new ArrayList<>(Arrays.asList("ccc", "ddd", "fff", "kkk"));
        ArrayList<String> ff = new ArrayList<>();

        //[aaa, ccc, bbb, ddd, fff, kkk]
//        List<String> list = Stream.concat(gg.stream(),vd.stream()).collect(Collectors.toList());
//        System.out.println(list);
           for (int i=0;i<gg.size();i++){
                ff.add(gg.get(i));
//                ff.add(vd.get(i));
//            }
       System.out.println(ff);

        //[aaa, ccc, bbb, ddd]

        //[aaa, bbb, ccc,ddd]
        ff.removeAll(Arrays.asList("fff","kkk"));
        System.out.println(ff);


        //[aaa, bbb, ccc, ddd, fff, kkk]
        ff.addAll(gg);
        ff.addAll(vd);
        System.out.println(ff);

        //  [aaa, bbb, ccc, ddd, fff]
        ff.remove("kkk");
        System.out.println(ff);


    }
}
}