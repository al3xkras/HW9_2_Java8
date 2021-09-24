import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    /*
    Задание 1 Stream.

        Сделать массив int. Из него получить IntStream. Для него

        1. Найти среднее значение элементов массива

        2. Найти минимальный элемент, значение и индекс

        3. Посчитать количество элементов равных нулю

        4. Посчитать количество элементов больше нуля

        5. Помножить элементы массива на число
     */
    public static void main(String[] args) {

        int[] X = {-2,4,3,5,0,0,-1,11,-50,23,15,0};

        //1. Найти среднее значение элементов массива
        System.out.printf("\nAverage: %.3f\n",
                Arrays.stream(X).average().getAsDouble());


        //2. Найти минимальный элемент, значение и индекс
        int min_index = IntStream.range(0,X.length)
                .boxed()
                .reduce((i,j)->X[i]>X[j]?j:i)
                .get();
        System.out.printf("\nMin: %d; index: %d\n",X[min_index],min_index);


        //3. Посчитать количество элементов равных нулю
        long zero_count = Arrays.stream(X)
                .filter(x->x==0)
                .count();
        System.out.printf("\nZero count: %d\n",zero_count);


        //4. Посчитать количество элементов больше нуля
        long positive_count = Arrays.stream(X)
                .filter(x->x>0)
                .count();
        System.out.printf("\nPositive number count: %d\n",positive_count);


        //5. Помножить элементы массива на число (a)
        int a = 10;
        System.out.printf("\nMultiplied by %d: \n",a);
        Arrays.stream(X)
                .map(x->a*x)
                .forEach(System.out::println);


    }
}
