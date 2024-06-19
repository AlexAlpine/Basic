package lesson_25.linked_list;

import lesson_25.lists.MyQueue;

public class MyLinkedList<T> implements MyQueue<T> {


        private int size;
        private Node<T> first; // голова
        private Node<T> last; // хвост

        //    @Override
        // Метод добавления элемента в конец списка
        public void add(T value) {
            if (first == null) {
                //Не существует ни одно узла
                //Создаем новый объект. И в ссылку first - записываем ссылку на этот объект
                first = new Node<>(value, null, null);
            } else if (last == null) {
                // Существует только один узел (first)
                last = new Node<>(value, first, null);
                // Следующий узел за first будет равен ?
                first.next = last;
            } else {
                Node<T> temp = last;
                last = new Node<>(value, temp, null);
                temp.next = last;
            }

            size++;
        }

        //    @Override
        public void addAll(T... values) {
            for (int i = 0; i < values.length; i++) {
                add(values[i]);
            }
        }

        //    @Override
        public int size() {
            return size;
        }

        //    @Override
        public int indexOf(T value) {
            int index = 0;
            // Перебрать список начиная с головы
            Node<T> cursor = first;
            while (cursor != null) {
                //сверяю значение в узле с искомым
                if (cursor.value.equals(value)) {
                    return index;
                }
                index++;
                cursor = cursor.next;
            }

            return -1;
        }

        //    @Override
        // Индекс последнего (самого правого) вхождения
        public int lastIndexOf(T value) {

            int index = size -1;
            Node<T> cursor = last;
            while (cursor != null) {
                if (cursor.value.equals(value)) {
                    return index;
                }
                index--;
                cursor = cursor.previous;
            }

            // Обрабатываем кейс - когда у нас только один элемент в списке
            // last = null, а first ссылается на какой-то объект

            if (size == 1) {
                if (first.value.equals(value)) {
                    return 0;
                }
            }

            return -1;
        }

        //    @Override
        public boolean contains(T value) {
            return indexOf(value) >= 0;
        }

        public int lastIndexOfV2(T value) {
            int result = -1;
            int index = 0;
            Node<T> cursor = first;
            while (cursor != null) {
                if (cursor.value.equals(value)) {
                    result = index;
                }
                index++;
                cursor = cursor.next;
            }

            return result;
        }

        //    @Override
        public boolean isEmpty() {
            return size == 0;
        }

        //    @Override
        public T get(int index) {
            // Перебирать ноды, считая "виртуальный" индекс.
            // Если добрались до ноды и индекс стал равен искомому - вернуть значение Ноды

            Node<T> node = searchNodeByIndex(index);
            return  node != null ? node.value : null;

            //Old realisation
//        if (index <0 || index > size -1) return null;
//
//        int idx = 0;
//        Node<T> cursor = first;
//        while (cursor != null) {
//            if (idx == index) {
//                return cursor.value;
//            }
//            idx++;
//            cursor = cursor.next;
//        }
//
//        return null;
        }


        //    @Override
        public void set(int index, T value) {

            Node<T> node = searchNodeByIndex(index);
            if (node != null) {
                node.value = value;
            }
        }

        private Node<T> searchNodeByIndex(int index) {
            if (index < 0 || index >= size) return null;
            Node<T> result = null;

            if (index <= size / 2) {
                result = first;
                // 0, 1,
                for (int i = 0; i < index; i++) {
                    result = result.next;
                }
            } else {
                result = last;
                for (int i = size -1; i > index ; i--) {
                    result = result.previous;
                }
            }

            return result;

        }

        //@Override
        public void addLast(T value) {
            add(value);
        }

        // Добавление элемента в начало списка
        public void addFirst(T value) {
            if (first == null) {
                //Если список пустой
                first = new Node<>(value, null, null);
            } else if (last == null) {
//            Есть только один элемент в списке
                last = first;
                first = new Node<>(value, null, last);
                last.previous = first;
            } else {
                // остальные состояния списка
                Node<T> temp = first;
                first = new Node<>(value, null, temp);
                temp.previous = first;
            }
            size++;
        }

        //@Override
        public T getFirst() {
            return first == null ? null : first.value;
        }

        //@Override
        public T getLast() {
            if (last != null) {
                return last.value;
            } else if (first != null) {
                return first.value;
            }

            return null;
        }

        // @Override
        //Удаляет самый первый (левый) узел. Вернуть удаленное значение
        public T remove() {
            //Нет ни одного элемента
            if (size == 0) return null;

            // Если список не пустой, будет удаляться нода first
            T value = first.value;
            // логика удаления ноды first
            if (size == 1) {
                // Только одна нода - она же first
                first = null;
            } else if (size == 2) {
                //В списке две ноды (first и last)
                first = last;
                first.previous = null;
                last = null;
            } else {
                // больше 2х нод
                first = first.next;
                first.previous = null;
            }
            size--;
            return value;
        }

        @Override
        public T removeFirst() {
            return remove();
        }

        @Override
        public T removeLast() {
            return null;
        }


        //@Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (first != null) {
                sb.append(first.value);
                Node<T> cursor = first.next;
                while (cursor != null) {
                    sb.append(", ");
                    sb.append(cursor.value);
                    cursor = cursor.next;
                }
            }

            sb.append("]");
            return sb.toString();
        }


        private static class Node<T> {
            T value;
            Node<T> previous;
            Node<T> next;


            public Node(T value, Node<T> previous, Node<T> next) {
                this.value = value;
                this.previous = previous;
                this.next = next;
            }
        }
    }