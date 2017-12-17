package com.kodilla.stream.array;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.IntToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.Global.print;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .forEach(n->System.out.print(numbers[n]));

       double average = IntStream.range(1,numbers.length)
                .mapToDouble(k->numbers[k])
               .average()
               .getAsDouble();


        return average;
    }
}
