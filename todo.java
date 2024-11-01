/*
Lista de métodos para implementar sobre streams
List<Dish> vegMenu = menu.stream()
                          .filter(Dish::isVegetarian)
                          .collect(toList());


List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
numbers.stream()
       .filter(i -> i % 2 == 0)
       .distinct()
       .forEach(System.out::println);

List<Dish> dishes = menu.stream()
                       .filter(dish -> dish.getCalories() > 320)
                       .limit(2)
                       .collect(toList());


takeWhile and dropWhile and .skip(int)

for apply a function to each element of a stream, use map
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
       .map(n -> n * n)
       .forEach(System.out::println);
       map(String::length)


List<String> words = Arrays.asList("Hello", "World");
words.stream()
.map(word -> word.split(""))
.distinct()
.collect(toList());
*/