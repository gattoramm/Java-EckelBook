## Параллельное выполнение

### Примеры из книги

[Liftoff](src/p21_threads/examples/concurrency/Liftoff.java) - задача, которую распараллеливаем.
MainThread - прямой вызов метода run().
BasicThreads - через использование класса Thread.
MoreBasicThreads - через использование класса Thread с дополнительными потоками.

### Упражнение

* Реализуйте интерфейс Runnable. В методе run() выведите сообщение, после чего вызовите yield().
Повторите 3 раза и верните управление из run(). Выведите начальное сообщение в конструкторе, а при
завершении выведите конечное сообщение. Создайте несколько задач и организуйте их выполнение с
использованием потока.