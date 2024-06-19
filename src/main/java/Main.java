package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Model> listWithModel = List.of(
                new Model("Serega", 15, true),
                new Model("Alex", 22, true),
                new Model("Marina", 25, false),
                new Model("Elmira", 17, false),
                new Model("Artem", 45, true),
                new Model("Katya", 18, false),
                new Model("Katya", 28, false));

        List<String> listString = List.of("Serega", "Markfff", "Elya", "Eva", "Petr", "America", "Africa", "Kolya");
        List<Integer> listInteger = List.of(5, 5, 7, 6, 4, 7, 7, 7);
        List<Integer> listIntegerSort = new ArrayList<>(Arrays.asList(5, 5, 7, 7, 8));

        long start = System.currentTimeMillis();

        System.out.println(bol4(listInteger));////////////

        long finish = System.currentTimeMillis();
        System.out.println("Time = " + (finish - start));



    }

    private static Map<Integer, String> bol4(List<Integer> list){
        return list.stream()
                .collect(Collectors.toMap(integer ->
                        integer,
                        integer -> integer.toString(),
                        (old, newV) -> old+newV
                        ));

    }











    private static List<Integer> udalDublic(List<Integer> listString) {

        if(!listString.isEmpty()) {
            List<Integer> listNew = new ArrayList<>();
            for (int i = 0; i < listString.size()-1; i++) {

                if(listString.get(i).equals(listString.get(i+1))){

                }

            }
        }


        return null;
    }

   /* private static Map<String, String > grupPoPerv(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        
                ))
    }*/

    private static List<String> sortObrA(List<String> list) {
        return list.stream()
                //.sorted((a,b) -> Integer.compare(b.length(),a.length()))
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }

    private static long summaVsehChiselA(List<Integer> list) {
        return list.stream()
                .reduce(0, (a, b) -> (a) + (b * b));

    }

    private static String lolvoStodnaStrokArBolA(List<String> list) {
        return list.stream()
                .filter(a -> a.contains("lya"))
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

    }

    private static List<String> sortObr(List<String> list) {
        return list.stream()
                //.sorted(Comparator.comparing((a) -> true))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private static long dlinaBolsheA(List<String> list) {
        return list.stream()
                .filter(a -> a.length() > 4)
                .count();
    }

    private static int maxA(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

    private static Optional<String> filterISoedA(List<String> list) {
        return Optional.of(list.stream()
                .filter(a -> a.startsWith("A"))
                .reduce((a, b) -> a + ", " + b)
                .orElse(""));
    }

    private static List<Integer> vadrChiselA(List<Integer> list) {
        return list.stream()
                .map(a -> a * a)
                .collect(Collectors.toList());
    }

    private static Integer pervChetA(List<Integer> list) {
        return list.stream()
                .filter(a -> a % 2 == 0)
                .findFirst()
                .get();
    }

    private static long uniqKolSlovA(List<String> list) {
        return list.stream()
                .distinct()
                .count();
    }

    private static List<String> sortListLenhA(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length))
                //.sorted(Comparator.comparing((a) -> a.length() > a.length()))
                //.sorted(Comparator.comparing((a) -> false))
                .collect(Collectors.toList());
    }


    private static Double averChA(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    private static String oneStringA(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }

    private static List<Integer> onlyChetA(List<Integer> list) {
        return list.stream()
                .filter(numb -> numb % 2 == 0)
                .collect(Collectors.toList());
    }

    private static int sumA(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                //.mapToInt(a -> a.intValue())
                .sum();
        //.reduce(0, Integer::sum);
        //.reduce(0, (a,b) -> a+b);
    }


    private static Map<Integer, List<String>> dlStrok(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toList()
                ));
    }

    private static List<String> filterLiter(List<String> list) {
        return list.stream()
                .filter(word -> word.contains("S"))
                .collect(Collectors.toList());
        //.collect(ArrayList::new, (a,b) -> a.add(b), (a,b) -> a.addAll(b));
    }


    private static Integer coub(Integer a, Integer b) {

        for (int i = 1; i <= a; i++) {
            for (int ii = 2; ii <= b; ii++) {
                double z = Math.pow(i, 3) + Math.pow(ii, 3);
                double cube = Math.cbrt(z);

                if (cube == Math.floor(cube)) {
                    System.out.println("!!!!!!!!!!: i=" + i + "   ii=" + ii + " " + cube);
                }
            }
        }

        return null;
    }


    //Поиск второго по величине
    private static Integer secondMax(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        /*if (list.size() >= 2) {
            return list.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList())
                    .get(1);
        }else{
            return 0;
        }*/
    }

    //Minimum
    private static Integer min(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
    }

    //Сортировка в обратном алфавитном порядке
    private static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    //Считаем количество слов с определенной буквы
    private static Long countWordLitera(List<String> list) {
        return list.stream()
                .filter(word -> word.startsWith("E"))
                .count();
    }

    //Удаляем дубликаты
    private static List<Integer> delDuble(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
        /*return list.stream()
                .mapToInt(Integer::intValue)
                .distinct()
                .boxed()    //Преобразование IntStream -> Stream<Integer>
                .collect(Collectors.toList());
*/
    }

    //Сумма нечетных чисел
    private static Integer sumNeChet(List<Model> list) {
        /*return list.stream()
                .map(Model::getAge)
                .filter(number -> number%2==0)
                .collect(Collectors.summingInt(i ->i));*/
        return list.stream()
                .map(Model::getAge)
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }


    //Все строки в верхний регистр
    private static List<String> upCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //Среднее значение
    private static Double averInteger(List<Integer> list) {
        return list.stream()
                .mapToDouble(t -> t)
                .average()
                .orElse(0.0);
        /*return  list.stream()
                .collect(Collectors.averagingLong(t -> t)).longValue();*/
    }

    public static List<String> joinString(List<Model> listWithModel) {
        return Arrays.stream(listWithModel.stream()
                        .map(Model::getName)
                        .collect(Collectors.joining())
                        .split("(?=\\p{Lu})"))
                .collect(Collectors.toList())
                ;
    }

    public static Map<String, List<Model>> mergeMap(List<Model> listWithModel) {
        return listWithModel.stream()
                .filter(f -> f.getStudent().equals(false))
                .collect(Collectors.groupingBy(Model::getName));
    }

    private static Map<String, Integer> getNamesAndAges(List<Model> listWithModel) {
        return listWithModel.stream()
                .collect(Collectors.toMap(Model::getName, Model::getAge));
    }


}

