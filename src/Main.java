import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main
{
    public static<Temp> List<Temp> reverseList(List<Temp> list)
    {
        List<Temp> reverse = new ArrayList<>(list.size());//временный списолк

        new LinkedList<>(list)
                .descendingIterator() //обратный последовательный поток вкава232323232
                .forEachRemaining(reverse::add);

        return reverse;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}