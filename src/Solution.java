/* 
Selectable и Updatable
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!


Требования:
1. Класс Screen должен реализовывать(implements) интерфейс Selectable.
2. Класс Screen должен реализовывать(implements) интерфейс Updatable.
3. В классе Screen должен быть реализован метод onSelect интерфейса Selectable.
4. В классе Screen должен быть реализован метод refresh интерфейса Updatable.


public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
}
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public class Screen implements Selectable, Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}