package partB.part10.partA;

import java.util.Arrays;
import java.util.List;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        System.out.println(new Or().someSimpleIsTrue(list));
    }

    public boolean someSimpleIsTrue(List<Simple> list) {
        return list.stream()
                .map(simple -> simple.flag)
                .reduce(false, (aBoolean, aBoolean2) -> aBoolean || aBoolean2);
    }

}
