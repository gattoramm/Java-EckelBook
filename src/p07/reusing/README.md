### Глава 7 - Повторное использование классов

### Примеры из книги

##### Синтаксис композиции

* [Пример](examples/composition/SprinklerSystem.java) - Композиция для повторного использования кода.
* [Пример](examples/composition/Bath.java) - Инициализация в конструкторе с композицией.

##### Синтаксис наследования

* [Пример](examples/inheritance/Detergent.java) - Синтаксис наследования и его свойства.

###### Инициализация базового класса

* [Пример](examples/reusing/Cartoon.java) - Вызов конструкторов при проведении наследования.

###### Конструкторы с аргументами

* [Пример](examples/reusing/Chess.java) - Наследование, конструкторы и аргументы.

##### Делегирование

* [Пример](examples/reusing/delegacy) - Пример делегирования.

##### Сочетание композиции и наследования

* [Пример](examples/reusing/delegacy) - Совмещение композиции и наследования.

### Упражнения

* [1](exercises/ex1/SimpleClass.java) - Создайте простой класс. Во втором классе определите ссылку на объект первого класса. Используйте отложенную
инициализацию для создания экземпляров этого класса.
* [2](exercises/ex2/Detergent.java) - Объявите новый класс, производный от Detergent. Переопределите метод `scrub()` и добавьте новый метод с
именем `sterillize()`.
* [3](exercises/ex3/Cartoon.java) - Докажите, что, если конструктор наследника не определен, то компилятор сгенерирует конструктор по
умолчанию, в котором вызывается конструктор базового класса.
* [5](exercises/ex5/C.java) - Создайте два класса `A` и `B`, имеющие конструкторы по умолчанию(с пустым списком аргументов), которые
выводят сообщение о вызове. Создайте новый класс `C`, производный от `A`; создайте в `C` поле типа `B`. Не создавайте
конструктор `C`. Создайте объект класса `C` и проследите за происходящим.
* [7](exercises/ex7/C.java) - Изменить упражнение 5 так, чтобы классы `A` и `B` имели конструкторы с аргументами вместо
конструкторов по умолчанию. Напишите конструктор для класса `C` и проведите всю необходимую инициализацию внутри него.
* [8](exercises/ex8/SimpleClass.java) - Создайте базовый класс с единственным конструктором, не являющимся конструктором
по умолчанию, и производный класс с конструктором по умолчанию(без аргументов), так и с аргументами. В конструкторе
производного класса вызовите конструктор базового класса.
* [9](exercises/ex8/SimpleClass.java) - Создайте класс `Root`, содержащий экземпляры каждого из классов (также созданных вами)
`Component1`, `Component2` и `Component3`. Объявите класс `Stem` производным от класса `Root`, тк чтобы в нем также
содержались экземпляры каждого из упомянутых классов `Component`. Каждый класс должен содержать конструктор по
умолчанию, который выводит сообщение о своем вызове.

* [11](exercises/ex8/SimpleClass.java) - Измените пример [Detergent](examples/inheritance/Detergent.java) так, чтобы в нем использовалось делегирование.



