package lesson_40;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    // Stream API

    // Stream - поток данных, который представляет собой последовательность элементов.

    // Pipeline - последовательность операций, выполняемых на потоке данных

    // Промежуточные операции (методы) - это операции, которые преобразуют поток в другой поток (возвращают поток)
    // Их может быть много (больше чем одна)

    // Терминальные операции (методы) - Это операции, которые запускают обработку потока и закрывают поток.
    // После выполнения терминальной операции поток перестает быть доступ для дальнейшей обработки.
    // Может быть ТОЛЬКО ОДИН терминальный метод

    // Ленивые вычисления
    // Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.

/*
     Промежуточные методы:
       Stream<T> filter(Predicate predicate) - оставляет в потоке только элементы удовлетворяющие условию
       (отбрасывает элементы НЕ удовлетворяющие условию)
       ---
       sorted() - сортируем элементы в естественном порядке
       sorted(Comparator<T> comparator) - сортирует элементы с использованием компаратора
       ---
       Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
       в том числе и в другой тип данных
       ---
       peek(Consumer<T> action) - выполняет действие для каждого элемента потока

 */

/*
    Терминальные методы
    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные типы коллекций или другие структуры данных
    ___
    void forEach(Consumer<T> action) - выполняет действие для каждого элемента потока
    ___
    Optional<T> min(Comparator<T> comparator) - возвращает минимальное значение элемента потока, в соответствии с компаратором
    ___
    Optional<T> max(Comparator<T> comparator) - возвращает максимальное значение элемента потока, в соответствии с компаратором
 */


    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
        task11();

    }

    private static void task11() {
       Cat cat = new Cat(null, 5, "braun");
       Cat cat1 = new Cat("Python", 7, "white");
       Cat cat2 = new Cat("Tiger", 3, "gray");
       Cat cat3 = new Cat("Panda", 4, "black");

       Cat[] cats = {cat, cat1, cat2, cat3};

       List<Cat> bigCats = Arrays.stream(cats)
               .filter(Objects::nonNull)
               // filter(c -> Objects.nonNull(c))
               .filter(c -> Objects.nonNull(c.getName()))
               .filter(c -> c.getWeight() > 4)
               .filter(c -> c.getName().length() > 5)
               .collect(Collectors.toList());

        System.out.println(bigCats);

    }

    private static void task10() {

        List<Integer> integers = List.of(1, 12, 7, -11, 25, 12, 25, -15, -39, 10, 0);
        List<Integer> integerList = integers.stream()
                .filter(i -> i > 0)
                .filter(i -> i < 20)
                .collect(Collectors.toList());

        System.out.println(integerList);

    }


    private static void task9() {

        List<Cat> cats = getListCats();
        Optional<String> longestName = cats.stream()
                .map(Cat::getName)
                .max((name1, name2) -> name1.length() - name2.length());

        if (longestName.isPresent()) {
            System.out.println(longestName.get());

        }else {
            System.out.println("Котов с именами не найдено");


        }
        System.out.println(longestName.orElse("Коты не найдены"));

    }

    private static void task8() {
        // min, max
        List<Integer> integers = List.of(5, 4, 14, 50, 32, 24, -1);

        // максимальный отрицательный элемент
        Optional<Integer> max = integers.stream()
                .filter(i -> i < 0)
                .max(Integer::compareTo);
//                .max((i1, i2) -> i1.compareTo(i2))

        System.out.println("isPresent: " + max.isPresent());

        // Пытается вытащить значение. Если внутри null - вернет свой аргумент `other`
        System.out.println(max.orElse(0));


        Integer value = null;
        // проверяем есть ли в Optional значение
        if (max.isPresent()) {
            // если есть - берем значение и присваиваем
            value = max.get();
        }

        System.out.println("value:" + value);

        // минимальное положительное
        Optional<Integer> min = integers.stream()
                .filter(i -> i > 0)
                .min(Integer::compareTo);

        System.out.println("min.orElse(0): " + min.orElse(0));





    }

    private static void task7() {
        // Изменить имя котиков, вес которых меньше 5
        // Вывести в консоль список элементов потока
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем котов
                .peek(cat -> cat.setName(cat.getName() + "_" + cat.getWeight()));
//                .peek(cat -> cat.setName("Slim" + cat.getWeight())); // промежуточный метод, выполняет действие для каждого элемента потока

//        catStream.forEach(cat -> System.out.println(cat));
        catStream.forEach(System.out::println);

    }

    private static void task6() {
        // Получить список имен кошек, которые (имена) короче 5 символов
        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 8)
                .collect(Collectors.toList());

        System.out.println(catNames);

        List<String> names = cats.stream()
                .filter(cat -> cat.getName().length() < 8)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names);


    }

    private static void task5() {
        // Получить список имен кошек, чей вес больше 4
        List<Cat> cats = getListCats();
        // Создать поток
        // оставить кошек, чей вес больше 4
        // изменить тип потока Cat -> name (String)
        // собрать в список

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
//                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task4() {
        // Получить список имен всех кошек
        List<Cat> cats = getListCats();

        // получаем поток элементов другого типа
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);


    }


    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // фильтрация по длине имени. Оставить котов с имененм длиннее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // пока не запущен терминальный метод промежуточные методы не выполняются
        List<Cat> longNameCats = stream.collect(Collectors.toList());
//        List<Cat> longNameCats = stream.toList(); - синтаксис доступный с 17 JDK
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек, чей вес больше 4 кг
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());

        // повторно использовать "закрытый" поток (stream) нельзя. (Поток на котором уже был вызван терминальный метод)
//       fatCats = catStream.filter(c -> c.getWeight() > 5).collect(Collectors.toList()); - будет исключение (ошибка)

        System.out.println(fatCats);

    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // список, содержащий положительные числа
        // Список должен быть отсортирован в порядке возрастания

//        List<Integer> result = new ArrayList<>();
//        for (Integer integer : integers) {
//            if (integer > 0) result.add(integer);
//        }
//
//        Collections.sort(result);
//        System.out.println(result);

        // У всех коллекций есть метод stream() создающий поток из элементов коллекции
        List<Integer> integerList = integers.stream() // создание потока на основе элементов списка
                .filter(i -> i > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собираем элементы потока в коллекцию List

        System.out.println(integerList);

        // Pipeline
        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());


    }
}