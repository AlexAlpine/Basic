package lesson_26.persons;


public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }
    // 012345678901234  -- 15
    // vasya@gmail.com
    // vasya@gmail.com.de
    // vasya1223@gmail.com.de
    // a@gmail.com.de

    /*
    1. должна присутствовать @ и только одна (done)
    2. Точка после собаки (done)
    3. после последней точки 2 или более символов
    4. английский алфавит, цифры, '_', '-', '.', '@'
    5. до собаки должен быть мин 1 символ
     */

    private boolean isEmailValid(String email) {

        // 1. должна присутствовать @ и только одна
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt) == -1) return false;

        //3. после последней точки 2 или более символов
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        //4. английский алфавит, цифры, '_', '-', '.', '@'

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) {
                return false;
            }
        }

        // 5. до собаки должен быть мин 1 символ
        // ???
        if (indexAt == 0) return false;

        if (!Character.isAlphabetic(email.charAt(0)))  return false;

        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }
    /*
    Требования к паролю
    1. длина >= 8
    2. должна быть мин 1 цифра
    3. должна быть мин 1 маленькая буква
    4. должна быть мин 1 большая буква
    5. должна быть мин 1 спец.символ ("!%$@&*()[]")
     */

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявления переменных
        boolean[] res = new boolean[4]; // false, false, false, false

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                isDigit = true;
//                res[0] = true;
            }

            if (Character.isLowerCase(ch)) {
                isLowerCase = true;
//                res[1] = true;
            }

            if (Character.isUpperCase(ch)) {
                isUpperCase = true;
//                res[2] = true;
            }

            if ("!%$@&*()[]".indexOf(ch) >= 0) {
                isSpecialSymbol = true;
//                res[3] = true;
            }


        }

        //true      true
        return  isDigit && isLowerCase && isUpperCase && isSpecialSymbol;

//        return res[0] && res[1] && res[2] && res[3];

    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}