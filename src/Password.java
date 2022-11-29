public class Password {

    public static boolean passwordConfirmation(String login,String password,String confirmPassword) {

        try {
            if (login.length() > 20){
                throw new WrongLoginException("Логин длиннее 20 символов");
            }
            if (password.length() > 20){
                throw new WrongPasswordException("Пароль длиннее 20 символов");
            }
            if (!password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d_]).+")) {
                throw new WrongPasswordException("Пароль не соответствует требованию");
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
