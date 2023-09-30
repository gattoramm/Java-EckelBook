### Глава 8 - Полиморфизм

### Примеры из книги

##### Снова о восходящем преобразовании

* [Пример](examples/upwardconversion) - Пример наследования и восходящего преобразования.

##### Особенности

* [Пример](examples/peculiarities) - Получение нужного результата. Переопределение интерфейса.

### Упражнения

* [1](exercises/ex1/Wheel.java) - Создайте класс Cycle с произвольными классами Unicycle, Bicycle, Tricycle. Покажите, что экземпляр каждого из произвольных типов может быть преобразован в Cycle, на примере вызова метода ride().
* [3](exercises/ex3/Shapes.java) - Включите в базовый класс Shapes.java новый метод, выводящий сообщение, но не переопределяйте его в производных классах. Объясните результат. Переопределите его в одном из производных классов и посмотрите, что происходит. Наконец, переопределите метод во всех производных классах.
* [4](exercises/ex4/Shapes.java) - Добавьте новый подтип Shape к программе Shapes.java и проверьте на методе main(), что полиморфизм работает правильно для вашего нового типа, так же как и для старых типов.
* [5](exercises/ex5/Wheel.java) - В упражнении 1 добавьте классу Cycle метод wheel(), возвращающий количество колес каждого транспортного средства. Измените метод ride() так, чтобы он вызывал метод wheels(), и убедитесь в том, что полиморфизм успешно работает.