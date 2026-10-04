//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    // Задача 1
    System.out.println("Задача 1");
    String firstName = ("Ivan");
    String middleName = ("Ivanovich");
    String lastName = ("Ivanov");
    String fullName = "Ivanov " + "Ivan " + "Ivanovich";
    System.out.println("Ф.И.О. сотрудника = " + fullName);
    System.out.println(" ");
    System.out.println("________");
    // Задача 2
    System.out.println("Задача 2");
    String small = "ivanov ivan ivanovich";
    System.out.println( "Ф.И.О. сотрудника " + fullName.toUpperCase());
    System.out.println(" ");
    System.out.println("_________");

    //Задача 3
    System.out.println("Задача 3");
    String fullName1 = ("Иванов Семён Семёнович");
    String fullName2 = fullName1.replace("ё", "е");
    System.out.println("fullName2 = " + fullName2);
    System.out.println(" ");
    System.out.println("__________");
}
