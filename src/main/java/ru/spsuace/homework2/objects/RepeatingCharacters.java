package ru.spsuace.homework2.objects;


import java.util.Objects;

/**
 * Нужно найти символ, который встречается подряд в строке чаще всего, и указать количество повторений.
 * Если более одного символа с максимальным значением, то нужно вернуть тот символ,
 * который первый встречается в строчке
 * Если строка пустая или null, то вернуть null
 * Пример abbasbdlbdbfklsssbb -> (s, 3)
 */
public class  RepeatingCharacters {

    public static Pair<Character, Integer> getMaxRepeatingCharacters(String str) {

        if (str == null || str.isEmpty()) {
            return null;
        }

        char symbol =  str.charAt(0);
        char symbolFin =  str.charAt(0);
        int amountSymbolFin = 1;
        int amountSymbol = 0;
        for (int i = 0; i < str.length(); i++) {

            if (symbol == str.charAt(i)) {
               amountSymbol++;
            } else {
                amountSymbol = 1;
                symbol = str.charAt(i);
            }
            if (amountSymbol > amountSymbolFin) {
            amountSymbolFin = amountSymbol;
            symbolFin = symbol;
            }
        }
        return new Pair<>(symbolFin, amountSymbolFin);
    }

    public static class Pair<T, V> {
        private final T first;
        private final V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }
    }
}
